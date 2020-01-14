

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

public class PPListener extends JCLPPParserBaseListener {

	public ArrayList<Job> jobs = null;
	public ArrayList<Proc> procs = null;
	public ArrayList<SetSymbolValue> sets = null;
	public String fileName = null;
	public String procName = null;
	public Job currJob = null;
	public Proc currProc = null;
	public JclStep currJclStep = null;

	public PPListener(
			ArrayList<Job> jobs
			, ArrayList<Proc> procs
			, String fileName
			) {
		super();
		this.jobs = jobs;
		this.procs = procs;
		this.fileName = fileName;
	}

	@Override public void enterJobCard(JCLPPParser.JobCardContext ctx) {
		if (this.currJob == null) {
		} else {
			this.currJob.setEndLine(ctx.JOB().getSymbol().getLine() - 1);
		}
		this.currJob = new Job(ctx, fileName);
		this.jobs.add(this.currJob);
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
	}

	@Override public void enterJcllibStatement(JCLPPParser.JcllibStatementContext ctx) {
		this.currJob.addJcllib(ctx);
	}

	@Override public void enterNotifyStatement(JCLPPParser.NotifyStatementContext ctx) {

	}

	@Override public void enterOutputStatement(JCLPPParser.OutputStatementContext ctx) {

	}

	@Override public void enterXmitStatement(JCLPPParser.XmitStatementContext ctx) {

	}

	@Override public void enterSetOperation(JCLPPParser.SetOperationContext ctx) { 
		if (this.currProc == null) {
			this.currJob.addSymbolic(new SetSymbolValue(ctx, this.fileName, null));
		} else {
			this.currProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterProcStatement(JCLPPParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		this.currProc = new Proc(ctx, this.fileName);
		if (this.currJob == null) {
		} else {
			this.currJob.addInstreamProc(this.currProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLPPParser.DefineSymbolicParameterContext ctx) {
		this.currProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
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
			this.currJob.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
		} else {
			this.currProc.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterJclStep(JCLPPParser.JclStepContext ctx) {
		this.currJclStep = new JclStep(ctx, this.fileName, this.procName);
		if (this.currProc == null) {
			this.currJob.addJclStep(this.currJclStep);
		} else {
			this.currProc.addJclStep(this.currJclStep);
		}
	}

	@Override public void enterSetOperation(JCLPPParser.SetOperationContext ctx) { 
		this.sets.add(new SetSymbolValue(ctx));
	}

	@Override public void exitStartRule(JCLPPParser.StartRuleContext ctx) {
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
