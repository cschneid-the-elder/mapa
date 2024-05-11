
import java.util.*;
import java.time.*;
import java.time.format.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import org.antlr.v4.runtime.atn.*;

/**
This class represents a source file containing one or more COBOL
programs, each of which is represented by an instance of the
<code>CobolProgram</code> class.

<p>It is possible, though rare in the mainframe environment, to 
have a single source code member comprised of multiple COBOL
programs, each with its own Identification Division.  These might
be nested programs, possibly for performance reasons.

<p>The <code>dataNodes</code> and <code>calledNodes</code> are only
here to make the admittedly kludgy unit tests in TestIntegration work.

<p>Note that the <code>copyStatements</code> are kept here and not at
the <code>CobolProgram</code> level.  The rules for constructing the
COBOL code to be compiled from source are interesting, and state that
the source cannot be determined until after all COPY and REPLACE 
statements have been processed.  A COPY might bring in another program
in its entirety.

<p>Instantiating one of these is _expensive_.
*/
class CobolSource {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private static TheCLI staticCLI = null;
	private File baseDir = null; // keep all temp files contained here
	private String initFileNm = null;
	private String sourceFileName = null;
	private String currTempFile = null;
	private ArrayList<DDNode> dataNodes = new ArrayList<>();
	private ArrayList<CobolProgram> programs = new ArrayList<>();
	private ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();
	private ArrayList<CopyStatement> copyStatements = new ArrayList<>();
	private ArrayList<CallWrapper> calledNodes = new ArrayList<>();
	private BasisStatement basisStatement = null;
	private Boolean isCobol = true;
	private ArrayList<CondCompVar> finalCompOptDefines = new ArrayList<>();

	public CobolSource(
			String sourceFileName
			, File baseDir
			, Logger LOGGER
			, TheCLI CLI) throws Exception {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		if (CobolSource.staticCLI == null) {
			CobolSource.staticCLI = CLI;
		}
		this.baseDir = baseDir;
		this.sourceFileName = sourceFileName;
		this.initFileNm = new File(sourceFileName).getName();

		currTempFile = CobolSource.copyWithout73to80(sourceFileName, baseDir, initFileNm);
		this.lookForBasis(currTempFile);
		if (this.basisStatement != null) {
			String dir = new File(sourceFileName).getAbsoluteFile().getParent();
			currTempFile = this.basisStatement.mergeWithSource(initFileNm, currTempFile, baseDir, dir);
		}
		Boolean idDivFound = lookForIdDiv(currTempFile);
		if (!idDivFound) {
			LOGGER.info(sourceFileName + " not COBOL?");
			this.isCobol = false;
		} else {
			currTempFile = CLI.copyCompressingContinuations(currTempFile, baseDir, initFileNm);
			currTempFile = processCDS(currTempFile, baseDir, initFileNm);
			Boolean exceptionFound = false;
			ParseTree tree = null;
			try {
				tree = this.lookForCobolPrograms(currTempFile);
			} catch (Exception e) {
				LOGGER.severe("Exception " + e + " encountered");
				e.printStackTrace();
				exceptionFound = true;
			}
			if (!exceptionFound) {
				this.assembleDataNodeTree(tree, currTempFile, getLib(sourceFileName));
			}
		}
	}

	public Boolean isCobol() {
		return this.isCobol;
	}

	public ArrayList<CobolProgram> getPrograms() {
		return this.programs;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	private void lookForBasis(String initFileName) throws Exception {
		LOGGER.fine(this.myName + " lookForBasis()");

		CharStream cs = fromFileName(initFileName);  //load the file
		//CobolPreprocessorLexer.testRig = false;
		CobolPreprocessorLexer.nistTest = this.CLI.nistTest;
		CobolPreprocessorLexer.freeForm = false;  //BASIS seems to require fixed format
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens	
		parser.removeErrorListeners(); //that this is COBOL is not yet established

		if (this.CLI.profile) {
			parser.setProfile(true);
		}

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		if (this.CLI.profile) {
			this.profileParser(parser, "lookForBasis");
		}
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		BasisListener listener = new BasisListener(this.LOGGER, this.CLI);
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

		this.basisStatement = listener.basisStatement;
	}

	/**
	It turns out little is required of a COBOL program qua being a
	COBOL program other than the Identification Division.  So we look
	for that, and if absent we do not proceed.
	*/
	public Boolean lookForIdDiv(String initFileName) throws Exception {
		LOGGER.fine(this.myName + " lookForIdDiv()");
		CharStream cs = fromFileName(initFileName);  //load the file
		//CobolPreprocessorLexer.testRig = false;
		CobolPreprocessorLexer.nistTest = this.CLI.nistTest;
		CobolPreprocessorLexer.freeForm = this.CLI.freeForm;
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens	
		parser.removeErrorListeners(); //that this is COBOL is not yet established

		if (this.CLI.profile) {
			parser.setProfile(true);
		}

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		if (this.CLI.profile) {
			this.profileParser(parser, "lookForIdDiv");
		}
		
		ParseTreeWalker walker = new ParseTreeWalker();
	
		IdDivListener listener = new IdDivListener();
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

		return listener.idDivFound;
		
	}

	/**
	Remove the troublesome columns 73 - 80 if they are present.

	<p>I was never able to find a way in the lexer grammar to simply and
	easily ignore these columns.  So I just get rid of them.

	<p><code>java.nio.charset.MalformedInputException: Input length = 1</code>
	means I had to add the <code>,Charset.forName("ISO-8859-1")</code> to
	<code>Files.readAllLines()</code>.  I'm not happy about it.
	*/
	public static String copyWithout73to80(
			String fileName
			, File baseDir
			, String initFileNm
			) throws IOException {

		TestIntegration.LOGGER.fine(
			"CobolSource copyWithout73to80("
			+ fileName
			+ ", "
			+ baseDir
			+ ", "
			+ initFileNm
			+ ")"
			);
		ArrayList<CompilerDirectiveSource> cdSourceList = null;
		CharStream cs = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer.nistTest = TestIntegration.CLI.nistTest;
		CobolPreprocessorLexer.freeForm = TestIntegration.CLI.freeForm;
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens	
		parser.removeErrorListeners(); //that this is COBOL is not yet established
		ParseTree tree = parser.startRule(); // parse the content and get the tree
		ParseTreeWalker walker = new ParseTreeWalker();
		CompilerDirectiveSourceListener listener = 
			new CompilerDirectiveSourceListener(TestIntegration.LOGGER, TestIntegration.CLI);
		walker.walk(listener, tree);
		cdSourceList = listener.compilerDirectiveSourceStatements;
		
		File tmp = File.createTempFile("CallTree-" + initFileNm + "-without73to80-", "-cbl", baseDir);
		staticCLI.setPosixAttributes(tmp);
		if (staticCLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);
		List<String> list = Files.readAllLines(Paths.get(fileName), Charset.forName("ISO-8859-1"));
		int lineNb = 0;
		int cdNb = 0;
		CompilerDirectiveSource cds = null;
		if (cdSourceList.size() > 0) {
			cds = cdSourceList.get(cdNb);
		}
		for (String line: list) {
			lineNb++;
			int length = line.length();
			String outLine = new String(line);
			if (cds == null && TestIntegration.CLI.freeForm) {
				//do nothing
			} else if (cds != null) {
				if (lineNb > cds.getLastLine()) {
					// lastLine is set to Integer.MAX_VALUE in the last cds in cdSourceList
					cdNb++;
					cds = cdSourceList.get(cdNb);
				}
				TestIntegration.LOGGER.finer("lineNb = " + lineNb + " cds = " + cds);
				if (lineNb >= cds.getStartLine() && lineNb <= cds.getLastLine()) {
					if (cds.isFixed()) {
						if (length > 72) {
							outLine = line.substring(0, 72);
						}
					}
				}
			} else if (!TestIntegration.CLI.freeForm) {
				if (length > 72) {
					outLine = line.substring(0, 72);
				}
			}
			out.println(outLine);
		}
		out.close();

		/*		
		File tmp = File.createTempFile("CallTree-" + initFileNm + "-copy-", "-cbl", baseDir);
		staticCLI.setPosixAttributes(tmp);
		if (staticCLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		Path source = Paths.get(fileName);
		Path target = Paths.get(tmp.getAbsolutePath());
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		*/
		return tmp.getAbsolutePath();

	}

	/**
	The intent here is to return the last directory in the path to the
	file named in the argument, on the theory that the path is named
	for the library in which the file originally resided.

	<p>If the file is /home/cschneid/cobol/PROD.PAYROLL.SOURCE/UPDATE then
	this method should return "PROD.PAYROLL.SOURCE".
	*/
	public String getLib(String aFileName) {
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

	/**
	Return the compiler directing statement on the indicated line,
	if there is one.  If not, return null.

	<p>This method makes the logic in <code>processCDS()</code> below
	just a <i>bit</i> easier to read.
	*/
	public static CompilerDirectingStatement cdsInList(
			int line
			, ArrayList<CompilerDirectingStatement> compDirStmts) {
		for (CompilerDirectingStatement cds: compDirStmts) {
			if (line == cds.getLine()) return cds;
		}

		return null;
	}

	/**
	This is an interpreter for Compiler Directing Statements, and thus is
	a bit strange.  And long.  Because there is a state machine therein.

	<p>The general ugliness herein is contributed to by the fact that the
	input file is being rewritten as the compiler directing statements
	it contains are being interpreted.

	<p>The idea is to iteratively process the input file, which may contain
	compiler directing statements, and the compiler directing statements may
	optionally include COPY statements which may in turn insert code which
	includes more compiler directing statements.

	<p>So, given...
	<code>
	       PROCESS DEFINE(A=B'1'),DEFINE(B=B'0')
	       ID Division.
	       Program-ID. test9009.
	       Procedure Division.
	           >>IF A
	           CALL 'PGM0001A'
	           >>END-IF
	
	           >>IF B
	           CALL 'PGM0001B'
	           >>END-IF
	
	           >>DEFINE A B'0' OVERRIDE
	           >>DEFINE B B'1' OVERRIDE
	
	           >>IF A
	           CALL 'PGM0001C'
	           >>END-IF
	
	           >>IF B
	           CALL 'PGM0001D'
	           >>END-IF
	
	           >>DEFINE A AS PARAMETER
	           >>DEFINE B AS PARAMETER
	
	           >>IF A
	           CALL 'PGM0001E'
	           >>END-IF
	
	           >>IF B
	           CALL 'PGM0001F'
	           >>END-IF
	
	           >>IF A
	           COPY test9009.cpy.
	           >>END-IF
	
	           >>IF B
	           CALL 'PGM0001G'
	           >>END-IF
	
	           >>DEFINE B AS PARAMETER
	
	           >>IF B
	           CALL 'PGM0001H'
	           >>END-IF
	
	           GOBACK.
	</code>
	<p>...where test9009.cpy contains...
	<code>
	           >>DEFINE B B'1' OVERRIDE
	</code>
	<p>...you can see that test9009.cpy contains a compiler directing
	statement that must be parsed and interpreted but it hasn't been
	because it wasn't in the original input stream.

	<p>Thus the iterative nature of the algorithm.  Parse, rewrite and
	interpret, if a COPY statement is encountered then process it and just
	rewrite the rest of the file from that point on and go back to the 
	beginning and parse, rewrite, interpret.  Iterate until there are no
	more COPY statements.
	*/
	@SuppressWarnings({"fallthrough"})
	public String processCDS(
			String aFileName
			, File baseDir
			, String initFileNm
			) throws Exception {
		LOGGER.fine(this.myName + " processCDS()");

		ArrayList<CondCompVar> compOptDefines = new ArrayList<>(CLI.compOptDefines);
		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();
		String fileName = initFileNm;
		Boolean done = false;
		int nbCopies = 0;
		int sanityCheck = 0;
		int iteration = 0;

		lookForCompilerDirectingStatements(
						aFileName
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
			Boolean butDontWriteThisOne = false;
			ArrayDeque<Boolean> truthiness = new ArrayDeque<>();
			ArrayDeque<ArrayList<Boolean>> whenStrewth = new ArrayDeque<>();

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
								this.copyStatements.add((CopyStatement)cds);
								((CopyStatement)cds).apply(src, out, inLineSB.toString());
								justWriteTheRest = true;
								butDontWriteThisOne = true;
							} else {
								if (inLineSB.length() > 6) {
									inLineSB.setCharAt(6, '*');
								}
							}
							inLine = inLineSB.toString();
							break;
						case STMT_REPLACE:
							break;
						case STMT_REPLACE_OFF:
							break;
						default:
							break;
					}
				}
				if (butDontWriteThisOne) {
					LOGGER.finest("not writing |" + inLine + "| as it has been processed by a COPY statement");
					butDontWriteThisOne = false;
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

		fileName = processReplaceStatements(fileName, baseDir, initFileNm, compOptDefines);
		this.finalCompOptDefines = compOptDefines;

		return fileName;
	}
 
	/**
	Return the number of COPY statements found in the latest parse.

	<p>This method makes the logic in <code>processCDS()</code> above
	just a <i>bit</i> easier to read.
	*/
	public int countCopyCDS(ArrayList<CompilerDirectingStatement> compDirStmts) {
		int nbCopies = 0;
		for (CompilerDirectingStatement copy: compDirStmts) {
			if (copy.getType() == CompilerDirectingStatement.CompilerDirectingStatementType.STMT_COPY) {
				nbCopies++;
			}
		}

		return nbCopies;
	}

	/**
	IBM's documentation is quite clear that REPLACE statements are not
	processed until after all COPY statements have been resolved.  So
	this method includes a similar but not identical state machine to
	the <code>processCDS()</code> method for
	interpreting compiler directing statements to determine which, if
	any, of the REPLACE statements are enabled and should be applied
	to the source.

	<p>The source is again rewritten with the REPLACE statements applied.
	*/
	@SuppressWarnings({"fallthrough"})
	public String processReplaceStatements(
			String aFileName
			, File baseDir
			, String initFileNm
			, ArrayList<CondCompVar> compOptDefines
			) throws Exception {
		LOGGER.fine(this.myName + " processReplaceStatements()");

		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();
		String fileName = initFileNm;

		lookForCompilerDirectingStatements(
						aFileName
						, compDirStmts
						, compOptDefines);

		ArrayDeque<Boolean> truthiness = new ArrayDeque<>();
		ArrayDeque<ArrayList<Boolean>> whenStrewth = new ArrayDeque<>();
		ArrayList<ReplaceStatement> replaceStatements = new ArrayList<>();
		ArrayList<ReplaceOffStatement> replaceOffStatements = new ArrayList<>();

		for (CompilerDirectingStatement cds: compDirStmts) {
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
					throw new IllegalArgumentException("COPY statement found where it shouldn't be");
				case STMT_REPLACE:
					if (truthiness.peek() == null || truthiness.peek()) {
						((ReplaceStatement)cds).setEnabled(true);
						replaceStatements.add((ReplaceStatement)cds);
					}
					break;
				case STMT_REPLACE_OFF:
					if (truthiness.peek() == null || truthiness.peek()) {
						((ReplaceOffStatement)cds).setEnabled(true);
						replaceOffStatements.add((ReplaceOffStatement)cds);
					}
					break;
				default:
					break;
			}
		}

		if (replaceStatements.size() == 0 && replaceOffStatements.size() == 0) {
			LOGGER.finest(
				"replaceStatements.size() == " 
				+ replaceStatements.size()
				+ "replaceOffStatements.size() == " 
				+ replaceOffStatements.size()
				);
			return aFileName;
		}

		for (ReplaceStatement rs: replaceStatements) rs.setStopLine();

		ArrayList<TerminalNodeWrapper> tnwList = null;
		tnwList = CLI.lookForTerminalNodes(aFileName);
		CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes = new CopyOnWriteArrayList<>(tnwList);

		for (ReplaceStatement rs: replaceStatements) {
			rs.apply(sourceNodes);
		}

		for (ReplaceOffStatement ros: replaceOffStatements) {
			ros.apply(sourceNodes);
		}

		File tmp = File.createTempFile("CallTree-" + initFileNm + "-withreplacingapplied-", "-cbl", baseDir);
		CLI.setPosixAttributes(tmp);
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);

		StringBuilder outLine = CopyReplaceParent.createStringBuilderFromTerminalNodeWrappers(sourceNodes);

		out.println(outLine);
		out.close();

		return tmp.getPath();
	}

	/**
	Parse the input and find all the compiler directing statements.  

	<p>Note that
	this must also take into account any additional DEFINE statements provided
	on the command line to this application - those are in <code>compOptDefines</code>.

	<p>Also note that this is the preprocesser lexer and parser.
	*/
	public void lookForCompilerDirectingStatements(
			String fileName
			, ArrayList<CompilerDirectingStatement> compDirStmts
			, ArrayList<CondCompVar> compOptDefines
			) throws Exception {
		LOGGER.fine(this.myName + " lookForCompilerDirectingStatements");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		//CobolPreprocessorLexer.testRig = false;
		CobolPreprocessorLexer.nistTest = this.CLI.nistTest;
		CobolPreprocessorLexer.freeForm = this.CLI.freeForm;
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		if (this.CLI.profile) {
			parser.setProfile(true);
		}

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		if (this.CLI.profile) {
			this.profileParser(parser, "lookForCompilerDirectingStatements");
		}

		ParseTreeWalker walker = new ParseTreeWalker();

		CompilerDirectingStatementListener listener = 
			new CompilerDirectingStatementListener(compDirStmts, compOptDefines, this.LOGGER, this.CLI);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		LOGGER.finest("compDirStmts: " + compDirStmts);
		LOGGER.finest("compOptDefines: " + compOptDefines);

	}

	/**
	Return the name of a temporary file containing the source (as preprocessed
	up to this point) without any compile options (PROCESS or CBL statements).
	*/
	public String rewriteWithoutCompileOptionsStatements(
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

	/**
	Parse the input and find all COBOL programs contained therein.

	<p>Note that this is where instances of CobolProgram are created.

	<p>Also note that this is no longer the preprocessor lexer and parser.
	*/
	public ParseTree lookForCobolPrograms(
				String fileName
				) throws IOException {
		LOGGER.fine(this.myName + " lookForCobolPrograms()");

		CharStream cs = fromFileName(fileName);  //load the file

		LOGGER.finer("lexing " + fileName);

		CobolLexer.testRig = false;
		CobolLexer.nistTest = this.CLI.nistTest;
		CobolLexer.freeForm = this.CLI.freeForm;
		CobolLexer lexer = new CobolLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens

		LOGGER.finer("parsing with CobolParser");

		CobolParser parser = new CobolParser(tokens);  //parse the tokens

		if (this.CLI.profile) {
			parser.setProfile(true);
		}

		/*
		This may throw an exception, which is caught in the caller.  In that case
		we just bail because a parsing error occurred.
		*/
		ParseTree tree = parser.startRule(); // parse the content and get the tree

		if (this.CLI.profile) {
			this.profileParser(parser, "lookForCobolPrograms");
		}

		ParseTreeWalker walker = new ParseTreeWalker();

		ProgramListener listener = new ProgramListener(this.programs, this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		return tree;
	}

	/**
	The <code>DataDescriptionEntryListener</code> creates instances of DDNode which
	describe the data identifiers in each <code>CobolProgram</code>.

	<p>Note that the input hasn't changed, so the parse tree hasn't changed, and thus
	the input does not need to be parsed again.
	*/
	public void assembleDataNodeTree(
				ParseTree tree
				, String fileName
				, String aLib
				) throws IOException {
		LOGGER.fine(
			this.myName 
			+ " assembleDataNodeTree("
			+ tree
			+ ", "
			+ fileName
			+ ", "
			+ aLib
			+ ")");
		ArrayList<CallWrapper> calledNodes = new ArrayList<>();

		ParseTreeWalker walker = new ParseTreeWalker();

		DataDescriptionEntryListener listener = 
			new DataDescriptionEntryListener(this.programs, this.LOGGER, this.finalCompOptDefines);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		this.lookForCalledRoutines(tree, walker, aLib);
		this.resolveCalledNodes();
	}

	/**
	The <code>CallEtAlListener</code> creates instances of CallWrapper which
	describe the different sorts of CALLs in each <code>CobolProgram</code>.

	<p>Note that the input hasn't changed, so the parse tree hasn't changed, and thus
	the input does not need to be parsed again.
	*/
	private void lookForCalledRoutines(ParseTree tree
					, ParseTreeWalker walker
					, String aLib) {
		LOGGER.fine(this.myName + " lookForCalledRoutines()");
		ArrayList<CallWrapper> calledNodes = new ArrayList<>();
		CallEtAlListener listener = 
			new CallEtAlListener(
					this.programs
					, aLib
					, this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		LOGGER.finest("tree = " + tree);

		walker.walk(listener, tree);

		LOGGER.finest("programs: " + this.programs);
	}

	/**
	Instruct each <code>CobolProgram</code> to resolve its called programs.

	<p>For each CALL statement that references DDNode, the values that are
	assigned to that DDNode, via MOVE or SET statements, are determined.
	*/
	private void resolveCalledNodes() {

		LOGGER.fine(this.myName + " resolveCalledNodes");

		for (CobolProgram pgm: this.programs) {
			pgm.resolveCalledNodes();
			pgm.resolveCICSStatementIdentifiers();
		}
	}

	public void profileParser(CobolPreprocessorParser parser, String header) {
		DecisionInfo[] decisionsInfo = parser.getParseInfo().getDecisionInfo();

		this.LOGGER.fine(header);
		String header2 = String.format(
			"%35s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s"
			, "ruleName"
			, "timeInPred"
			, "invocations"
			, "SLL_TotalLook"
			, "SLL_MaxLook"
			, "ambiguities"
			, "LL_TotalLook"
			, "LL_MaxLook"
			, "contextSensitiv"
			, "predicateEvals"
			, "errors"
			);
		this.LOGGER.fine(header2);

		for (DecisionInfo di: decisionsInfo) {
			DecisionState ds = parser.getATN().getDecisionState(di.decision);
			String ruleName = CobolPreprocessorParser.ruleNames[ds.ruleIndex];
			if (di.timeInPrediction > 0) {
				String detail = String.format(
					"%35s %15d %15d %15d %15d %15d %15d %15d %15d %15d %15d"
					, ruleName
					, di.timeInPrediction
					, di.invocations
					, di.SLL_TotalLook
					, di.SLL_MaxLook
					, di.ambiguities.size()
					, di.LL_TotalLook
					, di.LL_MaxLook
					, di.contextSensitivities.size()
					, di.predicateEvals.size()
					, di.errors.size()
					);
				this.LOGGER.fine(detail);
			}
		}
	}

	public void profileParser(CobolParser parser, String header) {
		DecisionInfo[] decisionsInfo = parser.getParseInfo().getDecisionInfo();

		this.LOGGER.fine(header);
		String header2 = String.format(
			"%35s %15s %15s %15s %15s %15s %15s %15s %15s %15s %15s"
			, "ruleName"
			, "timeInPred"
			, "invocations"
			, "SLL_TotalLook"
			, "SLL_MaxLook"
			, "ambiguities"
			, "LL_TotalLook"
			, "LL_MaxLook"
			, "contextSensitiv"
			, "predicateEvals"
			, "errors"
			);
		this.LOGGER.fine(header2);

		for (DecisionInfo di: decisionsInfo) {
			DecisionState ds = parser.getATN().getDecisionState(di.decision);
			String ruleName = CobolParser.ruleNames[ds.ruleIndex];
			if (di.timeInPrediction > 0) {
				String detail = String.format(
					"%35s %15d %15d %15d %15d %15d %15d %15d %15d %15d %15d"
					, ruleName
					, di.timeInPrediction
					, di.invocations
					, di.SLL_TotalLook
					, di.SLL_MaxLook
					, di.ambiguities.size()
					, di.LL_TotalLook
					, di.LL_MaxLook
					, di.contextSensitivities.size()
					, di.predicateEvals.size()
					, di.errors.size()
					);
				this.LOGGER.fine(detail);
			}
		}
	}

	/**
	Output is produced here.  Each CobolSource instance can be asked
	to produce a report of data of interest to be written on the 
	passed PrintWriter.
	*/
	public void writeOn(PrintWriter out) throws IOException {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
		String dateTimeStamp = LocalDateTime.now().format(df).toString();

		out.printf(
			"FILE,%s,%s,%s\n"
			, this.getUUID().toString()
			, this.sourceFileName
			, dateTimeStamp);

		if (basisStatement != null) {
			basisStatement.writeOn(out, this.getUUID());
		}

		for (CopyStatement cs: this.copyStatements) {
			cs.writeOn(out, this.getUUID());
		}

		for (CobolProgram pgm: this.programs) {
			pgm.writeOn(out, this.getUUID());
		}

	}

	public String toString() {
		return this.sourceFileName;
	}
}
