import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

class CondCompEvaluateSelection {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccaeCtx = null;
	private TerminalNode identifier = null;
	private CobolPreprocessorParser.LiteralContext literalCtx = null;
	private TerminalNode numericLiteral = null;
	private TerminalNode nonNumericLiteral = null;
	private CondCompArithmeticExpression ccae = null;
	private CondCompVar var = null;
	private TerminalNode tn = null;
	private Integer numericValue = null;
	private String nonNumericValue = null;
	private Boolean booleanValue = null;
	private int line = -1;
	private String text = null;
	private Logger LOGGER = Logger.getLogger("TestIntegration");

	public CondCompEvaluateSelection (
				CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext ctx
				, ArrayList<CondCompVar> varList) {
		this.ctx = ctx;
		this.line = this.ctx.getStart().getLine();
		this.ccaeCtx = ctx.conditionalCompilationArithmeticExpression();
		if (this.ccaeCtx != null) {
			this.ccae = new CondCompArithmeticExpression(this.ccaeCtx, varList);
		}
		this.identifier = this.ctx.IDENTIFIER();
		this.literalCtx = this.ctx.literal();
		if (this.literalCtx != null) {
			this.numericLiteral = this.literalCtx.NUMERICLITERAL();
			this.nonNumericLiteral = this.literalCtx.NONNUMERICLITERAL();
		}

		this.setValue(varList);

		if (this.var != null) {
			this.text = "@ " + this.line + " " + this.myName + " " + this.var;
		} else if (this.numericValue != null) {
			this.text = "@ " + this.line + " " + this.myName + " " + this.numericValue;
		} else if (this.nonNumericValue != null) {
			this.text = "@ " + this.line + " " + this.myName + " " + this.nonNumericValue;
		} else {
			this.text = "@ " + this.line + " " + this.myName + " <unknown value>";
		}
	}

	public TerminalNode getTerminalNode() {
		return this.tn;
	}

	public CondCompVar getVar() {
		return this.var;
	}

	private Integer getIntValue() {
		if (this.ccae == null) {
			return null;
		} else {
			return this.ccae.getValue();
		}
	}

	public Integer getNumericValue() {
		return this.numericValue;
	}

	public String getNonNumericValue() {
		return this.nonNumericValue;
	}

	public Boolean getBooleanValue() {
		return this.booleanValue;
	}

	private void setValue(ArrayList<CondCompVar> varList) {
		if (this.ccae != null) {
			this.numericValue = this.ccae.getValue();
		} else if (this.identifier != null) {
			long aLine = this.identifier.getSymbol().getLine();
			long posn = this.identifier.getSymbol().getCharPositionInLine();
			long sortKey = (aLine * (long)Integer.MAX_VALUE) + posn;
			/*
			Iterate backwards through varList so we get the most recent
			value set for this variable.
			*/
			for (int i = varList.size() - 1; i >= 0; i--) {
				CondCompVar currVar = varList.get(i);
				if (currVar.varNameIs(this.identifier)) {
					if (currVar.getSortKey() < sortKey) {
						this.var = currVar;
						break;
					}
				}
			}
			if (this.var == null) {
				this.LOGGER.finest(this.myName + " " + this.var + " is null");
			} else {
				this.LOGGER.finest(this.myName + " " + this.var + " is not null");
				switch(this.var.getType()) {
					case VAR_INTEGER:
						this.numericValue = this.var.getIntValue();
						break;
					case VAR_ALPHANUM:
						this.nonNumericValue = this.var.getAlnumValue();
						break;
					case VAR_BOOLEAN:
						this.booleanValue = this.var.getBoolValue();
						break;
					default:
						// not sure we can get here, but it doesn't cost any extra
						throw new IllegalArgumentException(
									this.var.getVarName()
									+ " is of type "
									+ this.var.getType()
									+ " and is invalid in this context");
				}
			}
		} else if (this.numericLiteral != null) {
			this.tn = this.numericLiteral;
			this.numericValue = Integer.parseInt(this.numericLiteral.getSymbol().getText());
		} else if (this.nonNumericLiteral != null) {
			this.tn = this.nonNumericLiteral;
			this.nonNumericValue = this.nonNumericLiteral.getSymbol().getText();
		} else {
			throw new IllegalArgumentException(
				this.myName
				+ " syntax error - no value found");
		}
	}

	public String toString() {
		return this.text;
	}
}
