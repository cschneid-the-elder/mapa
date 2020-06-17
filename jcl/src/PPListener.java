/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/

import java.util.*;
import java.util.logging.Logger;
import java.io.*;
import org.antlr.v4.runtime.tree.*;

/**
Preprocessor listener, used to instantiate objects of interest
found by the parser.

<p>This listener is used extensively in preprocessing, where symbolics
are resolved according to arcane rules.
*/
public class PPListener extends JCLPPParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	public ArrayList<PPJob> jobs = null;
	public ArrayList<PPProc> procs = null;
	public ArrayList<PPSetSymbolValue> sets = null;
	public String fileName = null;
	public String procName = null;
	public PPJob currJob = null;
	public PPProc currProc = null;
	public PPJclStep currJclStep = null;
	public int nbJobs = 0;
	public int fileNb = 0;
	public File baseDir = null;
	public File tmpJobDir = null;
	public File tmpProcDir = null;

	public PPListener(
			ArrayList<PPJob> jobs
			, ArrayList<PPProc> procs
			, String fileName
			, int fileNb
			, File baseDir
			, File tmpJobDir
			, File tmpProcDir
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		if (jobs == null) {
		} else {
			this.jobs = jobs;
		}
		if (procs == null) {
		} else {
			this.procs = procs;
		}
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.baseDir = baseDir;
		this.tmpJobDir = tmpJobDir;
		this.tmpProcDir = tmpProcDir;
	}

	@Override public void enterJobCard(JCLPPParser.JobCardContext ctx) {
		if (this.currJob == null) {
		} else {
			this.currJob.setEndLine(ctx.JOB().getSymbol().getLine() - 1);
		}
		this.nbJobs++;
		if (tmpJobDir == null && tmpProcDir == null) {
			this.currJob = 
				new PPJob(
					ctx
					, this.fileName
					, this.nbJobs
					, this.fileNb
					, this.baseDir
					, this.LOGGER
					, this.CLI);
		} else {
			this.currJob = 
				new PPJob(
					ctx
					, this.fileName
					, this.nbJobs
					, this.fileNb
					, this.baseDir
					, this.tmpJobDir
					, this.tmpProcDir
					, this.LOGGER
					, this.CLI);
		}
		if (this.jobs == null) {
			this.LOGGER.warning(this.myName + " ignoring job " + currJob);
		} else {
			this.jobs.add(this.currJob);
		}
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
		this.currJob.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
	}

	@Override public void enterJcllibStatement(JCLPPParser.JcllibStatementContext ctx) {
		if (this.jobs == null) {
		} else {
			this.currJob.addJcllib(ctx);
		}
	}

	@Override public void enterCommandStatement(JCLPPParser.CommandStatementContext ctx) {
		if (this.currProc == null) {
			this.currJob.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		} else {
			this.currProc.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		}
	}

	@Override public void enterJclCommandStatement(JCLPPParser.JclCommandStatementContext ctx) {
		if (this.currProc == null) {
			this.currJob.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		} else {
			this.currProc.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		}
	}

	@Override public void enterScheduleStatement(JCLPPParser.ScheduleStatementContext ctx) {
		if (this.currProc == null) {
			this.currJob.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		} else {
			this.currProc.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		}
	}

	@Override public void enterNotifyStatement(JCLPPParser.NotifyStatementContext ctx) {
		if (this.currProc == null) {
			this.currJob.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		} else {
			this.currProc.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		}
	}

	@Override public void enterOutputStatement(JCLPPParser.OutputStatementContext ctx) {
		if (this.currProc == null) {
			this.currJob.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		} else {
			this.currProc.addOp(new PPOp(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		}
	}

	@Override public void enterXmitStatement(JCLPPParser.XmitStatementContext ctx) {

	}

	/**
	A SET statement is considered to be part of the current "owning" entity - 
	either the current Job or the current Proc.
	*/
	@Override public void enterSetOperation(JCLPPParser.SetOperationContext ctx) {

		if (this.currProc == null) {
			this.currJob.addSetSym(new PPSetSymbolValue(ctx, this.fileName, null, this.LOGGER, this.CLI));
		} else {
			this.currProc.addSetSym(new PPSetSymbolValue(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
		}
	}

	@Override public void enterProcStatement(JCLPPParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		this.currProc = this.createCurrProc(ctx);
		if (this.currJob == null) {
		} else {
			this.currJob.addInstreamProc(this.currProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLPPParser.DefineSymbolicParameterContext ctx) {
		this.currProc.addSetSym(new PPSetSymbolValue(ctx, this.fileName, this.procName, this.LOGGER, this.CLI));
	}

	@Override public void enterPendStatement(JCLPPParser.PendStatementContext ctx) {
		this.currProc.addPendCtx(ctx);
		if (this.procs == null) {
			if (this.currJob == null) {
				this.LOGGER.warning(this.myName + " ignoring proc " + currProc);
			}
		} else {
			if (this.currJob == null) {
				this.procs.add(this.currProc);
			}
		}
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
	}

	/**
	An IncludeStatement is considered to be part of the current "owning" entity - 
	either the current Job or the current Proc.

	<p>Consider...<p>
	<code>
			//ZHANN JOB
			//      INCLUDE MEMBER=CHIANA
			//RYGEL PROC
			//      INCLUDE MEMBER=DARGO
			//PS01  EXEC PGM=CRAIS
			//      INCLUDE MEMBER=TALYN
			//      PEND
			//      INCLUDE MEMBER=CRICHTON
			//JS01  EXEC PROC=RYGEL
			//      INCLUDE MEMBER=AERYN
	</code>

	<p>...the IncludeStatement CHIANA is attached to Job ZHANN.  The
	IncludeStatement DARGO is standalone and attached to Proc RYGEL.  The
	IncludeStatement TALYN is also attached to Proc RYGEL.  The IncludeStatement
	CRICHTON is attached to Job ZHANN.  The IncludeStatement AERYN
	is also attached to Job ZHANN.
	*/
	@Override public void enterIncludeStatement(JCLPPParser.IncludeStatementContext ctx) {
		if (this.currProc == null && this.currJob == null) {
			/**
			A cataloged proc need not have a PROC statement.  Thus it is
			possible to encounter an INCLUDE without having an owning
			entity.
			*/
			this.LOGGER.warning(
				this.myName 
				+ " INCLUDE at line " 
				+ ctx.SS().getSymbol().getLine() 
				+ " encountered with this.currProc == null && this.currJob == null");
			this.currProc = this.createCurrProc();
			this.currProc.addInclude(
				new PPIncludeStatement(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		} else if (this.currProc == null) {
			this.currJob.addInclude(
				new PPIncludeStatement(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		} else {
			this.currProc.addInclude(
				new PPIncludeStatement(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		}
	}

	/**
	A JCL step is considered to be part of the current "owning" entity - 
	either the current Job or the current Proc.
	*/
	@Override public void enterJclStep(JCLPPParser.JclStepContext ctx) {

		if (this.currProc == null && this.currJob == null) {
			/**
			A cataloged proc need not have a PROC statement.  Thus it is
			possible to encounter a JclStep without having an owning
			entity.
			*/
			this.currProc = this.createCurrProc();
			this.currJclStep = new PPJclStep(ctx, this.fileName, this.currProc, this.LOGGER, this.CLI);
			this.currProc.addJclStep(this.currJclStep);
		} else if (this.currProc == null) {
			this.currJclStep = new PPJclStep(ctx, this.fileName, this.currJob, this.LOGGER, this.CLI);
			this.currJob.addJclStep(this.currJclStep);
		} else {
			this.currJclStep = new PPJclStep(ctx, this.fileName, this.currProc, this.LOGGER, this.CLI);
			this.currProc.addJclStep(this.currJclStep);
		}
	}

	/**
	It is convenient to have the end line of the current Job or Proc.
	<p>In-stream procs will have been ended by their PEND statement.
	*/
	@Override public void exitStartRule(JCLPPParser.StartRuleContext ctx) {

		if (this.currJob == null) {
			if (this.currProc == null) {
			} else {
				this.currProc.setEndLine(ctx.getStop().getLine());
				if (this.procs == null) {
					this.LOGGER.warning(this.myName + " ignoring proc " + currProc);
				} else {
					this.procs.add(this.currProc);
				}
			}
		} else {
			this.currJob.setEndLine(ctx.getStop().getLine());
		}
	}

	private PPProc createCurrProc() {
		PPProc aProc = null;

		if (this.tmpProcDir == null) {
			aProc = new PPProc(
						this.fileName
						, this.fileNb
						, this.baseDir
						, this.LOGGER
						, this.CLI);
		} else {
			aProc = new PPProc(
						this.fileName
						, this.fileNb
						, this.baseDir
						, this.tmpProcDir
						, this.LOGGER
						, this.CLI);
		}

		return aProc;
	}

	private PPProc createCurrProc(JCLPPParser.ProcStatementContext ctx) {
		PPProc aProc = null;

		if (this.tmpProcDir == null) {
			aProc = new PPProc(
						ctx
						, this.fileName
						, this.fileNb
						, this.baseDir
						, this.LOGGER
						, this.CLI);
		} else {
			aProc = new PPProc(
						ctx
						, this.fileName
						, this.fileNb
						, this.baseDir
						, this.tmpProcDir
						, this.LOGGER
						, this.CLI);
		}

		return aProc;
	}


}
