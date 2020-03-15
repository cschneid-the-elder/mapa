

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

public class JobListener extends JCLParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
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
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.myName = this.getClass().getName();
	}

	@Override public void enterJobCard(JCLParser.JobCardContext ctx) {
		if (this.currJob == null) {
		} else {
			this.currJob.setEndLine(ctx.JOB().getSymbol().getLine() - 1);
		}
		this.currJob = new Job(ctx, fileName, this.LOGGER, this.CLI);
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
			this.currJob.addSetSym(new SetSymbolValue(ctx, this.fileName, this.procName));
		} else {
			this.currProc.addSetSym(new SetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
		this.currJclStep = null;
		this.currProc = new Proc(ctx, this.fileName, this.LOGGER, this.CLI);
		if (this.currJob == null) {
		} else {
			this.currJob.addInstreamProc(this.currProc);
		}
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		this.currProc.addSetSym(new SetSymbolValue(ctx, this.fileName, this.procName));
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
		if (this.currJclStep == null) {
			if (this.currProc == null) {
				this.currJob.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
			} else {
				this.currProc.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
			}
		}
	}

	@Override public void enterJclStep(JCLParser.JclStepContext ctx) {
		this.currJclStep = new JclStep(ctx, this.fileName, this.procName, this.LOGGER, this.CLI);
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
