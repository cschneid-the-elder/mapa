
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtWhen implements ConditionalCompilationStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_WHEN;
	private CobolPreprocessorParser.ConditionalCompilationWhenContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccaeCtx1 = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccaeCtx2 = null;
	private CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ccrcCtx = null;
	private List<CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext> ccesCtxList = null;
	private CondCompRelationalCondition relCond = null;
	private CondCompStmtEvaluate evaluateStmt = null;
	private CondCompStmtEndEvaluate endEvaluateStmt = null;
	private CondCompEvaluateSelection evaluateSelection1 = null;
	private CondCompEvaluateSelection evaluateSelection2 = null;
	private CondCompComparisonOp op1 = null;
	private CondCompComparisonOp op2 = null;
	private Boolean truthiness = null;
	private int line = -1;
	private int endLine = -1;
	private String text = null;

	public CondCompStmtWhen (
				CobolPreprocessorParser.ConditionalCompilationWhenContext ccwc
				, CondCompStmtEvaluate evaluateStmt
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccwc;
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType();
		this.evaluateStmt = evaluateStmt;
		this.ccrcCtx = this.ctx.conditionalCompilationRelationalCondition();
		if (this.ccrcCtx != null) {
			this.relCond = new CondCompRelationalCondition(this.ccrcCtx, varList);
		}
		this.ccesCtxList = this.ctx.conditionalCompilationEvaluateSelection();
		if (this.ccesCtxList != null) {
			this.evaluateSelection1 = new CondCompEvaluateSelection(this.ccesCtxList.get(0), varList);
			if (this.ccesCtxList.size() > 1) {
				this.evaluateSelection2 = new CondCompEvaluateSelection(this.ccesCtxList.get(1), varList);
				if (this.ctx.THRU() == null || this.ctx.THROUGH() == null) {
					throw new IllegalArgumentException(
						this.myName
						+ " this.ctx.conditionalCompilationEvaluateSelection().size = "
						+ this.ccesCtxList.size()
						+ " and this.ctx.THRU() == null || this.ctx.THROUGH() == null"
						+ " @ line "
						+ this.getLine());
				}
				this.op1 = new CondCompComparisonOp(">=");
				this.op2 = new CondCompComparisonOp("<=");
			} else {
				this.op1 = new CondCompComparisonOp("=");
			}
		}

	}

	public Boolean strewth() {
		if (this.truthiness == null) {
			this.truthiness = this.evaluate();
		}

		return this.truthiness;
	}

	private Boolean evaluate() {
		if (this.evaluateStmt.isJustTrue()) {
			return this.evaluateWhen();
		}

		return this.compareWithEvaluate();
	}

	private Boolean evaluateWhen() {
		if (this.ctx.OTHER() != null) {
			return true;
		}

		if (this.relCond != null) {
			return relCond.evaluate();
		}

		TestIntegration.LOGGER.warning(
			this.myName
			+ " "
			+ this
			+ " "
			+ "this.ctx.OTHER() == null && this.relCond == null"
			);

		return false;		
	}

	private Boolean compareWithEvaluate() {
		CondCompVar evaluateVar = this.evaluateStmt.getVar();
		TerminalNode evaluateTn = this.evaluateStmt.getTerminalNode();
		Integer evaluateInt = this.evaluateStmt.getIntValue();

		if (evaluateVar == null) {
			if (evaluateTn == null) {
				if (evaluateInt == null) {
					throw new IllegalArgumentException(
						this.myName
						+ " "
						+ this.evaluateStmt
						+ " getVar() getTerminalNode() getIntValue() are all null");
				} else {
				}
			} else {
				if (this.op2 == null) {
					return this.compareWithEvaluate(this.evaluateStmt.getEvaluateSelection(), this.op1);
				} else {
					return this.compareWithEvaluate(this.evaluateStmt.getEvaluateSelection(), this.op1, this.op2);
				}
		} else {
			if (this.op2 == null) {
				return this.compareWithEvaluate(evaluateVar, this.op1);
			} else {
				return this.compareWithEvaluate(evaluateVar, this.op1, this.op2);
			}
		}
	}

	private Boolean compareWithEvaluate(CondCompVar evaluateVar, CondCompComparisonOp op) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();

		if (whenVar1 == null) {
			return evaluateVar.compareTo(op, whenTn1);
		} else {
			return whenVar1.compareTo(evaluateVar, op);
		}
	}

	private Boolean compareWithEvaluate(CondCompVar evaluateVar, CondCompComparisonOp op1, CondCompComparisonOp op2) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();
		CondCompVar whenVar2 = this.evaluateSelection2.getVar();
		TerminalNode whenTn2 = this.evaluateSelection2.getTerminalNode();

		if (whenVar1 == null) {
			if (whenVar2 == null) {
				return evaluateVar.compareTo(op1, whenTn1) && evaluateVar.compareTo(op2, whenTn2);
			} else {
				return evaluateVar.compareTo(op1, whenTn1) && evaluateVar.compareTo(op2, whenVar2);
			}
		} else {
			if (whenVar2 == null) {
				return evaluateVar.compareTo(op1, whenVar1) && evaluateVar.compareTo(op2, whenTn2);
			} else {
				return evaluateVar.compareTo(op1, whenVar1) && evaluateVar.compareTo(op2, whenVar2);
			}
		}

	}

	private Boolean compareWithEvaluate(CondCompEvaluateSelection evaluateStmtSelection, CondCompComparisonOp op) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();

		if (whenVar1 == null) {
			if (evaluateStmtSelection.getNumericValue() == null) {
				int cmp = whenTn1.getSymbol().getText().compareTo(evaluateStmtSelection.getNonNumericValue());
				return this.compare(cmp, op);
			} else {
				Integer anInt = new Integer(whenTn1.getSymbol().getText());
				int cmp = anInt.compareTo(evaluateStmtSelection.getNumericValue())
				return this.compare(cmp, op);
		} else {
			return whenVar1.compareTo(evaluateStmtSelection.getTerminalNode(), op);
		}
	}

	private Boolean compareWithEvaluate(CondCompEvaluateSelection evaluateStmtSelection, CondCompComparisonOp op1, CondCompComparisonOp op2) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();
		CondCompVar whenVar2 = this.evaluateSelection2.getVar();
		TerminalNode whenTn2 = this.evaluateSelection2.getTerminalNode();

	}

	private Boolean compare(int comparison, CondCompComparisonOp op) {
		TestIntegration.LOGGER.finest(this.myName + " compare(int comparison, CondCompComparisonOp op)");
		TestIntegration.LOGGER.finest("    comparison = |" + comparison + "|");
		TestIntegration.LOGGER.finest("    op = |" + op + "|");
		Boolean rc = null;

		switch(op.getType()) {
			case COMPAREOP_EQ:
				if (comparison == 0) {
					rc = true;
				} else {
					rc = false;
				}
				break;
			case COMPAREOP_NE:
				if (comparison == 0) {
					rc = false;
				} else {
					rc = true;
				}
				break;
			case COMPAREOP_LT:
				if (comparison < 0) {
					rc = true;
				} else {
					rc = false;
				}
				break;
			case COMPAREOP_LE:
				if (comparison <= 0) {
					rc = true;
				} else {
					rc = false;
				}
				break;
			case COMPAREOP_GT:
				if (comparison > 0) {
					rc = true;
				} else {
					rc = false;
				}
				break;
			case COMPAREOP_GE:
				if (comparison >= 0) {
					rc = true;
				} else {
					rc = false;
				}
				break;
			default:
				throw new IllegalArgumentException(
							"comparison operator is of unknown type");
		}

		TestIntegration.LOGGER.finest("    returning " + rc);
		return rc;
	}

	public int getLine() {
		return this.line;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public void setEndEvaluate(CondCompStmtEndEvaluate stmt) {
		this.endEvaluateStmt = stmt;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public String toString() {
		return this.text;
	}
}
