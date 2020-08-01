
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtIf implements CompilerDirectingStatement, CondCompStmtCond {

	private String myName = this.getClass().getName();
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_IF;
	private CobolPreprocessorParser.ConditionalCompilationIfContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ccrcCtx = null;
	private CondCompRelationalCondition ccrc = null;
	private Boolean truthiness = null;
	private int line = -1;
	private String text = null;

	public CondCompStmtIf (
				CobolPreprocessorParser.ConditionalCompilationIfContext ccic
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccic;
		this.ccrcCtx = this.ctx.conditionalCompilationRelationalCondition();
		this.ccrc = new CondCompRelationalCondition(this.ccrcCtx, varList);
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();
		this.text = "@ " + this.getLine() + " " + this.getType() + " " + this.ccrc;

	}

	public Boolean strewth() {
		if (this.truthiness == null) {
			this.truthiness = this.ccrc.evaluate();
		}

		return this.truthiness;
	}

	public int getLine() {
		return this.line;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	public String toString() {
		return this.text;
	}
}
