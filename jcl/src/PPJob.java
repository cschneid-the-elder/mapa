
import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL PPJob.

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
public class PPJob {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLPPParser.JobCardContext jobCardCtx = null;
	private JCLPPParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<PPKeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<PPProc> procs  = new ArrayList<>();
	private ArrayList<PPSetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<PPIncludeStatement> includes = new ArrayList<>();
	private ArrayList<PPJclStep> steps = new ArrayList<>();
	private ArrayList<PPSymbolic> sym = new ArrayList<>();
	/**
	This collection of PPOp instances is only used in the generated PPJob
	class;  PPOp is a generic representation of most JCL statements that are
	not needed in preprocessing other than for resolving INCLUDEs and 
	symbolics;  The primary function of PPOp is to hold symbolics that must be
	iteratively resolved as the JCL is rewritten. 
	*/
	private ArrayList<PPOp> op = new ArrayList<>();
	private String fileName = null;
	private String jobName = null;
	private int startLine = -1;
	private int endLine = -1;
	private int ordNb = 0;
	private int fileNb = 0;
	private int nbSteps = 0;
	private File baseDir = null;
	private File tmpJobDir = null;
	private File tmpProcDir = null;

	public PPJob(
			JCLPPParser.JobCardContext ctx
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		this.LOGGER.fine(
			this.myName 
			+ " " 
			+ this.jobName 
			+ " instantiated from " 
			+ this.fileName
			);
	}

	public PPJob(
			JCLPPParser.JobCardContext ctx
			, String fileName
			, int ordNb
			, int fileNb
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.ordNb = ordNb;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		this.LOGGER.fine(
			this.myName 
			+ " " 
			+ this.jobName 
			+ " instantiated from " 
			+ this.fileName
			);
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.startLine = this.jobCardCtx.JOB().getSymbol().getLine();
		this.jobName = this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText();
	}

	/**
	Used by listeners constructing instances of PPJob.

	<p>Note that a JCLLIB statement is optional, and if absent then
	the path(s) to search for INCLUDEs and PROCs must be set via (in
	this case) the CLI.
	*/
	public void addJcllib(JCLPPParser.JcllibStatementContext ctx) {
		this.LOGGER.fine(
			this.myName 
			+ " addJcllib jobName = |" 
			+ this.jobName
			+ "|"
			);

		/*
		Handle single entry non-parenthesized JCLLIB...
		// JCLLIB ORDER=SIKOZU
		*/
		List<JCLPPParser.KeywordOrSymbolicContext> kywdCtxList = 
			ctx.singleOrMultipleValue().keywordOrSymbolic();

		this.LOGGER.finest(
			this.myName 
			+ " addJcllib ctx.singleOrMultipleValue().keywordOrSymbolic() = |" 
			+ ctx.singleOrMultipleValue().keywordOrSymbolic()
			+ "|"
			);

		this.jcllibCtx = ctx;
		if (kywdCtxList == null || kywdCtxList.size() == 0) {
			/*
			Handle parenthesized JCLLIB
			// JCLLIB ORDER=(SIKOZU)
			...or...
			// JCLLIB ORDER=(SIKOZU,JOOL)
			*/
			kywdCtxList = ctx.singleOrMultipleValue().parenList().keywordOrSymbolic();
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib ctx.singleOrMultipleValue().parenList().keywordOrSymbolic() = |" 
				+ ctx.singleOrMultipleValue().parenList().keywordOrSymbolic()
				+ "|"
				);
		}

		for (JCLPPParser.KeywordOrSymbolicContext k: kywdCtxList) {
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k = |" 
				+ k
				+ "|"
				);
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k.KEYWORD_VALUE() = |" 
				+ k.KEYWORD_VALUE()
				+ "|"
				);
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k.SYMBOLIC() = |" 
				+ k.SYMBOLIC()
				+ "|"
				);
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k.QUOTED_STRING_FRAGMENT() = |" 
				+ k.QUOTED_STRING_FRAGMENT()
				+ "|"
				);
			for (TerminalNode t: k.KEYWORD_VALUE()) {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib kywdCtxList KEYWORD_VALUE() t.getSymbol().getText() = |" 
					+ t.getSymbol().getText()
					+ "|"
					);
			}
			for (TerminalNode t: k.SYMBOLIC()) {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib kywdCtxList SYMBOLIC() t.getSymbol().getText() + |" 
					+ t.getSymbol().getText()
					+ "|"
					);
			}
			for (TerminalNode t: k.QUOTED_STRING_FRAGMENT()) {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib kywdCtxList QUOTED_STRING_FRAGMENT() t.getSymbol().getText() = |" 
					+ t.getSymbol().getText()
					+ "|"
					);
			}
		}

		this.jcllib.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList, this.LOGGER, this.CLI));
	}

	/**
	Used by listeners to set the end line of this PPJob. A file can
	contain more than one JOB statement.
	*/
	public void setEndLine(int aLine) {
		this.endLine = aLine;
	}

	private void setTmpDirs(File baseDir) throws IOException {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpJobDir == null) {
			this.tmpJobDir = this.newTempDir(baseDir, this.myName + "-" + this.getJobName() + "-", this.CLI.saveTemp);
			this.LOGGER.finest(this.myName + " setTmpDirs tmpJobDir set to |" + this.tmpJobDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = this.newTempDir(baseDir, this.myName + "-" + this.getJobName() + "-instreamprocs-", this.CLI.saveTemp);
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
		
		for (PPJclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	public void setTmpDirs(File baseDir, File tmpJobDir, File tmpProcDir) throws IOException {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + "," + tmpJobDir + "," + tmpProcDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpJobDir == null) {
			this.tmpJobDir = tmpJobDir;
			this.LOGGER.finest(this.myName + " setTmpDirs tmpJobDir set to |" + this.tmpJobDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
		
		for (PPJclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	public void addInstreamProc(PPProc iProc) {
		this.procs.add(iProc);
	}

	public void addSetSym(PPSetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	public void addInclude(PPIncludeStatement include) {
		this.includes.add(include);
	}

	public void addJclStep(PPJclStep step) {
		this.nbSteps++;
		step.setOrdNb(this.nbSteps);
		step.setJobOrdNb(this.ordNb);
		this.steps.add(step);
		step.setJcllib(this.jcllib);
	}

	public void addOp(PPOp anOp) {
		this.op.add(anOp);
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public File getJobDir() {
		return this.tmpJobDir;
	}

	public File getProcDir() {
		return this.tmpProcDir;
	}

	public int getOrdNb() {
		return this.ordNb;
	}

	public StringBuffer getFormattedOrdNb() {
		return new StringBuffer(String.format("%06d", this.ordNb));
	}

	public StringBuffer getResolvedSuffix() {
		StringBuffer sb = new StringBuffer(String.format("%06d", this.fileNb));
		sb.append("-");
		sb.append(String.format("%06d", this.ordNb));
		return sb;
	}

	public void resolveParmedIncludes() {
		this.LOGGER.finer(this.myName + " resolveParmedIncludes " + this);

		/*
			The symbolics (setSym) in CLI used by this method come from a list provided at
			execution time.  These would typically be static and/or dynamic system
			symbols such as SYSCLONE or SYSUID.

			These symbolics are merged with the relevant symbolics (those whose SET
			statement come before the include being processed) from this job.
		*/

		for (PPIncludeStatement i: this.includes) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.PPsetSym);
			for (PPSetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < i.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			i.resolveParms(mergedSetSym);
		}

		this.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);
	}

	public void resolveParms() {
		this.LOGGER.finer(this.myName + " resolveParms " + this);

		/*
			The symbolics (setSym) in CLI used by this method come from a list provided at
			execution time.  These would typically be static and/or dynamic system
			symbols such as SYSCLONE or SYSUID.

			These symbolics are merged with the relevant symbolics (those whose SET
			statement come before the step being processed) from this job.
		*/

		ArrayList<PPSetSymbolValue> allSym = new ArrayList<>(this.CLI.PPsetSym);
		allSym.addAll(this.setSym);
		for (PPSetSymbolValue s: this.setSym) {
			s.resolveParms(allSym);
		}

		for (PPOp o: this.op) {
			o.resolveParms(allSym, this);
		}

		for (PPJclStep step: this.steps) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.PPsetSym);
			for (PPSetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			step.resolveParms(mergedSetSym);
		}
	}

	public void resolveProcs() throws IOException {
		LOGGER.finer(this.myName + " resolveProcs " + this);

		for (PPJclStep step: this.steps) {
			step.resolveProc();
		}
	}

	public ArrayList<PPJclStep> stepsInNeedOfProc() {
		ArrayList<PPJclStep> stepsInNeed = new ArrayList<>();

		for (PPJclStep step: this.steps) {
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

	public PPProc instreamProcThisLineIsIn(int aLine) {
		PPProc aProc = null;

		for (PPProc p: this.procs) {
			if (p.containsLine(aLine) && (p.getFileName().equals(this.fileName))) {
				aProc = p;
				break;
			}
		}

		return aProc;
	}

	public Boolean lineIsInThisJob(int aLine) {
		return ((aLine >= this.startLine) && (aLine <= this.endLine));
	}

	public PPIncludeStatement includeStatementAt(int aLine) {
		for (PPIncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public PPJclStep jclStepAt(int aLine) {
		for (PPJclStep j: steps) {
			if (j.getLine() == aLine) return j;
		}

		return null;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int getFileNb() {
		return this.fileNb;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String getJobName() {
		return this.jobName;
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public ArrayList<PPJclStep> getSteps() {
		return this.steps;
	}

	public ArrayList<PPIncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<PPIncludeStatement> getAllUnresolvedIncludes() {
		PPIncludeStatement[] unresolved_includes = 
				this.getAllIncludes().stream()
				.filter(i -> !i.isResolved())
				.toArray(PPIncludeStatement[]::new);
		return new ArrayList<PPIncludeStatement>(Arrays.asList(unresolved_includes));
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}

	public File rewriteWithParmsResolved() throws IOException {
		/*
		*/
		this.LOGGER.finer(
			this.myName 
			+ " rewriteWithParmsResolved job = |" 
			+ this 
			+ "| tmpJobDir = |" 
			+ this.tmpJobDir 
			+ "|"
			);

		this.sym = this.collectSymbolics();
		this.LOGGER.finest(this.myName + " sym = |" + this.sym + "|");
		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(
			this.tmpJobDir.toString() 
			+ File.separator 
			+ this.myName 
			+ "-" 
			+ this.getJobName() 
			+ "-resolved-" 
			+ this.getResolvedSuffix()
			);
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
			PPSymbolic[] symOnThisLineA = 
				this.sym.stream()
				.filter(s -> s.getLine() == src.getLineNumber())
				.toArray(PPSymbolic[]::new);
			// now sort them by size descending so we don't get confused over
			// replacing &A and &A1
			ArrayList<PPSymbolic> symOnThisLine = new ArrayList<>();
			symOnThisLine.addAll(Arrays.asList(symOnThisLineA));
			symOnThisLine.sort(Comparator.comparingInt(PPSymbolic::getLen).reversed());
			this.LOGGER.finest(this.myName + " symOnThisLine = |" + symOnThisLine + "|");
			outLine = new StringBuffer(inLine);
			this.LOGGER.finest(this.myName + " outLine before = |" + outLine + "|");
			// replace symbolics with their resolved value - if the
			// symbolic is followed by a dot, get rid of the dot
			for (PPSymbolic s: symOnThisLine) {
				this.LOGGER.finest(this.myName + " s = " + s);
				int start = outLine.indexOf(s.getText());
				int end = start + s.getLen();
				this.LOGGER.finest(this.myName + " start = " + start);
				this.LOGGER.finest(this.myName + " end   = " + end);
				if ((end < outLine.length()) && (outLine.substring(end, end + 1).equals("."))) {
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

	private ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " collectSymbolics");

		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		for (PPJclStep j: steps) {
			symbolics.addAll(j.collectSymbolics());
		}

		for (PPOp o: this.op) {
			symbolics.addAll(o.collectSymbolics(this));
		}

		// these should be resolved?
		for (PPIncludeStatement i: includes) {
			symbolics.addAll(i.collectSymbolics());
		}

		return symbolics;
	}

	public PPJob iterativelyResolveIncludes(File initialJobFile) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " iterativelyResolveIncludes this = |" 
			+ this 
			+ "| initialJobFile = |" 
			+ initialJobFile.getName() 
			+ "|"
			);

		PPJob aJob = this;
		File jobFile = initialJobFile;
		Boolean iterating = true;
		int sanity = 0;
		do {
			this.LOGGER.finest(this.myName + " jobFile = |" + jobFile.getName() + "|");
			ArrayList<PPJob> thisJob = new ArrayList<>();
			lexAndParse(thisJob, null, this.tmpJobDir.getCanonicalPath() + File.separator + jobFile.getName());
			thisJob.get(0).resolveParmedIncludes();
			ArrayList<PPIncludeStatement> includes_after = thisJob.get(0).getAllUnresolvedIncludes();
			//are all includes from before still there after? yes = stop iterating
			this.LOGGER.finest(this.myName + " includes_after  = " + includes_after);
			aJob = thisJob.get(0);
			aJob.setTmpDirs(this.baseDir, this.tmpJobDir, this.tmpProcDir);
			jobFile = aJob.rewriteJobWithIncludesResolved();
			sanity++;
			if (includes_after.size() == 0) {
				//includes resolved, parse one last time to get resolved PPJob instance
				iterating = false;
				thisJob = new ArrayList<>();
				lexAndParse(
					thisJob
					, null
					, this.tmpJobDir.getCanonicalPath() + File.separator + jobFile.getName()
					);
				aJob = thisJob.get(0);
				aJob.setTmpDirs(this.baseDir, this.tmpJobDir, this.tmpProcDir);
				aJob.setOrdNb(this.ordNb);
			}
		} while(iterating && (sanity < CLI.getSanity()));
		if (sanity >= CLI.getSanity()) 
			this.LOGGER.severe(
				this.myName 
				+ " sanity check failed in iterativelyResolveIncludes for " 
				+ this
				);

		return aJob;
	}

	public void lexAndParse(ArrayList<PPJob> jobs, ArrayList<PPProc> procs, String fileName) throws IOException {
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
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPListener jobListener = new PPListener(jobs, procs, fileName, this.fileNb, LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public File rewriteJobWithIncludesResolved() throws IOException {
		/*
			At this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		this.LOGGER.finer(this.myName + " rewriteJobWithIncludesResolved job = |" + this + "| tmpJobDir = |" + this.tmpJobDir + "|");

		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(this.tmpJobDir.toString() + File.separator + this.myName + "-" + this.getJobName() + "-" + this.getUUID());
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			PPIncludeStatement i = this.includeStatementAt(src.getLineNumber());
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

	public File rewriteJobAndSeparateInstreamProcs(File baseDir) throws IOException {
		/*
			Rewrite one job from the current file, separating any instream procs into their own
			files to be processed later.

			After this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		/*
			the plan...

			for each job, read a record from its file
				if the record number resides in an instream proc, skip it
				if the record number corresponds to a resolved include,
					skip writing the include, instead read the file it
					refers to and add that to the output in place of the include
				if the record number corresponds to a jclstep _not_ in stepsInNeedOfProc,
					open a new LineNumberReader on the jclstep's file
					read the proc, writing records to a new file
					if the record number corresponds to a resolved include,
						skip writing the include, instead read the file it
						refers to and add that to the output in place of the include
				write the record read to output
		*/
		this.LOGGER.finer(this.myName + " rewriteJobAndSeparateInstreamProcs job = |" + this + "| baseDir = |" + baseDir + "|");

		this.setTmpDirs(baseDir);
		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(this.tmpJobDir.toString() + File.separator + this.myName + "-" + this.getJobName() + "-" + this.getUUID());
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		PPProc aProc = null;
		File procTmp = null;
		PrintWriter procOut = null;
		while ((inLine = src.readLine()) != null) {
			if (this.lineIsInThisJob(src.getLineNumber())) {
			} else {
				continue;
			}
			aProc = this.instreamProcThisLineIsIn(src.getLineNumber());
			if (aProc == null) {
				if (procOut == null) {
				} else {
					procOut.close();
					procTmp = null;
					procOut = null;
				}
				out.println(inLine);
			} else {
				if (procOut == null) {
					procTmp = new File(this.tmpProcDir.toString() + File.separator + aProc.getProcName());
					if (this.CLI.saveTemp) {
					} else {
						procTmp.deleteOnExit();
					}
					procOut = new PrintWriter(procTmp);
					this.LOGGER.finest(this.myName + " procTmp = |" + procTmp.getName() + "|");
				}
				procOut.println(inLine);
			}
			if (src.getLineNumber() == this.getEndLine()) break; //end of this job in this file
		}
		src.close();
		out.close();
		return tmp;
	}

	public Boolean writeTheIncludeContent(
							PPIncludeStatement i
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
		for (PPJclStep s: this.steps) {
			s.lexAndParseProc();
		}
	}

	public void toCSV(StringBuffer csvOut) {
		csvOut.append(this.jobName);
		csvOut.append(",");
		csvOut.append(this.ordNb);
		for (PPJclStep s: this.steps) {
			csvOut.append('\n');
			s.toCSV(csvOut);
		}
	}

	public String toString() {
		return 
			this.getJobName() 
			+ " @ " 
			+ this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getLine() 
			+ " in " 
			+ this.fileName;
	}
}

