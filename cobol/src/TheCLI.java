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
	private Logger LOGGER = null;
	public Options options = new Options();
	public CommandLineParser parser = new DefaultParser();
	public CommandLine line = null;
	public HelpFormatter formatter = new HelpFormatter();
	public ArrayList<String> fileNamesToProcess = new ArrayList<>();
	public ArrayList<String> copyPaths = new ArrayList<>();
	public String outFileName = null;
	public Boolean unitTest = false;
	public Boolean saveTemp = false;
	public Boolean profile = false;
	public Boolean freeForm = false;
	public Boolean nistTest = false;
	public ArrayList<CondCompVar> compOptDefines = new ArrayList<>();

	public TheCLI(String[] args, Logger LOGGER) throws Exception {

		this.args = args;
		this.LOGGER = LOGGER;

		Option file = new Option("file", true
			, "name of a single file to process, takes precedence over the fileList option");
		Option fileList = new Option("fileList", true
			, "name of a file containing a list of files to process");
		Option copy = new Option("copy", true
			, "name of a single path in which to locate copybooks, takes precedence over the copyList option");
		Option copyList = new Option("copyList", true
			, "name of a file containing a list of paths in which to locate copybooks");
		Option freeForm = new Option("freeForm", false
			, "indicates if source is presumed free form in the absence of a compile option indicating otherwise");
		Option defList = new Option("defList", true
			, "name of a file containing a list of >>DEFINE statements for conditional compilation variables and their values");
		Option out = new Option("out", true
			, "name of a file in which to store the CALLs, EXEC CICS LINKs, EXEC CICS XCTLs, and EXEC SQL CALLs");
		Option logLevel = new Option("logLevel", true
			, "logging level for this run {SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST}");
		Option unitTest = new Option("unitTest", false
			, "used to test lexer, parser, listeners, et. al");
		Option nistTest = new Option("nistTest", false
			, "used to test with NIST COBOL 85 test suite");
		Option saveTemp = new Option("saveTemp", false
			, "save temporary files, used to test lexer, parser, listeners, et. al");
		Option profile = new Option("profile", false
			, "profile ANTLR grammar");
		Option help = new Option("help", false, "print this message");

		this.options.addOption(file);
		this.options.addOption(fileList);
		this.options.addOption(copy);
		this.options.addOption(copyList);
		this.options.addOption(freeForm);
		this.options.addOption(defList);
		this.options.addOption(out);
		this.options.addOption(logLevel);
		this.options.addOption(unitTest);
		this.options.addOption(nistTest);
		this.options.addOption(saveTemp);
		this.options.addOption(profile);
		this.options.addOption(help);

		try {
			this.line = parser.parse( options, args );
		} catch( ParseException exp ) {
			this.LOGGER.severe( "Command line parsing failed.  Reason: " + exp.getMessage() );
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
			this.LOGGER.config("Either the file or the fileList option must be provided");
			this.formatter.printHelp( "CallTree", options, true );
			System.exit(16);
		}

		if (this.line.hasOption("copy")) {
			this.copyPaths.add(this.line.getOptionValue("copy"));
		} else if (this.line.hasOption("copyList")) {
			List<String> list = Files.readAllLines(Paths.get(this.line.getOptionValue("copyList")));
			this.copyPaths.addAll(list);
		} else {
			this.LOGGER.config("Either the copy or the copyList option must be provided");
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
					this.LOGGER.setLevel(Level.SEVERE);
					break;
				case "WARNING":
					this.LOGGER.setLevel(Level.WARNING);
					break;
				case "INFO":
					this.LOGGER.setLevel(Level.INFO);
					break;
				case "CONFIG":
					this.LOGGER.setLevel(Level.CONFIG);
					break;
				case "FINE":
					this.LOGGER.setLevel(Level.FINE);
					break;
				case "FINER":
					this.LOGGER.setLevel(Level.FINER);
					break;
				case "FINEST":
					this.LOGGER.setLevel(Level.FINEST);
					break;
				default:
					this.LOGGER.config("Unrecognized logLevel option " + this.line.getOptionValue("LogLevel"));
			}
		} else {
			this.LOGGER.setLevel(Level.INFO);
		}

		if (this.line.hasOption("unitTest")) {
			this.unitTest = true;
			if (this.line.hasOption("logLevel")) {
				if (this.line.getOptionValue("logLevel").equals("FINE")
				||  this.line.getOptionValue("logLevel").equals("FINER")
				||  this.line.getOptionValue("logLevel").equals("FINEST")) {
				} else {
					this.LOGGER.setLevel(Level.FINE);
					this.LOGGER.info("overriding logLevel, setting to FINE");
				}
			} else {
				this.LOGGER.setLevel(Level.FINE);
				this.LOGGER.info("setting logLevel to FINE");
			}
			this.LOGGER.info("unit testing is in effect");
		}

		if (this.line.hasOption("saveTemp")) {
			this.saveTemp = true;
			this.LOGGER.info("temporary files will be preserved");
		}

		if (this.line.hasOption("profile")) {
			this.profile = true;
			this.LOGGER.info("ANTLR grammar will be profiled");
		}

		if (this.line.hasOption("freeForm")) {
			this.freeForm = true;
			this.LOGGER.info("free format source presumed");
		} else {
			this.LOGGER.info("fixed format source presumed");
		}
		
		if (this.line.hasOption("nistTest")) {
			this.nistTest = true;
			this.LOGGER.info("NIST COBOL 85 testing presumed");
		}
		
	}

	private void parseDefines(String fileName) throws Exception {
		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();

		this.LOGGER.fine("parseDefines");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		CompilerDirectingStatementListener listener = 
			new CompilerDirectingStatementListener(compDirStmts, this.compOptDefines, this.LOGGER, this);

		this.LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		this.LOGGER.finest("compOptDefines: " + this.compOptDefines);

	}

	/**
	Used to create temporary directories.  Global.
	*/
	public File newTempDir(File baseDir, String prfx, Boolean saveTemp) {
		File tmpDir = null;
		try {
			tmpDir = Files.createTempDirectory(baseDir.toPath(), prfx).toFile();
		} catch (Exception e) {
			this.LOGGER.severe(this.myName + " Exception " + e + " encountered in newTempDir");
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
				this.LOGGER.severe(this.myName + " Exception " + e + " encountered in setPosixAttributes");
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
		this.LOGGER.finest(this.myName + " copyCompressingContinuations()");
		ArrayList<TerminalNodeWrapper> tNodes = this.lookForTerminalNodes(fileName);

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
	public String writeOutTerminalNodes(
			File tmp
			, ArrayList<TerminalNodeWrapper> tNodes
			) throws IOException {
		this.LOGGER.finest(this.myName + " writeOutTerminalNodes() " + tmp.getName());

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
			this.LOGGER.finest(" token = |" + token + "|");
			switch(token.getType()) {
				case CobolPreprocessorParser.NEWLINE:
					newline = true;
					break;
				case CobolPreprocessorParser.CLASSIC_CONTINUATION:
					continuation = true;
					break;
				case Token.EOF:
					break;
				case CobolPreprocessorParser.CONTINUED_NONNUMERICLITERAL:
					if (continuation) {
						sb.append(token.getText().substring(1, token.getText().length() -2));
					} else {
						sb.append(' ');
						sb.append(token.getText().substring(0, token.getText().length() -2));
					}
					/*
					The continuation boolean is used as both a "this is the first in
					a potential series of CONTINUED_NONNUMERICLITERAL tokens" and to
					make the default logic work as the last token will be of type
					NONNUMERICLITERAL.
					*/
					continuation = true;
					break;
				default:
					if (newline && continuation) {
						if (token.getText().startsWith("\"") || token.getText().startsWith("\'")) {
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
	public ArrayList<TerminalNodeWrapper> lookForTerminalNodes(
			String fileName
			) throws IOException {
		this.LOGGER.fine(this.myName + " lookForTerminalNodes()");

		ArrayList<TerminalNodeWrapper> tNodes = new ArrayList<>();
		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer.testRig = false;
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		PreprocessorParserTerminalNodeListener listener = 
			new PreprocessorParserTerminalNodeListener(tNodes);

		this.LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		for (int i = 0; i < tNodes.size(); i++) {
			if (i == 0) {
				tNodes.get(i).setIsFirst(true);
			} else {
				tNodes.get(i).setPrecededByNewline(tNodes.get(i - 1).isNewline());
				long posn1 = tNodes.get(i - 1).getPosn();
				int textLength = tNodes.get(i - 1).getTextLength();
				long posn2 = tNodes.get(i).getPosn();
				Boolean precededByWhitespace = !(posn1 + textLength == posn2);
				tNodes.get(i).setPrecededByWhitespace(precededByWhitespace);
			}
		}
		this.LOGGER.finest("tNodes: " + tNodes);

		return tNodes;
	}

}
