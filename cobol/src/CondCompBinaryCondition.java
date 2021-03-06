
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompBinaryCondition implements CondCompToken, CondCompCondition {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationBinaryConditionContext ctx = null;
	private TerminalNode tn = null;
	private CondCompVar var = null;
	private long sortKey = -1;
	private String text = null;

	public static List<CondCompBinaryCondition> bunchOfThese(
				List<CobolPreprocessorParser.ConditionalCompilationBinaryConditionContext> ctxList
				, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompBinaryCondition> ccbcList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationBinaryConditionContext ccbc: ctxList) {
			ccbcList.add(new CondCompBinaryCondition(ccbc, varList));
		}

		return ccbcList;
	}

	public CondCompBinaryCondition(
				CobolPreprocessorParser.ConditionalCompilationBinaryConditionContext ccbc
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccbc;
		this.type = CondCompTokenType.BINARY_CONDITION;

		this.tn = this.ctx.IDENTIFIER();

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.text = this.tn.getSymbol().getText();

		this.var = this.varFromList(this.tn, varList);

	}

	private CondCompVar varFromList(TerminalNode t, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompVar> revList = new ArrayList<>(varList);

		TestIntegration.LOGGER.finest(myName + " varFromList varList.size() = " + varList.size());
		TestIntegration.LOGGER.finest(myName + " varFromList varList = |" + varList + "|");

		Collections.reverse(revList);
		for (CondCompVar v: revList) {
			if (v.varNameIs(t)) {
				if (v.getSortKey() < this.getSortKey()) {
					return v;
				}
			}
		}

		return null;
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	public Boolean evaluate() {
		if (this.var == null) {
			return false;
		}

		return this.var.getBoolValue();
	}

	public String toString() {
		return this.text;
	}
}
