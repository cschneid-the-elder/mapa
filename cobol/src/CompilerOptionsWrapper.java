import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerOptionsWrapper implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CompilerOptionsContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_COMPILE_OPTION;
	//private int line = -1;
	private int startLine = -1;
	private int endLine = -1;

	CompilerOptionsWrapper(CobolPreprocessorParser.CompilerOptionsContext ctx) {
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
	}

	/*
	public int getLine() {
		if (this.line < 0) {
			if (this.ctx.PROCESS() == null) {
				this.line = this.ctx.CBL().getSymbol().getLine();
			} else {
				this.line = this.ctx.PROCESS().getSymbol().getLine();
			}
		}

		return this.line;
	}
	*/

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

}
