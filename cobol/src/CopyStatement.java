import java.util.*;
import java.io.*;
import java.nio.file.*;
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
		//this.startLine = this.ctx.COPY().getSymbol().getLine();
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
			copyFile = TestIntegration.CLI.copyCompressingContinuations(
					this.getCopyFileFull()
					, TestIntegration.baseDir
					, this.getCopyFile()
					);
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		if (this.replaceable.size() == 0) {
			List<String> list = 
				Files.readAllLines(Paths.get(this.getCopyFileFull()));
			for (String line: list) out.println(line);			
		} else {
			TestIntegration.CLI.applyReplacingPhrase(out, copyFile, this.replaceable, this.replacement);
		}

		/*
		String inLine = currLine;
		Boolean pleaseWrite = true;
		while (inLine != null) {
			pleaseWrite = true;
			if (src.getLineNumber() < this.getLine() || src.getLineNumber() > this.getEndLine()) {
					// outside of this COPY statement
					TestIntegration.LOGGER.finer("outside this COPY statement");
					return;
					//if (pleaseWrite) {
					//	TestIntegration.LOGGER.finer("out = |" + inLine + "|");
					//	out.println(inLine);
					//	pleaseWrite = false;
					//}
				} else if (src.getLineNumber() > this.getLine() && src.getLineNumber() < this.getEndLine()) {
					// inside of a multi-line COPY statement - we just discard these
					TestIntegration.LOGGER.finer("inside multi-line COPY statement");
					TestIntegration.LOGGER.finer("discarding " + inLine);
					pleaseWrite = false;
				} else if (src.getLineNumber() == this.getLine() && this.getLine() == this.getEndLine()) {
					// single line COPY statement
					TestIntegration.LOGGER.finer("single-line COPY statement");
					TestIntegration.LOGGER.finer("startPosn = " + this.startPosn);
					TestIntegration.LOGGER.finer("endPosn   = " + this.endPosn);
					String aLine = inLine.substring(0, this.startPosn - 1);
					for (int i = this.startPosn; i <= this.endPosn + 1; i++) aLine = aLine.concat(" "); 
					if (inLine.length() > this.endPosn) {
						aLine = aLine.concat(inLine.substring(this.endPosn + 1));
					}
					TestIntegration.LOGGER.finer("in  = |" + inLine + "|");
					TestIntegration.LOGGER.finer("out = |" + aLine + "|");
					out.println(aLine);
					pleaseWrite = false;
					writeTheCopyContent(out);
					return;
				} else if (src.getLineNumber() == this.getLine() && this.getLine() < this.getEndLine()) {
					// first line of a multi-line COPY statement
					TestIntegration.LOGGER.finer("first line of a multi-line COPY statement");
					int endPosn = 71;
					if (inLine.length() <= endPosn) endPosn = inLine.length() - 1;
					String aLine = inLine.substring(0, this.startPosn - 1);
					for (int i = this.startPosn; i <= endPosn + 1; i++) {
						aLine = aLine.concat(" ");
						TestIntegration.LOGGER.finer("i = " + i);
						TestIntegration.LOGGER.finer("aLine = |" + aLine + "|");
					} 
					aLine = aLine.concat(inLine.substring(endPosn + 1));
					TestIntegration.LOGGER.finer("startPosn = " + this.startPosn);
					TestIntegration.LOGGER.finer("endPosn   = " + endPosn);
					TestIntegration.LOGGER.finer("in  = |" + inLine + "|");
					TestIntegration.LOGGER.finer("out = |" + aLine + "|");
					out.println(aLine);
					pleaseWrite = false;
					writeTheCopyContent(out);
				} else if (src.getLineNumber() == this.getEndLine()) {
					// last line of a multi-line COPY statement
					TestIntegration.LOGGER.finer("last line of a multi-line COPY statement");
					int startPosn = 7;
					String aLine = inLine.substring(0, startPosn - 1);
					for (int i = startPosn; i <= this.endPosn + 1; i++) {
						aLine = aLine.concat(" ");
						TestIntegration.LOGGER.finer("i = " + i);
						TestIntegration.LOGGER.finer("aLine = |" + aLine + "|");
					} 
					aLine = aLine.concat(inLine.substring(this.endPosn + 1));
					TestIntegration.LOGGER.finer("startPosn = " + startPosn);
					TestIntegration.LOGGER.finer("endPosn   = " + this.endPosn);
					TestIntegration.LOGGER.finer("in  = |" + inLine + "|");
					TestIntegration.LOGGER.finer("out = |" + aLine + "|");
					out.println(aLine);
					pleaseWrite = false;
					return;
				}
			if (pleaseWrite) {
				TestIntegration.LOGGER.finer("out = |" + inLine + "|");
				out.println(inLine);
			}
			inLine = src.readLine();
		}
		*/

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

	/*
	public void writeTheCopyContent(
							PrintWriter out)
						throws IOException {

		TestIntegration.LOGGER.fine("writeTheCopyContent");
		String copyFileFull = this.getCopyFileFull();

		if (copyFileFull == null) {
			TestIntegration.LOGGER.warning(this.getCopyFile() + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
		} else if (this.ctx.replacingPhrase() == null) {
			List<String> list = 
				Files.readAllLines(Paths.get(copyFileFull));
			for (String line: list) out.println(line);
		} else {
			this.writeTheCopyContentWithReplacing(out, copyFileFull);
		}
	}
	*/

	private void writeTheCopyContentWithReplacing(PrintWriter out, String copyFileFull) {
		ArrayList<TerminalNodeWrapper> tNodes = new ArrayList<>();

		try {
			tNodes = this.parseCopybook(copyFileFull);
		} catch (Exception e) {
			TestIntegration.LOGGER.severe("Exception " + e + " encountered parsing " + copyFileFull);
			e.printStackTrace();
			return;
		}
		
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

	/*
	public String applyReplacingPhrases(String line) {
		String newLine = new String(line);

		for (int i = 0; i < this.replaceable.size(); i++) {
			newLine = newLineWithReplacingApplied(this.replaceable.get(i), this.replacement.get(i), newLine);
		}

		return newLine;
	}
	*/

	public ArrayList<TerminalNodeWrapper> parseCopybook(
				String fileName
				) throws IOException {
		TestIntegration.LOGGER.fine(this.myName + " parseCopybook()");
		ArrayList<TerminalNodeWrapper> tNodes = new ArrayList<>();

		CharStream cs = fromFileName(fileName);  //load the file

		TestIntegration.LOGGER.finer(this.myName + " lexing " + fileName);

		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens

		TestIntegration.LOGGER.finer(this.myName + " parsing with CobolPreprocessorParser");

		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree
		ParseTreeWalker walker = new ParseTreeWalker();

		CobolPreprocessorParserTerminalNodeListener listener = new CobolPreprocessorParserTerminalNodeListener(tNodes);

		TestIntegration.LOGGER.finer(this.myName + " walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		return tNodes;
	}

	/*
	public ArrayList<TerminalNodeWrapper> getReplacement(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		TestIntegration.LOGGER.finest(this.myName + " getReplacement()");
		ArrayList<TerminalNode> replacement = new ArrayList<>();

		if (rcc.replacement().pseudoText() == null) {
			TestIntegration.LOGGER.finest(this.myName + " rcc.replacement().pseudoText() == null");
			if (rcc.replacement().replaceText() == null) {
				TestIntegration.LOGGER.finest(this.myName + " rcc.replacement().replaceText() == null");
				TestIntegration.LOGGER.warning("replacing phrase found with no replacement content replacement().literal().NUMERICLITERAL() == null");
			} else {
				TestIntegration.LOGGER.finest(this.myName + " rcc.replacement().replaceText().REPLACE_TEXT() = " + rcc.replacement().replaceText().REPLACE_TEXT());
				replacement.addAll(TerminalNodeWrapper.bunchOfThese(rcc.replacement().replaceText().REPLACE_TEXT()));
			}
		} else {
			TestIntegration.LOGGER.finest(this.myName + " rcc.replacement().pseudoText().PSEUDOTEXTIDENTIFIER() = " + rcc.replacement().pseudoText().PSEUDOTEXTIDENTIFIER());
			replacement.addAll(TerminalNodeWrapper.bunchOfThese(rcc.replacement().pseudoText().PSEUDOTEXTIDENTIFIER()));
		}

		return replacement;
	}

	public ArrayList<TerminalNodeWrapper> getReplaceable(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		TestIntegration.LOGGER.finest(this.myName + " getReplaceable()");
		ArrayList<TerminalNode> replaceable = new ArrayList<>();

		if (rcc.replaceable().pseudoText() == null) {
			TestIntegration.LOGGER.finest(this.myName + " rcc.replaceable().pseudoText() == null");
			if (rcc.replaceable().replaceText() == null) {
				TestIntegration.LOGGER.finest(this.myName + " rcc.replaceable().replaceText() == null");
				TestIntegration.LOGGER.warning("replacing phrase found with no replaceable content replaceable().literal().NUMERICLITERAL() == null");
			} else {
				TestIntegration.LOGGER.finest(this.myName + " rcc.replaceable().replaceText().REPLACE_TEXT() = " + rcc.replaceable().replaceText().REPLACE_TEXT());
				replaceable.addAll(TerminalNodeWrapper.bunchOfThese(rcc.replaceable().replaceText().REPLACE_TEXT()));
			}
		} else {
			TestIntegration.LOGGER.finest(this.myName + " rcc.replaceable().pseudoText().PSEUDOTEXTIDENTIFIER() = " + rcc.replaceable().pseudoText().PSEUDOTEXTIDENTIFIER());
			replaceable.addAll(TerminalNodeWrapper.bunchOfThese(rcc.replaceable().pseudoText().PSEUDOTEXTIDENTIFIER()));
		}

		return replaceable;
	}
	*/

	/*
	public String newLineWithReplacingApplied(String replaceable
							, String replacement
							, String aLine) {

		TestIntegration.LOGGER.finer(
			this.myName
			+ " newLineWithReplacingApplied(|"
			+ replaceable
			+ "|, |"
			+ replacement
			+ "|, |"
			+ aLine
			+ "|");
		String newLine = new String(aLine);

		if (replaceable != null && replacement != null) {
			if (newLine.length() < 80) newLine = String.format("%-80s", newLine);
			if (replaceable.length() == replacement.length()) {
				newLine = newLine.replace(replaceable, replacement);
			} else if (replaceable.length() > replacement.length()) {
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				frontBits = String.format("%-72s", frontBits);
				newLine = frontBits.concat(endLine);
			} else if (replaceable.length() < replacement.length()) {
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				if (frontBits.substring(71,72).equals(" ")) {
					frontBits = frontBits.substring(0,72);
				} else {
					TestIntegration.LOGGER.warning("REPLACING phrase for " + this.getCopyFile() + " cannot be honored");
					TestIntegration.LOGGER.warning("replaceable = " + replaceable);
					TestIntegration.LOGGER.warning("replacement = " + replacement);
				}
				newLine = frontBits.concat(endLine);
			}
		}

		return newLine;
	}
	*/

	public String toString() {
		StringBuilder sb = new StringBuilder("copy @" + this.ctx.start.getLine() + ": " + this.ctx.getText());
		sb.append("\n\tstop = " + this.ctx.stop.getLine());
		sb.append("\n\tcopySource = " + this.ctx.copySource().getText());

		return sb.toString();
	}

}
