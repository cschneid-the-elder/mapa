
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
*/

class CicsKeywordWithArg {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.CicsKeywordWithArgContext ctx = null;
	private CobolWord keyword = null;
	private Identifier identifier = null;
	private Literal literal = null;
	private Boolean isProgram = false;

	public CicsKeywordWithArg(
			CobolParser.CicsKeywordWithArgContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.keyword = new CobolWord(this.ctx.cobolWord());

		if (this.ctx.identifier() != null) {
			this.identifier = new Identifier(this.ctx.identifier(), this.LOGGER);
		}

		if (this.ctx.literal() != null) {
			this.literal = new Literal(this.ctx.literal());
		}

		if (this.keyword.getText().toUpperCase().equals("PROGRAM")) {
			this.isProgram = true;
		}
	}

	public CobolWord getKeyword() {
		return this.keyword;
	}

	public String getArgString() {
		if (this.identifier == null) {
			return this.literal.getText();
		} else {
			return this.identifier.getDataNameText();
		}
	}

	public Identifier getIdentifier() {
		return this.identifier;
	}

	public Literal getLiteral() {
		return this.literal;
	}

	public CobolParser.IdentifierContext getIdentifierContext() {
		return this.ctx.identifier();
	}

	public CobolParser.LiteralContext getLiteralContext() {
		return this.ctx.literal();
	}

	public Boolean isProgram() {
		return this.isProgram;
	}
}
