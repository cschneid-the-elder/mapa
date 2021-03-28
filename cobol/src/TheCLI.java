import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.cli.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class TheCLI{
	public String[] args = null;
	private String myName = this.getClass().getName();
	public Options options = new Options();
	public CommandLineParser parser = new DefaultParser();
	public CommandLine line = null;
	public HelpFormatter formatter = new HelpFormatter();
	public ArrayList<String> fileNamesToProcess = new ArrayList<>();
	public ArrayList<String> copyPaths = new ArrayList<>();
	public String outFileName = null;
	public Boolean unitTest = false;
	public Boolean saveTemp = false;
	public ArrayList<CondCompVar> compOptDefines = new ArrayList<>();

	public TheCLI(String[] args) throws Exception {

		this.args = args;

		Option file = new Option("file", true
			, "name of a single file to process, takes precedence over the fileList option");
		Option fileList = new Option("fileList", true
			, "name of a file containing a list of files to process");
		Option copy = new Option("copy", true
			, "name of a single path in which to locate copybooks, takes precedence over the copyList option");
		Option copyList = new Option("copyList", true
			, "name of a file containing a list of paths in which to locate copybooks");
		Option defList = new Option("defList", true
			, "name of a file containing a list of >>DEFINE statements for conditional compilation variables and their values");
		Option out = new Option("out", true
			, "name of a file in which to store the CALLs, EXEC CICS LINKs, EXEC CICS XCTLs, and EXEC SQL CALLs");
		Option logLevel = new Option("logLevel", true
			, "logging level for this run {SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST}");
		Option unitTest = new Option("unitTest", false
			, "used to test lexer, parser, listeners, et. al");
		Option saveTemp = new Option("saveTemp", false
			, "save temporary files, used to test lexer, parser, listeners, et. al");
		Option help = new Option("help", false, "print this message");

		this.options.addOption(file);
		this.options.addOption(fileList);
		this.options.addOption(copy);
		this.options.addOption(copyList);
		this.options.addOption(defList);
		this.options.addOption(out);
		this.options.addOption(logLevel);
		this.options.addOption(unitTest);
		this.options.addOption(saveTemp);
		this.options.addOption(help);

		try {
			this.line = parser.parse( options, args );
		} catch( ParseException exp ) {
			TestIntegration.LOGGER.severe( "Command line parsing failed.  Reason: " + exp.getMessage() );
			System.exit(16);
		}

		if (this.line.hasOption("help")) {
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(0);
		}

		if (this.line.hasOption("file")) {
			this.fileNamesToProcess.add(this.line.getOptionValue("file"));
		} else if (this.line.hasOption("fileList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("fileList")));
			this.fileNamesToProcess.addAll(list);
		} else {
			TestIntegration.LOGGER.config("Either the file or the fileList option must be provided");
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("copy")) {
			this.copyPaths.add(this.line.getOptionValue("copy"));
		} else if (this.line.hasOption("copyList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("copyList")));
			this.copyPaths.addAll(list);
		} else {
			TestIntegration.LOGGER.config("Either the copy or the copyList option must be provided");
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("defList")) {
			this.parseDefines(this.line.getOptionValue("defList"));
		}

		if (this.line.hasOption("out")) {
			this.outFileName = this.line.getOptionValue("out");
		}

		if (this.line.hasOption("logLevel")) {
			switch(this.line.getOptionValue("logLevel")) {
				case "SEVERE":
					TestIntegration.LOGGER.setLevel(Level.SEVERE);
					break;
				case "WARNING":
					TestIntegration.LOGGER.setLevel(Level.WARNING);
					break;
				case "INFO":
					TestIntegration.LOGGER.setLevel(Level.INFO);
					break;
				case "CONFIG":
					TestIntegration.LOGGER.setLevel(Level.CONFIG);
					break;
				case "FINE":
					TestIntegration.LOGGER.setLevel(Level.FINE);
					break;
				case "FINER":
					TestIntegration.LOGGER.setLevel(Level.FINER);
					break;
				case "FINEST":
					TestIntegration.LOGGER.setLevel(Level.FINEST);
					break;
				default:
					TestIntegration.LOGGER.config("Unrecognized logLevel option " + this.line.getOptionValue("LogLevel"));
			}
		} else {
			TestIntegration.LOGGER.setLevel(Level.INFO);
		}

		if (this.line.hasOption("unitTest")) {
			this.unitTest = true;
			if (this.line.hasOption("logLevel")) {
				if (this.line.getOptionValue("logLevel").equals("FINE")
				||  this.line.getOptionValue("logLevel").equals("FINER")
				||  this.line.getOptionValue("logLevel").equals("FINEST")) {
				} else {
					TestIntegration.LOGGER.setLevel(Level.FINE);
					TestIntegration.LOGGER.info("overriding logLevel");
				}
			} else {
				TestIntegration.LOGGER.setLevel(Level.FINE);
			}
			TestIntegration.LOGGER.info("unit testing is in effect");
		}

		if (this.line.hasOption("saveTemp")) {
			this.saveTemp = true;
			TestIntegration.LOGGER.info("temporary files will be preserved");
		}

	}

	private void parseDefines(String fileName) throws Exception {
		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();

		TestIntegration.LOGGER.fine("parseDefines");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		CompilerDirectingStatementListener listener = 
			new CompilerDirectingStatementListener(compDirStmts, this.compOptDefines);

		TestIntegration.LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		TestIntegration.LOGGER.finest("compOptDefines: " + this.compOptDefines);

	}

	/**
	Used to create temporary directories.  Global.
	*/
	public File newTempDir(File baseDir, String prfx, Boolean saveTemp) {
		File tmpDir = null;
		try {
			tmpDir = Files.createTempDirectory(baseDir.toPath(), prfx).toFile();
		} catch (Exception e) {
			TestIntegration.LOGGER.severe(this.myName + " Exception " + e + " encountered in newTempDir");
			e.printStackTrace();
			System.exit(16);
		}

		this.setPosixAttributes(tmpDir);

		if (saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	/**
	Used to set file attributes if necessary.  Global.
	*/
	public void setPosixAttributes(File aFile) {
		String attr = null;

		if (aFile.isDirectory()) {
			attr = "rwxr-x---";
		} else {
			attr = "rw-r-----";
		}

		if (aFile.toPath().getFileSystem().supportedFileAttributeViews().contains("posix")) {
			Set<PosixFilePermission> perms = PosixFilePermissions.fromString(attr);
			try {
				Files.setPosixFilePermissions(aFile.toPath(), perms);
			} catch (Exception e) {
				TestIntegration.LOGGER.severe(this.myName + " Exception " + e + " encountered in setPosixAttributes");
				e.printStackTrace();
				System.exit(16);
			}
		}
	}

	/**
	Convenience method used from multiple locations.

	Global.
	*/
	public String copyCompressingContinuations(
			String fileName
			, File baseDir
			, String initFileNm
			) throws IOException {
		TestIntegration.LOGGER.finest(this.myName + " copyCompressingContinuations()");
		ArrayList<TerminalNodeWrapper> tNodes = new ArrayList<>();

		this.lookForTerminalNodes(fileName, tNodes);

		File tmp = File.createTempFile("CallTree-" + initFileNm + "-withoutcontinuations-", "-cbl", baseDir);
		this.setPosixAttributes(tmp);
		if (this.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		return(this.writeOutTerminalNodes(tmp, tNodes));
	}

	/**
	The intent of this method is to compress some of the syntactically correct
	but awful constructs such as...

	000028     ADD 
	000029                                                                 1
	000030-                                                                0
	000031
	000032     TO
	000033                                                                 C
	000034-                                                                O
	000035-                                                                U
	000036-                                                                N
	000037-                                                                T
	000038-                                                                E
	000039-                                                                R
	000040
	000041
	000042                                                               DIS
	000043-                                                             PLAY 
	000044     COUNTER

	There is a need for this code in multiple places and this was the
	most convenient place to locate it.

	Global.
	*/
	@SuppressWarnings({"fallthrough"})
	public String writeOutTerminalNodes(
			File tmp
			, ArrayList<TerminalNodeWrapper> tNodes
			) throws IOException {
		TestIntegration.LOGGER.finest(this.myName + " writeOutTerminalNodes()");

		PrintWriter out = new PrintWriter(tmp);
		StringBuilder sb = new StringBuilder();
		TerminalNodeWrapper token = null;
		Boolean newline = false;
		Boolean continuation = false;
		long prevLine = -1;
		int prevTextLength = -1;
		long prevPosn = -1;

		for (int i = 0; i < tNodes.size(); i++) {
			token = tNodes.get(i);
			TestIntegration.LOGGER.finest(" token = |" + token + "|");
			switch(token.getType()) {
				case CobolPreprocessorParser.NEWLINE:
					newline = true;
					break;
				case CobolPreprocessorParser.CLASSIC_CONTINUATION: // intentional fall-through!
				case CobolPreprocessorParser.REPLACE_CONTINUATION: // intentional fall-through!
				case CobolPreprocessorParser.PSEUDOTEXT_CONTINUATION: // intentional fall-through!
					continuation = true;
					break;
				case Token.EOF:
					break;
				default:
					if (newline && continuation) {
						if (token.getText().startsWith("\"")) {
							sb.append(token.getText().substring(1));
						} else {
							sb.append(token.getText());
						}
					} else if (newline) {
						sb.append("\n");
						sb.append(this.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
					} else if (token.getLine() == prevLine) {
						long extraPadding = token.getPosn() - (prevPosn + prevTextLength);
						sb.append(this.padLeft(token.getText(), token.getTextLength() + extraPadding));
					} else {
						sb.append(this.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
					}
					prevLine = token.getLine();
					prevTextLength = token.getTextLength();
					prevPosn = token.getPosn();
					newline = false;
					continuation = false;
			}
		}

		out.println(sb);
		out.close();
		return tmp.getAbsolutePath();

	}

	public String padLeft(String aString, long length) {
		if (aString.length() >= length) {
			return aString;
		}
		StringBuilder sb = new StringBuilder();
		while (sb.length() < length - aString.length()) {
			sb.append(' ');
		}
		sb.append(aString);

		return sb.toString();
	}

	/**
	In multiple places there is a need for a collection of TerminalNode 
	instances that comprise source code text.  This was the most convenient
	place to locate the code.  Global.
	*/
	public void lookForTerminalNodes(
			String fileName
			, ArrayList<TerminalNodeWrapper> tNodes
			) throws IOException {
		TestIntegration.LOGGER.fine(this.myName + " lookForTerminalNodes()");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer.testRig = false;
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		CobolPreprocessorParserTerminalNodeListener listener = 
			new CobolPreprocessorParserTerminalNodeListener(tNodes);

		TestIntegration.LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		TestIntegration.LOGGER.finest("tNodes: " + tNodes);

	}

	public void applyReplacingPhrase(
			PrintWriter out
			, String copyFile
			, ArrayList<ArrayList<TerminalNodeWrapper>> replaceable
			, ArrayList<ArrayList<TerminalNodeWrapper>> replacement
			) throws IOException {
		TestIntegration.LOGGER.fine(this.myName + " applyReplacingPhrase() ");

		StringBuilder outLine = new StringBuilder();
		ArrayList<TerminalNodeWrapper> copyFileNodes = new ArrayList<>();
		this.lookForTerminalNodes(copyFile, copyFileNodes);
		int from = 0;
		int to = -1;
		int matchedIndex = 0;

		while (from < copyFileNodes.size()) {
			Boolean matched = false;
			matchLoop:
			for (ArrayList<TerminalNodeWrapper> matchList: replaceable) {
				if (copyFileNodes.size() - from >= matchList.size()) {
					to = from + matchList.size();
					int i = 0;
					matched = true;
					for (TerminalNodeWrapper copyFileNode: copyFileNodes.subList(from, to)) {
						if (!matchList.get(i).textIsEqual(copyFileNode)) {
							matched = false;
							break matchLoop;
						}
						i++;
					}
				}
				matchedIndex++;
			}
			if (matched) {
				for (TerminalNodeWrapper replaceBy: replacement.get(matchedIndex)) {
					outLine.append(replaceBy.getText());
				}
				from = to;
			} else {
				outLine.append(copyFileNodes.get(from).getText());
				from++;
			}
		}

		out.println(outLine);
	}
}
