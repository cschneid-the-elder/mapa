
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
	private CobolPreprocessorParser.ConditionalCompilationDefinePredicateContext predicate = null;
	private CobolPreprocessorParser.LiteralContext literalCtx = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext expression = null;
	private CobolPreprocessorParser.ConditionalCompilationDefineContext ctx = null;
	private CobolPreprocessorParser.Define_optContext defCtx = null;
	private Boolean parameter = false;
	private TerminalNode tn = null;
	private long sortKey = -1;

	public static List<CondCompVar> bunchOfThese(
					List<CobolPreprocessorParser.ConditionalCompilationDefineContext> list) {
		ArrayList<CondCompVar> ccVarList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationDefineContext ccVar: list) {
			ccVarList.add(new CondCompVar(ccVar));
		}

		return ccVarList;
	}

	public CondCompVar(CobolPreprocessorParser.ConditionalCompilationDefineContext ccdc) {
		this.ctx = ccdc;
		this.varName = this.ctx.IDENTIFIER().getSymbol().getText();
		this.tn = this.ctx.IDENTIFIER();

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.predicate = this.ctx.conditionalCompilationDefinePredicate();
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

	public CondCompVar(CobolPreprocessorParser.Define_optContext ctx) {
		this.defCtx = ctx;
		this.varName = this.defCtx.IDENTIFIER().getSymbol().getText();
		this.tn = this.defCtx.IDENTIFIER();

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.literalCtx = this.defCtx.literal();
		if (this.literalCtx == null) {
			/*
			As per https://www.ibm.com/support/knowledgecenter/SS6SG3_6.3.0/pg/ui/up4011.html
			"If literal-1 is not specified, a value of B'1' will be assigned to the 
			compilation variable."
			If that link has gone stale, it's..
				Enterprise COBOL for z/OS > Programming Guide
				> Compiling and debugging your program > Compiler options > DEBUG
			*/
			this.boolValue = true;
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

	private void setValue(TerminalNode t) {
		String aString = t.getSymbol().getText();
		if (this.type == CondCompTokenType.VAR_INTEGER) {
			this.intValue = new Integer(aString);
		} else if (aString.toUpperCase().startsWith("B'")) {
			this.type = CondCompTokenType.VAR_BOOLEAN;
			if (aString.toUpperCase().equals("B'0'")) {
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

	public CondCompTokenType getType() {
		return this.type;
	}

	public Boolean fromCompileOption() {
		return (this.ctx == null);
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
							this.getVarName()
							+ " is of type "
							+ this.getType()
							+ " and #compareTo() is thus invalid");
		}

		return this.compare(comparison, op);
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the second argument, is true with respect to the first
	argument.

	>>IF var op this

	...if you will.  It's possible this isn't used.
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
				comparison = var.getIntValue().compareTo(this.getIntValue());
				break;
			case VAR_ALPHANUM:
				comparison = var.getAlnumValue().compareTo(this.getAlnumValue());
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

	>>IF this op t

	...if you will.
	*/
	public Boolean compareTo(CondCompComparisonOp op, TerminalNode t) {
		int comparison = 0;
		String tText = t.getSymbol().getText();

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
		String tText = t.getSymbol().getText();

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
		StringBuilder sb = new StringBuilder(this.getVarName());

		sb.append(" ");

		switch(this.getType()) {
			case VAR_INTEGER:
				sb.append(this.getIntValue());
				break;
			case VAR_ALPHANUM:
				sb.append(this.getAlnumValue());
				break;
			case VAR_BOOLEAN:
				sb.append(this.getBoolValue());
				break;
			default:
				sb.append("<value not yet set>");
		}

		if (this.fromCompileOption()) {
			sb.append(" <from compile option>");
		}

		return sb.toString();
	}
}
