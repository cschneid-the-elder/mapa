
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompDefinedCondition implements CondCompToken, CondCompCondition {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationDefinedConditionContext ctx = null;
	private TerminalNode tn = null;
	private CondCompVar var = null;
	private Boolean negated = false;
	private long sortKey = -1;

	public static List<CondCompDefinedCondition> bunchOfThese(
				List<CobolPreprocessorParser.ConditionalCompilationDefinedConditionContext> ctxList
				, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompDefinedCondition> ccdcList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationDefinedConditionContext ccdc: ctxList) {
			ccdcList.add(new CondCompDefinedCondition(ccdc, varList));
		}

		return ccdcList;
	}

	public CondCompDefinedCondition(
				CobolPreprocessorParser.ConditionalCompilationDefinedConditionContext ccdc
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccdc;
		this.type = CondCompTokenType.DEFINED_CONDITION;

		this.tn = this.ctx.IDENTIFIER();
		this.negated = (this.ctx.NOT() != null);
		this.var = this.varFromList(this.tn, varList);

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	private CondCompVar varFromList(TerminalNode t, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompVar> revList = new ArrayList<>();

		revList.addAll(varList);
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
		if (negated) {
			// >>IF var IS NOT DEFINED
			return (this.var == null);
		} else {
			// >>IF var IS DEFINED
			return (this.var != null);
		}
	}

}
