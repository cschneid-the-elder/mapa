
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DLIListener extends DLIParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<ImsSegmentName> imsSegments = new ArrayList<>();

	public DLIListener(Logger LOGGER) {
		super();
		this.LOGGER = LOGGER;
	}

	@Override public void enterEveryRule(ParserRuleContext ctx) { 
		this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	@Override public void enterSegmentOption(DLIParser.SegmentOptionContext ctx) {
		this.imsSegments.add(new ImsSegmentName(ctx, this.LOGGER));
	}

}
