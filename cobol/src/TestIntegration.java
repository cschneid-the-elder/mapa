import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.SimpleFormatter;
import java.util.concurrent.atomic.AtomicReference;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

/**
Top level of a COBOL static code analysis tool.  Static code analysis
is always going to be limited, but this tool will attempt to aid the
user in getting a feel for the "shape" of a code base by tracking the
call tree.
<p>
This tool will not be able to determine which module is being called
if the called module's name is obtained at run time from an external
data store (via SQL or I/O or JCL PARM=).
<p>
The intent here is to obtain a hierarchical map of the Data Division,
then a list of CALLs in the Procedure Division, then match the two for
<code>CALL identifier</code> syntax.
<p>
This can get interesting, as we must also attempt to determine values
assigned to the identifier via <code>MOVE</code> and any 88-levels that
are <code>SET</code>.
<p>
So, first map the Data Division, then get a list of CALLs, then match 
the two, storing the Data Division node in the list of CALLs.  Then,
for all Data Division nodes, attempt to determine what values are
assigned at run time.
<p>
Finally, store calling module, called module (to the extent it can be
determined) and anything else that seems useful.
<p><p>
Syntax: <code>java -jar CallTree.jar -help</code>


*/

public class TestIntegration{

public static final Logger LOGGER = Logger.getLogger(TestIntegration.class.getName());
public static ArrayList<CopyStatementContextWrapper> copiesForFile = new ArrayList<>(); //TODO needed?
public static ArrayList<DDNode> dataNodes = new ArrayList<>();
public static TheCLI CLI = null;

public static void main(String[] args) throws Exception {

	Handler fileHandler  = null;

	System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tc] %4$s: %5$s%n");

	try {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		fileHandler = new FileHandler("./TestIntegration-" + LocalDateTime.now().format(df) +".log");
		fileHandler.setFormatter(new SimpleFormatter());
		LOGGER.addHandler(fileHandler);
		fileHandler.setLevel(Level.ALL);
		LOGGER.setLevel(Level.ALL);
		LOGGER.info("Logger Name: " + LOGGER.getName());
	} catch (Exception e) {
		LOGGER.severe("Exception " + e + " encountered");
		System.exit(16);
	}

	CLI = new TheCLI(args);
	File baseDir = newTempDir(); // keep all temp files contained here
	String fileName = null;
	ArrayList<CallWrapper> allTheCalledNodes = new ArrayList<>();
	Boolean pass = true;
	Boolean idDivFound = false;
	int failCount = 0;

	for (String aFileName: CLI.fileNamesToProcess) {
		LOGGER.info("Processing " + aFileName);
		dataNodes = new ArrayList<>();
		ArrayList<CallWrapper> calledNodes = new ArrayList<>();
		ArrayList<CondCompVar> compOptDefines = new ArrayList<>();
		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();
		String initFileNm = new File(aFileName).getName();

		idDivFound = lookForIdDiv(aFileName);
		if (!idDivFound) {
			LOGGER.info(aFileName + " not COBOL?");
			continue;
		}
		fileName = processCDS(aFileName, baseDir);
		calledNodes = assembleDataNodeTree(fileName, getLib(aFileName));
		allTheCalledNodes.addAll(calledNodes);
		if (CLI.unitTest) {
			if (!testFor(aFileName, dataNodes, calledNodes)) failCount++;
		}
		LOGGER.fine(aFileName + " calls " + calledNodes.size() + " modules");
	}

	LOGGER.fine("allTheCalledNodes: " + allTheCalledNodes);

	if (failCount > 0) LOGGER.info("----> At least one unit test failed");

	if (CLI.outFileName != null) {
		LOGGER.info("writing to " + CLI.outFileName);
		File outFile = new File(CLI.outFileName);
		PrintWriter pw = new PrintWriter(outFile);
		LOGGER.finest("writing output");
		for (CallWrapper cw: allTheCalledNodes) {
			LOGGER.finest(cw.callingModuleName + " " + cw.uuid.toString());
			cw.writeOn(pw);
		}
		pw.close();
	}

	LOGGER.info("Processing complete");
}

	/**
	The intent here is to return the last directory in the path to the
	file named in the argument, on the theory that the path is named
	for the library in which the file originally resided.

	<p>If the file is /home/cschneid/cobol/PROD.PAYROLL.SOURCE/UPDATE then
	this method should return "PROD.PAYROLL.SOURCE".
	*/
	public static String getLib(String aFileName) {
		String absPath = new File(aFileName).getAbsolutePath();
		int lastSep = absPath.lastIndexOf(File.separatorChar);
		int nextToLastSep = -1;
		String lib = null;

		if (lastSep > 0) {
			nextToLastSep = absPath.lastIndexOf(File.separatorChar, lastSep - 1);
		}

		if (nextToLastSep > 0) {
			lib = absPath.substring(nextToLastSep + 1, lastSep);
		} else {
			lib = "";
		}

		return lib;
	}

	public static CompilerDirectingStatement cdsInList(
			int line
			, ArrayList<CompilerDirectingStatement> compDirStmts) {
		for (CompilerDirectingStatement cds: compDirStmts) {
			if (line == cds.getLine()) return cds;
		}

		return null;
	}

	@SuppressWarnings({"fallthrough"})
	public static String processCDS(
			String aFileName
			, File baseDir
			) throws Exception {
		LOGGER.fine("processCDS()");

		ArrayList<CondCompVar> compOptDefines = new ArrayList<>(CLI.compOptDefines);
		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();
		String initFileNm = new File(aFileName).getName();
		String fileName = initFileNm;
		Boolean done = false;
		int nbCopies = 0;
		int sanityCheck = 0;
		int iteration = 0;

		lookForCompilerDirectingStatements(
						aFileName
						, baseDir
						, initFileNm
						, compDirStmts
						, compOptDefines);
		LOGGER.finest("compOptDefines = " + compOptDefines);
		fileName = rewriteWithoutCompileOptionsStatements(compDirStmts, aFileName, baseDir, initFileNm);
		while (!done) {
			sanityCheck++;
			LOGGER.finest("sanityCheck = " + sanityCheck);
			if (sanityCheck > 100) {
				throw new IllegalArgumentException(
					"sanity check exceeded ("
					+ sanityCheck
					+ ") processing "
					+ aFileName
					+ " into "
					+ fileName);
			}
			compDirStmts.clear();
			lookForCompilerDirectingStatements(
							fileName
							, baseDir
							, initFileNm
							, compDirStmts
							, compOptDefines);
			nbCopies = countCopyCDS(compDirStmts);
			LineNumberReader src = new LineNumberReader(new FileReader(new File(fileName)));
			File tmp = File.createTempFile("CallTree-" + initFileNm + "-" + String.format("%05d", iteration) + "-", "-cbl", baseDir);
			iteration++;
			CLI.setPosixAttributes(tmp);
			if (CLI.saveTemp) {
			} else {
				tmp.deleteOnExit();
			}
			LOGGER.finest("reading from " + fileName);
			LOGGER.finest("writing to " + tmp.getPath());
			PrintWriter out = new PrintWriter(tmp);
			Boolean justWriteTheRest = false;
			ArrayDeque<Boolean> truthiness = new ArrayDeque<>();
			ArrayDeque<ArrayList<Boolean>> whenStrewth = new ArrayDeque<>();
			ReplaceStatement currReplace = null;
			int replaceStart = -1;
			int replaceStop = -1;

			String inLine = src.readLine();
			while (inLine != null) {
				StringBuilder inLineSB = new StringBuilder(inLine);
				CompilerDirectingStatement cds = cdsInList(src.getLineNumber(), compDirStmts);
				LOGGER.finest("  justWriteTheRest = |" + justWriteTheRest + "|" + "  cds = |" + cds + "|" + "  truthiness.peek() = |" + truthiness.peek() + "|");
				if (justWriteTheRest) {
					/*
					A COPY statement has been encountered and its contents have been
					incorporated into the output file.  Just write the rest of the
					input file to the output file.  This is done because the contents
					of the COPY member may contain compiler directing statements which
					have not been parsed and are not present in compDirStmts.  These
					will be caught in the next iteration.
					*/
				} else if (cds == null) {
					/*
					cds == null indicates the current line is not a compiler directing
					statement.  If the current compiler directing statement (IF or WHEN)
					is true, or there is no current compiler directing statement then
					just leave the input as is, otherwise comment it out.  Apply the
					current REPLACE statement if it exists and all COPY statements have
					been resolved.
					*/
					if (truthiness.peek() == null || truthiness.peek()) {
					} else {
						if (inLineSB.length() > 6) {
							inLineSB.setCharAt(6, '*');
						}
					}
					inLine = inLineSB.toString();
					if (nbCopies == 0) {
						if (currReplace == null) {
						} else {
							inLine = currReplace.applyTo(inLineSB.toString());
						}
					}
				} else {
					/*
					State machine for interpreting compiler directing statements.
					*/
					LOGGER.finest("cds.getType() = " + cds.getType());
					switch(cds.getType()) {
						case STMT_EVALUATE:
							whenStrewth.push(new ArrayList<Boolean>());
							break;
						case STMT_WHEN:
							if (truthiness.peek() != null) {
								truthiness.pop();
							}
							Boolean prevTruth1 = true;
							if (truthiness.peek() != null) {
								prevTruth1 = truthiness.peek();
							}
							if (prevTruth1) {
								Boolean strewth = ((ConditionalCompilationStatement)cds).strewth();
								if (whenStrewth.peek().contains(true)) {
									LOGGER.finest("this WHEN is disregarded because a previous WHEN tested TRUE");
									truthiness.push(false);
								} else {
									truthiness.push(strewth && prevTruth1);
								}
								whenStrewth.peek().add(strewth);
							} else {
								LOGGER.finest("prevTruth1 == false so " + cds + " strewth() not executed");
								truthiness.push(false);
							}
							break;
						case STMT_END_EVALUATE:
							whenStrewth.pop();
							truthiness.pop();
							break;
						case STMT_ELSE:
							truthiness.pop();
						case STMT_IF: // intentional fall-through!
							Boolean prevTruth2 = true;
							if (truthiness.peek() != null) {
								prevTruth2 = truthiness.peek();
							}
							if (prevTruth2) {
								truthiness.push(((ConditionalCompilationStatement)cds).strewth() && prevTruth2);
							} else {
								LOGGER.finest("prevTruth2 == false so " + cds + " strewth() not executed");
								truthiness.push(false);
							}
							break;
						case STMT_END_IF:
							truthiness.pop();
							break;
						case STMT_COPY:
							if (truthiness.peek() == null || truthiness.peek()) {
								((CopyStatement)cds).apply(src, out, inLineSB.toString());
								justWriteTheRest = true;
								inLineSB.delete(0, inLineSB.length());
							} else {
								if (inLineSB.length() > 6) {
									inLineSB.setCharAt(6, '*');
								}
							}
							inLine = inLineSB.toString();
							break;
						case STMT_REPLACE:
							if (nbCopies == 0) {
								if (truthiness.peek() == null || truthiness.peek()) {
									currReplace = (ReplaceStatement)cds;
									replaceStart = cds.getLine();
									replaceStop = cds.getEndLine();
								}
							}
							break;
						case STMT_REPLACE_OFF:
							if (nbCopies == 0) {
								if (truthiness.peek() == null || truthiness.peek()) {
									currReplace = null;
									replaceStart = cds.getLine();
									replaceStop = cds.getEndLine();
								}
							}
							break;
						default:
							break;
					}
				}
				if (nbCopies == 0 
				&& (src.getLineNumber() >= replaceStart && src.getLineNumber() <= replaceStop)) {
					LOGGER.finest("not writing |" + inLine + "| as it seems to be part of a REPLACE [OFF] statement");
				} else {
					LOGGER.finest("writing  |" + inLine + "|");
					out.println(inLine);
				}
				inLine = src.readLine();
			}
			src.close();
			out.close();
			fileName = tmp.getPath();
			sanityCheck = 0;
			if (nbCopies == 0) done = true;
		}

		return fileName;
	}
 
	public static int countCopyCDS(ArrayList<CompilerDirectingStatement> compDirStmts) {
		int nbCopies = 0;
		for (CompilerDirectingStatement copy: compDirStmts) {
			if (copy.getType() == CompilerDirectingStatement.CompilerDirectingStatementType.STMT_COPY) {
				nbCopies++;
			}
		}

		return nbCopies;
	}

	/**
	It turns out little is required of a COBOL program qua being a
	COBOL program other than the Identification Division.  So we look
	for that, and if absent we do not proceed.
	*/
	public static Boolean lookForIdDiv(String initFileName) throws Exception {
		LOGGER.fine("lookForIdDiv");
		CharStream cs = fromFileName(initFileName);  //load the file
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens	

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		IdDivListener listener = new IdDivListener();
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

		return listener.idDivFound;
		
	}

	public static void lookForCompilerDirectingStatements(
			String fileName
			, File baseDir
			, String initFileNm
			, ArrayList<CompilerDirectingStatement> compDirStmts
			, ArrayList<CondCompVar> compOptDefines
			) throws Exception {
		LOGGER.fine("lookForCompilerDirectingStatements");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		CompilerDirectingStatementListener listener = 
			new CompilerDirectingStatementListener(compDirStmts, compOptDefines);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		LOGGER.finest("compDirStmts: " + compDirStmts);
		LOGGER.finest("compOptDefines: " + compOptDefines);

	}

	public static String lookForReplaceStatements(
						String fileName
						, File baseDir
						, String initFileNm
						) throws Exception {
		LOGGER.fine("lookForReplacementStatements");
		ArrayList<ReplaceStatementContextWrapper> replaces = new ArrayList<>();

		CharStream cs = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		ReplaceListener listener = new ReplaceListener(replaces);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		LOGGER.finest("replaces: " + replaces);

		fileName = rewriteApplyingReplaceStatements(replaces, fileName, baseDir, initFileNm);

		return fileName;
	}

	public static String rewriteApplyingReplaceStatements(
						ArrayList<ReplaceStatementContextWrapper> replaces
						, String fileName
						, File baseDir
						, String initFileNm
						) throws IOException {
		LOGGER.fine("rewriteApplyingReplaceStatements");
		LineNumberReader src = new LineNumberReader(new FileReader( new File(fileName)));
		File tmp = File.createTempFile("CallTree-" + initFileNm + "-", "-cbl", baseDir);
		CLI.setPosixAttributes(tmp);
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);
		String inLine = src.readLine();

		LOGGER.finer("Applying REPLACE statements to " + fileName);

		/**
			Here we apply the REPLACE statements.
		*/	
		while (inLine != null) {
			for (ReplaceStatementContextWrapper repl: replaces) {
				while (repl.startLine() <= src.getLineNumber() 
					&& src.getLineNumber() <= repl.endLine()
					&& inLine != null) {
						inLine = src.readLine();
						//System.out.println("eating line " + src.getLineNumber());
				}
			}
			out.println(applyReplaceStatements(replaces, inLine, src.getLineNumber()));
			inLine = src.readLine();
		}

		src.close();
		out.close();
		fileName = tmp.getPath();
		return fileName;

	}

	public static String applyReplaceStatements(
						ArrayList<ReplaceStatementContextWrapper> replaces
						, String line
						, int lineNb) {
		LOGGER.fine("applyReplaceStatements");
		String newLine = new String(line);
		int i = 0;

		for (i = 0; i < replaces.size(); i++) {
			if (replaces.get(i).isReplaceByStatement()) {
				if (lineNb > replaces.get(i).startLine()) {
					if (i < replaces.size() - 1 && lineNb < replaces.get(i+1).startLine()) {
						newLine = replaces.get(i).applyTo(newLine);
					}
				}
			}
		}
		return newLine;
	}

	/**
	Return the name of a temporary file containing the source (as preprocessed
	up to this point) without any compile options (PROCESS or CBL statements).
	*/
	public static String rewriteWithoutCompileOptionsStatements(
			ArrayList<CompilerDirectingStatement> compDirStmts
			, String fileName
			, File baseDir
			, String initFileNm
			) throws IOException {
		LOGGER.fine("rewriteWithoutCompileOptionsStatements");

		LineNumberReader src = new LineNumberReader(new FileReader( new File(fileName)));
		File tmp = File.createTempFile("CallTree-" + initFileNm + "-", "-cbl", baseDir);
		CLI.setPosixAttributes(tmp);
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);
		String inLine = src.readLine();

		while (inLine != null) {
			Boolean isCompileOptLine = false;
			for (CompilerDirectingStatement cds: compDirStmts) {
				if (cds.getType() == CompilerDirectingStatement.CompilerDirectingStatementType.STMT_COMPILE_OPTION 
				&& cds.getLine() == src.getLineNumber()) {
					isCompileOptLine = true;
					break;
				}
			}
			LOGGER.finest("isCompileOptLine = " + isCompileOptLine);
			if (!isCompileOptLine) {
				out.println(inLine);
				LOGGER.finest("output line = |" + inLine + "|");
			}
			inLine = src.readLine();
		}

		src.close();
		out.close();
		fileName = tmp.getPath();
		LOGGER.finest("rewritten w/o compile option statements to " + fileName);
		return fileName;
	}

	public static ArrayList<CallWrapper> assembleDataNodeTree(
				String fileName
				, String aLib
				) throws IOException {
		LOGGER.fine("assembleDataNodeTree");
		ArrayList<CallWrapper> calledNodes = new ArrayList<>();

		CharStream cs = fromFileName(fileName);  //load the file

		LOGGER.finer("lexing " + fileName);

		CobolLexer lexer = new CobolLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens

		LOGGER.finer("parsing with CobolParser");

		CobolParser parser = new CobolParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree
		ParseTreeWalker walker = new ParseTreeWalker();

		DataDescriptionEntryListener listener = new DataDescriptionEntryListener(dataNodes);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		LOGGER.finest("dataNodes: " + dataNodes);

		calledNodes = lookForCalledRoutines(tree, walker, aLib);
		calledNodes = resolveCalledNodes(tree, walker, calledNodes, dataNodes);

		return calledNodes;

	}

	public static ArrayList<CallWrapper> lookForCalledRoutines(ParseTree tree
					, ParseTreeWalker walker
					, String aLib) {
		LOGGER.fine("lookForCalledRoutines");
		ArrayList<CallWrapper> calledNodes = new ArrayList<>();
		CallEtAlListener callListener = new CallEtAlListener(calledNodes, aLib);

		LOGGER.finer("----------walking tree with CallEtAlListener");

		LOGGER.finest("tree = " + tree);

		walker.walk(callListener, tree);

		LOGGER.finest("calledNodes: " + calledNodes);

		return calledNodes;
	}

	public static ArrayList<CallWrapper> resolveCalledNodes(ParseTree tree
						, ParseTreeWalker walker
						, ArrayList<CallWrapper> calledNodes
						, ArrayList<DDNode> dataNodes) {

		LOGGER.fine("resolveCalledNodes");
		ArrayList<DDNode> calledDataNodes = new ArrayList<>();

		for (CallWrapper call: calledNodes) {
			LOGGER.finest("  call.identifier = " + call.identifier);
			if (call.identifier == null) {
			} else {
				calledDataNodes = new ArrayList<>();
				for (DDNode node: dataNodes) {
					if (node.parent == null) {
						//System.out.println("  data node  = " + node);
						//System.out.println("    parent   = " + node.parent);
						//System.out.println("    children = " + node.children);
						calledDataNodes.addAll(node.findChildrenNamed(call.identifier));
					}
				}
				LOGGER.finest("  all node children named " + call.identifier + " = " + calledDataNodes);
				if (!call.selectDataNode(calledDataNodes, dataNodes)) {
					LOGGER.warning("!no data node selected");
				}
				LOGGER.finest("call.dataNode = " + call.dataNode);
			}
		}

		LOGGER.finest("calledNodes: " + calledNodes);

		SetListener listener = new SetListener(calledNodes, LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		LOGGER.finest("calledNodes: " + calledNodes);

		return calledNodes;
	}

	/**
	Create a copy of the original file with a '\n' prepended in order
	to make the CLASSIC_LINE_NUMBER lexer token match.
	*/
	public static String copyWithBOL(
			String fileName
			, File baseDir
			, String initFileNm
			) throws IOException {
		LineNumberReader src = new LineNumberReader(new FileReader( new File(fileName)));
		File tmp = File.createTempFile("CallTree-" + initFileNm + "-", "-cbl", baseDir);
		CLI.setPosixAttributes(tmp);
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);
		List<String> list = Files.readAllLines(Paths.get(fileName));
		out.println('\n');
		for (String line: list) out.println(line);
		out.close();
		return tmp.getAbsolutePath();

	}

	/**
	Create a directory to hold temporary files used in processing.  This way,
	they're all confined together and can be easily disposed of if the
	<code>-saveTemp</code> option was requested.
	*/
	public static File newTempDir() throws IOException {
		File tmpDir = Files.createTempDirectory("CallTree-").toFile();
		CLI.setPosixAttributes(tmpDir);

		if (CLI.saveTemp) {
		} else {
			tmpDir.deleteOnExit();
		}

		return tmpDir;
	}

	/**
	This method is executed if the -unitTest option is requested.  It may
	not meet your definition of unit test, but it serves mine.

	<p>The goal is to examine the results of all processing for given
	modules and compare them to known correct results.  Those known correct
	results are hard-coded here.

	<p>It's awful, I know, but try not to look at it.  Or think about it.
	You're thinking about it now aren't you?
	*/
	public static Boolean testFor(String fileName
						, ArrayList<DDNode> dataNodes
						, ArrayList<CallWrapper> calledNodes
						) {

		LOGGER.fine("Executing unit tests for " + fileName);
		Boolean rc = false;
		String bareName = fileName.substring(fileName.lastIndexOf("/") + 1, fileName.lastIndexOf("."));
		int failCount = 0;

		switch(bareName) {
			case "testantlr001":
			case "testantlr101":
			case "testantlr201":
			case "testantlr301":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (calledNodes.size() == 0) {
					//do nothing
				} else {
					LOGGER.info("FAIL " + fileName);
					LOGGER.fine("FAIL " + fileName + " test - calledNodes.size() != 0");
					LOGGER.fine(fileName + " calledNodes.size() = " + calledNodes.size());
					LOGGER.fine(fileName + " calledNodes = " + calledNodes);
					failCount++;
				}
				break;
			case "testantlr002":
			case "testantlr102":
			case "testantlr202":
			case "testantlr302":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr003":
			case "testantlr103":
			case "testantlr203":
			case "testantlr303":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr004":
			case "testantlr104":
			case "testantlr204":
			case "testantlr304":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr005":
			case "testantlr105":
			case "testantlr205":
			case "testantlr305":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr006":
			case "testantlr106":
			case "testantlr206":
			case "testantlr306":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr007":
			case "testantlr107":
			case "testantlr207":
			case "testantlr307":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr008":
			case "testantlr108":
			case "testantlr208":
			case "testantlr308":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr009":
			case "testantlr109":
			case "testantlr209":
			case "testantlr309":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr010":
			case "testantlr110":
			case "testantlr210":
			case "testantlr310":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.SQLCALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr011":
			case "testantlr111":
			case "testantlr211":
			case "testantlr311":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr012":
			case "testantlr112":
			case "testantlr212":
			case "testantlr312":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr013":
			case "testantlr113":
			case "testantlr213":
			case "testantlr313":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.SQLCALLBYLITERAL, calledNodes)) failCount++;
				break;
			case "testantlr014":
			case "testantlr114":
			case "testantlr214":
			case "testantlr314":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSLINKBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr015":
			case "testantlr115":
			case "testantlr215":
			case "testantlr315":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CICSXCTLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr016":
			case "testantlr116":
			case "testantlr216":
			case "testantlr316":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0004", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr017":
			case "testantlr117":
			case "testantlr217":
			case "testantlr317":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0005", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr018":
			case "testantlr118":
			case "testantlr218":
			case "testantlr318":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMO0010", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr019":
			case "testantlr119":
			case "testantlr219":
			case "testantlr319":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMN0010", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr020":
			case "testantlr120":
			case "testantlr220":
			case "testantlr320":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMK0008", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr021":
			case "testantlr121":
			case "testantlr221":
			case "testantlr321":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr022":
			case "testantlr122":
			case "testantlr222":
			case "testantlr322":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(77), "AA-FROM-COPY", dataNodes)) failCount++;
				break;
			case "testantlr023":
			case "testantlr123":
			case "testantlr223":
			case "testantlr323":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "PGM-0004", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0004", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr024":
			case "testantlr124":
			case "testantlr224":
			case "testantlr324":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "X", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "V99", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "B9", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "Z", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9", dataNodes)) failCount++;
				break;
			case "testantlr025":
			case "testantlr125":
			case "testantlr225":
			case "testantlr325":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "X", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "V99", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "B9", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "Z", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMP3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMP5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99DISPLAY1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMP1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMP3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMP5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMPU3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMPU5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94COMPU1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95COMPU3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98COMPU5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5-V", dataNodes)) failCount++;
				break;
			case "testantlr026":
			case "testantlr126":
			case "testantlr226":
			case "testantlr326":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "B", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "C", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOAT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S99USAGEDISPLAY1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMP1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMP3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMP5-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9SFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S9DFLOATU", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S94USAGECOMPU1-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S95USAGECOMPU3-V", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "S98USAGECOMPU5-V", dataNodes)) failCount++;
				break;
			case "testantlr027":
			case "testantlr127":
			case "testantlr227":
			case "testantlr327":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "A", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "X", dataNodes)) failCount++;
				break;
			case "testantlr028":
			case "testantlr128":
			case "testantlr228":
			case "testantlr328":
				if (!testDD002(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "MYNAME", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "X", dataNodes, DataLocation.WORKINGSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "LOCAL-WORK-AREAS", dataNodes, DataLocation.LOCALSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "Y", dataNodes, DataLocation.LOCALSTORAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(01), "PARM-DATA", dataNodes, DataLocation.LINKAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "PARM-DATA-LEN", dataNodes, DataLocation.LINKAGE)) failCount++;
				if (!testDD002(fileName, bareName, new Integer(05), "PARM-DATA-VAL", dataNodes, DataLocation.LINKAGE)) failCount++;
				break;
			case "testantlr029":
			case "testantlr129":
			case "testantlr229":
			case "testantlr329":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMK0008", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMO0010", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0004", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMB0004", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				break;
			case "testantlr030":
			case "testantlr130":
			case "testantlr230":
			case "testantlr330":
			case "testantlr031":
			case "testantlr131":
			case "testantlr231":
			case "testantlr331":
			case "testantlr032":
			case "testantlr132":
			case "testantlr232":
			case "testantlr332":
			case "testantlr033":
			case "testantlr133":
			case "testantlr233":
			case "testantlr333":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "CEE3ABD", CallType.CALLBYLITERAL, calledNodes, 1)) failCount++;
				break;
			case "testantlr034":
			case "testantlr134":
			case "testantlr234":
			case "testantlr334":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr035":
			case "testantlr135":
			case "testantlr235":
			case "testantlr335":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr036":
			case "testantlr136":
			case "testantlr236":
			case "testantlr336":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr037":
			case "testantlr137":
			case "testantlr237":
			case "testantlr337":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr038":
			case "testantlr138":
			case "testantlr238":
			case "testantlr338":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr039":
			case "testantlr139":
			case "testantlr239":
			case "testantlr339":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr040":
			case "testantlr140":
			case "testantlr240":
			case "testantlr340":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr041":
			case "testantlr141":
			case "testantlr241":
			case "testantlr341":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr042":
			case "testantlr142":
			case "testantlr242":
			case "testantlr342":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr043":
			case "testantlr143":
			case "testantlr243":
			case "testantlr343":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0009", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr044":
			case "testantlr144":
			case "testantlr244":
			case "testantlr344":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0003", CallType.CALLBYIDENTIFIER, calledNodes, 3)) failCount++;
				break;
			case "testantlr045":
			case "testantlr145":
			case "testantlr245":
			case "testantlr345":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0009", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr046":
			case "testantlr146":
			case "testantlr246":
			case "testantlr346":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr047":
			case "testantlr147":
			case "testantlr247":
			case "testantlr347":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes, 2)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0003", CallType.CALLBYIDENTIFIER, calledNodes, 2)) failCount++;
				break;
			case "testantlr048":
			case "testantlr148":
			case "testantlr248":
			case "testantlr348":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes)) failCount++;
				break;
			case "testantlr049":
			case "testantlr149":
			case "testantlr249":
			case "testantlr349":
				if (!testDD001(fileName, bareName, new Integer(01), "CONSTANTS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "MYNAME", dataNodes)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0001", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0002", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0003", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0004", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0005", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0006", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0007", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PGMA0008", CallType.CALLBYIDENTIFIER, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "JULIA", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "ELIOT", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "PENNY", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "MARGOT", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				if (!testCall001(fileName, bareName, "ALICE", CallType.CALLBYLITERAL, calledNodes, 13)) failCount++;
				break;
			case "testantlr050":
			case "testantlr150":
			case "testantlr250":
			case "testantlr350":
				if (!testCall001(fileName, bareName, "D#IS#7", CallType.CALLBYLITERAL, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "E#IS#9", CallType.CALLBYLITERAL, calledNodes, 3)) failCount++;
				if (!testCall001(fileName, bareName, "F#IS#7", CallType.CALLBYLITERAL, calledNodes, 3)) failCount++;
				break;
			case "testantlr051":
			case "testantlr151":
			case "testantlr251":
			case "testantlr351":
				if (!testCall001(fileName, bareName, "PGM0001A", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				if (!testCall001(fileName, bareName, "PGM0001D", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				if (!testCall001(fileName, bareName, "PGM0001E", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				if (!testCall001(fileName, bareName, "PGM0001G", CallType.CALLBYLITERAL, calledNodes, 4)) failCount++;
				break;
			case "testantlr052":
			case "testantlr152":
			case "testantlr252":
			case "testantlr352":
				if (!testCall001(fileName, bareName, "OTHER#1", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "VAR1#2", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "VAR2#3", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "IGYARCH4", CallType.CALLBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "IGYCICS5", CallType.CICSXCTLBYLITERAL, calledNodes, 5)) failCount++;
				break;
			case "testantlr053":
			case "testantlr153":
			case "testantlr253":
			case "testantlr353":
				if (!testCall001(fileName, bareName, "PGM00003", CallType.CALLBYLITERAL, calledNodes, 2)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00009", CallType.CALLBYLITERAL, calledNodes, 2)) failCount++;
				break;
			case "testantlr054":
			case "testantlr154":
			case "testantlr254":
			case "testantlr354":
				if (!testCall001(fileName, bareName, "PGM00004", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00005", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00009", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00011", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00016", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00018", CallType.CICSLINKBYLITERAL, calledNodes, 6)) failCount++;
				break;
			case "testantlr055":
			case "testantlr155":
			case "testantlr255":
			case "testantlr355":
				if (!testCall001(fileName, bareName, "PGM00004", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00005", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00010", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00011", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				if (!testCall001(fileName, bareName, "PGM00013", CallType.CICSLINKBYLITERAL, calledNodes, 5)) failCount++;
				break;
			case "testantlr056":
			case "testantlr156":
			case "testantlr256":
			case "testantlr356":
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "WS-COUNT", dataNodes)) failCount++;
				break;
			case "testantlr057":
			case "testantlr157":
			case "testantlr257":
			case "testantlr357":
				if (!testDD001(fileName, bareName, new Integer(01), "WORK-AREAS", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "WS-POINTER", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(05), "WS-COUNT", dataNodes)) failCount++;
				if (!testDD001(fileName, bareName, new Integer(01), "SOME-DATA", dataNodes)) failCount++;
				break;
			default:
				LOGGER.info("NONE " + fileName);
				LOGGER.fine("NONE " + fileName + " test - no tests defined");
				break;
		}

		if (failCount == 0) rc = true;
		return rc;
	}

	public static Boolean testCall001(String fileName
						, String bareName
						, String callee
						, CallType ty
						, ArrayList<CallWrapper> calledNodes
						) {
		Boolean rc = false;

		if (calledNodes.size() == 1) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.size() != 1");
			LOGGER.fine(fileName + " calledNodes.size() = " + calledNodes.size());
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		if (rc && calledNodes.get(0).calledModuleNames.size() == 1) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.get(0).calledModuleNames.size() != 1");
			LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames.size() = " + calledNodes.get(0).calledModuleNames.size());
			LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames = " + calledNodes.get(0).calledModuleNames);
		} 

		if (rc) {
			rc = false;
			for (CallWrapper cw: calledNodes) {
				if (cw.includes(bareName, callee, ty)) {
					rc = true;
					break;
				}
			} 
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.includes(" + callee + ") == false");
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		return rc;
	}

	public static Boolean testCall001(String fileName
						, String bareName
						, String callee
						, CallType ty
						, ArrayList<CallWrapper> calledNodes
						, int count
						) {
		Boolean rc = false;

		if (calledNodes.size() == count) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.size() != " + count);
			LOGGER.fine(fileName + " calledNodes.size() = " + calledNodes.size());
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		if (rc && calledNodes.get(0).calledModuleNames.size() == 1) {
			rc = true;
		} else {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.get(0).calledModuleNames.size() != 1");
			LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames.size() = " + calledNodes.get(0).calledModuleNames.size());
			LOGGER.fine(fileName + " calledNodes.get(0).calledModuleNames = " + calledNodes.get(0).calledModuleNames);
		} 

		if (rc) {
			rc = false;
			for (CallWrapper cw: calledNodes) {
				if (cw.includes(bareName, callee, ty)) {
					rc = true;
					break;
				}
			} 
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - calledNodes.includes(" + callee + ") == false");
			LOGGER.fine(fileName + " calledNodes = " + calledNodes);
		} 

		return rc;
	}

	public static Boolean testDD001(String fileName
						, String bareName
						, Integer level
						, String identifier
						, ArrayList<DDNode> dataNodes) {
		Boolean rc = false;

		for (DDNode node: dataNodes) {
			if (node.level.equals(level) && node.identifier.equals(identifier)) {
				rc = true;
				LOGGER.fine(identifier + " node found");
				break;
			} else {
				LOGGER.fine(node.level + " != " + level + " || " + node.identifier + " != " + identifier);
			}
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - no dataNode found " + level + " " + identifier);
			LOGGER.fine("dataNodes = " + dataNodes);
		}

		return rc;
	}

	public static Boolean testDD002(String fileName
						, String bareName
						, Integer level
						, String identifier
						, ArrayList<DDNode> dataNodes
						, DataLocation locn) {
		Boolean rc = false;

		for (DDNode node: dataNodes) {
			if (node.level.equals(level) && node.identifier.equals(identifier) && node.locn == locn) {
				rc = true;
				LOGGER.fine(identifier + " node found");
				break;
			} else {
				LOGGER.finest(node.level + " != " + level + " || " + node.identifier + " != " + identifier + " || " + node.locn + " != " + locn);
			}
		}

		if (!rc) {
			LOGGER.info("FAIL " + fileName);
			LOGGER.fine("FAIL " + fileName + " test - no dataNode found " + level + " " + identifier + " " + locn);
			LOGGER.finest("dataNodes = " + dataNodes);
		}

		return rc;
	}

}
