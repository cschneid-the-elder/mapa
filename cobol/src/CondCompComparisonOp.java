
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompComparisonOp implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationComparisonOpContext ctx = null;
	private TerminalNode tn = null;
	private long sortKey = -1;
	private String text = null;

	public static List<CondCompComparisonOp> bunchOfThese(
					List<CobolPreprocessorParser.ConditionalCompilationComparisonOpContext> list) {
		ArrayList<CondCompComparisonOp> cccoList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationComparisonOpContext cccoc: list) {
			cccoList.add(new CondCompComparisonOp(cccoc));
		}

		return cccoList;
	}

	public CondCompComparisonOp(CobolPreprocessorParser.ConditionalCompilationComparisonOpContext cccoc) {
		this.ctx = cccoc;
		if (this.ctx.EQUAL() != null) {
			this.tn = this.ctx.EQUAL();
			if (this.ctx.GREATER() != null) {
				if (this.ctx.NOT() == null) {
					this.type = CondCompTokenType.COMPAREOP_GE;
				} else {
					this.type = CondCompTokenType.COMPAREOP_LT;
				}
			} else if (this.ctx.LESS() != null) {
				if (this.ctx.NOT() == null) {
					this.type = CondCompTokenType.COMPAREOP_LE;
				} else {
					this.type = CondCompTokenType.COMPAREOP_GT;
				}
			} else {
				if (this.ctx.NOT() == null) {
					this.type = CondCompTokenType.COMPAREOP_EQ;
				} else {
					this.type = CondCompTokenType.COMPAREOP_NE;
				}
			}
		} else if (this.ctx.EQUALCHAR() != null) {
			this.tn = this.ctx.EQUALCHAR();
			if (this.ctx.NOT() == null) {
				this.type = CondCompTokenType.COMPAREOP_EQ;
			} else {
				this.type = CondCompTokenType.COMPAREOP_NE;
			}
		} else if (this.ctx.NOTEQUALCHAR() != null) {
			this.tn = this.ctx.NOTEQUALCHAR();
			if (this.ctx.NOT() == null) {
				this.type = CondCompTokenType.COMPAREOP_NE;
			} else {
				this.type = CondCompTokenType.COMPAREOP_EQ;
			}
		} else if (this.ctx.LESSTHANCHAR() != null) {
			this.tn = this.ctx.LESSTHANCHAR();
			if (this.ctx.NOT() == null) {
				this.type = CondCompTokenType.COMPAREOP_LT;
			} else {
				this.type = CondCompTokenType.COMPAREOP_GE;
			}
		} else if (this.ctx.GREATERTHANCHAR() != null) {
			this.tn = this.ctx.GREATERTHANCHAR();
			if (this.ctx.NOT() == null) {
				this.type = CondCompTokenType.COMPAREOP_GT;
			} else {
				this.type = CondCompTokenType.COMPAREOP_LE;
			}
		} else if (this.ctx.LESSOREQUALCHAR() != null) {
			this.tn = this.ctx.LESSOREQUALCHAR();
			if (this.ctx.NOT() == null) {
				this.type = CondCompTokenType.COMPAREOP_LE;
			} else {
				this.type = CondCompTokenType.COMPAREOP_GT;
			}
		} else if (this.ctx.GREATEROREQUALCHAR() != null) {
			this.tn = this.ctx.GREATEROREQUALCHAR();
			if (this.ctx.NOT() == null) {
				this.type = CondCompTokenType.COMPAREOP_GE;
			} else {
				this.type = CondCompTokenType.COMPAREOP_LT;
			}
		} else {
			throw new IllegalArgumentException(
				"ConditionalCompilationComparisonOpContext"
				+ " without a recognizable comparison operator");
		}


		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
		this.text = this.tn.getSymbol().getText();

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	public String toString() {
		return this.text;
	}
}
