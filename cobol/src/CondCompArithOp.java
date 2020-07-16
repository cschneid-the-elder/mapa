
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompArithOp implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticOpContext ctx = null;
	private TerminalNode tn = null;
	private long sortKey = -1;

	public static List<CondCompArithOp> bunchOfThese(
					List<CobolPreprocessorParser.ConditionalCompilationArithmeticOpContext> list) {
		ArrayList<CondCompArithOp> ccaoList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationArithmeticOpContext ctaoc: list) {
			ccaoList.add(new CondCompArithOp(ctaoc);
		}

		return ccaoList;
	}

	public CondCompArithOp(CobolPreprocessorParser.ConditionalCompilationArithmeticOpContext ctaoc) {
		this.ctx = ctaoc;
		if (this.ctx.ASTERISKCHAR() != null) {
			this.tn = this.ctx.ASTERISKCHAR();
			this.type = CondCompTokenType.NUMOP_MULTIPLY;
		} else if (this.ctx.MINUSCHAR() != null) {
			this.tn = this.ctx.MINUSCHAR();
			this.type = CondCompTokenType.NUMOP_SUBTRACT;
		} else if (this.ctx.PLUSCHAR() != null) {
			this.tn = this.ctx.PLUSCHAR();
			this.type = CondCompTokenType.NUMOP_ADD;
		} else if (this.ctx.SLASHCHAR() != null) {
			this.tn = this.ctx.SLASHCHAR();
			this.type = CondCompTokenType.NUMOP_DIVIDE;
		}

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	public long getSortKey() {
		return this.sortKey;
	}

}
