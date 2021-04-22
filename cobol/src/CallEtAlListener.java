
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CallEtAlListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<CobolProgram> programs = null;
	public String callingModuleName = null;
	public String aLib = null;
	public CobolProgram currProgram = null;

	public CallEtAlListener(
			ArrayList<CobolProgram> programs
			, String aLib
			, Logger LOGGER) {
		super();
		this.aLib = aLib;
		this.LOGGER = LOGGER;
		this.programs = programs;
	}

	public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterProgramUnit(CobolParser.ProgramUnitContext ctx) {
		//not clear this is needed
	}

	public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
		String callingModuleName = ctx.getText();
		currProgram = null;

		for (CobolProgram pgm: this.programs) {
			if (pgm.hasThisProgramName(callingModuleName)) {
				currProgram = pgm;
				break;
			}
		}

		if (currProgram == null) {
			this.currProgram = new CobolProgram(callingModuleName, LOGGER);
			programs.add(this.currProgram);
		}
	}

	public void enterStatement(CobolParser.StatementContext ctx) {
		currProgram.incrementStatementCounter(ctx);
	}

	public void enterCallStatement(CobolParser.CallStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	public void enterExecCicsLinkStatement(CobolParser.ExecCicsLinkStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	public void enterExecCicsXctlStatement(CobolParser.ExecCicsXctlStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	public void enterExecSqlCallStatement(CobolParser.ExecSqlCallStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	public void enterAssignClause(CobolParser.AssignClauseContext ctx) {
		this.currProgram.addAssignClause(new AssignClause(ctx, this.LOGGER));
	}
}
