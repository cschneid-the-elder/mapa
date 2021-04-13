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
			TestIntegration.CLI.applyReplacingPhrase(out, copyFile, this.replaceable, this.replacement);
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

	public String toString() {
		StringBuilder sb = new StringBuilder("copy @" + this.ctx.start.getLine() + ": " + this.ctx.getText());
		sb.append("\n\tstop = " + this.ctx.stop.getLine());
		sb.append("\n\tcopySource = " + this.ctx.copySource().getText());

		return sb.toString();
	}

}
