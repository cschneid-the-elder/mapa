
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtWhen implements ConditionalCompilationStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_WHEN;
	private CobolPreprocessorParser.ConditionalCompilationWhenContext ctx = null;
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
	private Logger LOGGER = null;

	public CondCompStmtWhen (
				CobolPreprocessorParser.ConditionalCompilationWhenContext ccwc
				, CondCompStmtEvaluate evaluateStmt
				, ArrayList<CondCompVar> varList
				, Logger LOGGER) {
		this.ctx = ccwc;
		this.LOGGER = LOGGER;
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType();
		this.LOGGER.fine(
			this.myName + " " + this.toString());
		this.evaluateStmt = evaluateStmt;
		this.ccrcCtx = this.ctx.conditionalCompilationRelationalCondition();
		if (this.ccrcCtx != null) {
			this.relCond = new CondCompRelationalCondition(this.ccrcCtx, varList);
		}
		this.ccesCtxList = this.ctx.conditionalCompilationEvaluateSelection();
		if (this.ccesCtxList != null && this.ccesCtxList.size() > 0) {
			this.evaluateSelection1 = new CondCompEvaluateSelection(this.ccesCtxList.get(0), varList);
			if (this.ccesCtxList.size() > 1) {
				this.evaluateSelection2 = new CondCompEvaluateSelection(this.ccesCtxList.get(1), varList);
				if (this.ctx.THRU() == null && this.ctx.THROUGH() == null) {
					throw new IllegalArgumentException(
						this.myName
						+ " this.ctx.conditionalCompilationEvaluateSelection().size = "
						+ this.ccesCtxList.size()
						+ " and this.ctx.THRU() == null && this.ctx.THROUGH() == null"
						+ " @ line "
						+ this.getLine());
				}
				this.op1 = new CondCompComparisonOp("<=");
				this.op2 = new CondCompComparisonOp(">=");
			} else {
				this.op1 = new CondCompComparisonOp("=");
			}
		}

		this.LOGGER.finest(
			this.myName 
			+ " relCond = |" 
			+ this.relCond 
			+ "| evaluateSelection1 = |"
			+ this.evaluateSelection1
			+ "| evaluateSelection2 = |"
			+ this.evaluateSelection2
			+ "| op1 = |"
			+ this.op1
			+ "| op2 = |"
			+ this.op2 + "|");
	}

	/**
	When interpreting the conditional compilation statements, it is
	the responsibility of the caller to keep track of which WHEN
	statement is being evaluated and its truthiness.  Interpretation
	must stop when the first strewth() == true condition is encountered.
	*/
	public Boolean strewth() {
		if (this.truthiness == null) {
			this.truthiness = this.evaluate();
		}

		return this.truthiness;
	}

	private Boolean evaluate() {
		if (this.ctx.OTHER() != null) {
			return true;
		}

		if (this.evaluateStmt.isJustTrue()) {
			return this.evaluateWhen();
		}

		return this.compareWithEvaluate();
	}

	private Boolean evaluateWhen() {
		if (this.relCond != null) {
			return relCond.evaluate();
		}

		if (this.evaluateSelection1.getBooleanValue() == null) {
			return false;
		}

		return this.evaluateSelection1.getBooleanValue();
	}

	/**
	This is more complicated than I'd like.  The options, as I see them...

	>>DEFINE VAR1 1
	*>scenario 1
	>>EVALUATE TRUE
	>>WHEN IGY-CICS
	>>WHEN IGY-ARCH > 10
	>>WHEN VAR2 IS DEFINED
	>>WHEN VAR1 + 1 = 2
	>>WHEN OTHER
	>>END-EVALUATE

	*>scenario 2
	>>EVALUATE IGY-ARCH
	>>WHEN 8
	>>WHEN 9
	>>WHEN 10 THRU 13
	>>WHEN OTHER
	>>END-EVALUATE

	>>DEFINE VAR2 2
	*>scenario 3
	>>EVALUATE VAR1 + 2
	>>WHEN VAR2 + 1
	>>WHEN 3
	>>WHEN 4 - 1
	>>WHEN VAR1 - 1 THROUGH VAR2 + 2
	>>WHEN OTHER
	>>END-EVALUATE

	>>DEFINE VAR2 2
	*>scenario 4
	>>EVALUATE VAR1 + VAR2
	>>WHEN VAR2 + 1
	>>WHEN 3
	>>WHEN 4 - 1
	>>WHEN VAR1 - 1 THROUGH VAR2 + 2
	>>WHEN OTHER
	>>END-EVALUATE

	>>DEFINE VAR3 AS 'TOOTINGBEC'
	>>scenario 5
	>>EVALUATE VAR3
	>>WHEN 'KENSINGTON'
	>>WHEN 'TOOTINGBEB' THRU 'TOOTINGBEE'
	>>END-EVALUATE

	...which, for our purposes, means...

	scenario 1 is handled in the evaluateWhen() method.
	scenario 2 means evaluateVar != null && evaluateInt == null
	scenario 3 means evaluateVar == null && evaluateInt != null
	scenario 4 means evaluateVar == null && evaluateInt != null
	scenario 5 means evaluateVar != null && evaluateInt == null

	*/
	private Boolean compareWithEvaluate() {
		CondCompVar evaluateVar = this.evaluateStmt.getVar();
		Integer evaluateInt = this.evaluateStmt.getEvaluateSelection().getNumericValue();
		String evaluateString = this.evaluateStmt.getEvaluateSelection().getNonNumericValue();

		if (evaluateVar == null) {
			if (evaluateInt == null) {
				if (evaluateString == null) {
					/*
					throw new IllegalArgumentException(
						this.myName
						+ " "
						+ this.evaluateStmt
						+ " getVar() && getEvaluateSelection().getNumericValue() && getEvaluateSelection().getNonNumericValue() are null");
					*/
					return false;
				} else {
					if (this.op2 == null) {
						return this.compareWithEvaluate(evaluateString, this.op1);
					} else {
						return this.compareWithEvaluate(evaluateString, this.op1, this.op2);
					}
				}
			} else {
				if (this.op2 == null) {
					return this.compareWithEvaluate(evaluateInt, this.op1);
				} else {
					return this.compareWithEvaluate(evaluateInt, this.op1, this.op2);
				}
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
		Integer whenInt1 = this.evaluateSelection1.getNumericValue();
		String whenString1 = this.evaluateSelection1.getNonNumericValue();

		this.LOGGER.finer(
			this.myName 
			+ " compareWithEvaluate(CondCompVar evaluateVar, CondCompComparisonOp op)");
		this.LOGGER.finest(
			"  evaluateVar = |" + evaluateVar + "|");
		this.LOGGER.finest(
			"  op = |" + op + "|");
		this.LOGGER.finest(
			"  whenVar1 = |" + whenVar1 + "|");
		this.LOGGER.finest(
			"  whenTn1 = |" + whenTn1 + "|");
		this.LOGGER.finest(
			"  whenInt1 = |" + whenInt1 + "|");
		this.LOGGER.finest(
			"  whenString1 = |" + whenString1 + "|");

		if (whenVar1 == null) {
			if (whenTn1 == null) {
				if (whenInt1 == null) {
					if (whenString1 == null) {
						throw new IllegalArgumentException(
							this.myName
							+ " "
							+ this.evaluateStmt
							+ " "
							+ this
							+ " whenVar1 && whenTn1 && whenInt1 && whenString1 are null");
					} else {
						return evaluateVar.compareTo(whenString1, op);
					}
				} else {
					return evaluateVar.compareTo(whenInt1, op);
				}
			} else {
				return evaluateVar.compareTo(op, whenTn1);
			}
		} else {
			return whenVar1.compareTo(evaluateVar, op);
		}
	}

	private Boolean compareWithEvaluate(CondCompVar evaluateVar, CondCompComparisonOp op1, CondCompComparisonOp op2) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();
		Integer whenInt1 = this.evaluateSelection1.getNumericValue();
		String whenString1 = this.evaluateSelection1.getNonNumericValue();
		CondCompVar whenVar2 = this.evaluateSelection2.getVar();
		TerminalNode whenTn2 = this.evaluateSelection2.getTerminalNode();
		Integer whenInt2 = this.evaluateSelection2.getNumericValue();
		String whenString2 = this.evaluateSelection2.getNonNumericValue();
		Boolean cmp1 = null;
		Boolean cmp2 = null;

		this.LOGGER.finer(
			this.myName 
			+ " compareWithEvaluate(CondCompVar evaluateVar, CondCompComparisonOp op1, CondCompComparisonOp op2)");
		this.LOGGER.finest(
			"  evaluateVar = |" + evaluateVar + "|");
		this.LOGGER.finest(
			"  op1 = |" + op1 + "|");
		this.LOGGER.finest(
			"  op2 = |" + op2 + "|");
		this.LOGGER.finest(
			"  whenVar1 = |" + whenVar1 + "|");
		this.LOGGER.finest(
			"  whenVar2 = |" + whenVar2 + "|");
		this.LOGGER.finest(
			"  whenTn1 = |" + whenTn1 + "|");
		this.LOGGER.finest(
			"  whenTn2 = |" + whenTn2 + "|");
		this.LOGGER.finest(
			"  whenInt1 = |" + whenInt1 + "|");
		this.LOGGER.finest(
			"  whenInt2 = |" + whenInt2 + "|");
		this.LOGGER.finest(
			"  whenString1 = |" + whenString1 + "|");
		this.LOGGER.finest(
			"  whenString2 = |" + whenString2 + "|");

		if (whenVar1 != null) {
			cmp1 = evaluateVar.compareTo(op1, whenVar1);
		}

		if (whenTn1 != null) {
			cmp1 = evaluateVar.compareTo(op1, whenTn1);
		}

		if (whenInt1 != null) {
			cmp1 = evaluateVar.compareTo(whenInt1, op1);
		}

		if (whenString1 != null) {
			cmp1 = evaluateVar.compareTo(whenString1, op1);
		}

		if (whenVar2 != null) {
			cmp2 = evaluateVar.compareTo(op2, whenVar2);
		}

		if (whenTn2 != null) {
			cmp2 = evaluateVar.compareTo(op2, whenTn2);
		}

		if (whenInt2 != null) {
			cmp2 = evaluateVar.compareTo(whenInt2, op2);
		}

		if (whenString2 != null) {
			cmp2 = evaluateVar.compareTo(whenString2, op2);
		}

		return cmp1 && cmp2;
	}

	/**
	We are here because this.op2 == null indicating there is no THRU option
	and the >>EVALUATE subject can be resolved to a numeric value.
	*/
	private Boolean compareWithEvaluate(Integer evaluateInt, CondCompComparisonOp op) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();
		Integer whenInt1 = this.evaluateSelection1.getNumericValue();

		this.LOGGER.finer(
			this.myName 
			+ " compareWithEvaluate(Integer evaluateInt, CondCompComparisonOp op1)");
		this.LOGGER.finest(
			"  evaluateInt = |" + evaluateInt + "|");
		this.LOGGER.finest(
			"  op = |" + op + "|");
		this.LOGGER.finest(
			"  whenVar1 = |" + whenVar1 + "|");
		this.LOGGER.finest(
			"  whenTn1 = |" + whenTn1 + "|");
		this.LOGGER.finest(
			"  whenInt1 = |" + whenInt1 + "|");

		if (whenVar1 == null) {
			if (whenTn1 == null) {
				int cmp = whenInt1.compareTo(evaluateInt);
				return this.compare(cmp, op);
			} else {
				Integer anInt = new Integer(whenTn1.getSymbol().getText());
				int cmp = anInt.compareTo(evaluateInt);
				return this.compare(cmp, op);
			}
		} else {
			return whenVar1.compareTo(evaluateInt, op);
		}
	}

	/**
	We are here because this.op2 != null indicating there is a THRU option
	and the >>EVALUATE subject can be resolved to a numeric value.
	*/
	private Boolean compareWithEvaluate(Integer evaluateInt, CondCompComparisonOp op1, CondCompComparisonOp op2) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();
		CondCompVar whenVar2 = this.evaluateSelection2.getVar();
		TerminalNode whenTn2 = this.evaluateSelection2.getTerminalNode();
		int cmp1 = 0;
		int cmp2 = 0;
		Boolean rc1 = null;
		Boolean rc2 = null;

		this.LOGGER.finer(
			this.myName 
			+ " compareWithEvaluate(Integer evaluateInt, CondCompComparisonOp op1, CondCompComparisonOp op2)");
		this.LOGGER.finest(
			"  evaluateInt = |" + evaluateInt + "|");
		this.LOGGER.finest(
			"  op1 = |" + op1 + "|");
		this.LOGGER.finest(
			"  op2 = |" + op2 + "|");
		this.LOGGER.finest(
			"  whenVar1 = |" + whenVar1 + "|");
		this.LOGGER.finest(
			"  whenVar2 = |" + whenVar2 + "|");
		this.LOGGER.finest(
			"  whenTn1 = |" + whenTn1 + "|");
		this.LOGGER.finest(
			"  whenTn2 = |" + whenTn2 + "|");


		if (whenVar1 == null) {
			Integer anInt = new Integer(whenTn1.getSymbol().getText());
			cmp1 = anInt.compareTo(evaluateInt);
			rc1 = compare(cmp1, op1);
		} else {
			rc1 = whenVar1.compareTo(evaluateInt, op1);
		}

		if (whenVar2 == null) {
			Integer anInt = new Integer(whenTn2.getSymbol().getText());
			cmp2 = anInt.compareTo(evaluateInt);
			rc2 = compare(cmp2, op2);
		} else {
			rc2 = whenVar2.compareTo(evaluateInt, op2);
		}

		return rc1 && rc2;
	}

	/**
	We are here because this.op2 == null indicating there is no THRU option
	and the >>EVALUATE subject can be resolved to a text value.
	*/
	private Boolean compareWithEvaluate(String evaluateText, CondCompComparisonOp op) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();

		this.LOGGER.finer(
			this.myName 
			+ " compareWithEvaluate(String evaluateText, CondCompComparisonOp op1)");
		this.LOGGER.finest(
			"  evaluateText = |" + evaluateText + "|");
		this.LOGGER.finest(
			"  op = |" + op + "|");
		this.LOGGER.finest(
			"  whenVar1 = |" + whenVar1 + "|");
		this.LOGGER.finest(
			"  whenTn1 = |" + whenTn1 + "|");

		if (whenVar1 == null) {
			String aString = whenTn1.getSymbol().getText();
			int cmp = aString.compareTo(evaluateText);
			return this.compare(cmp, op);
		} else {
			return whenVar1.compareTo(evaluateText, op);
		}
	}

	/**
	We are here because this.op2 != null indicating there is a THRU option
	and the >>EVALUATE subject can be resolved to a text value.
	*/
	private Boolean compareWithEvaluate(String evaluateText, CondCompComparisonOp op1, CondCompComparisonOp op2) {
		CondCompVar whenVar1 = this.evaluateSelection1.getVar();
		TerminalNode whenTn1 = this.evaluateSelection1.getTerminalNode();
		CondCompVar whenVar2 = this.evaluateSelection2.getVar();
		TerminalNode whenTn2 = this.evaluateSelection2.getTerminalNode();
		int cmp1 = 0;
		int cmp2 = 0;
		Boolean rc1 = null;
		Boolean rc2 = null;

		this.LOGGER.finer(
			this.myName 
			+ " compareWithEvaluate(String evaluateText, CondCompComparisonOp op1, CondCompComparisonOp op2)");
		this.LOGGER.finest(
			"  evaluateText = |" + evaluateText + "|");
		this.LOGGER.finest(
			"  op1 = |" + op1 + "|");
		this.LOGGER.finest(
			"  op2 = |" + op2 + "|");
		this.LOGGER.finest(
			"  whenVar1 = |" + whenVar1 + "|");
		this.LOGGER.finest(
			"  whenVar2 = |" + whenVar2 + "|");
		this.LOGGER.finest(
			"  whenTn1 = |" + whenTn1 + "|");
		this.LOGGER.finest(
			"  whenTn2 = |" + whenTn2 + "|");


		if (whenVar1 == null) {
			String aString = whenTn1.getSymbol().getText();
			cmp1 = aString.compareTo(evaluateText);
			rc1 = compare(cmp1, op1);
		} else {
			rc1 = whenVar1.compareTo(evaluateText, op1);
		}

		if (whenVar2 == null) {
			String aString = whenTn2.getSymbol().getText();
			cmp2 = aString.compareTo(evaluateText);
			rc2 = compare(cmp2, op2);
		} else {
			rc2 = whenVar2.compareTo(evaluateText, op2);
		}

		return rc1 && rc2;
	}

	private Boolean compare(int comparison, CondCompComparisonOp op) {
		this.LOGGER.finest(this.myName + " compare(int comparison, CondCompComparisonOp op)");
		this.LOGGER.finest("    comparison = |" + comparison + "|");
		this.LOGGER.finest("    op = |" + op + "|");
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

		this.LOGGER.finest("    returning " + rc);
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
