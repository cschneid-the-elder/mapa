

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

public class JobListener extends JCLParserBaseListener {

	public ArrayList<Job> jobs = null;
	public ArrayList<Proc> procs = null;
	public ArrayList<IncludeStatement> jobIncludes = new ArrayList<>();
	public ArrayList<IncludeStatement> procIncludes = new ArrayList<>();
	public String fileName = null;
	public String procName = null;
	public Job currJob = null;
	public JCLParser.ProcStatementContext currProcCtx = null;
	public ArrayList<SetSymbolValue> defs = new ArrayList<>();

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
		if (this.procName == null) {
			this.currJob.addSymbolic(new SetSymbolValue(ctx, this.fileName, this.procName));
		} else {
			this.defs.add(new SetSymbolValue(ctx, this.fileName, this.procName));
		}
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		this.currProcCtx = ctx;
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		this.defs.add(new SetSymbolValue(ctx, this.fileName, this.procName));
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		this.currJob.addInstreamProc(new InstreamProc(currProcCtx, ctx, this.defs, this.procIncludes, this.fileName));
		this.procName = null;
		this.defs = new ArrayList<>();
		this.procIncludes = new ArrayList<>();
	}

	@Override public void enterIncludeStatement(JCLParser.IncludeStatementContext ctx) {
		if (this.procName == null) {
			this.currJob.addInclude(new IncludeStatement(ctx, this.fileName, this.procName));
		} else {
			this.procIncludes.add(new IncludeStatement(ctx, this.fileName, this.procName));
		}
	}

	@Override public void exitStartRule(JCLParser.StartRuleContext ctx) {
		if (this.currJob == null) {
			this.procs.add(new Proc(this.currProcCtx, this.defs, this.procIncludes, this.fileName));
		}
	}

}
