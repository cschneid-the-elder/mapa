/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

/**
Once preprocessing is complete, this listener is used to obtain
the relevant components of the JCL being processed.
*/
public class JobListener extends JCLParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	public ArrayList<Job> jobs = null;
	public ArrayList<Proc> procs = null;
	public String fileName = null;
	public String procName = null;
	public Job currJob = null;
	public Proc currProc = null;
	public JclStep currJclStep = null;
	public int nbJobs = 0;
	public int fileNb = 0;
	private Boolean errorCharsFound = false;

	public JobListener(
			ArrayList<Job> jobs
			, ArrayList<Proc> procs
			, String fileName
			, int fileNb
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
	}

	@Override public void enterJobCard(JCLParser.JobCardContext ctx) {
		if (this.currJob == null) {
		} else {
			this.currJob.setEndLine(ctx.JOB().getSymbol().getLine() - 1);
		}
		this.nbJobs++;
		this.currJob = new Job(ctx, fileName, this.nbJobs, this.fileNb, this.LOGGER, this.CLI);
		if (this.jobs == null) {
			this.LOGGER.warning(this.myName + " ignoring job " + currJob);
		} else {
			this.jobs.add(this.currJob);
		}
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
	}

	@Override public void enterJcllibStatement(JCLParser.JcllibStatementContext ctx) {
		this.currJob.addJcllib(ctx);
	}

	@Override public void enterSetOperation(JCLParser.SetOperationContext ctx) { 
		if (this.currProc == null) {
			this.currJob.addSetSym(
				new SetSymbolValue(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		} else {
			this.currProc.addSetSym(
				new SetSymbolValue(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		}
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		this.currProc = new Proc(ctx, this.fileName, this.fileNb, this.LOGGER, this.CLI);
		if (this.currJob == null) {
		} else {
			this.currJob.addInstreamProc(this.currProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		this.currProc.addSetSym(
			new SetSymbolValue(
				ctx
				, this.fileName
				, this.procName
				, this.LOGGER
				, this.CLI));
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		this.currProc.addPendCtx(ctx);
		if (this.procs == null) {
			if (this.currJob == null) {
				this.LOGGER.warning(this.myName + " ignoring proc " + currProc);
			}
		} else {
			this.procs.add(this.currProc);
		}
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
	}

	@Override public void enterIncludeStatement(JCLParser.IncludeStatementContext ctx) {
		/**
			An IncludeStatement is considered to be part of the current "owning" entity - 
			either the current Job or the current Proc.

			Consider...

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

			...the IncludeStatement CHIANA is attached to Job ZHANN.  The
			IncludeStatement DARGO is standalone and attached to Proc RYGEL.  The
			IncludeStatement TALYN is also attached to Proc RYGEL.  The IncludeStatement
			CRICHTON is attached to Job ZHANN.  The IncludeStatement AERYN
			is also attached to Job ZHANN.
		*/
		if (this.currProc == null && this.currJob == null) {
			this.currProc = new Proc(this.fileName, this.LOGGER, this.CLI);
			this.currProc.addInclude(
				new IncludeStatement(
					ctx
					, this.fileName
					, this.currProc.getProcName()
					, this.LOGGER
					, this.CLI));
		} else if (this.currProc == null) {
			this.currJob.addInclude(
				new IncludeStatement(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		} else {
			this.currProc.addInclude(
				new IncludeStatement(
					ctx
					, this.fileName
					, this.procName
					, this.LOGGER
					, this.CLI));
		}
	}

	@Override public void enterJclStep(JCLParser.JclStepContext ctx) {
		if (this.currProc == null && this.currJob == null) {
			this.currProc = new Proc(this.fileName, this.LOGGER, this.CLI);
			this.currJclStep = new JclStep(ctx, this.fileName, this.currProc, this.LOGGER, this.CLI);
			this.currProc.addJclStep(this.currJclStep);
		} else if (this.currProc == null) {
			this.currJclStep = new JclStep(ctx, this.fileName, this.currJob, this.LOGGER, this.CLI);
			this.currJob.addJclStep(this.currJclStep);
		} else {
			this.currJclStep = new JclStep(ctx, this.fileName, this.currProc, this.LOGGER, this.CLI);
			this.currProc.addJclStep(this.currJclStep);
		}
	}

	@Override public void enterErrorChars(JCLParser.ErrorCharsContext ctx) {
		this.errorCharsFound = true;	
	}

	/**
	It is convenient to have the end line of the current Job or Proc.
	<p>In-stream procs will have been ended by their PEND statement.
	<p>If any unexpected characters have been found, indicated by the
	errorChars rule being entered, then all processing is thrown away as
	the input isn't valid JCL.
	*/
	@Override public void exitStartRule(JCLParser.StartRuleContext ctx) {
		if (this.errorCharsFound) {
			this.procs.clear();
			this.jobs.clear();
			this.currJob = null;
			this.currProc = null;
		}

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

}
