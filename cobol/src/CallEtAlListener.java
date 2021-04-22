
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CallEtAlListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<CallWrapper> calledNodes = null;
	public ArrayList<AssignClause> assignClauses = null;
	public String callingModuleName = null;
	public String aLib = null;

	public CallEtAlListener(
			ArrayList<CallWrapper> al
			, ArrayList<AssignClause> assignClauses
			, String aLib
			, Logger LOGGER) {
		super();
		this.calledNodes = al;
		this.aLib = aLib;
		this.LOGGER = LOGGER;
		this.assignClauses = assignClauses;
	}

	public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterProgramUnit(CobolParser.ProgramUnitContext ctx) {
		//not clear this is needed
	}

	public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
		callingModuleName = ctx.getText();
	}

	public void enterCallStatement(CobolParser.CallStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib, this.LOGGER);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	public void enterExecCicsLinkStatement(CobolParser.ExecCicsLinkStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib, this.LOGGER);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	public void enterExecCicsXctlStatement(CobolParser.ExecCicsXctlStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib, this.LOGGER);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	public void enterExecSqlCallStatement(CobolParser.ExecSqlCallStatementContext ctx) {
		Boolean found = false;
		CallWrapper aCall = new CallWrapper(ctx, this.callingModuleName, this.aLib, this.LOGGER);
		for (CallWrapper cw: calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) calledNodes.add(aCall);
	}

	public void enterAssignClause(CobolParser.AssignClauseContext ctx) {
		assignClauses.add(new AssignClause(ctx, this.LOGGER));
	}
}
