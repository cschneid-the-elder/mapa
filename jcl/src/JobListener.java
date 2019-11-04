

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

public class JobListener extends JCLParserBaseListener {

	public ArrayList<Job> jobs = null;
	public ArrayList<Proc> procs = null;
	public String fileName = null;
	public String procName = null;
	public Job currJob = null;
	public InstreamProc currInstreamProc = null;
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
		this.currJob = new Job(ctx, fileName);
		this.jobs.add(this.currJob);
	}

	@Override public void enterJcllibStatement(JCLParser.JcllibStatementContext ctx) {
		this.currJob.addJcllib(ctx);
	}

	@Override public void enterSetOperation(JCLParser.SetOperationContext ctx) { 
		if (this.currInstreamProc == null) {
			if (this.currJob == null) {
				this.currProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
			} else {
				this.currJob.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
			}
		} else {
			this.currInstreamProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		if (this.currJob == null) {
			this.currProc = new Proc(ctx, this.fileName);
		} else {
			this.currInstreamProc = new InstreamProc(ctx, this.fileName);
			this.currJob.addInstreamProc(this.currInstreamProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		if (this.currInstreamProc == null) {
			this.currProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		} else {
			this.currInstreamProc.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		this.currInstreamProc.addPendCtx(ctx);
		this.procName = null;
		this.currInstreamProc = null;
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
			if (this.currInstreamProc == null) {
				if (this.currJob == null) {
					this.currProc.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
				} else {
					this.currJob.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
				}
			} else {
				this.currInstreamProc.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
			}
		}
	}

	@Override public void enterJclStep(JCLParser.JclStepContext ctx) {
		this.currJclStep = new JclStep(ctx, this.fileName, this.procName);
		if (this.currInstreamProc == null) {
			if (this.currJob == null) {
				this.currProc.addJclStep(this.currJclStep);
			} else {
				this.currJob.addJclStep(this.currJclStep);
			}
		} else {
			this.currInstreamProc.addJclStep(this.currJclStep);
		}
	}

	@Override public void exitStartRule(JCLParser.StartRuleContext ctx) {
		if (this.currJob == null) {
			this.procs.add(this.currProc);
		}
	}

}
