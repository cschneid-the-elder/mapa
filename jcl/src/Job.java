
import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL Job, consisting of one or more JCL steps, each
of which executes either a program or a procedure.

<p>There are a host of other statements that could be represented here, but for
demonstration purposes they are superfluous.  The intent is to provide some
basic functionality to demonstrate what can be done with the lexer/parser.

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
public class Job {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLParser.JobCardContext jobCardCtx = null;
	private JCLParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<Proc> procs  = new ArrayList<>();
	private ArrayList<SetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private ArrayList<Symbolic> sym = new ArrayList<>();
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

	public Job(
			JCLParser.JobCardContext ctx
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

	public Job(
			JCLParser.JobCardContext ctx
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
	Used by listeners constructing instances of Job.

	<p>Note that a JCLLIB statement is optional, and if absent then
	the path(s) to search for INCLUDEs and PROCs must be set via (in
	this case) the CLI.
	*/
	public void addJcllib(JCLParser.JcllibStatementContext ctx) {
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
		List<JCLParser.KeywordOrSymbolicContext> kywdCtxList = 
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

		for (JCLParser.KeywordOrSymbolicContext k: kywdCtxList) {
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

		this.jcllib.addAll(KeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList, this.LOGGER, this.CLI));
	}

	/**
	Used by listeners to set the end line of this Job. A file can
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
		
		for (JclStep step: this.steps) {
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
		
		for (JclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	public void addInstreamProc(Proc iProc) {
		this.procs.add(iProc);
	}

	public void addSetSym(SetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addJclStep(JclStep step) {
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

	public Boolean lineIsInThisJob(int aLine) {
		return ((aLine >= this.startLine) && (aLine <= this.endLine));
	}

	public IncludeStatement includeStatementAt(int aLine) {
		for (IncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public JclStep jclStepAt(int aLine) {
		for (JclStep j: steps) {
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

	public ArrayList<JclStep> getSteps() {
		return this.steps;
	}

	public ArrayList<IncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (KeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
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
	
		JobListener jobListener = new JobListener(jobs, procs, fileName, this.fileNb, LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

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
		for (JclStep s: this.steps) {
			s.lexAndParseProc();
		}
	}

	public void toTree(StringBuffer treeOut) {
		this.LOGGER.fine(this.myName + " " + this.jobName + " toTree");

		treeOut.append(this.jobName);
		treeOut.append('\t');
		treeOut.append(this.ordNb);
		for (JclStep s: this.steps) {
			treeOut.append(System.getProperty("line.separator"));
			s.toTree(treeOut);
		}
	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		this.LOGGER.fine(this.myName + " " + this.jobName + " toCSV");

		csvOut.append("JOB");
		csvOut.append(",");
		csvOut.append(this.jobName);
		csvOut.append(",");
		csvOut.append(this.ordNb);
		csvOut.append(",");
		csvOut.append(parentUUID.toString());
		csvOut.append(",");
		csvOut.append(this.uuid.toString());

		for (JclStep s: this.steps) {
			csvOut.append(System.getProperty("line.separator"));
			s.toCSV(csvOut, this.uuid);
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

