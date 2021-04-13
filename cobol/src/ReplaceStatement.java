import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class ReplaceStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	public CobolPreprocessorParser.ReplaceByStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_REPLACE;
	private int startLine = -1;
	private int endLine = -1; //end of this REPLACE statement
	private int stopLine = -1; //end of the scope of this REPLACE statement
	private ArrayList<ArrayList<TerminalNodeWrapper>> replaceable = new ArrayList<>();
	private ArrayList<ArrayList<TerminalNodeWrapper>> replacement = new ArrayList<>();
	private Boolean enabled = false;
	private ArrayList<ReplaceClause> replaceClauses = new ArrayList<>();

	ReplaceStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) {
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();

		if (this.ctx.replaceClause() == null) {
		} else {
			for (CobolPreprocessorParser.ReplaceClauseContext rcc: this.ctx.replaceClause()) {
				ReplaceClause replaceClause = new ReplaceClause(rcc);
				this.replaceClauses.add(replaceClause);
				this.replaceable.add(replaceClause.getReplaceable());
				this.replacement.add(replaceClause.getReplacement());
			}
		}

	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean isEnabled() {
		return this.enabled;
	}

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public int getStopLine() {
		return this.stopLine;
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

	/**
	This is used in CompilerDirectingStatementListener.
	*/
	public void setStopLine(int stopLine) {
		this.stopLine = stopLine;
	}

	public String toString() {
		StringBuilder sb = 
			new StringBuilder(
					myName 
					+ " replace BY startLine = " 
					+ this.startLine()
					+ " endLine = "
					+ this.endLine()
					+ " enabled = "
					+ this.enabled
					+ "\n\treplaceable = " 
					+ this.replaceable
					+ "\n\treplacement = " 
					+ this.replacement);

		return sb.toString();

	}

}
