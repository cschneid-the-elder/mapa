
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
	private ArrayDeque<CondCompToken> evals = new ArrayDeque<>();
	private String text = null;

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
		StringBuilder sb = new StringBuilder();
		for (CondCompToken cct: conditions) {
			sb.append(cct);
		}
		this.text = sb.toString();

		/*
		Set up for evaluate(), which wants a stack of tokens in the
		order they are to be evaluated, i.e. first token should be 
		on top of the stack.
		*/
		
		ArrayList<CondCompToken> revConditions = new ArrayList<>(this.conditions);
		Collections.reverse(revConditions);
		for (CondCompToken token: revConditions) {
			try {
				evals.push(token);
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(
					"Exception " + e + " encountered"
					+ " in CondCompRelationalCondition constructor");
				e.printStackTrace();
				System.exit(16);
			}
		}

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	/**
	>>DEFINE A B'1'
	>>DEFINE B B'0'
	>>DEFINE C B'1'
	>>DEFINE D B'0'
	>>IF A AND B --> false
	>>IF (((((A AND B))))) --> false
	>>IF A AND (B OR C)  --> true
	>>IF (A AND B) OR D  --> false
	>>IF A AND (B AND (C OR D)) --> false
	>>IF B AND (C OR D)  --> false
	>>IF (B AND C) OR D  --> false
	>>IF A AND (B OR C) AND D --> false
	*/
	public Boolean evaluate() {
		CondCompToken token = null;
		CondCompToken logicalOp = null;
		Boolean result = null;

		TestIntegration.LOGGER.fine(this.myName + " evaluate()");

		while(this.evals.peek() != null) {
			try {
				token = this.evals.pop();
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(
					"Exception " + e + " encountered"
					+ " in CondCompRelationalCondition::evaluate()");
				e.printStackTrace();
				System.exit(16);
			}
			TestIntegration.LOGGER.finest(this.myName + " evaluate()" + " token.getType() = " + token.getType());
			switch(token.getType()) {
				case GROUPOP_BEGIN:
					if (logicalOp == null) {
						result = this.evaluate();
					} else {
						if (logicalOp.getType() == CondCompTokenType.LOGICOP_AND) {
							result = result && this.evaluate();
						} else {
							result = result || this.evaluate();
						}
					}
					TestIntegration.LOGGER.finest(this.myName + " evaluate()" + " result = " + result);
					break;
				case GROUPOP_END:
					return(result);
				case SIMPLE_RELATIONAL_CONDITION:
				case BINARY_CONDITION:
				case DEFINED_CONDITION:
				case RELATIONAL_CONDITION:
					if (logicalOp == null) {
						result = ((CondCompCondition)token).evaluate();
					} else {
						if (logicalOp.getType() == CondCompTokenType.LOGICOP_AND) {
							result = result && ((CondCompCondition)token).evaluate();
						} else {
							result = result || ((CondCompCondition)token).evaluate();
						}
					}
					TestIntegration.LOGGER.finest(this.myName + " evaluate()" + " result = " + result);
					break;
				case LOGICOP_AND:
				case LOGICOP_OR:
					logicalOp = token;
					break;
			}
		}

		return result;
	}

	/*
	public Boolean evaluate() {
		ArrayDeque<Boolean> groupStack = new ArrayDeque<>();
		ArrayDeque<CondCompToken> logicalOpStack = new ArrayDeque<>();
		Boolean rc = null;
		int groupLevel = 0;
		CondCompToken token = null;

		for (CondCompToken token: this.conditions) {
			switch(token.getType()) {
				case GROUPOP_BEGIN:
					if (rc != null) {
						try {
							groupStack.push(new Boolean(rc));
							rc = null;
						} catch (Exception e) {
							TestIntegration.LOGGER.severe("Exception " + e + " encountered");
							e.printStackTrace();
							System.exit(16);
							}
					}
					groupLevel++;
					break;
				case GROUPOP_END:
					if (groupStack.peek() != null) {
						try {
							rc = rc && groupStack.pop();
						} catch (Exception e) {
							TestIntegration.LOGGER.severe("Exception " + e + " encountered");
							e.printStackTrace();
							System.exit(16);
							}
					}
					groupLevel--;
					break;
				case SIMPLE_RELATIONAL_CONDITION:
					if (rc == null) {
						rc = ((CondCompCondition)token).evaluate();
					} else {
						rc = rc && ((CondCompCondition)token).evaluate();
					}
					break;
				case BINARY_CONDITION:
					if (rc == null) {
						rc = ((CondCompCondition)token).evaluate();
					} else {
						rc = rc && ((CondCompCondition)token).evaluate();
					}
					break;
				case DEFINED_CONDITION:
					if (rc == null) {
						rc = ((CondCompCondition)token).evaluate();
					} else {
						rc = rc && ((CondCompCondition)token).evaluate();
					}
					break;
				case RELATIONAL_CONDITION:
					if (rc == null) {
						rc = ((CondCompCondition)token).evaluate();
					} else {
						rc = rc && ((CondCompCondition)token).evaluate();
					}
					break;
				case LOGICOP_AND:
					logicOpStack.push(token);
					break;
				case LOGICOP_OR:
					logicOpStack.push(token);
					break;
			}
		}
	*/

	public String toString() {
		return this.text;
	}
}
