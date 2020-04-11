
import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL Procedure - cataloged or instream.

<p>-->NOTE This class is used as a base to create another class via a sed script 
executed in the Makefile.  The resulting file has the name of this file with 
"PP" prepended.

<p>The tricky bit of parsing JCL is that you must do it iteratively.  INCLUDEs 
may be nested and may contain SET statements for symbolics.  On most (all?) 
JCL statements, everything beyond the operation (JOB, EXEC, DD, etc.) can 
consist of parameters only, thus...
<p>
<code>
<br>// INCLUDE MEMBER=ASET
<br>//*
<br>//STEP01   EXEC &MYEXEC
<br>//SYSUT1   DD  &SYS1DISP,
<br>//             &SYS1DSN
<br>//SYSUT2   DD  &SYS2DISP,
<br>//             &SYS2DSN
</code>

<p>...is perfectly legal so long as values for these symbolics are provided.  So 
ASET may contain a SET for one or more of these symbolics, followed by an 
INCLUDE MEMBER=BSET which contains SETs for those same symbolics, overriding 
those in ASET.  And the member being INCLUDEd may be parameterized.

<p>Code is included to iteratively resolve INCLUDE statements by resolving 
symbolics to the extent known, rewrite the JCL, and then to re-lex-and-parse 
the rewritten JCL, continuing until all INCLUDEs are resolved.

<p>This is accomplished via two separate grammars, one used by the preprocessing 
code to resolve symbolics and INCLUDEs, the other to lex and parse the 
resulting JCL.

<p>An unfortunate side effect of this class and its brethren being created
by an ANTLR listener class is that not all instance variables are known at
instantiation time, they must be added as they are encountered by the listener.

*/
public class Proc {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLParser.ProcStatementContext procCtx = null;
	private JCLParser.PendStatementContext pendCtx = null;
	private ArrayList<SetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private ArrayList<Symbolic> sym = new ArrayList<>();
	/**
	This collection of PPOp instances is only used in the generated PPProc
	class;  PPOp is a generic representation of most JCL statements that are
	not needed in preprocessing other than for resolving INCLUDEs and 
	symbolics;  The primary function of PPOp is to hold symbolics that must be
	iteratively resolved as the JCL is rewritten. 
	*/
	private ArrayList<PPOp> op = new ArrayList<>();
	private String fileName = null;
	private String procName = null;
	private int startLine = -1;
	private int endLine = -1;
	private int jobOrdNb = 0;
	private int ordNb = 0;
	private int fileNb = 0;
	private int nbSteps = 0;
	private File baseDir = null;
	private File tmpProcDir = null;
	private JclStep parentJclStep = null;

	public Proc(
				JCLParser.ProcStatementContext procCtx
				, String fileName
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		LOGGER.fine(this.myName + " " + this.procName + " instantiated from " + this.fileName);
	}

	public Proc(
				JCLParser.ProcStatementContext procCtx
				, String fileName
				, int fileNb
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		LOGGER.fine(this.myName + " " + this.procName + " instantiated from " + this.fileName);
	}

	private void initialize() {
		if (this.myName == null) {
			this.myName = this.getClass().getName();
		}
		if (this.procName == null) {
			this.procName = this.procCtx.procName().NAME_FIELD().getSymbol().getText();
		}
		if (this.procCtx != null) {
			this.startLine = this.procCtx.PROC().getSymbol().getLine();
		}
		if (this.pendCtx != null) {
			this.endLine = this.pendCtx.PEND().getSymbol().getLine();
		}
	}

	private void setTmpDirs(File baseDir) throws IOException {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = this.newTempDir(baseDir, this.myName + "-" + this.procName + "-" + this.uuid, this.CLI.saveTemp);
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
		
		for (JclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	public void setTmpDirs(File baseDir, File tmpProcDir) throws IOException {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + "," + tmpProcDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
		
		for (JclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	/**
	Used by listeners in constructing instances of Proc.

	<p>A PEND statement is optional, if present it is used to determine
	the endLine for this Proc.
	*/
	public void addPendCtx(JCLParser.PendStatementContext pendCtx) {
		this.pendCtx = pendCtx;
		this.initialize();
	}

	/**
	Used by listeners in constructing instances of Proc.

	<p>A PEND statement is optional, when absent the listener manually sets
	the endLine for this Proc.
	*/
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	/**
	Used by JclStep and Proc in constructing instances of Proc.

	<p>The JCLLIB concatenation is needed to resolve INCLUDE statements and
	PROCs executed by JclSteps in this Proc.
	*/
	public void setJcllib(ArrayList<KeywordOrSymbolicWrapper> jcllib) {
		this.jcllib = jcllib;
		for (JclStep step: this.steps) {
			step.setJcllib(jcllib);
		}
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (KeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addSetSym(SetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	/**
	Add a JclStep to this Proc.

	<p>Note that this is similar to addJclStep in Job, but neither
	<code>setJcllib()</code> nor <code>setJobOrdNb</code> are executed
	from here.  Instead, those methods are executed in Proc's implementation
	of them, for the collection of JclSteps.
	*/
	public void addJclStep(JclStep step) {
		this.nbSteps++;
		step.setOrdNb(this.nbSteps);
		this.steps.add(step);
	}

	public void addOp(PPOp anOp) {
		this.op.add(anOp);
	}

	public String getProcName() {
		return this.procName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int getFileNb() {
		return this.fileNb;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public void setJobOrdNb(int jobOrdNb) {
		this.jobOrdNb = jobOrdNb;
		for (JclStep step: this.steps) {
			step.setJobOrdNb(jobOrdNb);
		}
	}

	public void setParentJclStep(JclStep jclStep) {
		this.parentJclStep = jclStep;
	}

	public JclStep getParentJclStep() {
		return this.parentJclStep;
	}

	/**
	Return the suffix to be used in the file name of the fully resolved 
	version of this Proc.  If there is a parent JCL step, then defer to
	its resolved suffix, otherwise construct our own.

	A predictable file name is needed so the transition from preprocessing
	to "normal" lexing/parsing works seamlessly.
	*/
	public StringBuffer getResolvedSuffix() {
		if (this.parentJclStep == null) {
			StringBuffer sb = new StringBuffer(String.format("%06d", this.fileNb));
			sb.append("-");
			sb.append(String.format("%06d", this.ordNb));
			return sb;
		} else {
			return this.parentJclStep.getResolvedSuffix();
		}
	}

	public StringBuffer getResolvedFileName() {
		StringBuffer sb = new StringBuffer(this.tmpProcDir.toString());
		sb.append(File.separator);
		sb.append(this.myName);
		sb.append("-");
		sb.append(this.procName);
		sb.append("-resolved-");
		sb.append(this.getResolvedSuffix());

		return sb;
	}

	public IncludeStatement includeStatementAt(int aLine) {
		for (IncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public ArrayList<IncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<IncludeStatement> getAllUnresolvedIncludes() {
		IncludeStatement[] unresolved_includes = 
				this.getAllIncludes().stream()
				.filter(i -> !i.isResolved())
				.toArray(IncludeStatement[]::new);
		return new ArrayList<IncludeStatement>(Arrays.asList(unresolved_includes));
	}

	public ArrayList<JclStep> stepsInNeedOfProc() {
		ArrayList<JclStep> stepsInNeed = new ArrayList<>();

		for (JclStep step: this.steps) {
			if (step.isExecProc()) {
				if (step.needsProc()) {
					stepsInNeed.add(step);
				} else {
					stepsInNeed.addAll(step.getProc().stepsInNeedOfProc());
				} 
			}
		}

		return stepsInNeed;
	}

	public Boolean containsLine(int aLine) {
		if (this.endLine <= this.startLine) {
			this.LOGGER.severe(
				this.myName 
				+ " " 
				+ this.procName 
				+ " containsLine detected either endLine or startLine not set |" 
				+ this
				+ "|"
				);
		}

		return (aLine >= startLine) && (aLine <= endLine);
	}

	public void resolveProcs() throws IOException {
		this.LOGGER.finer(this.myName + " " + this.procName + " resolveProcs " + this);

		for (JclStep step: this.steps) {
			step.resolveProc();
		}
	}

	public void resolveParmedIncludes(ArrayList<SetSymbolValue> execSetSym) {
		/* previously...
		LOGGER.finest(myName + " " + this.procName + " resolveParmedIncludes");
		ArrayList<SetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.setSym);
		mergedSetSym.addAll(this.setSym);

		for (IncludeStatement i: includes) {
			i.resolveParms(mergedSetSym);
		}
		LOGGER.finest(myName + " includes (after resolving): " + includes);

		this.LOGGER.finest(this.myName + " resolveParmedIncludes " + this);
		*/

		/*
			The symbolics passed into this method come from a list provided at
			execution time.  These would typically be static and/or dynamic system
			symbols such as SYSCLONE or SYSUID.

			These symbolics are merged with the relevant symbolics (those whose SET
			statement come before the include being processed) from this job.
		*/

		this.LOGGER.finer(
			this.myName 
			+ " " 
			+ this.procName 
			+ " resolveParmedIncludes execSetSym = |" 
			+ execSetSym 
			+ "|"
			);

		for (IncludeStatement i: this.includes) {
			ArrayList<SetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.setSym);
			for (SetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < i.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					this.LOGGER.finest(this.myName + " mergedSetSym.add |" + s + "|");
					mergedSetSym.add(s);
				} else {
					this.LOGGER.finest(this.myName + " mergedSetSym discarding |" + s + "|");
				}
			}
			mergedSetSym.addAll(execSetSym);
			i.resolveParms(mergedSetSym);
		}

		this.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);
	}

	public void resolveParms(ArrayList<SetSymbolValue> execSetSym) {
		LOGGER.finer(this.myName + " resolveParms " + this);

		ArrayList<SetSymbolValue> allSym = new ArrayList<>(this.CLI.setSym);
		allSym.addAll(this.setSym);
		allSym.addAll(execSetSym);
		for (SetSymbolValue s: this.setSym) {
			s.resolveParms(allSym);
		}

		for (JclStep step: steps) {
			ArrayList<SetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.setSym);
			for (SetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			mergedSetSym.addAll(execSetSym);
			step.resolveParms(mergedSetSym);
		}

	}

	public File rewriteWithParmsResolved() throws IOException {
		/*
		*/
		this.LOGGER.finer(
			this.myName 
			+ " "
			+ this.procName
			+ " rewriteWithParmsResolved job = |" 
			+ this 
			+ "| tmpProcDir = |" 
			+ this.tmpProcDir 
			+ "|"
			);

		this.sym = this.collectSymbolics();
		this.LOGGER.finest(this.myName + " sym = |" + this.sym + "|");
		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(this.getResolvedFileName().toString());
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		StringBuffer outLine = new StringBuffer();
		while ((inLine = src.readLine()) != null) {
			// first get just the symbolics on this line
			Symbolic[] symOnThisLineA = 
				this.sym.stream()
				.filter(s -> s.getLine() == src.getLineNumber())
				.toArray(Symbolic[]::new);
			// now sort them by size descending so we don't get confused over
			// replacing &A and &A1
			ArrayList<Symbolic> symOnThisLine = new ArrayList<>();
			symOnThisLine.addAll(Arrays.asList(symOnThisLineA));
			symOnThisLine.sort(Comparator.comparingInt(Symbolic::getLen).reversed());
			this.LOGGER.finest(this.myName + " symOnThisLine = |" + symOnThisLine + "|");
			outLine = new StringBuffer(inLine);
			this.LOGGER.finest(this.myName + " outLine before = |" + outLine + "|");
			// replace symbolics with their resolved value - if the
			// symbolic is followed by a dot, get rid of the dot
			for (Symbolic s: symOnThisLine) {
				int start = outLine.indexOf(s.getText());
				int end = start + s.getLen();
				if (outLine.substring(end, end + 1).equals(".")) {
					end++;
				}
				outLine.replace(start, end, s.getResolvedText());
			}
			this.LOGGER.finest(this.myName + " outLine after  = |" + outLine + "|");
			out.println(outLine);
		}
		src.close();
		out.close();
		return tmp;
	}

	private ArrayList<Symbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " " + this.procName + " collectSymbolics");

		ArrayList<Symbolic> symbolics = new ArrayList<>();

		for (JclStep j: steps) {
			symbolics.addAll(j.collectSymbolics());
		}

		// these should be resolved?
		for (IncludeStatement i: includes) {
			symbolics.addAll(i.collectSymbolics());
		}

		return symbolics;
	}

	public Proc iterativelyResolveIncludes(
					ArrayList<SetSymbolValue> execSetSym
					, File initialFile
					) throws IOException {
		/*
			At this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		this.LOGGER.finer(
			this.myName 
			+ " iterativelyResolveIncludes this = |" 
			+ this 
			+ "| initialFile = |" 
			+ initialFile.getName() 
			+ "| execSetSym = |"
			+ execSetSym
			+ "|"
			);

		Proc aProc = this;
		File procFile = initialFile;
		Boolean iterating = true;
		int sanity = 0;
		do {
			this.LOGGER.finest(this.myName + " procFile = |" + procFile.getName() + "|");
			aProc = this.lexAndParseAndStuff(procFile, execSetSym);
			procFile = aProc.rewriteWithIncludedContent();
			ArrayList<IncludeStatement> includes_after = aProc.getAllIncludes();
			this.LOGGER.finest(this.myName + " includes_after (1)  = |" + includes_after + "|");
			sanity++;
			if (includes_after.size() == 0) {
				aProc = this.lexAndParseAndStuff(procFile, execSetSym);
				includes_after = aProc.getAllIncludes();
				this.LOGGER.finest(this.myName + " includes_after (2)  = |" + includes_after + "|");
				if (includes_after.size() == 0) {
					iterating = false;
				}
			}
		} while(iterating && (sanity < CLI.getSanity()));
		if (sanity >= CLI.getSanity()) 
			this.LOGGER.severe(
				this.myName 
				+ " sanity check failed in iterativelyResolveIncludes for " 
				+ this
				);

		return aProc;
	}

	private Proc lexAndParseAndStuff(File procFile, ArrayList<SetSymbolValue> execSetSym) throws IOException {
		this.LOGGER.finer(this.myName + " " + this.procName + " lexAndParseAndStuff");

		ArrayList<Proc> thisProc = new ArrayList<>();
		lexAndParse(null, thisProc, this.tmpProcDir.getPath() + File.separator + procFile.getName());
		thisProc.get(0).resolveParmedIncludes(execSetSym);
		Proc aProc = thisProc.get(0);
		aProc.setTmpDirs(this.baseDir, this.tmpProcDir);
		aProc.setJcllib(this.jcllib);
		aProc.setOrdNb(this.ordNb);
		aProc.setJobOrdNb(this.jobOrdNb);
		aProc.setParentJclStep(this.parentJclStep);

		return aProc;
	}

	public void lexAndParse(ArrayList<Job> jobs, ArrayList<Proc> procs, String fileName) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " lexAndParse jobs = |" 
			+ jobs 
			+ "| procs = |" 
			+ procs 
			+ "| fileName = |" 
			+ fileName + "|"
			);

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer jcllexer = new JCLLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLParser jclparser = new JCLParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		JobListener jobListener = new JobListener(jobs, procs, fileName, this.getFileNb(), LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public File rewriteWithIncludedContent() throws IOException {
		this.LOGGER.finer(this.myName + " rewriteWithIncludedContent " + this);

		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(this.tmpProcDir.toString() + File.separator + this.myName + "-" + this.procName + "-" + this.getUUID());
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			IncludeStatement i = this.includeStatementAt(src.getLineNumber());
			if (i == null) {
				out.println(inLine);
			} else {
				if (writeTheIncludeContent(i, out)) {
				} else {
					out.println(inLine);
				}
			}
		}
		src.close();
		out.close();
		return tmp;
	}

	public Boolean writeTheIncludeContent(
							IncludeStatement i
							, PrintWriter out
							)
						throws IOException {

		this.LOGGER.finer(this.myName + " writeTheIncludeContent i =|" + i + "|");

		if (i.isResolved()) {
		} else {
			return false;
		}

		Boolean foundIt = true;
		String includeFile = i.getResolvedText();

		String includeFileFull = searchProcPathsFor(includeFile);

		if (includeFileFull == null) {
			foundIt = false;
			//LOGGER.warning(includeFile + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
		} else {
			List<String> list = 
				Files.readAllLines(Paths.get(includeFileFull));
			for (String line: list) out.println(line);
		}

		return foundIt;
	}

	public String searchProcPathsFor(String fileName) throws IOException {
		File aFile = new File(this.tmpProcDir.getPath() + File.separator + fileName);
		if (aFile.exists()) {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
			return aFile.getPath();
		}

		ArrayList<String> jcllib = this.getJcllibStrings();
		for (String lib: jcllib) {
			if (this.CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(this.CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
					return aFile.getPath();
				}
			}
		}

		for (String path: this.CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			if (aFile.exists()) {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
				return aFile.getPath();
			}
		}

		this.LOGGER.warning(this.myName + " searchProcPathsFor() did not find " + fileName);
		return null;
	}

	public File newTempDir(File baseDir, String prfx, Boolean saveTemp) throws IOException {
		/*
			It's possible the file permissions are superfluous.  The code would be more
			portable without them.  TODO maybe remove the code setting file permissions.
		*/
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x---");
		FileAttribute<Set<PosixFilePermission>> attr =
			PosixFilePermissions.asFileAttribute(perms);
		File tmpDir = Files.createTempDirectory(baseDir.toPath(), prfx, attr).toFile();

		if (saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	public void lexAndParseProcs() throws IOException {
		this.LOGGER.fine(this.myName + " " + this.procName + " lexAndParseProcs");
		for (JclStep s: this.steps) {
			s.lexAndParseProc();
		}
	}

	/**
	Add a comma separated representation of this Proc to the passed
	StringBuffer.

	The tricky <code>while</code> is to get the indentation right by
	working through the tree of JclSteps and Procs leading to this instance.
	*/
	public void toCSV(StringBuffer csvOut) {
		StringBuffer prefix = new StringBuffer();
		JclStep aStep = this.parentJclStep;
		if (aStep != null) {
			prefix.append(",,");
		}
		while (aStep != null) {
			prefix.append(",");
			Proc aProc = aStep.getParentProc();
			if (aProc == null) {
				aStep = null;
			} else {
				aStep = aProc.getParentJclStep();
			}
		}
		csvOut.append(prefix);
		csvOut.append(this.procName);
		prefix.append(",");
		for (JclStep s: this.steps) {
			csvOut.append('\n');
			csvOut.append(prefix);
			s.toCSV(csvOut);
		}
	}

	public String toString() {
		return 
			this.procName 
			+ " @ " 
			+ this.startLine 
			+ " to " 
			+ this.endLine 
			+ " in " 
			+ this.fileName;
	}

}
