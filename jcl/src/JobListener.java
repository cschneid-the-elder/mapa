

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

public class JobListener extends JCLParserBaseListener {

	public ArrayList<Job> jobs = null;
	public ArrayList<Proc> procs = null;
	public String fileName = null;
	public String procName = null;
	public Job currJob = null;
	public Proc currProc = null;
	public JclStep currJclStep = null;

	public JobListener(
			ArrayList<Job> jobs
			, ArrayList<Proc> procs
			, String fileName
			) {
		super();
		this.jobs = jobs;
		this.procs = procs;
		this.fileName = fileName;
	}

	@Override public void enterJobCard(JCLParser.JobCardContext ctx) {
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

	@Override public void enterJcllibStatement(JCLParser.JcllibStatementContext ctx) {
		this.currJob.addJcllib(ctx);
	}

	@Override public void enterSetOperation(JCLParser.SetOperationContext ctx) { 
		if (this.currProc == null) {
			this.currJob.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		} else {
			this.currProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		this.currProc = new Proc(ctx, this.fileName);
		if (this.currJob == null) {
		} else {
			this.currJob.addInstreamProc(this.currProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		this.currProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		this.currProc.addPendCtx(ctx);
		this.procName = null;
		this.currProc = null;
		this.currJclStep = null;
	}

	@Override public void enterIncludeStatement(JCLParser.IncludeStatementContext ctx) {
		/**
			If a JclStep has been encountered then any IncludeStatement encountered will
			be picked up as part of a JclStep.  If a JclStep has _not_ been encountered then
			any IncludeStatement encountered stands on its own and is not considered a part
			of any JclStep and therefore must be added to the "owning" entity - either the
			current Job, the current Proc, or the current InstreamProc.  Whether there is
			a currently extant JclStep is reset on encountering a PROC or PEND statement.

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

			...the IncludeStatement CHIANA is standalone and attached to Job ZHANN.  The
			IncludeStatement DARGO is standalone and attached to InstreamProc RYGEL.  The
			IncludeStatement TALYN is attached to JclStep PS01.  The IncludeStatement
			CRICHTON is standalone and attached to Job ZHANN.  The IncludeStatement AERYN
			is attached to JS01.
		*/
		if (this.currJclStep == null) {
			if (this.currProc == null) {
				this.currJob.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
			} else {
				this.currProc.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
			}
		}
	}

	@Override public void enterJclStep(JCLParser.JclStepContext ctx) {
		this.currJclStep = new JclStep(ctx, this.fileName, this.procName);
		if (this.currProc == null) {
			this.currJob.addJclStep(this.currJclStep);
		} else {
			this.currProc.addJclStep(this.currJclStep);
		}
	}

	@Override public void exitStartRule(JCLParser.StartRuleContext ctx) {
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
