
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtEndEvaluate implements ConditionalCompilationStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_END_EVALUATE;
	private CobolPreprocessorParser.ConditionalCompilationEndEvaluateContext ctx = null;
	private CondCompStmtEvaluate evaluateStmt = null;
	private Boolean truthiness = true;
	private int line = -1;
	private String text = null;

	public CondCompStmtEndEvaluate (
				CobolPreprocessorParser.ConditionalCompilationEndEvaluateContext cceec
				, CondCompStmtEvaluate evaluateStmt) {
		this.ctx = cceec;
		this.evaluateStmt = evaluateStmt;
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType();

	}

	public Boolean strewth() {
		return this.truthiness;
	}

	public int getLine() {
		return this.line;
	}

	public int getEndLine() {
		return this.getLine();
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public String toString() {
		return this.text;
	}
}
