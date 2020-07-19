
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompSimpleRelation implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationSimpleRelationalConditionContext ctx = null;
	private CondCompComparisonOp op = null;
	private TerminalNode tn = null;
	private TerminalNode arg1 = null;
	private TerminalNode arg2 = null;
	private CondCompVar var1 = null;
	private CondCompVar var2 = null;
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

		this.op = new CondCompComparisonOp(this.ctx.conditionalCompilationComparisonOp());

		if (ccsrc.IDENTIFIER() == null && ccsrc.literal() == null) {
			throw new IllegalArgumentException(
				"ConditionalCompilationSimpleRelationalConditionContext"
			+ " with IDENTIFIER() == null && literal() == null");
		}

		if (ccsrc.IDENTIFIER() != null && ccsrc.literal() != null) {
			if (ccsrc.IDENTIFIER().size() == 0 && ccsrc.literal().size() == 0) {
				throw new IllegalArgumentException(
					"ConditionalCompilationSimpleRelationalConditionContext"
				+ " with IDENTIFIER().size() == 0 && literal().size() == 0");
			}
		}

		if (ccsrc.IDENTIFIER() == null || ccsrc.IDENTIFIER().size() == 0) {
			if (ccsrc.literal().size() != 2) {
				throw new IllegalArgumentException(
					"ConditionalCompilationSimpleRelationalConditionContext"
				+ " with (IDENTIFIER() == null || IDENTIFIER().size() == 0)"
				+ " && literal().size() != 2");
			}
		}

		if (ccsrc.literal() == null || ccsrc.literal().size() == 0) {
			if (ccsrc.IDENTIFIER().size() != 2) {
				throw new IllegalArgumentException(
					"ConditionalCompilationSimpleRelationalConditionContext"
				+ " with (literal() == null || literal().size() == 0)"
				+ " && IDENTIFIER().size() != 2");
			}
		}

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
				this.arg1 == ccsrc.IDENTIFIER(0);
				this.arg2 == ccsrc.IDENTIFIER(1);
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
		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	private TerminalNode literalValue(LiteralContext lit) {
		if (lit.NONNUMERICLITERAL() == null) {
			return lit.NUMERICLITERAL();
		} else {
			return lit.NONNUMERICLITERAL();
		}
	}

	private CondCompVar varFromList(TerminalNode t, ArrayList<CondCompVar> varList) {
		ArrayList<CondCompVar> revList = new ArrayList<>(varList.size());

		Collections.copy(revList, varList);
		for(CondCompVar v: Collections.reverse(revList)) {
			if (v.varNameIs(t)) {
				return v;
			}
		}

		return null;
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public int getType() {
		return this.type;
	}

	public Boolean evaluate() {
		if (this.var1 == null) {
			if (this.var2 == null) {
				return this.compareTN(this.arg1, this.arg2);
			} else {
				return this.var2.compareTo(this.arg1, this.op);
			}
		} else {
			if (this.var2 == null) {
				return this.var1.compareTo(this.op, this.arg2);
			} else {
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
		int comparison = tn1.getSymbol().getText().toUpperCase().compareTo(tn2.getSymbol().getText().toUpperCase());
		Boolean rc = null;

		switch(this.op.getType()) {
			case COMPAREOP_EQ:
				if (comparison == 0) {
					rc = true;
				} else {
					rc = false;
				}
			case COMPAREOP_NE:
				if (comparison == 0) {
					rc = false;
				} else {
					rc = true;
				}
			case COMPAREOP_LT:
				if (comparison < 0) {
					rc = true;
				} else {
					rc = false;
				}
			case COMPAREOP_LE:
				if (comparison <= 0) {
					rc = true;
				} else {
					rc = false;
				}
			case COMPAREOP_GT:
				if (comparison > 0) {
					rc = true;
				} else {
					rc = false;
				}
			case COMPAREOP_GE:
				if (comparison >= 0) {
					rc = true;
				} else {
					rc = false;
				}
			default:
				throw new IllegalArgumentException(
							"comparison operator is of unknown type");
		}

		return rc;
	}
}
