
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ProgramListener extends CobolParserBaseListener {
	public ArrayList<CobolProgram> programs = null;
	public CobolProgram currProgram = null;
	public ArrayDeque<CobolProgram> pgmStack = new ArrayDeque<>();
	public Logger LOGGER = null;

	public ProgramListener(
			ArrayList<CobolProgram> programs
			, Logger LOGGER
			) {
		super();
		this.programs = programs;
		this.LOGGER = LOGGER;
	}

	public void enterEveryRule(ParserRuleContext ctx) {
		//LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterProgramIdParagraph(CobolParser.ProgramIdParagraphContext ctx) {
		String newPgmName = ctx.programName().getText();
		CobolProgram newPgm = new CobolProgram(newPgmName, this.LOGGER);
		CobolProgram currProgram = pgmStack.peek();
		if (currProgram == null) {
			this.programs.add(newPgm);
		} else {
			currProgram.addProgram(newPgm);
			newPgm.setParent(currProgram);
		}
		this.pgmStack.push(newPgm);
		LOGGER.finest(" enterProgramName exit pgmStack = " + this.pgmStack);
		LOGGER.finest(" enterProgramName exit newPgm = " + newPgm);
		LOGGER.finest(" enterProgramName exit currProgram = " + currProgram);
	}

	public void enterEndProgramStatement(CobolParser.EndProgramStatementContext ctx) {
		this.pgmStack.pop();
		LOGGER.finest(" enterEndProgramStatement exit pgmStack = " + this.pgmStack);
	}
}
