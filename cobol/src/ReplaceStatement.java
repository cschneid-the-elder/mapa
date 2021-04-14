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
	private ReplaceOffStatement replaceOffStatement = null;
	private ReplaceStatement nextReplaceStatement = null;

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

	public void setReplaceOffStatement(ReplaceOffStatement replaceOffStatement) {
		this.replaceOffStatement = replaceOffStatement;
	}

	public void setNextReplaceStatement(ReplaceStatement nextReplaceStatement) {
		this.nextReplaceStatement = nextReplaceStatement;
	}

	public ReplaceStatement getNextReplaceStatement() {
		return this.nextReplaceStatement;
	}

	public ReplaceOffStatement getReplaceOffStatement() {
		return this.replaceOffStatement;
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

	private void setStopLine() {

		if (this.replaceOffStatement == null && this.nextReplaceStatement == null) {
			/*
			This REPLACE statement was not followed by neither a REPLACE OFF
			statement nor another REPLACE statement.
			*/
			this.stopLine = Integer.MAX_VALUE;
		} else if (this.replaceOffStatement == null && this.nextReplaceStatement.isEnabled()) {
			/*
			This REPLACE statement was followed by another REPLACE statement.
			*/
			this.stopLine = this.nextReplaceStatement.getLine();
		} else if (this.nextReplaceStatement == null && this.replaceOffStatement.isEnabled()) {
			/*
			This REPLACE statement was followed by a REPLACE OFF statement.
			*/
			this.stopLine = this.replaceOffStatement.getLine();
		} else if (this.replaceOffStatement.isEnabled() && this.nextReplaceStatement.isEnabled()) {
			/*
			This REPLACE statement was followed by both a REPLACE OFF
			statement and another REPLACE statement.  Whichever comes first
			determines the scope of this statement.
			*/
			if (this.replaceOffStatement.getLine() > this.nextReplaceStatement.getLine()) {
				this.stopLine = this.nextReplaceStatement.getLine();
			} else {
				this.stopLine = this.replaceOffStatement.getLine();
			}
		} else if (this.replaceOffStatement.isEnabled()) {
			/*
			This REPLACE statement was followed by both a REPLACE OFF
			statement and another REPLACE statement, but the REPLACE statement
			is disabled.
			*/
			this.stopLine = this.replaceOffStatement.getLine();
		} else if (this.nextReplaceStatement.isEnabled()) {
			/*
			This REPLACE statement was followed by both a REPLACE OFF
			statement and another REPLACE statement, but the REPLACE OFF statement
			is disabled.
			*/
			this.stopLine = this.nextReplaceStatement.getLine();
		} else {
			/*
			This REPLACE statement was followed by both a REPLACE OFF
			statement and another REPLACE statement, but both are
			disabled.  Follow the chain of nextReplaceStatements until
			it either ends or an enabled one is found.
			*/
			ReplaceStatement rs = this.nextReplaceStatement;
			while (rs != null && !rs.isEnabled()) {
				rs = rs.getNextReplaceStatement();
			}
			if (rs == null) {
				this.stopLine = Integer.MAX_VALUE;
			} else {
				this.stopLine = rs.getLine();
			}
		}

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
