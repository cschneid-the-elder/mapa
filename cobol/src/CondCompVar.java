
import java.util.*;
import java.util.logging.Logger;
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
	private CondCompArithmeticExpression ccae = null;
	private Boolean parameter = false;
	private TerminalNode tn = null;
	private long sortKey = -1;
	private Logger LOGGER = null;

	/*public static List<CondCompVar> bunchOfThese(
					List<CobolPreprocessorParser.ConditionalCompilationDefineContext> list
					, ArrayList<CondCompVar> compOptDefines) {
		ArrayList<CondCompVar> ccVarList = new ArrayList<>();

		for (CobolPreprocessorParser.ConditionalCompilationDefineContext ccVar: list) {
			ccVarList.add(new CondCompVar(ccVar, compOptDefines));
		}

		return ccVarList;
	}*/

	public CondCompVar(CobolPreprocessorParser.ConditionalCompilationDefineContext ccdc, ArrayList<CondCompVar> compOptDefines, Logger LOGGER) {
		this.LOGGER = LOGGER;
		this.LOGGER.fine("CondCompVar(CobolPreprocessorParser.ConditionalCompilationDefineContext ccdc, ArrayList<CondCompVar> compOptDefines)");

		this.ctx = ccdc;
		this.tn = this.ctx.IDENTIFIER();
		this.varName = this.tn.getSymbol().getText();

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.predicate = this.ctx.conditionalCompilationDefinePredicate();
		if (this.predicate == null) {
			this.LOGGER.finest("this.predicate == null");
			this.literalCtx = null;
			/*
			As per https://www.ibm.com/support/knowledgecenter/SS6SG3_6.3.0/pg/ui/up4011.html
			"If literal-1 is not specified, a value of B'1' will be assigned to the 
			compilation variable."
			If that link has gone stale, it's..
				Enterprise COBOL for z/OS > Programming Guide
				> Compiling and debugging your program > Compiler options > DEFINE
			*/
			this.setValue("B'1'");
		} else {
			this.LOGGER.finest("this.predicate != null");
			this.literalCtx = this.predicate.literal();
			if (this.predicate.PARAMETER() != null) {
				this.LOGGER.finest("this.predicate.PARAMETER() != null");
				this.parameter = true;
				for (CondCompVar ccv: compOptDefines) {
					if (this.varName.equals(ccv.getVarName()) && ccv.fromCompileOption()) {
						this.type = ccv.getType();
						switch(this.type) {
							case VAR_INTEGER:
								this.intValue = ccv.getIntValue();
								break;
							case VAR_ALPHANUM:
								this.alnumValue = ccv.getAlnumValue();
								break;
							case VAR_BOOLEAN:
								this.boolValue = ccv.getBoolValue();
								break;
							default:
								throw new IllegalArgumentException(
											ccv.getVarName()
											+ " is of type "
											+ ccv.getType()
											+ " AS PARAMETER has been indicated and value has not been set in PROCESS or CBL DEFINE()");
						}
					}
				}
				if (this.type == null) {
					throw new IllegalArgumentException(
								this.getVarName()
								+ " AS PARAMETER has been indicated and value has not been set in PROCESS or CBL DEFINE()");
				}
			} else if (this.literalCtx == null) {
				this.LOGGER.finest("this.literalCtx == null");
				if (this.predicate.IDENTIFIER() == null) {
					this.LOGGER.finest("this.predicate.IDENTIFIER() == null");
					// set to an expression
					this.expression = this.predicate.conditionalCompilationArithmeticExpression();
					this.ccae = new CondCompArithmeticExpression(this.expression, compOptDefines);
					this.type = CondCompTokenType.VAR_INTEGER;
					this.intValue = this.ccae.getValue();
				} else {
					this.LOGGER.finest("this.predicate.IDENTIFIER() != null");
					//set to the value of another variable
				}
			} else {
				this.LOGGER.finest("this.literalCtx != null");
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
						this.setValue(this.literalCtx.NUMERICLITERAL());
					}
				} else {
					this.setValue(this.literalCtx.NONNUMERICLITERAL());
				}
			}
		}

	}

	/*public CondCompVar(CobolPreprocessorParser.ConditionalCompilationDefineContext ctx, Logger LOGGER) {
		this.LOGGER = LOGGER;
		this.LOGGER.fine("CondCompVar(CobolPreprocessorParser.ConditionalCompilationDefineContext ctx)");

		this.ctx = ctx;
		this.tn = this.ctx.IDENTIFIER();
		this.varName = this.tn.getSymbol().getText();

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.predicate = ctx.conditionalCompilationDefinePredicate();

		if (predicate == null) {
			this.literalCtx = null;
		} else {
			this.literalCtx = this.predicate.literal();
		}
		if (this.literalCtx == null) {
			*//*
			As per https://www.ibm.com/support/knowledgecenter/SS6SG3_6.3.0/pg/ui/up4011.html
			"If literal-1 is not specified, a value of B'1' will be assigned to the 
			compilation variable."
			If that link has gone stale, it's..
				Enterprise COBOL for z/OS > Programming Guide
				> Compiling and debugging your program > Compiler options > DEFINE
			*//*
			this.setValue("B'1'");
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
					this.setValue(this.literalCtx.NUMERICLITERAL());
				}
			} else {
				this.setValue(this.literalCtx.NONNUMERICLITERAL());
			}
		}

	}*/

	public CondCompVar(CobolPreprocessorParser.Define_optContext ctx, Logger LOGGER) {
		this.LOGGER = LOGGER;
		this.LOGGER.fine("CondCompVar(CobolPreprocessorParser.Define_optContext ctx)");

		this.defCtx = ctx;
		this.tn = this.getIdentifierTerminalNode(this.defCtx.identifier_et_al());
		this.varName = this.tn.getSymbol().getText();

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
				> Compiling and debugging your program > Compiler options > DEFINE
			*/
			this.setValue("B'1'");
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
					this.setValue(this.literalCtx.NUMERICLITERAL());
				}
			} else {
				this.setValue(this.literalCtx.NONNUMERICLITERAL());
			}
		}

	}

	private TerminalNode getIdentifierTerminalNode(CobolPreprocessorParser.Identifier_et_alContext iCtx) {
		if (iCtx.IDENTIFIER() != null) {
			return iCtx.IDENTIFIER();
		} else if (iCtx.C_CHAR() != null) {
			return iCtx.C_CHAR();
		} else if (iCtx.D_CHAR() != null) {
			return iCtx.D_CHAR();
		} else if (iCtx.E_CHAR() != null) {
			return iCtx.E_CHAR();
		} else if (iCtx.F_CHAR() != null) {
			return iCtx.F_CHAR();
		} else if (iCtx.H_CHAR() != null) {
			return iCtx.H_CHAR();
		} else if (iCtx.I_CHAR() != null) {
			return iCtx.I_CHAR();
		} else if (iCtx.M_CHAR() != null) {
			return iCtx.M_CHAR();
		} else if (iCtx.N_CHAR() != null) {
			return iCtx.N_CHAR();
		} else if (iCtx.O_CHAR() != null) {
			return iCtx.O_CHAR();
		} else if (iCtx.Q_CHAR() != null) {
			return iCtx.Q_CHAR();
		} else if (iCtx.S_CHAR() != null) {
			return iCtx.S_CHAR();
		} else if (iCtx.U_CHAR() != null) {
			return iCtx.U_CHAR();
		} else if (iCtx.W_CHAR() != null) {
			return iCtx.W_CHAR();
		} else if (iCtx.X_CHAR() != null) {
			return iCtx.X_CHAR();
		} else {
			throw new IllegalArgumentException(
				this.myName
				+ " instantiation error - Identifier_et_alContext"
				+ " contains no recognizable identifier");
		}
	}

	private void setValue(TerminalNode t) {
		this.LOGGER.finest("setValue(TerminalNode t)");

		this.setValue(t.getSymbol().getText());

	}

	private void setValue(String s) {
		this.LOGGER.finest("setValue(String s)");
		if (s.toUpperCase().startsWith("B'")) {
			this.LOGGER.finest("s.toUpperCase().startsWith(\"B\'\")");
			this.type = CondCompTokenType.VAR_BOOLEAN;
			if (s.toUpperCase().equals("B'0'")) {
				this.boolValue = false;
			} else {
				this.boolValue = true;
			}
		} else if (s.chars().allMatch(Character::isDigit)) {
			this.LOGGER.finest("s.chars().allMatch(Character::isDigit)");
			this.type = CondCompTokenType.VAR_INTEGER;
			this.intValue = Integer.parseInt(s);
		} else {
			this.LOGGER.finest("else must be alphanum");
			this.type = CondCompTokenType.VAR_ALPHANUM;
			this.alnumValue = s;
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

	public Boolean isBoolean() {
		return this.getType() == CondCompTokenType.VAR_BOOLEAN;
	}

	public Boolean isInteger() {
		return this.getType() == CondCompTokenType.VAR_INTEGER;
	}

	public Boolean isAlphanum() {
		return this.getType() == CondCompTokenType.VAR_ALPHANUM;
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
		this.LOGGER.finest(this.myName + " compareTo(CondCompComparisonOp op, CondCompVar var)");
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
		this.LOGGER.finest(this.myName + " compareTo(CondCompVar var, CondCompComparisonOp op)");
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
		this.LOGGER.finest(this.myName + " compareTo(CondCompComparisonOp op, TerminalNode t)");
		int comparison = 0;
		String tText = t.getSymbol().getText();

		switch(this.type) {
			case VAR_INTEGER:
				comparison = this.intValue.compareTo(Integer.parseInt(tText));
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
		this.LOGGER.finest(this.myName + " compareTo(TerminalNode t, CondCompComparisonOp op)");
		int comparison = 0;
		String tText = t.getSymbol().getText();

		switch(this.type) {
			case VAR_INTEGER:
				//comparison = new Integer(tText).compareTo(this.intValue);
				comparison = Integer.compare(Integer.parseInt(tText), this.intValue);
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

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the first argument, is true with respect to the second
	argument.

	>>IF i op this

	...if you will.
	*/
	public Boolean compareTo(Integer i, CondCompComparisonOp op) {
		this.LOGGER.finest(this.myName + " compareTo(Integer i, CondCompComparisonOp op)");
		int comparison = 0;

		switch(this.type) {
			case VAR_INTEGER:
				comparison = i.compareTo(this.intValue);
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName()
							+ " is of type "
							+ this.getType()
							+ " and #compareTo(Integer, CondCompComparisonOp) is thus invalid");
		}

		return this.compare(comparison, op);
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the first argument, is true with respect to the second
	argument.

	>>IF this op i

	...if you will.
	*/
	public Boolean compareTo(CondCompComparisonOp op, Integer i) {
		this.LOGGER.finest(this.myName + " compareTo(CondCompComparisonOp op, Integer i)");
		int comparison = 0;

		switch(this.type) {
			case VAR_INTEGER:
				comparison = this.intValue.compareTo(i);
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName()
							+ " is of type "
							+ this.getType()
							+ " and #compareTo(CondCompComparisonOp, Integer) is thus invalid");
		}

		return this.compare(comparison, op);
	}

	/**
	This method returns a Boolean indicating whether the comparison,
	indicated by the first argument, is true with respect to the second
	argument.

	>>IF s op this

	...if you will.
	*/
	public Boolean compareTo(String s, CondCompComparisonOp op) {
		this.LOGGER.finest(this.myName + " compareTo(String s, CondCompComparisonOp op)");
		int comparison = 0;

		switch(this.type) {
			case VAR_ALPHANUM:
				comparison = s.compareTo(this.alnumValue);
				break;
			default:
				throw new IllegalArgumentException(
							this.getVarName()
							+ " is of type "
							+ this.getType()
							+ " and #compareTo(String, CondCompComparisonOp) is thus invalid");
		}

		return this.compare(comparison, op);
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

	public String toString() {
		StringBuilder sb = new StringBuilder(this.getVarName());

		this.LOGGER.fine(this.myName + " toString() " + this.getVarName());

		sb.append(" ");

		if (this.getType() == null) {
			sb.append("<type is null>");
		} else {
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
				case DEFINE_ONLY:
					sb.append("<define only>");
					break;
				default:
					sb.append("<unhandled type>");
			}
		}

		if (this.fromCompileOption()) {
			sb.append(" <from compile option>");
		}

		return sb.toString();
	}
}
