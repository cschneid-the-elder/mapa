
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompVar implements CondCompToken {

	private String myName = this.getClass().getName();
	private String varName = null;
	private Integer intValue = null;
	private Boolean boolValue = null;
	private String alnumValue = null;
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationDefinePredicate predicate = null;
	private CobolPreprocessorParser.LiteralContext literalCtx = null;

}	private CobolPreprocessorParser.CompileTimeArithmeticOpContext ctx = null;
	private TerminalNode tn = null;
	private long sortKey = -1;

	public static List<CondCompArithOp> bunchOfThese(
					List<CobolPreprocessorParser.CompileTimeArithmeticOpContext> list) {
		ArrayList<CondCompArithOp> ccaoList = new ArrayList<>();

		for (CobolPreprocessorParser.CompileTimeArithmeticOpContext ctaoc: list) {
			ccaoList.add(new CondCompArithOp(ctaoc);
		}

		return ccaoList;
	}

	public CondCompArithOp(CobolPreprocessorParser.ConditionalCompilationDefineContext ccdc) {
		this.ctx = ccdc;
		this.varName = this.ctx.IDENTIFIER().getSymbol().getText();
		this.tn = this.ctx.COMPILER_DIRECTIVE_TAG();

		this.predicate = this.ctx.conditionalCompilationDefinePredicate()
		if (this.predicate == null) {
			// >>DEFINE only
		} else {
			this.literalCtx = this.predicate.literal();
			if (this.literalCtx == null) {
				// set to an expression
			} else {
				if (this.literalCtx.NONNUMERICLITERAL() == null) {
					if (this.literalCtx.NUMERICLITERAL() == null) {
						// this is very bad
					} else {
						this.type = CondCompTokenType.VAR_INTEGER;
						this.setValue(this.literalCtx.NUMERICLITERAL());
					}
				} else {
					this.setValue(this.literalCtx.NONNUMERICLITERAL());
				}
			}
		}

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	private void setValue(TerminalNode t) {
		String aString = t.getSymbol().getText();
		if (this.type == CondCompTokenType.VAR_INTEGER) {
			this.intValue = new Integer(aString);
		} else if (aString.toUpper().startsWith("B'")) {
			this.type = CondCompTokenType.VAR_BOOLEAN;
			if (aString.toUpper().equals("B'0'")) {
				this.boolValue = false;
			} else {
				this.boolValue = true;
			}
		} else {
			this.type = CondCompTokenType.VAR_ALPHANUM;
			this.alnumValue = aString;
		}
	}

	public long getSortKey() {
		return this.sortKey;
	}


