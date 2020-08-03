
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtElse implements CompilerDirectingStatement, CondCompStmtCond {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_ELSE;
	private CobolPreprocessorParser.ConditionalCompilationElseContext ctx = null;
	private CondCompStmtIf ifStmt = null;
	private CondCompStmtEndIf endIfStmt = null;
	private Boolean truthiness = null;
	private int line = -1;
	private String text = null;

	public CondCompStmtElse (
				CobolPreprocessorParser.ConditionalCompilationElseContext ccec
				, CondCompStmtIf ifStmt) {
		this.ctx = ccec;
		this.ifStmt = ifStmt;
		this.ifStmt.setElse(this);
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType() + " [of " + this.ifStmt + "]";

	}

	public Boolean strewth() {
		if (this.truthiness == null) {
			this.truthiness = !this.ifStmt.strewth();
		}

		return this.truthiness;
	}

	public int getLine() {
		return this.line;
	}

	public int getEndLine() {
		return this.endIfStmt.getLine();
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public void setEndIf(CondCompStmtEndIf stmt) {
		this.endIfStmt = stmt;
	}

	public String toString() {
		return this.text;
	}
}
