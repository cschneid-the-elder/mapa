
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtWhen implements ConditionalCompilationStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_WHEN;
	private CobolPreprocessorParser.ConditionalCompilationWhenContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccaeCtx1 = null;
	private CobolPreprocessorParser.ConditionalCompilationArithmeticExpressionContext ccaeCtx2 = null;
	private CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ccrc = null;
	private CondCompRelationalCondition relCond = null;
	private CondCompStmtEvaluate evaluateStmt = null;
	private CondCompStmtEndEvaluate endEvaluateStmt = null;
	private Boolean truthiness = null;
	private int line = -1;
	private int endLine = -1;
	private String text = null;

	public CondCompStmtWhen (
				CobolPreprocessorParser.ConditionalCompilationWhenContext ccwc
				, CondCompStmtEvaluate evaluateStmt
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccwc;
		this.evaluateStmt = evaluateStmt;
		this.ccrc = this.ctx.conditionalCompilationRelationalCondition();
		this.relCond = new CondCompRelationalCondition(this.ccrc, varList);
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType();

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
		return true;
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
