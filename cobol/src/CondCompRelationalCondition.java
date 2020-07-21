
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompRelationalCondition implements CondCompToken, CondCompCondition {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ctx = null;
	private long sortKey = -1;
	private ArrayList<CondCompToken> conditions = new ArrayList<>();

	public static List<CondCompRelationalCondition> bunchOfThese(
				List<CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext> ctxList
				, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompRelationalCondition> ccrcList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ccrc: ctxList) {
			ccrcList.add(new CondCompRelationalCondition(ccrc, varList));
		}

		return ccrcList;
	}

	public CondCompRelationalCondition(
				CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ccrc
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccrc;
		this.type = CondCompTokenType.RELATIONAL_CONDITION;

		for (CobolPreprocessorParser.ConditionalCompilationConditionContext cccc: this.ctx.conditionalCompilationCondition()) {
			if (cccc.conditionalCompilationBinaryCondition() != null) {
				this.conditions.add(new CondCompBinaryCondition(cccc.conditionalCompilationBinaryCondition(), varList));
			}
			if (cccc.conditionalCompilationSimpleRelationalCondition() != null) {
				this.conditions.add(new CondCompSimpleRelationalCondition(cccc.conditionalCompilationSimpleRelationalCondition(), varList));
			}
			if (cccc.conditionalCompilationDefinedCondition() != null) {
				this.conditions.add(new CondCompDefinedCondition(cccc.conditionalCompilationDefinedCondition(), varList));
			}
			if (this.ctx.AND() != null) {
				this.conditions.addAll(CondCompLogicOp.bunchOfThese(this.ctx.AND()));
			}
			if (this.ctx.OR() != null) {
				this.conditions.addAll(CondCompLogicOp.bunchOfThese(this.ctx.OR()));
			}
			if (this.ctx.LPARENCHAR() != null) {
				this.conditions.addAll(CondCompGroupOp.bunchOfThese(this.ctx.LPARENCHAR()));
			}
			if (this.ctx.RPARENCHAR() != null) {
				this.conditions.addAll(CondCompGroupOp.bunchOfThese(this.ctx.RPARENCHAR()));
			}
		}

		this.conditions.sort(Comparator.comparingLong(CondCompToken::getSortKey));
		this.sortKey = this.conditions.get(0).getSortKey();

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	public Boolean evaluate() {
		return this.evaluate(0);
	}

	private Boolean evaluate(int i) {
		Boolean rc = null;

		switch(this.conditions.get(i).getType()) {
			case GROUPOP_BEGIN:
				rc = this.evaluate(++i);
				break;
			case GROUPOP_END:
				return rc;
				break;
		}
	}
}
