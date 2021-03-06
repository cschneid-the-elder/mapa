
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtEvaluate implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_EVALUATE;
	private CobolPreprocessorParser.ConditionalCompilationEvaluateContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationEvaluateSelectionContext ccesCtx = null;
	private ArrayList<CondCompStmtWhen> whenStmts = new ArrayList<>();
	private CondCompStmtEndEvaluate endEvaluateStmt = null;
	private CondCompEvaluateSelection evaluateSelection = null;
	private int line = -1;
	private String text = null;

	public CondCompStmtEvaluate (
				CobolPreprocessorParser.ConditionalCompilationEvaluateContext ccec
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccec;
		this.ccesCtx = this.ctx.conditionalCompilationEvaluateSelection();
		if (this.ccesCtx != null) {
			this.evaluateSelection = new CondCompEvaluateSelection(this.ccesCtx, varList);
		}
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType();

	}

	public int getLine() {
		return this.line;
	}

	public int getEndLine() {
		return this.endEvaluateStmt.getLine();
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public ArrayList<CondCompStmtWhen> getWhenStmts() {
		return this.whenStmts;
	}

	public void addWhen(CondCompStmtWhen stmt) {
		this.whenStmts.add(stmt);
	}

	public void setEndEvaluate(CondCompStmtEndEvaluate stmt) {
		this.endEvaluateStmt = stmt;

		for (CondCompStmtWhen aWhenStmt: this.whenStmts) {
			aWhenStmt.setEndEvaluate(stmt);
		}
	}

	public Boolean isJustTrue() {
		return (this.ctx.TRUE() != null);
	}

	public CondCompVar getVar() {
		return this.evaluateSelection.getVar();
	}

	public TerminalNode getTerminalNode() {
		return this.evaluateSelection.getTerminalNode();
	}

	public CondCompEvaluateSelection getEvaluateSelection() {
		return this.evaluateSelection;
	}

	public String toString() {
		return this.text;
	}
}
