
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent either a variable or a
numeric constant in a conditional compile statement which
is evaluated in the preprocessor.
*/

class CondCompArithmeticAtom implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = CondCompTokenType.ARITHMETIC_ATOM;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext ctx = null;
	private ArrayList<CondCompVar> varList = null;
	private TerminalNode tn = null;
	private long line = -1;
	private long sortKey = -1;
	private Integer value = null;

	public static List<CondCompArithmeticAtom> bunchOfThese(
					List<CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext> list
					, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompArithmeticAtom> aList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext ctx: list) {
			aList.add(new CondCompArithmeticAtom(ctx, varList));
		}

		return aList;
	}

	public CondCompArithmeticAtom(
			CobolPreprocessorParser.ConditionalCompilationArithmeticAtomContext ctx
			, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		TestIntegration.LOGGER.finer(this.myName + " varList = |" + varList + "|");
		this.varList = varList;

		if (this.ctx.IDENTIFIER() != null) {
			this.tn = this.ctx.IDENTIFIER();
			this.setSortKey();
			/*
			Iterate backwards through varList so we get the most recent
			value set for this variable.
			*/
			for (int i = this.varList.size() - 1; i >= 0; i--) {
				CondCompVar currVar = this.varList.get(i);
				if (currVar.varNameIs(this.tn)) {
					if (currVar.getSortKey() < this.getSortKey()) {
						this.value = currVar.getIntValue();
						break;
					}
				}
			}
			if (this.value == null) {
				TestIntegration.LOGGER.fine(
					this.myName
					+ " unable to find identifier "
					+ this.tn.getSymbol().getText()
					+ " in current list of variables "
					+ this.varList);
				this.value = Integer.MIN_VALUE;
			}
		} else if (this.ctx.ZERO() != null) {
			this.tn = this.ctx.ZERO();
			this.setSortKey();
			this.value = new Integer(0);
		} else {
			this.tn = this.ctx.NUMERICLITERAL();
			this.setSortKey();
			this.value = new Integer(this.tn.getSymbol().getText());
		}
	}

	private void setSortKey() {
		this.line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (this.line * (long)Integer.MAX_VALUE) + posn;
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	public Integer getValue() {
		return this.value;
	}

	public String toString() {
		return this.myName + " " + this.getValue();
	}
}
