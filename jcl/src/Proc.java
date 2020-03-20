
import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**


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
	private ArrayList<PPOp> op = new ArrayList<>();
	private String fileName = null;
	private String procName = null;
	private int startLine = -1;
	private int endLine = -1;
	private File baseDir = null;
	private File tmpProcDir = null;

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
		LOGGER.finer(this.myName + " " + this.procName + " instantiated from " + this.fileName);
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
		this.LOGGER.finest(this.myName + " setTmpDirs(" + baseDir + ")");
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
		this.LOGGER.finest(this.myName + " setTmpDirs(" + baseDir + "," + tmpProcDir + ")");
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

	public void addPendCtx(JCLParser.PendStatementContext pendCtx) {
		this.pendCtx = pendCtx;
		this.initialize();
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

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

	public void addJclStep(JclStep step) {
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
		return (aLine >= startLine) && (aLine <= endLine);
	}

	public void resolveProcs() throws IOException {
		LOGGER.finest(this.myName + " resolveProcs " + this);

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

		for (IncludeStatement i: this.includes) {
			ArrayList<SetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.setSym);
			for (SetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < i.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			mergedSetSym.addAll(execSetSym);
			i.resolveParms(mergedSetSym);
		}

		this.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);
	}

	public void resolveParms(ArrayList<SetSymbolValue> execSetSym) {
		LOGGER.fine(this.myName + " resolveParms " + this);

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

	public Proc iterativelyResolveIncludes(
					ArrayList<SetSymbolValue> execSetSym
					, File initialFile
					) throws IOException {
		this.LOGGER.fine(
			this.myName 
			+ " iterativelyResolveIncludes this = |" 
			+ this 
			+ "| initialJobFile = |" 
			+ initialFile.getName() 
			+ "|"
			);

		Proc aProc = this;
		File procFile = initialFile;
		Boolean iterating = true;
		int sanity = 0;
		do {
			this.LOGGER.finest(this.myName + " procFile = |" + procFile.getName() + "|");
			ArrayList<Proc> thisProc = new ArrayList<>();
			lexAndParse(null, thisProc, this.tmpProcDir.getCanonicalPath() + File.separator + procFile.getName());
			thisProc.get(0).resolveParmedIncludes(execSetSym);
			ArrayList<IncludeStatement> includes_after = thisProc.get(0).getAllUnresolvedIncludes();
			//are all includes from before still there after? yes = stop iterating
			this.LOGGER.finest(this.myName + " includes_after  = " + includes_after);
			aProc = thisProc.get(0);
			aProc.setTmpDirs(this.baseDir, this.tmpProcDir);
			aProc.setJcllib(this.jcllib);
			procFile = aProc.rewriteWithIncludesResolved();
			sanity++;
			if (includes_after.size() == 0) {
				//includes resolved, parse one last time to get resolved Proc instance
				iterating = false;
				thisProc = new ArrayList<>();
				lexAndParse(
					null
					, thisProc
					, this.tmpProcDir.getCanonicalPath() + File.separator + procFile.getName()
					);
				aProc = thisProc.get(0);
				aProc.setTmpDirs(this.baseDir, this.tmpProcDir);
				aProc.setJcllib(this.jcllib);
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

	public void lexAndParse(ArrayList<Job> jobs, ArrayList<Proc> procs, String fileName) throws IOException {
		this.LOGGER.fine(
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
	
		JobListener jobListener = new JobListener(jobs, procs, fileName, LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public File rewriteWithIncludesResolved() throws IOException {
		/*
			At this point the intent is to iteratively process the job until all INCLUDEs are
			resolved.  Potentially, an INCLUDE can contain other INCLUDEs, SETs, and EXECs.
		*/
		this.LOGGER.fine(this.myName + " rewriteWithIncludesResolved " + this);

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

		this.LOGGER.fine(this.myName + " writeTheIncludeContent i =|" + i + "|");

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
		File aFile = new File(this.tmpProcDir.getName() + File.separator + fileName);
		if (aFile.exists()) {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getCanonicalPath());
			return aFile.getCanonicalPath();
		}

		ArrayList<String> jcllib = this.getJcllibStrings();
		for (String lib: jcllib) {
			if (this.CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(this.CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getCanonicalPath());
					return aFile.getCanonicalPath();
				}
			}
		}

		for (String path: this.CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			if (aFile.exists()) {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getCanonicalPath());
				return aFile.getCanonicalPath();
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

	public String toString() {
		return this.procName + " @ " + this.startLine + " to " + this.endLine + " in " + this.fileName;
	}

}
