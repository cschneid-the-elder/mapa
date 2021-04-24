
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<CobolProgram> programs = null;
	public CobolProgram currProgram = null;

	public SetListener(
			ArrayList<CobolProgram> programs
			, Logger LOGGER ) {
		super();
		this.LOGGER = LOGGER;
	}

	public void enterEveryRule(ParserRuleContext ctx) {
		//LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
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

	public void enterMoveToStatement(CobolParser.MoveToStatementContext ctx) { 
		/**
			Possibilities:
			MOVE literal    TO identifier
			MOVE literal    TO identifier identifier identifier
			MOVE identifier TO identifier
			MOVE identifier TO identifier identifier identifier

			Usually it's the first one.
		*/
		//System.out.println("enterMoveToStatement: " + ctx.getClass().getName() + ": " + ctx.getText()); 
		for (CallWrapper call: this.currProgram.getCalledNodes()) {
			if (call.getIdentifier() == null) continue; 
			//if (!currProgram.hasThisProgramName(call)) continue;
			for (CobolParser.IdentifierContext idCtx: ctx.identifier()) {
				LOGGER.finest("    idCtx: " + idCtx.getText());
				if (call.getIdentifier().equals(idCtx.qualifiedDataName().qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER().toString())) {
					LOGGER.finest("      call.identifier: " + call.identifier);
					if (ctx.moveToSendingArea().literal() == null) {
						/**
							setting the CALL identifier value to that of another 
							working-storage or linkage section variable.  Hm.  Tricky.
						*/
					} else {
						call.addCalledModuleName(ctx.moveToSendingArea().literal().NONNUMERICLITERAL().toString());
					}
				}
			}
		}

	}

	public void enterSetTo(CobolParser.SetToContext ctx) { 
		LOGGER.finest("enterSetTo: " + ctx.getClass().getName() + ": " + ctx.getText()); 
		for (CallWrapper call: this.currProgram.getCalledNodes()) {
			LOGGER.finest("  call.identifier = " + call.getIdentifier());
			//if (!currProgram.hasThisProgramName(call)) continue;
			if (call.dataNode == null) continue;
			for (DDNode ee: call.getDataNode().getChildren()) {
				if (!ee.isCondition()) continue;
				LOGGER.finest("    call.eightyEight = " + ee);
				LOGGER.finest("    ctx...IDENTIFIER() = " + ctx.identifier().qualifiedDataName().qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER());
				if (ee.getIdentifier().equals(ctx.identifier().qualifiedDataName().qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER().toString())) {
					LOGGER.finest( "    ee.name.equals(ctx...IDENTIFIER())");
					call.addCalledModuleName(ee.getValueInValueClause());
				}
			}
		}

	}

}
