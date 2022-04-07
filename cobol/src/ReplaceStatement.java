import java.util.*;
import java.util.logging.Logger;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

/**
Instances of this class represent a REPLACE statement.  IBM Documentation
indicates REPLACE statements are processed only after all COPY statements
have been processed to assemble the source code.  I'm going to take that
as normal behavior.

<p>ReplaceClause is used to obtain each collection of text to be replaced
and the collection of text with which to replace it.

<p>Determining scope is dependent on processing of compiler directing
statements.  It is possible that a REPLACE or REPLACE OFF statement is
disabled due to being inside conditional processing that takes place at
compile time.  Hence, the <code>enabled</code> instance variable.
*/
public class ReplaceStatement extends CopyReplaceParent implements CompilerDirectingStatement {

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
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Logger LOGGER = null;

	ReplaceStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx, Logger LOGGER) {
		this.LOGGER = LOGGER;
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();

		this.tnwList.add(new TerminalNodeWrapper(this.ctx.REPLACE()));
		this.tnwList.add(new TerminalNodeWrapper(this.ctx.DOT()));
		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE()));
		}

		if (this.ctx.replaceClause() == null) {
		} else {
			for (CobolPreprocessorParser.ReplaceClauseContext rcc: this.ctx.replaceClause()) {
				ReplaceClause replaceClause = new ReplaceClause(rcc);
				this.replaceClauses.add(replaceClause);
				this.replaceable.add(replaceClause.getReplaceable());
				this.replacement.add(replaceClause.getReplacement());
				this.tnwList.addAll(replaceClause.getTnwList());
			}
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
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

	public void setStopLine() {

		if (this.replaceOffStatement == null && this.nextReplaceStatement == null) {
			/*
			This REPLACE statement was followed by neither a REPLACE OFF
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

	private void iWasNeverHere(CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes) {
		ArrayList<TerminalNodeWrapper> toRemove = new ArrayList<>();
		for (TerminalNodeWrapper sourceNode: sourceNodes) {
			for (TerminalNodeWrapper tnw: this.tnwList) {
				if (sourceNode.textAndLocAreEqual(tnw)) {
					toRemove.add(sourceNode);
					break;
				}
			}
		}
		sourceNodes.removeAll(toRemove);
	}

	public void apply(
			CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes
			) throws IOException {
		this.LOGGER.fine(this.myName + " apply() ");
		this.LOGGER.finest(" replaceable = " + this.replaceable);
		this.LOGGER.finest(" replacement = " + this.replacement);

		this.iWasNeverHere(sourceNodes);

		super.applyReplacingPhrase(sourceNodes, this.replaceable, this.replacement, true, this.getEndLine(), this.getStopLine());

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
