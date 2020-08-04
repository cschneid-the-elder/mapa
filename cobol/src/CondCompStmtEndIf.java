
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtEndIf implements ConditionalCompilationStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_END_IF;
	private CobolPreprocessorParser.ConditionalCompilationEndIfContext ctx = null;
	private CondCompStmtIf ifStmt = null;
	private Boolean truthiness = true;
	private int line = -1;
	private String text = null;

	public CondCompStmtEndIf (
				CobolPreprocessorParser.ConditionalCompilationEndIfContext ccec
				, CondCompStmtIf ifStmt) {
		this.ctx = ccec;
		this.ifStmt = ifStmt;
		this.ifStmt.setEndIf(this);
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType() + " [of " + this.ifStmt + "]";

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
