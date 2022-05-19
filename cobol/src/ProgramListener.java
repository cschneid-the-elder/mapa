
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

	public void addNewProgram(String newPgmName, CobolProgramType type) {
		CobolProgram newPgm = new CobolProgram(newPgmName, type, this.LOGGER);
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

	public void enterIdentificationDivision(CobolParser.IdentificationDivisionContext ctx) {
	    if (ctx.programIdParagraph() != null) {
	    	this.addNewProgram(ctx.programIdParagraph().programName().getText(), CobolProgramType.PROGRAM);
	    } else if (ctx.functionIdParagraph() != null) {
	    	this.addNewProgram(ctx.functionIdParagraph().userFunctionName().getText(), CobolProgramType.FUNCTION);
	    } else if (ctx.classIdParagraph() != null) {
	    	this.addNewProgram(ctx.classIdParagraph().className().getText(), CobolProgramType.CLASS);
	    }
	    /*
	    Note that other types of Identification Division (Factory, et. al.) do
	    not change the current program.  This is intentional, those other types
	    aren't real changes in the current program.
	    */
	}

	public void enterEndProgramStatement(CobolParser.EndProgramStatementContext ctx) {
		this.pgmStack.pop();
		LOGGER.finest(" enterEndProgramStatement exit pgmStack = " + this.pgmStack);
	}

	public void enterEndFunctionStatement(CobolParser.EndFunctionStatementContext ctx) {
		this.pgmStack.pop();
		LOGGER.finest(" enterEndFunctionStatement exit pgmStack = " + this.pgmStack);
	}

	public void enterEndClassStatement(CobolParser.EndClassStatementContext ctx) {
		this.pgmStack.pop();
		LOGGER.finest(" enterEndClassStatement exit pgmStack = " + this.pgmStack);
	}
}
