

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

public class PPListener extends JCLPPParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<PPJob> jobs = null;
	public ArrayList<PPProc> procs = null;
	public ArrayList<PPOp> stmts = null;
	public ArrayList<PPSetSymbolValue> sets = null;
	public String fileName = null;
	public String procName = null;
	public PPJob currJob = null;
	public PPProc currProc = null;
	public PPJclStep currJclStep = null;

	public PPListener(
			ArrayList<PPJob> jobs
			, ArrayList<PPProc> procs
			, ArrayList<PPOp> stmts
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.jobs = jobs;
		this.procs = procs;
		this.stmts = stmts;
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterJobCard(JCLPPParser.JobCardContext ctx) {
		if (this.currJob == null) {
		} else {
			this.currJob.setEndLine(ctx.JOB().getSymbol().getLine() - 1);
		}
		this.currJob = new PPJob(ctx, fileName, LOGGER, CLI);
		this.jobs.add(this.currJob);
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
		this.stmts.add(new PPOp(ctx, this.fileName, this.procName));
	}

	@Override public void enterJcllibStatement(JCLPPParser.JcllibStatementContext ctx) {
		this.currJob.addJcllib(ctx);
	}

	@Override public void enterCommandStatement(JCLPPParser.CommandStatementContext ctx) {
		this.stmts.add(new PPOp(ctx, this.fileName, this.procName));
	}

	@Override public void enterJclCommandStatement(JCLPPParser.JclCommandStatementContext ctx) {
		this.stmts.add(new PPOp(ctx, this.fileName, this.procName));
	}

	@Override public void enterScheduleStatement(JCLPPParser.ScheduleStatementContext ctx) {
		this.stmts.add(new PPOp(ctx, this.fileName, this.procName));
	}

	@Override public void enterNotifyStatement(JCLPPParser.NotifyStatementContext ctx) {
		this.stmts.add(new PPOp(ctx, this.fileName, this.procName));
	}

	@Override public void enterOutputStatement(JCLPPParser.OutputStatementContext ctx) {
		this.stmts.add(new PPOp(ctx, this.fileName, this.procName));
	}

	@Override public void enterXmitStatement(JCLPPParser.XmitStatementContext ctx) {

	}

	@Override public void enterSetOperation(JCLPPParser.SetOperationContext ctx) {
		/**
			A SET statement is considered to be part of the current "owning" entity - 
			either the current Job or the current Proc.

		*/

		if (this.currProc == null) {
			this.currJob.addSymbolic(new PPSetSymbolValue(ctx, this.fileName, null));
		} else {
			this.currProc.addSymbolic(new PPSetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterProcStatement(JCLPPParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		this.currProc = new PPProc(ctx, this.fileName);
		if (this.currJob == null) {
		} else {
			this.currJob.addInstreamProc(this.currProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLPPParser.DefineSymbolicParameterContext ctx) {
		this.currProc.addSymbolic(new PPSetSymbolValue(ctx, this.fileName, this.procName));
	}

	@Override public void enterPendStatement(JCLPPParser.PendStatementContext ctx) {
		this.currProc.addPendCtx(ctx);
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
	}

	@Override public void enterIncludeStatement(JCLPPParser.IncludeStatementContext ctx) {
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
		if (this.currProc == null) {
			this.currJob.addInclude(new PPIncludeStatement(ctx, this.fileName, this.procName));
		} else {
			this.currProc.addInclude(new PPIncludeStatement(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterJclStep(JCLPPParser.JclStepContext ctx) {
		/**
			A JCL step is considered to be part of the current "owning" entity - 
			either the current Job or the current Proc.

		*/

		this.currJclStep = new PPJclStep(ctx, this.fileName, this.procName);
		if (this.currProc == null) {
			this.currJob.addJclStep(this.currJclStep);
		} else {
			this.currProc.addJclStep(this.currJclStep);
		}
	}

	@Override public void exitStartRule(JCLPPParser.StartRuleContext ctx) {
		/**
			It is convenient to have the end line of the current Job or Proc.
			In-stream procs will have been ended by their PEND statement.
		*/

		if (this.currJob == null) {
			if (this.currProc == null) {
			} else {
				this.currProc.setEndLine(ctx.getStop().getLine());
				this.procs.add(this.currProc);
			}
		} else {
			this.currJob.setEndLine(ctx.getStop().getLine());
		}
	}

}
