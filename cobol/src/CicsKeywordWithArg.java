
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
	private String keyword = null;
	private Identifier identifier = null;
	private Literal literal = null;
	private Boolean isProgram = false;
	private Boolean isTransID = false;
	private Boolean isFile = false;

	public CicsKeywordWithArg(
			CobolParser.CicsKeywordWithArgContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		if (this.ctx.cobolWord() != null) {
			CobolWord source = new CobolWord(this.ctx.cobolWord());
			this.keyword = source.getText().toUpperCase();
		} else {
			CicsWord source = new CicsWord(this.ctx.cicsWord());
			this.keyword = source.getText().toUpperCase();
		}

		if (this.ctx.identifier() != null) {
			this.identifier = new Identifier(this.ctx.identifier(), this.LOGGER);
		}

		if (this.ctx.literal() != null) {
			this.literal = new Literal(this.ctx.literal());
		}

		if (this.keyword.equals("PROGRAM")) {
			this.isProgram = true;
		}

		if (this.keyword.equals("FILE") || this.keyword.equals("DATASET")) {
			//DATASET is so old it is no longer documented
			this.isFile = true;
		}

		if (this.keyword.equals("TRANSID")) {
			this.isTransID = true;
		}
	}

	public String getKeyword() {
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

	public Boolean isFile() {
		return this.isFile;
	}

	public Boolean isTransID() {
		return this.isTransID;
	}
}
