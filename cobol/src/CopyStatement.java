import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class CopyStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CopyStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_COPY;
	private ArrayList<ReplaceClause> replaceClauses = new ArrayList<>();
	private int startLine = -1;
	private int endLine = -1;
	private int startPosn = -1;
	private int endPosn = -1;
	private ArrayList<ArrayList<TerminalNodeWrapper>> replaceable = new ArrayList<>();
	private ArrayList<ArrayList<TerminalNodeWrapper>> replacement = new ArrayList<>();

	public CopyStatement(CobolPreprocessorParser.CopyStatementContext ctx) {
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
		this.startPosn = this.ctx.start.getCharPositionInLine();
		this.endPosn = this.ctx.stop.getCharPositionInLine();

		if (this.ctx.replacingPhrase() == null) {
		} else {
			for (CobolPreprocessorParser.ReplacingPhraseContext rpc: this.ctx.replacingPhrase()) {
				for (CobolPreprocessorParser.ReplaceClauseContext rcc: rpc.replaceClause()) {
					ReplaceClause replaceClause = new ReplaceClause(rcc);
					this.replaceClauses.add(replaceClause);
					this.replaceable.add(replaceClause.getReplaceable());
					this.replacement.add(replaceClause.getReplacement());
				}
			}
		}

		TestIntegration.LOGGER.fine(myName + " " + this.getCopyFile());
		TestIntegration.LOGGER.fine(myName + " this.ctx.start.getLine() = " + this.ctx.start.getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.COPY().getSymbol().getLine() = " + this.ctx.COPY().getSymbol().getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.stop.getLine() = " + this.ctx.stop.getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.DOT().getSymbol().getLine() = " + this.ctx.DOT().getSymbol().getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.start.getCharPositionInLine() = " + this.ctx.start.getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.COPY().getSymbol().getCharPositionInLine() = " + this.ctx.COPY().getSymbol().getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.stop.getCharPositionInLine() = " + this.ctx.stop.getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.DOT().getSymbol().getCharPositionInLine() = " + this.ctx.DOT().getSymbol().getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.replaceable = " + this.replaceable);
		TestIntegration.LOGGER.fine(myName + " this.replacement = " + this.replacement);
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

	public int startLine() {
		return this.ctx.COPY().getSymbol().getLine();
	}

	public int endLine() {
		return this.ctx.DOT().getSymbol().getLine();
	}

	public int startPositionInLine() {
		return this.ctx.COPY().getSymbol().getCharPositionInLine();
	}

	public int endPositionInLine() {
		return this.ctx.DOT().getSymbol().getCharPositionInLine();
	}

	public String getText() {
		return this.ctx.getText();
	}

	public void apply(
			LineNumberReader src
			, PrintWriter out
			, String currLine
			) throws IOException {
		TestIntegration.LOGGER.fine(this.myName + " apply() " + this.getCopyFile());
		TestIntegration.LOGGER.finest(" replaceable = " + replaceable);
		TestIntegration.LOGGER.finest(" replacement = " + replacement);

		String lastLine = null;
		int lastLineNb = src.getLineNumber() + (this.endLine - this.startLine);
		TestIntegration.LOGGER.fine("current line = " + src.getLineNumber() + " lastLine = " + lastLineNb);
		while (src.getLineNumber() < lastLineNb) lastLine = src.readLine();

		/*
		The COPY statement need not be alone on the source line, e.g.

		DISPLAY 'Julia'. COPY 'copybook'. DISPLAY 'Wicker'.

		Thus we must write the source line up to the COPY statement and later
		write the rest of the source line following the COPY statement.
		*/
		int startPosn = this.startPositionInLine() - 1;
		TestIntegration.LOGGER.fine("startPosn = " + startPosn);
		out.println(currLine.substring(0, startPosn));

		String copyFile = null;

		try {
			copyFile = TestIntegration.copyWithout73to80(
					this.getCopyFileFull()
					, TestIntegration.baseDir
					, this.getCopyFile()
					);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		try {
			copyFile = TestIntegration.CLI.copyCompressingContinuations(
					copyFile
					, TestIntegration.baseDir
					, this.getCopyFile()
					);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		if (this.replaceable.size() == 0) {
			List<String> list = 
				Files.readAllLines(Paths.get(copyFile));
			for (String line: list) out.println(line);			
		} else {
			this.applyReplacingPhrase(out, copyFile, this.replaceable, this.replacement);
		}


		/*
		Writing the rest of the source line following the COPY statement.
		*/
		int endPosn = this.endPositionInLine() + 1;
		TestIntegration.LOGGER.fine("endPosn = " + endPosn);
		String outLine = null;
		if (this.getLine() == this.getEndLine()) {
			outLine = TestIntegration.CLI.padLeft(currLine.substring(endPosn), currLine.length());
		} else {
			outLine = TestIntegration.CLI.padLeft(lastLine.substring(endPosn), lastLine.length());
		}
		TestIntegration.LOGGER.fine("outLine = |" + outLine + "|");
		out.println(outLine);
	}

	public String getCopyFile() {
		String copyFile = this.getCopyFileRaw();

		if (copyFile.indexOf("'") != -1) {
			copyFile = 
				copyFile.substring(copyFile.indexOf("'") + 1, copyFile.lastIndexOf("'"));
		}

		return copyFile;
	}

	private String getCopyFileRaw() {
		String copyFile = null;

		if (this.ctx.copySource().literal() != null) {
			copyFile = this.ctx.copySource().literal().getText();
		} else if (this.ctx.copySource().cobolWord() != null) {
			copyFile = this.ctx.copySource().cobolWord().getText();
		} else if (this.ctx.copySource().filename() != null) {
			copyFile = this.ctx.copySource().filename().getText();
		}

		return copyFile;
	}

	private String getCopyFileFull() {
		String copyFileFull = null;
		String copyFile = this.getCopyFile();

		for (String path: TestIntegration.CLI.copyPaths) {
			File aFile = new File(path + "/" + copyFile);
			if (aFile.exists()) {
				copyFileFull = path + "/" + copyFile;
				break;
			}
		}

		return copyFileFull;
	}

	public void applyReplacingPhrase(
			PrintWriter out
			, String copyFile
			, ArrayList<ArrayList<TerminalNodeWrapper>> replaceable
			, ArrayList<ArrayList<TerminalNodeWrapper>> replacement
			) throws IOException {
		TestIntegration.LOGGER.fine(this.myName + " applyReplacingPhrase() ");
		TestIntegration.LOGGER.finest(" replaceable = " + replaceable);
		TestIntegration.LOGGER.finest(" replacement = " + replacement);

		StringBuilder outLine = new StringBuilder();
		ArrayList<TerminalNodeWrapper> copyFileNodes1 = TestIntegration.CLI.lookForTerminalNodes(copyFile);
		CopyOnWriteArrayList<TerminalNodeWrapper> copyFileNodes = new CopyOnWriteArrayList<>(copyFileNodes1);
		int matchedIndex = 0;

		for (ArrayList<TerminalNodeWrapper> matchList: replaceable) {
			TestIntegration.LOGGER.finest(" matchList = " + matchList);
			matchedIndex = replaceable.indexOf(matchList);
			int from = 0;
			int to = -1;
			matchLoop:
			while (from < copyFileNodes.size()) {
				TestIntegration.LOGGER.finest(" while (" + from + " < " + copyFileNodes.size() + ")");
				Boolean matched = false;
				ArrayList<TerminalNodeWrapper> subList = null;
				if (copyFileNodes.size() - from >= matchList.size()) {
					TestIntegration.LOGGER.finest(" copyFileNodes.size() |" + copyFileNodes.size() + "| - from |" + from + "| >= matchList.size() |" + matchList.size() + "|");
					to = from + matchList.size();
					int i = 0;
					subList = this.subListTerminalNodeWrapper(copyFileNodes, from, matchList.size());
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
						subList.get(0).alterText(matchList.get(0), replacement.get(matchedIndex).get(0));
					} else {
						copyFileNodes.removeAll(subList);
						TestIntegration.LOGGER.finest(" copyFileNodes after removeAll = " + copyFileNodes);
						copyFileNodes.addAll(from, this.cloneTerminalNodeWrapperList(replacement.get(matchedIndex), subList));
						TestIntegration.LOGGER.finest(" copyFileNodes after addAll    = " + copyFileNodes);
					}
					from = from + replacement.get(matchedIndex).size();
				} else {
					from++;
				}
			}
		}

	/**
	This is, in conjunction with subListTerminalNodeWrapper()
	and cloneTerminalNodeWrapperList(), an attempt to account
	for the replacement of subList by replacement.get(matchedIndex)
	the latter of which need not have the same number of elements
	and almost certainly has different posn, line, and text.
	*/
		long prevLine = -1;
		int prevTextLength = -1;
		long prevPosn = -1;
		TerminalNodeWrapper prevToken = null;

		for (TerminalNodeWrapper token: copyFileNodes) {
			TestIntegration.LOGGER.finest(" token = " + token);
			long clonedPosn = token.getClonedPosn();
			if (token.isPrecededByNewline() || token.isFirst()) {
				TestIntegration.LOGGER.finest(" token.isPrecededByNewline() == true || token.isFirst() == true");
				outLine.append('\n');
				if (token.getClonedPosn() == -1) {
					outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
				} else {
					outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + token.getClonedPosn()));
				}
			} else if (token.getClonedLine() == prevLine) {
				TestIntegration.LOGGER.finest(" token.getClonedLine() == prevLine ws = " + token.isPrecededByWhitespace());
				if (token.isPrecededByWhitespace()) {
					outLine.append(" ");
					long extraPadding = 0;
					if (token.getClonedPosn() == -1) {
						extraPadding = token.getPosn() - (prevPosn + prevTextLength);
					} else {
						extraPadding = token.getClonedPosn() - (prevPosn + prevTextLength);
					}
					outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + extraPadding));
				} else {
					outLine.append(token.getText());
				}
			} else if (token.getClonedLine() == -1) {
				TestIntegration.LOGGER.finest(" token.getClonedLine() == -1");
				if (prevToken != null && prevToken.getClonedLine() != -1) {
					if (token.isPrecededByWhitespace()) {
						outLine.append(" ");
					}
				}
				long extraPadding = token.getPosn() - (prevPosn + prevTextLength);
				outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + extraPadding));
			} else {
				TestIntegration.LOGGER.finest(" else");
				outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
			}
			if (token.getClonedLine() == -1) {
				prevLine = token.getLine();
				prevPosn = token.getPosn();
			} else {
				prevLine = token.getClonedLine();
				prevPosn = token.getClonedPosn();
			}
			prevTextLength = token.getTextLength();
			prevToken = token;
		}
		out.println(outLine);
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
		StringBuilder sb = new StringBuilder("copy @" + this.ctx.start.getLine() + ": " + this.ctx.getText());
		sb.append("\n\tstop = " + this.ctx.stop.getLine());
		sb.append("\n\tcopySource = " + this.ctx.copySource().getText());

		return sb.toString();
	}

}
