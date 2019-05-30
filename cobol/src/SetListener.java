
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetListener extends CobolParserBaseListener {
	private static Logger LOGGER = null;
	public ArrayList<CallWrapper> calls = null;
	public String callingModuleName = null;

	public SetListener( ArrayList<CallWrapper> al, Logger logger ) {
		super();
		calls = al;
		LOGGER = logger;
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	@Override public void enterProgramName(CobolParser.ProgramNameContext ctx) { 
 		callingModuleName = ctx.getText();

	}

	@Override public void enterMoveToStatement(CobolParser.MoveToStatementContext ctx) { 
		/**
			Possibilities:
			MOVE literal    TO identifier
			MOVE literal    TO identifier identifier identifier
			MOVE identifier TO identifier
			MOVE identifier TO identifier identifier identifier

			Usually it's the first one.
		*/
		//System.out.println("enterMoveToStatement: " + ctx.getClass().getName() + ": " + ctx.getText()); 
		for (CallWrapper call: calls) {
			if (call.identifier == null) continue; 
			if (!callingModuleName.equals(call.callingModuleName)) continue;
			for (CobolParser.IdentifierContext idCtx: ctx.identifier()) {
				LOGGER.finest("    idCtx: " + idCtx.getText());
				if (call.identifier.equals(idCtx.qualifiedDataName().qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER().toString())) {
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

	@Override public void enterSetTo(CobolParser.SetToContext ctx) { 
		LOGGER.finest("enterSetTo: " + ctx.getClass().getName() + ": " + ctx.getText()); 
		for (CallWrapper call: calls) {
			LOGGER.finest("  call.identifier = " + call.identifier);
			if (!callingModuleName.equals(call.callingModuleName)) continue;
			if (call.dataNode == null) continue;
			if (call.dataNode.children.size() == 0) continue;
			for (DDNode ee: call.dataNode.children) {
				if (!ee.isCondition()) continue;
				LOGGER.finest("    call.eightyEight = " + ee);
				LOGGER.finest("    ctx...IDENTIFIER() = " + ctx.identifier().qualifiedDataName().qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER());
				if (ee.identifier.equals(ctx.identifier().qualifiedDataName().qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER().toString())) {
					LOGGER.finest( "    ee.name.equals(ctx...IDENTIFIER())");
					call.addCalledModuleName(ee.valueInValueClause);
				}
			}
		}

	}

}
