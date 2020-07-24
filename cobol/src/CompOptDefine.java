
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CompOptDefine {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.Define_optContext ctx = null;
	private String identifier = null;
	private String literal = null;
	private int line = -1;

	CompOptDefine(CobolPreprocessorParser.Define_optContext ctx) {
		this.ctx = ctx;
		this.identifier = this.ctx.IDENTIFIER().getSymbol().getText();
		if (this.ctx.literal() != null) {
			this.literal = this.literalValue();
		}
	}

	private String literalValue() {
			if (this.ctx.literal().NONNUMERICLITERAL() == null) {
				return this.ctx.literal().NUMERICLITERAL().getSymbol().getText();
			} else {
				return this.ctx.literal().NONNUMERICLITERAL().getSymbol().getText();
			}
	}
	public int getLine() {
		if (this.line < 0) {
			this.line = this.ctx.IDENTIFIER().getSymbol().getLine();
		}

		return this.line;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public String getLiteral() {
		return this.literal;
	}
}
