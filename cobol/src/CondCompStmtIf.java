
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompStmtIf implements CondCompStmt, CondCompStmtCond {

	private String myName = this.getClass().getName();
	private CondCompStmtType type = CondCompStmtType.STMT_IF;
	private CobolPreprocessorParser.ConditionalCompilationIfContext ctx = null;
	private CobolPreprocessorParser.ConditionalCompilationRelationalConditionContext ccrcCtx = null;
	private CondCompRelationalCondition ccrc = null;
	private Boolean strewth = null;
	private long line = -1;

	public CondCompStmtIf(
				CobolPreprocessorParser.ConditionalCompilationIfContext ccic
				, ArrayList<CondCompVar> varList) {
		this.ctx = ccic;
		this.ccrcCtx = this.ctx.conditionalCompilationRelationalCondition();
		this.ccrc = new CondCompRelationalCondition(this.ccrcCtx, varList);
		this.line = this.ctx.COMPILER_DIRECTIVE_TAG().getSymbol().getLine();

	}

	public Boolean truthiness() {
		if (this.strewth == null) {
			this.strewth = this.ccrc.evaluate();
		}

		return this.strewth;
	}

	public long getLine() {
		return this.line;
	}

	public CondCompStmtType getType() {
		return this.type;
	}
}

