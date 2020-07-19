
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompSimpleRelation implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ctx = null;
	private CondCompComparisonOp ccco = null;
	private TerminalNode tn = null;
	private long sortKey = -1;

	public static List<CondCompSimpleRelation> bunchOfThese(
				List<CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext> ctxList
				, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompSimpleRelation> ccsrList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ccsrc: ctxList) {
			ccsrList.add(new CondCompSimpleRelation(ccsrc, varList);
		}

		return ccsrList;
	}

	public CondCompSimpleRelation(
				CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ccsrc
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccsrc;
		this.type = CondCompTokenType.SIMPLE_RELATION;

		this.ccco = new CondCompComparisonOp(this.ctx.conditionalCompilationComparisonOp());

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public int getType() {
		return this.type;
	}
}
