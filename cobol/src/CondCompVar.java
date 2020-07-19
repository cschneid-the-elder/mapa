
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompVar implements CondCompToken {

	private String myName = this.getClass().getName();
	private String varName = null;
	private Integer intValue = null;
	private Boolean boolValue = null;
	private String alnumValue = null;
	private CondCompTokenType type = null;
	private CobolPreprocessorParser.ConditionalCompilationDefinePredicate predicate = null;
	private CobolPreprocessorParser.LiteralContext literalCtx = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpression expression = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticOpContext ctx = null;
	private Boolean parameter = false;
	private TerminalNode tn = null;
	private long sortKey = -1;

	public static List<CondCompVar> bunchOfThese(
					List<CobolPreprocessorParser.ConditionalCompilationDefineContext> list) {
		ArrayList<CondCompVar> ccVarList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationDefineContext ccVar: list) {
			ccVarList.add(new CondCompVar(ccVar);
		}

		return ccVarList;
	}

	public CondCompArithOp(CobolPreprocessorParser.ConditionalCompilationDefineContext ccdc) {
		this.ctx = ccdc;
		this.varName = this.ctx.IDENTIFIER().getSymbol().getText();
		this.tn = this.ctx.IDENTIFIER();

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.predicate = this.ctx.conditionalCompilationDefinePredicate()
		if (this.predicate == null) {
			this.type = CondCompTokenType.DEFINE_ONLY;
		} else {
			this.literalCtx = this.predicate.literal();
			if (this.predicate.PARAMETER() != null) {
				this.parameter = true;
			}
			if (this.literalCtx == null) {
				if (this.predicate.IDENTIFIER() == null) {
					// set to an expression
					this.expression = this.predicate.conditionalCompilationArithmeticExpression();
				} else {
					//set to the value of another variable
				}
			} else {
				if (this.literalCtx.NONNUMERICLITERAL() == null) {
					if (this.literalCtx.NUMERICLITERAL() == null) {
						throw new IllegalArgumentException(
							"@ " + line + " var " + this.varName
							+ " ConditionalCompilationDefineContext"
							+ ".ConditionalCompilationDefinePredicateContext"
							+ ".LiteralContext"
							+ " NONNUMERICLITERAL() == null"
							+ " && NUMERICLITERAL() == null");
					} else {
						this.type = CondCompTokenType.VAR_INTEGER;
						this.setValue(this.literalCtx.NUMERICLITERAL());
					}
				} else {
					this.setValue(this.literalCtx.NONNUMERICLITERAL());
				}
			}
		}

	}

	private void setValue(TerminalNode t) {
		String aString = t.getSymbol().getText();
		if (this.type == CondCompTokenType.VAR_INTEGER) {
			this.intValue = new Integer(aString);
		} else if (aString.toUpper().startsWith("B'")) {
			this.type = CondCompTokenType.VAR_BOOLEAN;
			if (aString.toUpper().equals("B'0'")) {
				this.boolValue = false;
			} else {
				this.boolValue = true;
			}
		} else {
			this.type = CondCompTokenType.VAR_ALPHANUM;
			this.alnumValue = aString;
		}
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public Boolean varNameIs(TerminalNode identifier) {
		return this.varName.equals(identifier.getSymbol().getText());
	}

	public String getVarName() {
		return this.varName;
	}

	public int getType() {
		return this.type;
	}

	public Integer getIntValue() {
		return this.intValue;
	}

	public String getAlnumValue() {
		return this.alnumValue;
	}

	public Boolean getBoolValue() {
		return this.boolValue;
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the first argument, is true with respect to the second
	argument.

	>>IF this op var

	...if you will.
	*/
	public Boolean compareTo(CondCompComparisonOp op, CondCompVar var) {
		int comparison = 0;
		Boolean rc = null;

		if (this.type != var.type) {
			throw new IllegalArgumentException(
						this.getVarName()
						+ " is of type "
						+ this.getType()
						+ " and var "
						+ var.getVarName()
						+ " is of type "
						+ var.getType()
						+ "and #compareTo() is thus invalid");
		}

		switch(this.type) {
			case VAR_INTEGER:
				comparison = this.intValue.compareTo(var.getIntValue());
				break;
			case VAR_ALPHANUM:
				comparison = this.alnumValue.compareTo(var.getAlnumValue());
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName
							+ " is of type "
							+ this.getType
							+ " and #compareTo() is thus invalid");
		}

		return this.compare(comparison, op);
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the second argument, is true with respect to the first
	argument.

	>>IF var op this

	...if you will.
	*/
	public Boolean compareTo(CondCompVar var, CondCompComparisonOp op) {
		int comparison = 0;
		Boolean rc = null;

		if (this.type != var.type) {
			throw new IllegalArgumentException(
						this.getVarName()
						+ " is of type "
						+ this.getType()
						+ " and var "
						+ var.getVarName()
						+ " is of type "
						+ var.getType()
						+ "and #compareTo() is thus invalid");
		}

		switch(this.type) {
			case VAR_INTEGER:
				comparison = var.getIntValue().compareTo(this.intValue);
				break;
			case VAR_ALPHANUM:
				comparison = var.getAlnumValue().compareTo(this.alnumValue);
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName
							+ " is of type "
							+ this.getType
							+ " and #compareTo() is thus invalid");
		}

		return this.compare(comparison, op);
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the first argument, is true with respect to the second
	argument.

	>>IF this op t

	...if you will.
	*/
	public Boolean compareTo(CondCompComparisonOp op, TerminalNode t) {
		int comparison = 0;
		String tText = t.var.getSymbol().getText();

		switch(this.type) {
			case VAR_INTEGER:
				comparison = this.intValue.compareTo(new Integer(tText));
				break;
			case VAR_ALPHANUM:
				comparison = this.alnumValue.compareTo(tText);
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName()
							+ " is of type "
							+ this.getType()
							+ " and #compareTo() is thus invalid");
		}

		return this.compare(comparison, op);
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the first argument, is true with respect to the second
	argument.

	>>IF t op this

	...if you will.
	*/
	public Boolean compareTo(TerminalNode t, CondCompComparisonOp op) {
		int comparison = 0;
		String tText = t.var.getSymbol().getText();

		switch(this.type) {
			case VAR_INTEGER:
				comparison = new Integer(tText).compareTo(this.intValue);
				break;
			case VAR_ALPHANUM:
				comparison = tText.compareTo(this.alnumValue);
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName()
							+ " is of type "
							+ this.getType()
							+ " and #compareTo() is thus invalid");
		}

		return this.compare(comparison, op);
	}

	private Boolean compare(int comparison, CondCompComparisonOp op) {
		Boolean rc = null;

		switch(op.getType()) {
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
