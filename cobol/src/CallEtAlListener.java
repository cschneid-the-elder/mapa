
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CallEtAlListener extends CobolParserBaseListener {
	public ArrayList<CallWrapper> calledNodes = null;
	public String callingModuleName = null;
	public String aLib = null;

	public CallEtAlListener(ArrayList<CallWrapper> al, String aLib) {
		super();
		this.calledNodes = al;
		this.aLib = aLib;
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//TestIntegration.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	@Override public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
		callingModuleName = ctx.getText();
	}

	@Override public void enterCallStatement(CobolParser.CallStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	@Override public void enterExecCicsLinkStatement(CobolParser.ExecCicsLinkStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	@Override public void enterExecCicsXctlStatement(CobolParser.ExecCicsXctlStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	@Override public void enterExecSqlCallStatement(CobolParser.ExecSqlCallStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	public void enterAssignClause(CobolParser.AssignClauseContext ctx) {

	}
}
