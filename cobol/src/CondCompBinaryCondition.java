
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
		this.var = this.varFromList(this.tn, varList);

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	private CondCompVar varFromList(TerminalNode t, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompVar> revList = new ArrayList<>(varList.size());

		Collections.copy(revList, varList);
		Collections.reverse(revList);
		for (CondCompVar v: revList) {
			if (v.varNameIs(t)) {
				return v;
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
		return this.var.getBoolValue();
	}

}
