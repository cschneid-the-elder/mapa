
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This listener is intended to be used on the List<TerminalNode> ARG()
text resulting from parsing with the CICSz parser.  The text may be
a COBOL identifier (a variable in Working-Storage, Local-Storage,
et. al.), a literal, or a constant entry.

There should be only one of these to be found.
*/
public class IdentifierEtAlListener extends CobolParserBaseListener {
	private Logger LOGGER = null;
	private CobolParser.IdentifierContext identifierCtx = null;
	private CobolParser.LiteralContext literalCtx = null;
	private CobolParser.ConstantEntryContext constantCtx = null;

	public IdentifierEtAlListener(Logger LOGGER) {
		super();
		this.LOGGER = LOGGER;
	}

	@Override public void enterIdentifier(CobolParser.IdentifierContext ctx) {
		this.identifierCtx = ctx;
	}

	@Override public void enterLiteral(CobolParser.LiteralContext ctx) {
		this.literalCtx = ctx;
	}

	@Override public void enterConstantEntry(CobolParser.ConstantEntryContext ctx) {
		this.constantCtx = ctx;
	}

	public CobolParser.IdentifierContext getIdentifierCtx() {
		return this.identifierCtx;
	}

	public CobolParser.LiteralContext getLiteralCtx() {
		return this.literalCtx;
	}
		
	public CobolParser.ConstantEntryContext getConstantCtx() {
		return this.constantCtx;
	}

}
