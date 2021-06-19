import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

/**
Instances of this class represent the COPY compiler directing statement.

<p>Processing can be complex, the REPLACING phrase has rules best expressed
as... unique.
*/

public class CopyStatement extends CopyReplaceParent implements CompilerDirectingStatement {

	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private CobolPreprocessorParser.CopyStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_COPY;
	private ArrayList<ReplaceClause> replaceClauses = new ArrayList<>();
	private DB2zIncludeStatement includeStatement = null;
	private int startLine = -1;
	private int endLine = -1;
	private int startPosn = -1;
	private int endPosn = -1;
	private ArrayList<ArrayList<TerminalNodeWrapper>> replaceable = new ArrayList<>();
	private ArrayList<ArrayList<TerminalNodeWrapper>> replacement = new ArrayList<>();

	public CopyStatement(
			CobolPreprocessorParser.CopyStatementContext ctx 
			, Logger LOGGER
			, TheCLI CLI) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
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

		this.LOGGER.fine(myName + " " + this.getCopyFile());
		this.LOGGER.fine(myName + " this.ctx.start.getLine() = " + this.ctx.start.getLine());
		this.LOGGER.fine(myName + " this.ctx.COPY().getSymbol().getLine() = " + this.ctx.COPY().getSymbol().getLine());
		this.LOGGER.fine(myName + " this.ctx.stop.getLine() = " + this.ctx.stop.getLine());
		this.LOGGER.fine(myName + " this.ctx.DOT().getSymbol().getLine() = " + this.ctx.DOT().getSymbol().getLine());
		this.LOGGER.fine(myName + " this.ctx.start.getCharPositionInLine() = " + this.ctx.start.getCharPositionInLine());
		this.LOGGER.fine(myName + " this.ctx.COPY().getSymbol().getCharPositionInLine() = " + this.ctx.COPY().getSymbol().getCharPositionInLine());
		this.LOGGER.fine(myName + " this.ctx.stop.getCharPositionInLine() = " + this.ctx.stop.getCharPositionInLine());
		this.LOGGER.fine(myName + " this.ctx.DOT().getSymbol().getCharPositionInLine() = " + this.ctx.DOT().getSymbol().getCharPositionInLine());
		this.LOGGER.fine(myName + " this.replaceable = " + this.replaceable);
		this.LOGGER.fine(myName + " this.replacement = " + this.replacement);
	}

	public CopyStatement(
			DB2zIncludeStatement includeStatement
			, CobolPreprocessorParser.ExecSqlStatementContext ctx 
			, Logger LOGGER
			, TheCLI CLI) {
		this.includeStatement = includeStatement;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.startLine = ctx.start.getLine();
		this.endLine = ctx.stop.getLine();
		TerminalNode end = null;
		if (ctx.DOT() == null) {
			end = ctx.END_EXEC();
		} else {
			end = ctx.DOT();
		}

		this.startPosn = ctx.start.getCharPositionInLine();
		this.endPosn = end.getSymbol().getCharPositionInLine() + end.getText().length();

		this.LOGGER.fine(myName + " " + this.getCopyFile());
		this.LOGGER.fine(myName + " instantiated from SQL INCLUDE");
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
		if (this.ctx == null) {
			return this.getLine();
		} else {
			return this.ctx.COPY().getSymbol().getLine();
		}
	}

	public int endLine() {
		if (this.ctx == null) {
			return this.getEndLine();
		} else {
			return this.ctx.DOT().getSymbol().getLine();
		}
	}

	public int startPositionInLine() {
		if (this.ctx == null) {
			return this.startPosn;
		} else {
			return this.ctx.COPY().getSymbol().getCharPositionInLine();
		}
	}

	public int endPositionInLine() {
		if (this.ctx == null) {
			return this.endPosn;
		} else {
			return this.ctx.DOT().getSymbol().getCharPositionInLine();
		}
		
	}

	public String getText() {
		if (this.ctx == null) {
			return "SQL INCLUDE " + this.includeStatement.getMemberName();
		} else {
			return this.ctx.getText();
		}
	}

	public UUID getUUID() {
		return this.uuid;
	}

	/**
	Reposition the LineNumberReader after this COPY statement, keeping in
	mind that the COPY statement can occur on a line with other code.  Apply 
	this COPY statement to the PrintWriter.

	<p>The code being copied is itself COBOL code, so must be processed much
	like the original source code in which this COPY statement was found.
	*/

	public void apply(
			LineNumberReader src
			, PrintWriter out
			, String currLine
			) throws IOException {
		this.LOGGER.fine(this.myName + " apply() " + this.getCopyFile());
		this.LOGGER.finest(" replaceable = " + replaceable);
		this.LOGGER.finest(" replacement = " + replacement);

		String lastLine = null;
		int lastLineNb = src.getLineNumber() + (this.endLine - this.startLine);
		this.LOGGER.fine("current line = " + src.getLineNumber() + " lastLine = " + lastLineNb);
		while (src.getLineNumber() < lastLineNb) lastLine = src.readLine();

		/*
		The COPY statement need not be alone on the source line, e.g.

		DISPLAY 'Julia'. COPY 'copybook'. DISPLAY 'Wicker'.

		Thus we must write the source line up to the COPY statement and later
		write the rest of the source line following the COPY statement.
		*/
		int startPosn = this.startPositionInLine() - 1;
		this.LOGGER.fine("startPosn = " + startPosn);
		out.println(currLine.substring(0, startPosn));

		String copyFile = null;
		String testCopyFile = this.getCopyFileFull();

		if (testCopyFile == null) {
			if (!this.getCopyFile().equals("SQLCA")) {
				this.LOGGER.info(this.getCopyFile() + " not found");
			}
		} else {
			try {
				copyFile = CobolSource.copyWithout73to80(
						this.getCopyFileFull()
						, TestIntegration.baseDir
						, this.getCopyFile()
						);
			} catch (Exception e) {
				e.printStackTrace();
				return;
			}
			try {
				copyFile = this.CLI.copyCompressingContinuations(
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
		}

		/*
		Writing the rest of the source line following the COPY statement.
		*/
		int endPosn = this.endPositionInLine() + 1;
		this.LOGGER.fine("endPosn = " + endPosn);
		String outLine = new String();
		if (this.getLine() == this.getEndLine()) {
			if (endPosn < currLine.length()) {
				outLine = this.CLI.padLeft(currLine.substring(endPosn), currLine.length());
			}
		} else {
			if (endPosn < lastLine.length()) {
				outLine = this.CLI.padLeft(lastLine.substring(endPosn), lastLine.length());
			}
		}
		this.LOGGER.fine("outLine = |" + outLine + "|");
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

		if (this.ctx == null) {
			copyFile = this.includeStatement.getMemberName();
		} else if (this.ctx.copySource().literal() != null) {
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

		for (String path: this.CLI.copyPaths) {
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
		this.LOGGER.fine(this.myName + " applyReplacingPhrase() ");
		this.LOGGER.finest(" replaceable = " + replaceable);
		this.LOGGER.finest(" replacement = " + replacement);

		ArrayList<TerminalNodeWrapper> copyFileNodes1 = this.CLI.lookForTerminalNodes(copyFile);
		CopyOnWriteArrayList<TerminalNodeWrapper> copyFileNodes = new CopyOnWriteArrayList<>(copyFileNodes1);

		super.applyReplacingPhrase(copyFileNodes, replaceable, replacement, false, this.getEndLine(), Integer.MAX_VALUE);

		StringBuilder outLine = CopyReplaceParent.createStringBuilderFromTerminalNodeWrappers(copyFileNodes);

		out.println(outLine);
	}

	public void writeOn(PrintWriter out, UUID parentUUID) {
		if (this.ctx == null) {
			out.printf(
				"SQLINCLUDE,%s,%s,%s\n"
				, this.getUUID().toString()
				, parentUUID.toString()
				, this.getCopyFile());
		} else {
			out.printf(
				"COPY,%s,%s,%s\n"
				, this.getUUID().toString()
				, parentUUID.toString()
				, this.getCopyFile());
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("copy @" + this.startLine() + ": " + this.getText());
		sb.append("\n\tstop = " + this.endLine());
		sb.append("\n\tcopySource = " + this.getText());

		return sb.toString();
	}

}
