import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.CopyOnWriteArrayList;
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
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();

	ReplaceStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) {
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
		TestIntegration.LOGGER.fine(this.myName + " apply() ");
		TestIntegration.LOGGER.finest(" replaceable = " + this.replaceable);
		TestIntegration.LOGGER.finest(" replacement = " + this.replacement);

		this.iWasNeverHere(sourceNodes);

		int matchedIndex = 0;

		for (ArrayList<TerminalNodeWrapper> matchList: this.replaceable) {
			TestIntegration.LOGGER.finest(" matchList = " + matchList);
			matchedIndex = replaceable.indexOf(matchList);
			int from = 0;
			int to = -1;
			for (TerminalNodeWrapper sourceNode: sourceNodes) {
				if (sourceNode.getLine() > this.getEndLine()) break;
				from++;
			}
			matchLoop:
			while (from < sourceNodes.size() && sourceNodes.get(from).getLine() < this.getStopLine()) {
				TestIntegration.LOGGER.finest(" while (" + from + " < " + sourceNodes.size() + " && " + sourceNodes.get(from).getLine() + " < " + this.getStopLine() + ")");
				Boolean matched = false;
				ArrayList<TerminalNodeWrapper> subList = null;
				if (sourceNodes.size() - from >= matchList.size()) {
					TestIntegration.LOGGER.finest(" sourceNodes.size() |" + sourceNodes.size() + "| - from |" + from + "| >= matchList.size() |" + matchList.size() + "|");
					to = from + matchList.size();
					int i = 0;
					subList = this.subListTerminalNodeWrapper(sourceNodes, from, matchList.size());
					TestIntegration.LOGGER.finest(" subList = " + subList);
					if (subList.size() == matchList.size()) {
						TestIntegration.LOGGER.finest(" subList.size() |" + subList.size() + "| == matchList.size() |" + matchList.size() + "|");
						matched = true;
						for (TerminalNodeWrapper copyFileNode: subList) {
							TestIntegration.LOGGER.finest(" copyFileNode = |" + copyFileNode + "|");
							if (!matchList.get(i).textIsEqual(copyFileNode)) {
								TestIntegration.LOGGER.finest(" !matchList.get(" + i + ").textIsEqual(copyFileNode) i.e. |" + matchList.get(i) + "| != |" + copyFileNode + "|");
								matched = false;
								break;
							}
							i++;
						}
					} else {
						TestIntegration.LOGGER.finest(" subList.size() |" + subList.size() + "| != matchList.size() |" + matchList.size() + "|");
						matched = false;
					}
				}
				TestIntegration.LOGGER.finest(" matched = " + matched);
				if (matched) {
					if (matchList.get(0).isDelimited()) {
						subList.get(0).alterText(matchList.get(0), this.replacement.get(matchedIndex).get(0));
					} else {
						sourceNodes.removeAll(subList);
						TestIntegration.LOGGER.finest(" sourceNodes after removeAll = " + sourceNodes);
						sourceNodes.addAll(from, this.cloneTerminalNodeWrapperList(replacement.get(matchedIndex), subList));
						TestIntegration.LOGGER.finest(" sourceNodes after addAll    = " + sourceNodes);
					}
					from = from + this.replacement.get(matchedIndex).size();
				} else {
					from++;
				}
			}
		}

	}

	private ArrayList<TerminalNodeWrapper> subListTerminalNodeWrapper(
			CopyOnWriteArrayList<TerminalNodeWrapper> tnwList
			, int from
			, int size
			) {
		ArrayList<TerminalNodeWrapper> newList = new ArrayList<>();
		int i = from;
		int j = 0;

		while (i < tnwList.size() && j < size) {
			if (!tnwList.get(i).isNewline()) {
				newList.add(tnwList.get(i));
				j++;
			}
			i++;
		}

		return newList;
	} 

	private ArrayList<TerminalNodeWrapper> cloneTerminalNodeWrapperList(
				ArrayList<TerminalNodeWrapper> source
				, ArrayList<TerminalNodeWrapper> fudge) {
		ArrayList<TerminalNodeWrapper> newList = new ArrayList<>();
		int i = 0;
		long clonedLine = -1;
		long clonedPosn = -1;
		TerminalNodeWrapper prevTNW = null;

		for (TerminalNodeWrapper tnw: source) {
			Boolean precededByNewline = false;
			Boolean precededByWhitespace = false;
			if (i < fudge.size()) {
				clonedLine = fudge.get(i).getLine();
				clonedPosn = fudge.get(i).getPosn();
				precededByNewline = fudge.get(i).isPrecededByNewline();
			} else {
				clonedPosn = clonedPosn + tnw.getTextLength();
			}
			if (i == 0) {
				precededByWhitespace = fudge.get(i).isPrecededByWhitespace();
			} else {
				precededByWhitespace = tnw.isPrecededByWhitespace();
			}
			TerminalNodeWrapper newNode = 
				new TerminalNodeWrapper(
					tnw
					, clonedLine
					, clonedPosn
					, precededByNewline
					, precededByWhitespace);
			newList.add(newNode);
			i++;
			prevTNW = tnw;
		}

		return newList;
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
