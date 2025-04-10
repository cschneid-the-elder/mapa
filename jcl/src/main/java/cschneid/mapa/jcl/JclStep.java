/*Copyright (C) 2019 - 2021 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import java.io.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL Job Step.

<p>An instance of JclStep is meaningless without its containing Job or Proc, 
which provide values for symbolics that may be present.

<p>A JclStep may execute a procedure, which may have its symbolics resolved by
values set by this JclStep.  The same procedure may be executed by several
different JclSteps in the same Job, all with different parameters.  So each
JclStep locates, parses, and provides any proc it executes its own collection
of SetSymbolValues for resolution.

<p>An unfortunate side effect of this class and its brethren being created
by an ANTLR listener class is that not all instance variables are known at
instantiation time, they must be added as they are encountered by the listener.


*/
public class JclStep {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private String fileName = null;
	private String procName = null;
	private String stepName = null;
	private int line = -1;
	private int jobOrdNb = 0;
	private int ordNb = 0;
	private KeywordOrSymbolicWrapper procExecuted = null;
	private KeywordOrSymbolicWrapper pgmExecuted = null;
	private Proc proc = null;
	private Boolean inProc = null;
	private JCLParser.JclStepContext jclStepCtx = null;
	private JCLParser.ExecStatementContext execStmtCtx = null;
	private JCLParser.ExecPgmStatementContext execPgmStmtCtx = null;
	private JCLParser.ExecProcStatementContext execProcStmtCtx = null;
	private List<JCLParser.DdStatementAmalgamationContext> ddStmtAmlgnCtxs = null;
	/**
	The collection setSym holds instances of SetSymbolValue representing
	parameters set on execution of a cataloged or instream procedure.
	*/
	private ArrayList<SetSymbolValue> setSym = new ArrayList<>();
	/**
	The collection incomingSetSym holds instances of SetSymbolValue
	representing parameters set by SET statements or other means prior
	to execution of this step.
	*/
	private ArrayList<SetSymbolValue> incomingSetSym = new ArrayList<>();
	private ArrayList<DdStatementAmalgamation> ddStatements = new ArrayList<>();
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private File baseDir = null;
	private File tmpProcDir = null;
	private Job parentJob = null;
	private Proc parentProc = null;
	private ArrayList<String> tsoCallPgms = new ArrayList<>();
	private ArrayList<String> tsoDSNPgms = new ArrayList<>();
	private ArrayList<String> tsoDSNPlans = new ArrayList<>();

	public JclStep(
			JCLParser.JclStepContext jclStepCtx
			, String fileName
			, Proc parentProc
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
	}

	public JclStep(
			JCLParser.JclStepContext jclStepCtx
			, String fileName
			, Job parentJob
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
	}

	private void initialize() {
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
			this.pgmExecuted = 
				new KeywordOrSymbolicWrapper(
					this.execPgmStmtCtx.keywordOrSymbolic()
					, this.procName
					, this.LOGGER
					, this.CLI);
		} else {
			this.line = this.execProcStmtCtx.EXEC().getSymbol().getLine();
			if (this.execProcStmtCtx.stepName() == null) {
				this.stepName = "_NONAME_";
			} else {
				this.stepName = this.execProcStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.procExecuted = 
				new KeywordOrSymbolicWrapper(
					this.execProcStmtCtx.keywordOrSymbolic()
					, this.procName
					, this.LOGGER
					, this.CLI);
			for (JCLParser.ExecProcParmContext epp: this.execProcStmtCtx.execProcParm()) {
				this.setSym.add(
					new SetSymbolValue(
						epp
						, this.fileName
						, this.procName
						, this.getProcExecuted()
						, this.LOGGER
						, this.CLI));
			}
		}

		if (this.ddStmtAmlgnCtxs == null) {
		} else {
			for (JCLParser.DdStatementAmalgamationContext d: this.ddStmtAmlgnCtxs) {
				this.ddStatements.add(
					new DdStatementAmalgamation(
						d, this.procName, this.fileName, this.LOGGER, this.CLI));
			}
		}	
	}

	public void setTmpDirs(File baseDir, File tmpProcDir) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " " 
			+ this.stepName 
			+ " setTmpDirs(" 
			+ baseDir 
			+ "," 
			+ tmpProcDir 
			+ ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(
				this.myName 
				+ " " 
				+ this.stepName 
				+ " setTmpDirs baseDir set to |" 
				+ this.baseDir 
				+ "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(
				this.myName 
				+ " " 
				+ this.stepName 
				+ " setTmpDirs tmpProcDir set to |" 
				+ this.tmpProcDir 
				+ "|");
		}

	}

	public Boolean isExecProc() {
		return this.execProcStmtCtx != null;
	}

	public Boolean isExecPgm() {
		return this.execPgmStmtCtx != null;
	}

	/**
	IKJEFT01, IKJEFT1A, and IKJEFT1B are all entry points in the TSO
	command processor.  If this JclStep is executing TSO in batch, then
	it may be <i>secretly</i> executing other programs via the TSO CALL
	command or the RUN command of the DB2 DSN command processor.
	*/
	public Boolean isTSO() {
		return 
			this.isExecPgm() 
			&& (this.pgmExecuted.getValue().equals("IKJEFT01")
				|| this.pgmExecuted.getValue().equals("IKJEFT1A")
				|| this.pgmExecuted.getValue().equals("IKJEFT1B"));
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

	public StringBuffer getProcFileName() {
		StringBuffer sb = new StringBuffer(this.tmpProcDir.toString());
		sb.append(File.separator);
		sb.append(this.getProcExecuted());
		sb.append("-resolved-");
		sb.append(this.getResolvedSuffix());

		return sb;
	}

	public Proc getProc() {
		return this.proc;
	}

	public Proc getParentProc() {
		return this.parentProc;
	}

	public Job getParentJob() {
		return this.parentJob;
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

	public void setJcllib(ArrayList<KeywordOrSymbolicWrapper> jcllib) {
		this.jcllib = jcllib;
	}

	public void processSYSTSIN() {
		this.LOGGER.fine(this.myName + " " + this.stepName + " processSYSTSIN");
		if (this.isTSO()) {
			for (DdStatementAmalgamation dda: ddStatements){
				if (dda.getDdName().equals("SYSTSIN")) {
					dda.processSYSTSIN(tsoCallPgms, tsoDSNPgms, tsoDSNPlans);
				}
			}			
		} else {
			if (this.isExecPgm()) {
				this.LOGGER.finest(
						this.myName 
						+ " " 
						+ this.stepName 
						+ " not executing TSO, pgm = |" 
						+ this.pgmExecuted.getValue() 
						+ "|");
			} else {
				this.LOGGER.finest(
						this.myName 
						+ " " 
						+ this.stepName 
						+ " not executing TSO, proc = |" 
						+ this.procExecuted.getValue() 
						+ "|");
			}
		}
	}

	public void lexAndParse(ArrayList<Proc> procs, String fileName) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " lexAndParse procs = |" 
			+ procs 
			+ "| fileName = |" 
			+ fileName 
			+ "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLLexer lexer = new JCLLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		JCLParser parser = new JCLParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		JobListener listener = new JobListener(null, procs, fileName, this.getFileNb(), LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	public UUID getUUID() {
		return this.uuid;
	}

	public void lexAndParseProc() throws IOException {
		this.LOGGER.fine(this.myName + " " + this.stepName + " lexAndParseProc");
		if (this.isExecProc()) {
			this.LOGGER.fine(
						this.myName 
						+ " " 
						+ this.stepName 
						+ " lexAndParseProc procName = |" 
						+ this.procName 
						+ "|"
						);
			File aFile = new File(this.getProcFileName().toString());
			if (aFile.exists()) {
				this.LOGGER.fine(
							this.myName 
							+ " " 
							+ this.stepName 
							+ " lexAndParseProc aFile.getName() = |" 
							+ aFile.getName() 
							+ "| exists"
							);
				ArrayList<Proc> procs = new ArrayList<>();
				String fileName = this.getProcFileName().toString();
				this.lexAndParse(procs, fileName);
				if (procs.size() == 0) {
					this.LOGGER.severe(
						this.myName 
						+ " lexAndParseProc error parsing " 
						+ this.procName 
						+ " in " 
						+ fileName
						);
					return;
				}
				this.proc = procs.get(0);
				procs.get(0).setJcllib(this.jcllib);
				procs.get(0).setTmpDirs(this.baseDir, this.tmpProcDir);
				procs.get(0).setOrdNb(this.ordNb);
				procs.get(0).setJobOrdNb(this.jobOrdNb);
				procs.get(0).setParentJclStep(this);
				this.proc.lexAndParseProcs();
			} else {
				this.LOGGER.fine(
							this.myName 
							+ " " 
							+ this.stepName 
							+ " lexAndParseProc aFile.getName() = |" 
							+ aFile.getName() 
							+ "| does not exist"
							);
			}
		}
	}

	public void toTree(StringBuffer treeOut) {
		this.LOGGER.fine(this.myName + " " + this.stepName + " toTree");

		treeOut.append('\t');
		treeOut.append(this.stepName);
		treeOut.append('\t');
		treeOut.append(this.ordNb);
		treeOut.append('\t');
		if (this.isExecPgm()) {
			treeOut.append("PGM");
			treeOut.append('\t');
			treeOut.append(this.pgmExecuted.getValue());
		} else {
			treeOut.append("PROC");
			treeOut.append('\t');
			treeOut.append(this.procExecuted.getValue());
			if (this.proc != null) {
				treeOut.append(System.getProperty("line.separator"));
				this.proc.toTree(treeOut);
			}
		}
	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		this.LOGGER.fine(this.myName + " " + this.stepName + " toCSV");

		if (this.parentJob != null) {
			csvOut.append("JOBSTEP");
		} else {
			csvOut.append("PROCSTEP");
		}
		csvOut.append(",");
		csvOut.append(this.stepName);
		csvOut.append(",");
		csvOut.append(this.ordNb);
		csvOut.append(",");
		csvOut.append(parentUUID.toString());
		csvOut.append(",");
		csvOut.append(this.uuid.toString());
		csvOut.append(",");

		if (this.isExecPgm()) {
			csvOut.append("PGM");
			csvOut.append(",");
			csvOut.append(this.pgmExecuted.getValue());
			if (this.isTSO()) {
				for (String s: this.tsoCallPgms) {
					csvOut.append(System.getProperty("line.separator"));
					if (this.parentJob != null) {
						csvOut.append("JOBSTEPTSOCALL");
					} else {
						csvOut.append("PROCSTEPTSOCALL");
					}
					csvOut.append(",");
					csvOut.append(this.uuid.toString());
					csvOut.append(",");
					csvOut.append(UUID.randomUUID().toString());
					csvOut.append(",");
					csvOut.append(s);
				}
				int i = 0;
				for (String s: this.tsoDSNPgms) {
					csvOut.append(System.getProperty("line.separator"));
					if (this.parentJob != null) {
						csvOut.append("JOBSTEPDSNRUN");
					} else {
						csvOut.append("PROCSTEPDSNRUN");
					}
					csvOut.append(",");
					csvOut.append(this.uuid.toString());
					csvOut.append(",");
					csvOut.append(UUID.randomUUID().toString());
					csvOut.append(",");
					csvOut.append(s);
					csvOut.append(",");
					csvOut.append(tsoDSNPlans.get(i));
					i++;
				}
			}
		} else {
			csvOut.append("PROC");
			csvOut.append(",");
			csvOut.append(this.procExecuted.getValue());
			if (this.proc != null) {
				csvOut.append(System.getProperty("line.separator"));
				this.proc.toCSV(csvOut, this.uuid);
			}
		}

		for (DdStatementAmalgamation dda: ddStatements) {
			dda.toCSV(csvOut, this.uuid, this.parentJob != null);
		}
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
