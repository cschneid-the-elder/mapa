
import java.util.*;
import java.util.logging.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL PPJob Step which is
used in PreProcessing to resolve parms and INCLUDEs.

<p>An instance of PPJclStep is meaningless without its containing PPJob or PPProc, 
which provide values for symbolics that may be present.

<p>A PPJclStep may execute a procedure, which may have its symbolics resolved by
values set by this PPJclStep.  The same procedure may be executed by several
different PPJclSteps in the same PPJob, all with different parameters.  So each
JclStep locates, parses, and provides any proc it executes its own collection
of PPSetSymbolValues for resolution.

<p>An unfortunate side effect of this class and its brethren being created
by an ANTLR listener class is that not all instance variables are known at
instantiation time, they must be added as they are encountered by the listener.


*/
public class PPJclStep {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private String fileName = null;
	private String procName = null;
	private String stepName = null;
	private int line = -1;
	private int jobOrdNb = 0;
	private int ordNb = 0;
	private PPKeywordOrSymbolicWrapper procExecuted = null;
	private PPKeywordOrSymbolicWrapper pgmExecuted = null;
	private PPProc proc = null;
	private Boolean inProc = null;
	private JCLPPParser.JclStepContext jclStepCtx = null;
	private JCLPPParser.ExecStatementContext execStmtCtx = null;
	private JCLPPParser.ExecPgmStatementContext execPgmStmtCtx = null;
	private JCLPPParser.ExecProcStatementContext execProcStmtCtx = null;
	private List<JCLPPParser.DdStatementAmalgamationContext> ddStmtAmlgnCtxs = null;
	/**
	The collection setSym holds instances of PPSetSymbolValue representing
	parameters set on execution of a cataloged or instream procedure.
	*/
	private ArrayList<PPSetSymbolValue> setSym = new ArrayList<>();
	/**
	The collection incomingSetSym holds instances of PPSetSymbolValue
	representing parameters set by SET statements or other means prior
	to execution of this step.
	*/
	private ArrayList<PPSetSymbolValue> incomingSetSym = new ArrayList<>();
	private ArrayList<PPDdStatementAmalgamation> ddStatements = new ArrayList<>();
	private ArrayList<PPKeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private File baseDir = null;
	private File tmpProcDir = null;
	private PPJob parentJob = null;
	private PPProc parentProc = null;

	public PPJclStep(
			JCLPPParser.JclStepContext jclStepCtx
			, String fileName
			, PPProc parentProc
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.parentProc = parentProc;
		this.procName = parentProc.getProcName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.inProc = true;
		this.initialize();
		this.LOGGER.fine(this.myName + " " + this.stepName + " instantiated from " + this.fileName);
		this.LOGGER.finest(this.myName + " procExecuted = |" + this.procExecuted + "|");
	}

	public PPJclStep(
			JCLPPParser.JclStepContext jclStepCtx
			, String fileName
			, PPJob parentJob
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.parentJob = parentJob;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.inProc = false;
		this.initialize();
		this.LOGGER.fine(this.myName + " " + this.stepName + " instantiated from " + this.fileName);
		this.LOGGER.finest(this.myName + " procExecuted = |" + this.procExecuted + "|");
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.execStmtCtx = this.jclStepCtx.execStatement();
		this.execPgmStmtCtx = this.execStmtCtx.execPgmStatement();
		this.execProcStmtCtx = this.execStmtCtx.execProcStatement();
		this.ddStmtAmlgnCtxs = this.jclStepCtx.ddStatementAmalgamation();
		
		if (this.isExecProc() && this.isExecPgm()) {
			this.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are not null");
		} else if (!this.isExecProc() && !this.isExecPgm()) {
			this.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are null");
		}

		if (this.isExecPgm()) {
			this.line = this.execPgmStmtCtx.EXEC().getSymbol().getLine();
			if (this.execPgmStmtCtx.stepName() == null) {
				this.stepName = "_NONAME_";
			} else {
				this.stepName = this.execPgmStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.pgmExecuted = new PPKeywordOrSymbolicWrapper(this.execPgmStmtCtx.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI);
		} else {
			this.line = this.execProcStmtCtx.EXEC().getSymbol().getLine();
			if (this.execProcStmtCtx.stepName() == null) {
				this.stepName = "_NONAME_";
			} else {
				this.stepName = this.execProcStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.procExecuted = new PPKeywordOrSymbolicWrapper(this.execProcStmtCtx.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI);
			for (JCLPPParser.ExecProcParmContext epp: this.execProcStmtCtx.execProcParm()) {
				this.setSym.add(new PPSetSymbolValue(epp, this.fileName, this.procName, this.getProcExecuted(), this.LOGGER, this.CLI));
			}
		}

		if (this.ddStmtAmlgnCtxs == null) {
		} else {
			for (JCLPPParser.DdStatementAmalgamationContext d: this.ddStmtAmlgnCtxs) {
				this.ddStatements.add(new PPDdStatementAmalgamation(d, this.procName, this.fileName, this.LOGGER, this.CLI));
			}
		}	
	}

	public void setTmpDirs(File baseDir, File tmpProcDir) throws IOException {
		this.LOGGER.finer(this.myName + " " + this.stepName + " setTmpDirs(" + baseDir + "," + tmpProcDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " " + this.stepName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(this.myName + " " + this.stepName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}

		this.LOGGER.fine(this.myName +  " " + this.stepName + " setTmpDirs procExecuted = |" + this.procExecuted + "|");
		
	}

	public Boolean isExecProc() {
		return this.execProcStmtCtx != null;
	}

	public Boolean isExecPgm() {
		return this.execPgmStmtCtx != null;
	}

	public Boolean needsProc() {
		return this.isExecProc() && (this.proc == null);
	}

	public String getProcExecuted() {
		return this.procExecuted.getValue();
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public void setJobOrdNb(int jobOrdNb) {
		this.jobOrdNb = jobOrdNb;
	}

	public StringBuffer getResolvedSuffix() {
		StringBuffer sb = new StringBuffer();

		if (this.parentProc == null) {
			sb.append(this.parentJob.getResolvedSuffix());
		} else {
			sb.append(this.parentProc.getResolvedSuffix());
		}

		sb.append("-");
		sb.append(String.format("%06d", this.ordNb));
		return sb;
	}

	public PPProc getProc() {
		return this.proc;
	}

	public int getLine() {
		return this.line;
	}

	private int getFileNb() {
		if (this.parentJob == null) {
			return this.parentProc.getFileNb();
		} else {
			return this.parentJob.getFileNb();
		}
	}

	public void setJcllib(ArrayList<PPKeywordOrSymbolicWrapper> jcllib) {
		this.jcllib = jcllib;
	}

	public ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}

	public ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " collectSymbolics");

		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		if (this.isExecPgm()) {
			symbolics.addAll(this.pgmExecuted.collectSymbolics());
		} else {
			symbolics.addAll(this.procExecuted.collectSymbolics());
		}

		for (PPDdStatementAmalgamation d: this.ddStatements) {
			symbolics.addAll(d.collectSymbolics());
		}

		return symbolics;
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> setSym) {
		/*
			PPSymbolics come from SET statements and dynamic system symbols defined
			on the command line.

			The mergedSetSym are only created and used when executing a proc, and
			would be empty anyway if just executing a program.  We do have to take
			them into account when resolving DD statements as those are overrides or
			additions to the executed proc.
		*/
		this.LOGGER.finer(myName + " " + this.stepName + " resolveParms setSym = |" + setSym + "|");

		this.incomingSetSym.addAll(setSym);
		// TODO procExecuted & pgmExecuted resolveParms(mergedSetSym)

		if (this.proc != null) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(setSym);
			mergedSetSym.addAll(this.setSym);
			this.proc.resolveParms(mergedSetSym);
			for (PPDdStatementAmalgamation dda: ddStatements) {
				dda.resolveParms(mergedSetSym);
			}
		} else {
			for (PPDdStatementAmalgamation dda: ddStatements) {
				dda.resolveParms(setSym);
			}
		}
	}

	public void resolveProc() throws IOException {
		this.LOGGER.finer(this.myName + " " + this.stepName + " resolveProc ");

		if (this.needsProc()) {
			String aProcFile = this.searchProcPathsFor(this.getProcExecuted());
			if (aProcFile == null) {
				this.LOGGER.warning(this + " proc not found");
			} else {
				ArrayList<PPProc> procs = new ArrayList<>();
				this.lexAndParse(procs, aProcFile);
				procs.get(0).setJcllib(this.jcllib);
				procs.get(0).setTmpDirs(this.baseDir, this.tmpProcDir);
				procs.get(0).setOrdNb(this.ordNb);
				procs.get(0).setJobOrdNb(this.jobOrdNb);
				procs.get(0).setParentJclStep(this);
				ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.incomingSetSym);
				mergedSetSym.addAll(this.setSym);
				this.proc = procs.get(0).iterativelyResolveIncludes(mergedSetSym, new File(aProcFile));
				this.proc.resolveParms(mergedSetSym);
				File finalProcFile = this.proc.rewriteWithParmsResolved();
				this.proc.resolveProcs();
			}

		}
	}

	public void lexAndParse(ArrayList<PPProc> procs, String fileName) throws IOException {
		this.LOGGER.finer(this.myName + " lexAndParse procs = |" + procs + "| fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer jcllexer = new JCLPPLexer(cs);  //instantiate a lexer
		CommonTokenStream jcltokens = new CommonTokenStream(jcllexer); //scan stream for tokens
		JCLPPParser jclparser = new JCLPPParser(jcltokens);  //parse the tokens	

		ParseTree jcltree = jclparser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker jclwalker = new ParseTreeWalker();
	
		PPListener jobListener = new PPListener(null, procs, fileName, this.getFileNb(), LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + jobListener.getClass().getName());
	
		jclwalker.walk(jobListener, jcltree);

	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String searchProcPathsFor(String fileName) throws IOException {
		File aFile = new File(this.tmpProcDir.getPath() + File.separator + fileName);

		this.LOGGER.finer(this.myName + " " + this.stepName + " searchProcPaths searching " + tmpProcDir);
		if (aFile.exists()) {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
			return aFile.getPath();
		} else {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() did not find " + aFile.getPath());
		}

		ArrayList<String> jcllib = this.getJcllibStrings();
		for (String lib: jcllib) {
			if (this.CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(this.CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
					return aFile.getPath();
				} else {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() did not find " + aFile.getPath());
				}
			}
		}

		for (String path: this.CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			this.LOGGER.finer(this.myName + " " + this.stepName + " searchProcPaths searching " + path);
			if (aFile.exists()) {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
				return aFile.getCanonicalPath();
			} else {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() did not find " + aFile.getPath());
			}
		}

		this.LOGGER.warning(this.myName + " searchProcPathsFor() did not find " + fileName);
		this.LOGGER.finer(
			this.myName 
			+ " searchProcPathsFor() searched for " 
			+ fileName
			+ " in "
			+ this.tmpProcDir
			+ " and "
			+ this.CLI.mappedProcPaths
			+ " and even "
			+ this.CLI.staticProcPaths
			+ " without success"
			);
		return null;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(this.myName);

		sb.append(" " + this.stepName);

		if (this.isExecProc()) {
			sb.append(" proc " + this.procExecuted.getValue());
		} else {
			sb.append(" pgm " + this.pgmExecuted.getValue());
		}

		return sb.toString();
	}
}
