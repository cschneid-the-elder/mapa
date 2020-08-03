
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtDefine implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_DEFINE;
	private CobolPreprocessorParser.ConditionalCompilationDefineContext ctx = null;
	private CondCompVar var = null;
	private int line = -1;

	public CondCompStmtDefine(
				CobolPreprocessorParser.ConditionalCompilationDefineContext ccdc) {
		this.ctx = ccdc;
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.var = new CondCompVar(this.ctx);
	}

	public int getLine() {
		return this.line;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public CondCompVar getVar() {
		return this.var;
	}
}

