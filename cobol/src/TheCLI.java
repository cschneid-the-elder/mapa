import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.CopyOnWriteArrayList;
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
				case CobolPreprocessorParser.CLASSIC_CONTINUATION:
					continuation = true;
					break;
				case Token.EOF:
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
		TestIntegration.LOGGER.fine(this.myName + " lookForTerminalNodes()");

		ArrayList<TerminalNodeWrapper> tNodes = new ArrayList<>();
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
		TestIntegration.LOGGER.finest("tNodes: " + tNodes);

		return tNodes;
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
		ArrayList<TerminalNodeWrapper> copyFileNodes1 = this.lookForTerminalNodes(copyFile);
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
					outLine.append(this.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
				} else {
					outLine.append(this.padLeft(token.getText(), token.getTextLength() + token.getClonedPosn()));
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
					outLine.append(this.padLeft(token.getText(), token.getTextLength() + extraPadding));
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
				outLine.append(this.padLeft(token.getText(), token.getTextLength() + extraPadding));
			} else {
				TestIntegration.LOGGER.finest(" else");
				outLine.append(this.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
			}
			prevLine = token.getClonedLine();
			prevTextLength = token.getTextLength();
			prevPosn = token.getClonedPosn();
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
}
