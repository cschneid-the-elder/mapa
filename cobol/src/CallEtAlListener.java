
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CallEtAlListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<CobolProgram> programs = null;
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

	public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
		String newProgramName = ctx.getText();
		this.currProgram = null;

		for (CobolProgram pgm: this.programs) {
			if (pgm.hasThisProgramName(newProgramName)) {
				this.currProgram = pgm;
				break;
			}
			CobolProgram newPgm = pgm.nestedProgramNamed(newProgramName);
			if (newPgm != null) {
				this.currProgram = newPgm;
				break;
			}
		}

		if (this.currProgram == null) {
			throw new IllegalArgumentException(
				"program "
				+ newProgramName
				+ " not found in "
				+ this.programs);
		}
	}

	public void enterStatement(CobolParser.StatementContext ctx) {
		currProgram.incrementStatementCounter(ctx);
	}

	public void enterCallStatement(CobolParser.CallStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	@SuppressWarnings({"fallthrough"})
	public void enterExecCicsStatement(CobolParser.ExecCicsStatementContext ctx) {
		switch(ctx.cicsKeyword(0).getText().toUpperCase()) {
			case "LINK":
			case "XCTL": //intentional fall through
				CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
				this.currProgram.addCall(aCall);
				break;
			default:
				break;
		}
	}

	public void enterExecSqlCallStatement(CobolParser.ExecSqlCallStatementContext ctx) {
		CallWrapper aCall = new CallWrapper(ctx, this.currProgram.getProgramName(), this.aLib, this.LOGGER);
		this.currProgram.addCall(aCall);
	}

	public void enterAssignClause(CobolParser.AssignClauseContext ctx) {
		this.currProgram.addAssignClause(new AssignClause(ctx, this.LOGGER));
	}

	public void enterMoveStatement(CobolParser.MoveStatementContext ctx) {
		this.currProgram.addMoveStatement(new MoveStatement(ctx, this.LOGGER));
	}

	public void enterSetTo(CobolParser.SetToContext ctx) {
		this.currProgram.addSetTo(new Identifier(ctx.identifier(), this.LOGGER));
	}
}
