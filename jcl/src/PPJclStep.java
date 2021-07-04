/*Copyright (C) 2019 - 2021 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL PPJob Step which is
used in PreProcessing to resolve parms and INCLUDEs.

<p>An instance of PPJclStep is meaningless without its containing PPJob or PPProc, 
which provide values for symbolics that may be present.

<p>A PPJclStep may execute a procedure, which may have its symbolics resolved by
values set by this PPJclStep.  The same procedure may be executed by several
different PPJclSteps in the same PPJob, all with different parameters.  So each
JclStep locates, parses, and provides any proc it executes its own collection
of PPSetSymbolValues for resolution.

<p>An unfortunate side effect of this class and its brethren being created
by an ANTLR listener class is that not all instance variables are known at
instantiation time, they must be added as they are encountered by the listener.


*/
public class PPJclStep {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private String fileName = null;
	private String procName = null;
	private String stepName = null;
	private int line = -1;
	/**
	Ordinal number of this step's "owning" PPJob in its file.
	*/
	private int jobOrdNb = 0;
	/**
	Ordinal number of this step within its "owning" PPJob or PPProc.
	*/
	private int ordNb = 0;
	private PPKeywordOrSymbolicWrapper procExecuted = null;
	private PPKeywordOrSymbolicWrapper pgmExecuted = null;
	private PPProc proc = null;
	private Boolean inProc = null;
	private JCLPPParser.JclStepContext jclStepCtx = null;
	private JCLPPParser.ExecStatementContext execStmtCtx = null;
	private JCLPPParser.ExecPgmStatementContext execPgmStmtCtx = null;
	private JCLPPParser.ExecProcStatementContext execProcStmtCtx = null;
	private List<JCLPPParser.DdStatementAmalgamationContext> ddStmtAmlgnCtxs = null;
	/**
	The collection setSym holds instances of PPSetSymbolValue representing
	parameters set on execution of a cataloged or instream procedure.
	*/
	private ArrayList<PPSetSymbolValue> setSym = new ArrayList<>();
	/**
	The collection incomingSetSym holds instances of PPSetSymbolValue
	representing parameters set by SET statements or other means prior
	to execution of this step.
	*/
	private ArrayList<PPSetSymbolValue> incomingSetSym = new ArrayList<>();
	private ArrayList<PPDdStatementAmalgamation> ddStatements = new ArrayList<>();
	private ArrayList<PPKeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private File baseDir = null;
	private File tmpProcDir = null;
	private PPJob parentJob = null;
	private PPProc parentProc = null;

	public PPJclStep(
			JCLPPParser.JclStepContext jclStepCtx
			, String fileName
			, PPProc parentProc
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.parentProc = parentProc;
		this.procName = parentProc.getProcName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.inProc = true;
		this.initialize();
		this.LOGGER.fine(this.myName + " " + this.stepName + " instantiated from " + this.fileName);
		this.LOGGER.finest(this.myName + " procExecuted = |" + this.procExecuted + "|");
	}

	public PPJclStep(
			JCLPPParser.JclStepContext jclStepCtx
			, String fileName
			, PPJob parentJob
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.parentJob = parentJob;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.inProc = false;
		this.initialize();
		this.LOGGER.fine(this.myName + " " + this.stepName + " instantiated from " + this.fileName);
		this.LOGGER.finest(this.myName + " procExecuted = |" + this.procExecuted + "|");
	}

	private void initialize() {
		this.execStmtCtx = this.jclStepCtx.execStatement();
		this.execPgmStmtCtx = this.execStmtCtx.execPgmStatement();
		this.execProcStmtCtx = this.execStmtCtx.execProcStatement();
		this.ddStmtAmlgnCtxs = this.jclStepCtx.ddStatementAmalgamation();
		
		if (this.isExecProc() && this.isExecPgm()) {
			this.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are not null");
		} else if (!this.isExecProc() && !this.isExecPgm()) {
			this.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are null");
		}

		if (this.isExecPgm()) {
			this.line = this.execPgmStmtCtx.EXEC().getSymbol().getLine();
			if (this.execPgmStmtCtx.stepName() == null) {
				this.stepName = "_NONAME_";
			} else {
				this.stepName = this.execPgmStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.pgmExecuted = 
				new PPKeywordOrSymbolicWrapper(
					this.execPgmStmtCtx.keywordOrSymbolic()
					, this.procName
					, this.LOGGER
					, this.CLI
					);
		} else {
			this.line = this.execProcStmtCtx.EXEC().getSymbol().getLine();
			if (this.execProcStmtCtx.stepName() == null) {
				this.stepName = "_NONAME_";
			} else {
				this.stepName = this.execProcStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.procExecuted = 
				new PPKeywordOrSymbolicWrapper(
					this.execProcStmtCtx.keywordOrSymbolic()
					, this.procName
					, this.LOGGER
					, this.CLI
					);
			for (JCLPPParser.ExecProcParmContext epp: this.execProcStmtCtx.execProcParm()) {
				this.setSym.add(
					new PPSetSymbolValue(
						epp
						, this.fileName
						, this.procName
						, this.getProcExecuted()
						, this.LOGGER
						, this.CLI
						)
					);
			}
		}

		if (this.ddStmtAmlgnCtxs == null) {
		} else {
			for (JCLPPParser.DdStatementAmalgamationContext d: this.ddStmtAmlgnCtxs) {
				this.ddStatements.add(
					new PPDdStatementAmalgamation(
						d
						, this.procName
						, this.fileName
						, this.LOGGER
						, this.CLI
						)
					);
			}
		}	
	}

	/**
	PPJob and PPProc use this method to set the working directories
	for the PPJclStep instances they "own."
	*/
	public void setTmpDirs(File baseDir, File tmpProcDir) {
		this.LOGGER.finer(
			this.myName 
			+ " " 
			+ this.stepName 
			+ " setTmpDirs(" 
			+ baseDir 
			+ "," 
			+ tmpProcDir 
			+ ")"
			);

		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(
				this.myName 
				+ " " 
				+ this.stepName 
				+ " setTmpDirs baseDir set to |" 
				+ this.baseDir 
				+ "|"
				);
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(
				this.myName 
				+ " " 
				+ this.stepName 
				+ " setTmpDirs tmpProcDir set to |" 
				+ this.tmpProcDir 
				+ "|"
				);
		}

	}

	public Boolean isExecProc() {
		return this.execProcStmtCtx != null;
	}

	public Boolean isExecPgm() {
		return this.execPgmStmtCtx != null;
	}

	public Boolean needsProc() {
		return this.isExecProc() && (this.proc == null);
	}

	public String getProcExecuted() {
		return this.procExecuted.getValue();
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public void setJobOrdNb(int jobOrdNb) {
		this.jobOrdNb = jobOrdNb;
	}

	public StringBuffer getResolvedSuffix() {
		StringBuffer sb = new StringBuffer();

		if (this.parentProc == null) {
			sb.append(this.parentJob.getResolvedSuffix());
		} else {
			sb.append(this.parentProc.getResolvedSuffix());
		}

		sb.append("-");
		sb.append(String.format("%06d", this.ordNb));
		return sb;
	}

	public PPProc getProc() {
		return this.proc;
	}

	public int getLine() {
		return this.line;
	}

	private int getFileNb() {
		if (this.parentJob == null) {
			return this.parentProc.getFileNb();
		} else {
			return this.parentJob.getFileNb();
		}
	}

	private Boolean hasUnattributedAsteriskData() {
		return this.jclStepCtx.ddParmASTERISK_DATA() != null
				&& this.jclStepCtx.ddParmASTERISK_DATA().size() > 0;
	}

	private Integer getAsteriskDataLine() {
		if (!this.hasUnattributedAsteriskData()) {
			throw new IllegalArgumentException(
				"this JCL step " + this.stepName
				+ " has no associated instream data");
		}

		return new Integer(
						this
						.jclStepCtx
						.ddParmASTERISK_DATA()
						.get(0)
						.DD_ASTERISK_DATA()
						.get(0)
						.getSymbol()
						.getLine());
	}

	public ArrayList<Integer> linesShouldBePrecededBySYSINDDSPLAT() {
		ArrayList<Integer> lines = new ArrayList<>();

		if (this.hasUnattributedAsteriskData()) {
			lines.add(this.getAsteriskDataLine());
		}

		for (PPDdStatementAmalgamation dda: this.ddStatements) {
			lines.addAll(dda.linesShouldBePrecededBySYSINDDSPLAT());
		}

		return lines;
	}

	public void setJcllib(ArrayList<PPKeywordOrSymbolicWrapper> jcllib) {
		this.jcllib = jcllib;
	}

	/**
	<code>searchProcPathsFor()</code> uses this in its search for PROCs 
	and INCLUDEs.
	*/
	private ArrayList<String> getJcllibStrings() {
		ArrayList<String> libs = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: jcllib) {
			libs.add(k.getValue());
		}

		return libs;
	}

	/**
	Used in symbolic substitution in PPJob and PPProc.
	*/
	public ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " collectSymbolics step = " + this.stepName);

		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		if (this.isExecPgm()) {
			symbolics.addAll(this.pgmExecuted.collectSymbolics());
		} else {
			symbolics.addAll(this.procExecuted.collectSymbolics());
		}

		for (PPDdStatementAmalgamation d: this.ddStatements) {
			symbolics.addAll(d.collectSymbolics());
		}

		return symbolics;
	}

	/**
	To the extent possible, resolve symbolic parameters to their values
	as indicated by corresponding PPSetSymbolValue instances.

	<p>PPSetSymbolValue come from SET statements and dynamic system symbols defined
	on the command line.

	<p>These symbolics are merged with the relevant symbolics (those whose 
	SET statement come before the step being processed) from this job.

	<p>The mergedSetSym are only created and used when executing a proc, and
	would be empty anyway if just executing a program.  We do have to take
	them into account when resolving DD statements as those are overrides or
	additions to the executed proc.

	<p>There is a great deal of delegation resulting from the relatively
	complex logic to resolve symbolics being encapsulated in the PPSymbolic 
	class.  PPSymbolic is contained in PPKeywordValueWrapper which is contained
	in PPKeywordOrSymbolicWrapper which may be contained in 
	PPSingleOrMultipleValueWrapper.
	*/
	public void resolveParms(ArrayList<PPSetSymbolValue> setSym) {
		this.LOGGER.finer(myName + " " + this.stepName + " resolveParms setSym = |" + setSym + "|");

		this.incomingSetSym.addAll(setSym);

		if (this.isExecPgm()) {
			this.pgmExecuted.resolveParms(setSym);
			for (PPDdStatementAmalgamation dda: ddStatements) {
				dda.resolveParms(setSym);
			}
		} else {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(setSym);
			mergedSetSym.addAll(this.setSym);
			this.procExecuted.resolveParms(this.incomingSetSym);
			for (PPDdStatementAmalgamation dda: ddStatements) {
				dda.resolveParms(mergedSetSym);
			}
		}
	}

	public void resolveProc() throws IOException {
		this.LOGGER.finer(this.myName + " " + this.stepName + " resolveProc ");

		if (this.needsProc()) {
			String aProcFile = this.searchProcPathsFor(this.getProcExecuted());
			if (aProcFile == null) {
				this.LOGGER.warning(this + " proc not found");
			} else {
				File aFileRewritten = rewriteWithoutCol72to80(aProcFile, tmpProcDir);
				ArrayList<PPProc> procs = new ArrayList<>();
				this.lexAndParse(procs, aFileRewritten.getPath());
				procs.get(0).setJcllib(this.jcllib);
				procs.get(0).setOrdNb(this.ordNb);
				procs.get(0).setJobOrdNb(this.jobOrdNb);
				procs.get(0).setParentJclStep(this);
				ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.incomingSetSym);
				mergedSetSym.addAll(this.setSym);
				this.proc = procs.get(0).iterativelyResolveIncludes(mergedSetSym, new File(aProcFile));
				this.proc.resolveParms(mergedSetSym);
				File finalProcFile = this.proc.rewriteWithParmsResolved();
				this.proc.resolveProcs();
			}

		}
	}

	/**
	This method rewrites a file without the troublesome columns 72 
	through 80.
	*/
	private File rewriteWithoutCol72to80(String aFileName, File baseDir) throws IOException {
		LOGGER.finer(
			this.myName 
			+ " rewriteWithoutCol72to80 aFileName = |"
			+ aFileName
			+ "| baseDir = |"
			+ baseDir
			+ "|"
			);

		ArrayList<Token> tokens = lex(aFileName);
		File aFile = new File(aFileName);
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(
			baseDir.toString() 
			+ File.separator 
			+ aFile.getName()
			+ "-" 
			+ UUID.randomUUID()
			);
		if (CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		Boolean addSplat = false;
		while ((inLine = src.readLine()) != null) {
			StringBuilder newLine = new StringBuilder(inLine);
			ArrayList<Token> onThisLine = new ArrayList<>();
			Token col72 = null;
			Token cmBefore72 = null;
			Token cmAfter72 = null;
			for (Token t: tokens) {
				if (t.getLine() == src.getLineNumber()) {
					onThisLine.add(t);
					if (t.getType() == JCLPPLexer.COMMENT_TEXT) {
						if (t.getText().trim().length() > 0) {
							if (t.getCharPositionInLine() < 71) {
								cmBefore72 = t;
							} else {
								cmAfter72 = t;
							}
						}
					}
					if (t.getType() == JCLPPLexer.COL_72) {
						col72 = t;
					}
				}
			}
			if (addSplat) {
				/*
				Note that the splat is added to the line _after_ the column 72
				comment continuation was found.
				*/
				newLine.setCharAt(2, '*');
			}
			if (onThisLine.size() > 0) {
				if (cmBefore72 != null && col72 != null) {
					/*
					Next line is a comment because this line has a comment
					_and_ a continuation indicator in column 72.
					*/
					addSplat = true;
				} else {
					addSplat = false;
				}
				if (cmAfter72 != null) {
					int start = cmAfter72.getCharPositionInLine();
					int end = start + cmAfter72.getText().length();
					String spaces = String.format("%1$"+ ((end - start) + 1) + "s", " ");
					newLine.replace(start, end, spaces);
				}
				if (col72 != null) {
					newLine.setCharAt(71, ' ');
				}
			}
			out.println(newLine.toString());
		}
		src.close();
		out.close();
		this.CLI.setPosixAttributes(tmp);
		return tmp;
	}

	public ArrayList<Token> lex(
					String fileName
					) throws IOException {
		LOGGER.fine(this.myName + " lex fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer.ckCol72 = true;
		JCLPPLexer lexer = new JCLPPLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream cmtokens = new CommonTokenStream(lexer, JCLPPLexer.COMMENTS); //scan stream for tokens
		ArrayList<Token> tokens = new ArrayList<>();
		while (cmtokens.LA(1) != CommonTokenStream.EOF) {
			if (cmtokens.LT(1).getType() == JCLPPLexer.COL_72 
			|| cmtokens.LT(1).getType() == JCLPPLexer.COMMENT_TEXT) {
				tokens.add(cmtokens.LT(1));
			}
			cmtokens.consume();
		}
		for (Token t: tokens) {
			LOGGER.fine(
				this.myName
				+ "token |" 
				+ t.getText()
				+ "| @ "
				+ t.getCharPositionInLine()
				+ " on "
				+ t.getLine()
				+ " of type "
				+ t.getType()
				);
		}

		return tokens;
	}

	public void lexAndParse(ArrayList<PPProc> procs, String fileName) throws IOException {
		this.LOGGER.finer(this.myName + " lexAndParse procs = |" + procs + "| fileName = |" + fileName + "|");

		CharStream cs = CharStreams.fromFileName(fileName);  //load the file
		JCLPPLexer lexer = new JCLPPLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		JCLPPParser parser = new JCLPPParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		PPListener listener = 
			new PPListener(
				null
				, procs
				, fileName
				, this.getFileNb()
				, this.baseDir
				, null
				, this.tmpProcDir
				, LOGGER
				, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	public UUID getUUID() {
		return this.uuid;
	}

	/**
	Search what corresponds to the libraries that JES would search for
	the passed file name.

	<p>The first location being searched is contrived - it's where the
	instream procs were written by PPJob.rewriteJobAndSeparateInstreamProcs().

	<p>The second set of locations are what correspond to the JCLLIB
	ORDER= libraries (if any were supplied).

	<p>The last set of locations are what correspond to the various PROCxx
	statements used at JES startup.

	<p>Processing continues if the passed file name cannot be found, but
	a warning is issued which should indicate the results will be incomplete.
	*/
	private String searchProcPathsFor(String fileName) throws IOException {
		File aFile = new File(this.tmpProcDir.getPath() + File.separator + fileName);

		this.LOGGER.finer(this.myName + " " + this.stepName + " searchProcPaths searching " + tmpProcDir);
		if (aFile.exists()) {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
			return aFile.getPath();
		} else {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() did not find " + aFile.getPath());
		}

		ArrayList<String> jcllib = this.getJcllibStrings();
		for (String lib: jcllib) {
			if (this.CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(this.CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
					return aFile.getPath();
				} else {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() did not find " + aFile.getPath());
				}
			}
		}

		for (String path: this.CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			this.LOGGER.finer(this.myName + " " + this.stepName + " searchProcPaths searching " + path);
			if (aFile.exists()) {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
				return aFile.getCanonicalPath();
			} else {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() did not find " + aFile.getPath());
			}
		}

		this.LOGGER.warning(this.myName + " searchProcPathsFor() did not find " + fileName);
		this.LOGGER.finer(
			this.myName 
			+ " searchProcPathsFor() searched for " 
			+ fileName
			+ " in "
			+ this.tmpProcDir
			+ " and "
			+ this.CLI.mappedProcPaths
			+ " and even "
			+ this.CLI.staticProcPaths
			+ " without success"
			);
		return null;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(this.myName);

		sb.append(" " + this.stepName);

		if (this.isExecProc()) {
			sb.append(" proc " + this.procExecuted.getValue());
		} else {
			sb.append(" pgm " + this.pgmExecuted.getValue());
		}

		return sb.toString();
	}
}
