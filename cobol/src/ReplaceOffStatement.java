import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReplaceOffStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	public CobolPreprocessorParser.ReplaceOffStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_REPLACE_OFF;
	//private int line = -1;
	private int startLine = -1;
	private int endLine = -1;

	ReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx) {
		this.ctx = ctx;
		//this.line = this.ctx.REPLACE().getSymbol().getLine();
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
	}

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	int startLine() {
		return this.ctx.start.getLine();
	}

	int endLine() {
		return this.ctx.stop.getLine();
	}

	public String toString() {
		StringBuilder sb = 
			new StringBuilder(
					myName 
					+ " replace OFF @" 
					+ this.startLine() 
					+ ": " 
					+ this.ctx.getText());

		return sb.toString();

	}

}
