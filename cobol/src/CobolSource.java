
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

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
	private ArrayList<AssignClause> assignClauses = new ArrayList<>();
	private ArrayList<CopyStatement> copyStatements = new ArrayList<>();
	private ArrayList<CallWrapper> calledNodes = new ArrayList<>();
	private Boolean isCobol = true;

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
		Boolean idDivFound = lookForIdDiv(currTempFile);
		if (!idDivFound) {
			LOGGER.info(sourceFileName + " not COBOL?");
			this.isCobol = false;
		} else {
			currTempFile = CLI.copyCompressingContinuations(currTempFile, baseDir, initFileNm);
			currTempFile = processCDS(currTempFile, baseDir, initFileNm);
			this.assembleDataNodeTree(currTempFile, getLib(sourceFileName));
		}
	}

	public Boolean isCobol() {
		return this.isCobol;
	}

	public ArrayList<CallWrapper> getCalledNodes() {
		return this.calledNodes;
	}

	public ArrayList<DDNode> getDataNodes() {
		return this.dataNodes;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	/**
	It turns out little is required of a COBOL program qua being a
	COBOL program other than the Identification Division.  So we look
	for that, and if absent we do not proceed.
	*/
	public Boolean lookForIdDiv(String initFileName) throws Exception {
		LOGGER.fine(this.myName + " lookForIdDiv()");
		CharStream cs = fromFileName(initFileName);  //load the file
		CobolPreprocessorLexer.testRig = false;
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

	/**
	Remove the troublesome columns 73 - 80 if they are present.
	*/
	public static String copyWithout73to80(
			String fileName
			, File baseDir
			, String initFileNm
			) throws IOException {
		LineNumberReader src = new LineNumberReader(new FileReader( new File(fileName)));
		File tmp = File.createTempFile("CallTree-" + initFileNm + "-without73to80-", "-cbl", baseDir);
		staticCLI.setPosixAttributes(tmp);
		if (staticCLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}

		PrintWriter out = new PrintWriter(tmp);
		List<String> list = Files.readAllLines(Paths.get(fileName));
		for (String line: list) {
			int length = line.length();
			String outLine = new String(line);
			if (length > 72) {
				outLine = line.substring(0, 72);
			}
			out.println(outLine);
		}
		out.close();
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

		return fileName;
	}
 
	public int countCopyCDS(ArrayList<CompilerDirectingStatement> compDirStmts) {
		int nbCopies = 0;
		for (CompilerDirectingStatement copy: compDirStmts) {
			if (copy.getType() == CompilerDirectingStatement.CompilerDirectingStatementType.STMT_COPY) {
				nbCopies++;
			}
		}

		return nbCopies;
	}

	@SuppressWarnings({"fallthrough"})
	public String processReplaceStatements(
			String aFileName
			, File baseDir
			, String initFileNm
			, ArrayList<CondCompVar> compOptDefines
			) throws Exception {
		LOGGER.fine(this.myName + " processReplaceStatements()");

		ArrayList<CompilerDirectingStatement> compDirStmts = new ArrayList<>();
		//String initFileNm = new File(aFileName).getName();
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

	public void lookForCompilerDirectingStatements(
			String fileName
			, ArrayList<CompilerDirectingStatement> compDirStmts
			, ArrayList<CondCompVar> compOptDefines
			) throws Exception {
		LOGGER.fine(this.myName + " lookForCompilerDirectingStatements");

		CharStream aCharStream = fromFileName(fileName);  //load the file
		CobolPreprocessorLexer.testRig = false;
		CobolPreprocessorLexer lexer = new CobolPreprocessorLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolPreprocessorParser parser = new CobolPreprocessorParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

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

	public ArrayList<CallWrapper> assembleDataNodeTree(
				String fileName
				, String aLib
				) throws IOException {
		LOGGER.fine(this.myName + " assembleDataNodeTree()");
		ArrayList<CallWrapper> calledNodes = new ArrayList<>();

		CharStream cs = fromFileName(fileName);  //load the file

		LOGGER.finer("lexing " + fileName);

		CobolLexer.testRig = false;
		CobolLexer lexer = new CobolLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens

		LOGGER.finer("parsing with CobolParser");

		CobolParser parser = new CobolParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree
		ParseTreeWalker walker = new ParseTreeWalker();

		DataDescriptionEntryListener listener = new DataDescriptionEntryListener(this.programs, this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		/*
		If an O1 level is GLOBAL or EXTERNAL it and all its children are visible
		to nested programs.

		I think I can get around this by implementing nested programs instead of
		simply trying to accomodate > 1 program in a source code member.

		for (CobolProgram pgm: this.programs) {
			for (DDNode ddNode: pgm.getDataNodes()) {
				if (ddNode.getLevel() == 1 && (ddNode.isGlobal() || ddNode.isExternal())) {
					if (!pgm.hasThisDDNode01(ddNode)) {
						pgm.adopt(ddNode);
					}
				}
			}
		}
		*/

		this.lookForCalledRoutines(tree, walker, aLib);
		this.resolveCalledNodes(tree, walker, calledNodes, dataNodes);

		return calledNodes;

	}

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

	private void resolveCalledNodes(ParseTree tree
						, ParseTreeWalker walker
						, ArrayList<CallWrapper> calledNodes
						, ArrayList<DDNode> dataNodes) {

		LOGGER.fine(this.myName + " resolveCalledNodes");
		ArrayList<DDNode> calledDataNodes = new ArrayList<>();

		for (CobolProgram pgm: this.programs) {
			pgm.resolveCalledNodes();
		}
		/*
		for (CallWrapper call: calledNodes) {
			LOGGER.finest("  call.identifier = " + call.identifier);
			if (call.identifier == null) {
			} else {
				calledDataNodes = new ArrayList<>();
				for (DDNode node: dataNodes) {
					if (node.parent == null) {
						calledDataNodes.addAll(node.findChildrenNamed(call.identifier));
					}
				}
				LOGGER.finest("  all node children named " + call.identifier + " = " + calledDataNodes);
				if (!call.selectDataNode(calledDataNodes)) {
					LOGGER.warning("!no data node selected");
				}
				LOGGER.finest("call.dataNode = " + call.dataNode);
			}
		}
		*/

		SetListener listener = new SetListener(programs, LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);
	}

	public void writeOn(PrintWriter out) throws IOException {
		out.printf(
			"FILE,%s,%s,%s\n"
			, this.getUUID().toString()
			, this.sourceFileName
			, this.initFileNm);

		for (CopyStatement cs: this.copyStatements) {
			cs.writeOn(out, this.getUUID());
		}

	}

	public String toString() {
		return this.sourceFileName;
	}
}
