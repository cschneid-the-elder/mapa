
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompSimpleRelationalCondition implements CondCompToken, CondCompCondition {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = CondCompTokenType.SIMPLE_RELATIONAL_CONDITION;
	private CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ctx = null;
	private List<CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext> ccaeCtx = null;
	private CondCompArithmeticExpression exp1 = null;
	private CondCompArithmeticExpression exp2 = null;
	private CondCompComparisonOp op = null;
	private TerminalNode tn = null;
	private TerminalNode arg1 = null;
	private TerminalNode arg2 = null;
	private CondCompVar var1 = null;
	private CondCompVar var2 = null;
	private long sortKey = -1;
	private String text = null;

	public static List<CondCompSimpleRelationalCondition> bunchOfThese(
				List<CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext> ctxList
				, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompSimpleRelationalCondition> ccsrList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ccsrc: ctxList) {
			ccsrList.add(new CondCompSimpleRelationalCondition(ccsrc, varList));
		}

		return ccsrList;
	}

	public CondCompSimpleRelationalCondition(
				CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ccsrc
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccsrc;

		this.op = new CondCompComparisonOp(this.ctx.conditionalCompilationComparisonOp());

		if (ccsrc.IDENTIFIER() == null && ccsrc.literal() == null) {
			throw new IllegalArgumentException(
				"ConditionalCompilationSimpleRelationalConditionContext"
			+ " with IDENTIFIER() == null && literal() == null");
		}

		if (ccsrc.conditionalCompilationArithmeticExpression() == null || ccsrc.conditionalCompilationArithmeticExpression().size() == 0) {
			if (ccsrc.IDENTIFIER() != null && ccsrc.literal() != null) {
				if (ccsrc.IDENTIFIER().size() == 0 && ccsrc.literal().size() == 0) {
					throw new IllegalArgumentException(
						"ConditionalCompilationSimpleRelationalConditionContext with"
					+ " (ccsrc.conditionalCompilationArithmeticExpression() == null || ccsrc.conditionalCompilationArithmeticExpression().size() == 0)"
					+ " && (ccsrc.IDENTIFIER() != null && ccsrc.literal() != null)"
					+ " && (ccsrc.IDENTIFIER().size() == 0 && ccsrc.literal().size() == 0)");
				}
			}
		}

		if (ccsrc.IDENTIFIER() == null || ccsrc.IDENTIFIER().size() == 0) {
			if (ccsrc.conditionalCompilationArithmeticExpression() == null || ccsrc.conditionalCompilationArithmeticExpression().size() == 0) {
				if (ccsrc.literal().size() != 2) {
					throw new IllegalArgumentException(
						"ConditionalCompilationSimpleRelationalConditionContext"
					+ " with (IDENTIFIER() == null || IDENTIFIER().size() == 0)"
					+ " && (conditionalCompilationArithmeticExpression() == null || conditionalCompilationArithmeticExpression().size() == 0)"
					+ " && literal().size() != 2");
				}
			}
		}

		if (ccsrc.literal() == null || ccsrc.literal().size() == 0) {
			if (ccsrc.conditionalCompilationArithmeticExpression() == null || ccsrc.conditionalCompilationArithmeticExpression().size() == 0) {
				if (ccsrc.IDENTIFIER().size() != 2) {
					throw new IllegalArgumentException(
						"ConditionalCompilationSimpleRelationalConditionContext"
					+ " with (literal() == null || literal().size() == 0)"
					+ " && (conditionalCompilationArithmeticExpression() == null || conditionalCompilationArithmeticExpression().size() == 0)"
					+ " && IDENTIFIER().size() != 2");
				}
			}
		}

		if (ccsrc.conditionalCompilationArithmeticExpression() == null || ccsrc.conditionalCompilationArithmeticExpression().size() == 0) {
			if (ccsrc.IDENTIFIER() == null || ccsrc.IDENTIFIER().size() == 0) {
				/*
				This is admittedly somewhat odd, we have a condition
				comparing two literals.
	
				>>IF 1 == 1
	
				The syntax allows for it, so here we are.
				*/
				this.arg1 = this.literalValue(ccsrc.literal(0));
				this.arg2 = this.literalValue(ccsrc.literal(1));
			} else {
				if (ccsrc.IDENTIFIER().size() == 2) {
					this.arg1 = ccsrc.IDENTIFIER(0);
					this.arg2 = ccsrc.IDENTIFIER(1);
					this.var1 = this.varFromList(this.arg1, varList);
					this.var2 = this.varFromList(this.arg2, varList);
				} else {
					TerminalNode t1 = ccsrc.IDENTIFIER(0);
					TerminalNode t2 = this.literalValue(ccsrc.literal(0));
					if (t1.getSymbol().getCharPositionInLine() < t2.getSymbol().getCharPositionInLine()) {
						this.arg1 = t1;
						this.arg2 = t2;
						this.var1 = this.varFromList(this.arg1, varList);
					} else {
						this.arg1 = t2;
						this.arg2 = t1;
						this.var2 = this.varFromList(this.arg2, varList);
					}
				}
			}
			this.tn = this.arg1;
		} else {
			ArrayList<CondCompArithmeticExpression> ccaeList = new ArrayList<>();
			ccaeList.addAll(
				CondCompArithmeticExpression.bunchOfThese(
					ccsrc.conditionalCompilationArithmeticExpression()
					, varList));
			exp1 = ccaeList.get(0);
			if (ccaeList.size() > 1) {
				exp2 = ccaeList.get(1);
			} else {
				long opPosn = this.op.getPosn();
				if (ccsrc.IDENTIFIER() == null || ccsrc.IDENTIFIER().size() == 0) {
					this.arg1 = this.literalValue(ccsrc.literal(0));
				} else {
					this.arg1 = ccsrc.IDENTIFIER(0);
					this.var1 = this.varFromList(this.arg1, varList);
				}
				/*
				This foolishness is because we must be able to discern which we have...

				10 < X + 3
				X + 3 > 10
				Y < X + 3
				X + 3 > Y
				*/
				if (opPosn < this.arg1.getSymbol().getCharPositionInLine()) {
					this.arg2 = this.arg1;
					this.var2 = this.var1;
					this.arg1 = null;
					this.var1 = null;
				}
			}
		}

		if (this.tn == null) {
			this.sortKey = this.exp1.getSortKey();
			if (this.exp2 == null) {
				this.text =
					this.myName
					+ " "
					+ exp1;
			} else {
				this.text =
					this.myName
					+ " "
					+ exp1
					+ " "
					+ this.op
					+ " "
					+ exp2;
			}
		} else {
			long line = this.tn.getSymbol().getLine();
			long posn = this.tn.getSymbol().getCharPositionInLine();
			this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
			this.text =
					this.myName
					+ " "
					+ this.arg1.getSymbol().getText()
					+ " "
					+ this.op
					+ " "
					+ this.arg2.getSymbol().getText();
		}
	}

	private TerminalNode literalValue(CobolPreprocessorParser.LiteralContext lit) {
		if (lit.NONNUMERICLITERAL() == null) {
			return lit.NUMERICLITERAL();
		} else {
			return lit.NONNUMERICLITERAL();
		}
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
		TestIntegration.LOGGER.finer(this.myName + " evaluate()");
		if (this.exp1 != null) {
			TestIntegration.LOGGER.finer("    this.exp1 != null");
			return this.compareArithmeticExpression();
		}

		if (this.var1 == null) {
			TestIntegration.LOGGER.finer("    this.var1 == null");
			if (this.var2 == null) {
				TestIntegration.LOGGER.finer("        this.var2 == null");
				return this.compareTN(this.arg1, this.arg2);
			} else {
				TestIntegration.LOGGER.finer("        this.var2 != null");
				return this.var2.compareTo(this.arg1, this.op);
			}
		} else {
			TestIntegration.LOGGER.finer("    this.var1 != null");
			if (this.var2 == null) {
				TestIntegration.LOGGER.finer("        this.var2 == null");
				return this.var1.compareTo(this.op, this.arg2);
			} else {
				TestIntegration.LOGGER.finer("        this.var2 != null");
				return this.var1.compareTo(this.op, this.var2);
			}
		}
	}

	/**
	This method returns the result of comparing two TerminalNode
	instances.  It may be too sloppy in using String::compareTo(),
	but I'm regarding this as an edge case already and am having
	some difficulty coming up with a reason to get more involved.
	*/
	private Boolean compareTN(TerminalNode tn1, TerminalNode tn2) {
		TestIntegration.LOGGER.finer(
			this.myName 
			+ " compareTN(TerminalNode tn1 |"
			+ tn1.getSymbol().getText()
			+ "|, TerminalNode tn2 |"
			+ tn2.getSymbol().getText()
			+ "|)");
		int comparison = tn1.getSymbol().getText().toUpperCase().compareTo(tn2.getSymbol().getText().toUpperCase());

		return this.compare(comparison);
	}

	private Boolean compareArithmeticExpression() {
		TestIntegration.LOGGER.finer(this.myName + " compareArithmeticExpression()");

		Boolean rc = null;
		int comparison = 0;
		Integer exp1Value = this.exp1.getValue();

		if (this.exp2 != null) {
			TestIntegration.LOGGER.finer("    this.exp2 != null");
			Integer exp2Value = this.exp2.getValue();
			comparison = exp1Value.compareTo(exp2Value);
			return this.compare(comparison);
		}

		if (this.var1 != null) {
			return this.var1.compareTo(this.op, exp1Value);
		}

		if (this.var2 != null) {
			return this.var2.compareTo(exp1Value, this.op);
		}

		if (this.arg1 != null) {
			Integer val1 = new Integer(this.arg1.getSymbol().getText());
			comparison = exp1Value.compareTo(val1);
			return this.compare(comparison);
		}

		Integer val2 = new Integer(this.arg2.getSymbol().getText());
		comparison = val2.compareTo(exp1Value);
		return this.compare(comparison);
	}

	private Boolean compare(int comparison) {
		Boolean rc = null;

		switch(this.op.getType()) {
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

		return rc;
	}

	public String toString() {
		return this.text;
	}
}
