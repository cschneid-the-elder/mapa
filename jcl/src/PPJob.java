/*Copyright (C) 2019 - 2021 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL PPJob which is used in PreProcessing to 
resolve parms and INCLUDEs.

<p>The tricky bit of parsing JCL is that you must do it iteratively.  INCLUDEs 
may be nested and may contain SET statements for symbolics.  On most (all?) 
JCL statements, everything beyond the operation (JOB, EXEC, DD, etc.) can 
consist of parameters only, thus...
<p>
<code>
<br>// INCLUDE MEMBER=ASET
<br>//*
<br>//STEP01   EXEC &MYEXEC
<br>//SYSUT1   DD  &SYS1DISP,
<br>//             &SYS1DSN
<br>//SYSUT2   DD  &SYS2DISP,
<br>//             &SYS2DSN
</code>
<p>...is perfectly legal so long as values for these symbolics are provided.  So 
ASET may contain a SET for one or more of these symbolics, followed by an 
INCLUDE MEMBER=BSET which contains SETs for those same symbolics, overriding 
those in ASET.  And the member being INCLUDEd may be parameterized.

<p>Code is included to iteratively resolve INCLUDE statements by resolving 
symbolics to the extent known, rewrite the JCL, and then to re-lex-and-parse 
the rewritten JCL, continuing until all INCLUDEs are resolved or the only
remaining INCLUDEs cannot be resolved.

<p>This is accomplished via two separate grammars, one used by the preprocessing 
code to resolve symbolics and INCLUDEs, the other to lex and parse the 
resulting JCL.

<p>An unfortunate side effect of this class and its brethren being created
by an ANTLR listener class is that not all instance variables are known at
instantiation time, they must be added as they are encountered by the listener.

*/
public class PPJob {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private JCLPPParser.JobCardContext jobCardCtx = null;
	/**
	The jcllibCtx variable is used in setting the value(s) in the jcllib
	variable.  It is preserved because it may be useful for other purposes
	as yet undreamt of.
	*/
	private JCLPPParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<PPKeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<PPProc> procs  = new ArrayList<>();
	private ArrayList<PPSetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<PPIncludeStatement> includes = new ArrayList<>();
	private ArrayList<PPJclStep> steps = new ArrayList<>();
	private ArrayList<PPSymbolic> sym = new ArrayList<>();
	/**
	PPOp is a generic representation of most JCL statements that are
	not needed in preprocessing other than for resolving INCLUDEs and 
	symbolics;  The primary function of PPOp is to hold symbolics that must be
	iteratively resolved as the JCL is rewritten. 
	*/
	private ArrayList<PPOp> op = new ArrayList<>();
	private String fileName = null;
	private String jobName = null;
	private int startLine = -1;
	private int endLine = -1;
	private int ordNb = 0;
	private int fileNb = 0;
	private int nbSteps = 0;
	private File baseDir = null;
	private File tmpJobDir = null;
	private File tmpProcDir = null;

	/**
	Constructor for use by PPListener as this PPJob is initially parsed.
	*/
	public PPJob(
			JCLPPParser.JobCardContext ctx
			, String fileName
			, int ordNb
			, int fileNb
			, File baseDir
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.ordNb = ordNb;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		this.setTmpDirs(baseDir);
		this.LOGGER.fine(
			this.myName 
			+ " " 
			+ this.jobName 
			+ " instantiated from " 
			+ this.fileName
			);
	}

	/**
	Constructor for use by PPListener as this job is iteratively parsed.
	*/
	public PPJob(
			JCLPPParser.JobCardContext ctx
			, String fileName
			, int ordNb
			, int fileNb
			, File baseDir
			, File tmpJobDir
			, File tmpProcDir
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.jobCardCtx = ctx;
		this.fileName = fileName;
		this.ordNb = ordNb;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		this.setTmpDirs(baseDir, tmpJobDir, tmpProcDir);
		this.LOGGER.fine(
			this.myName 
			+ " " 
			+ this.jobName 
			+ " instantiated from " 
			+ this.fileName
			);
	}

	private void initialize() {
		this.startLine = this.jobCardCtx.JOB().getSymbol().getLine();
		this.jobName = this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getText();
	}

	/**
	Used by listeners constructing instances of PPJob.

	<p>Note that a JCLLIB statement is optional, and if absent then
	the path(s) to search for INCLUDEs and PROCs must be set via (in
	this case) the CLI.
	*/
	public void addJcllib(JCLPPParser.JcllibStatementContext ctx) {
		this.LOGGER.fine(
			this.myName 
			+ " addJcllib jobName = |" 
			+ this.jobName
			+ "|"
			);

		this.jcllibCtx = ctx;

		/*
		Handle single entry non-parenthesized JCLLIB...
		// JCLLIB ORDER=SIKOZU
		*/
		ArrayList<JCLPPParser.KeywordOrSymbolicContext> kywdCtxList = new ArrayList<>();
		if (ctx.singleOrMultipleValue() == null) {
			// it turns out these are optional
		} else {
			if (ctx.singleOrMultipleValue().keywordOrSymbolic() == null) {
			} else {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib ctx.singleOrMultipleValue().keywordOrSymbolic() = |" 
					+ ctx.singleOrMultipleValue().keywordOrSymbolic()
					+ "|"
					);
				kywdCtxList.addAll(ctx.singleOrMultipleValue().keywordOrSymbolic());
			}
		}

		if (ctx.singleOrMultipleValue() == null) {
		} else {
			if (ctx.singleOrMultipleValue().parenList() == null) {
			} else {
				/*
				Handle parenthesized JCLLIB
				// JCLLIB ORDER=(SIKOZU)
				...or...
				// JCLLIB ORDER=(SIKOZU,JOOL)
				*/
				for (JCLPPParser.ParenListContext p: ctx.singleOrMultipleValue().parenList()) {
					kywdCtxList.addAll(p.keywordOrSymbolic());
				}
			}
		}

		if (ctx.keywordOrSymbolic() == null) {
		} else {
			/*
			Handle any extant PROCLIB parameters
			*/
			kywdCtxList.addAll(ctx.keywordOrSymbolic());
		}

		for (JCLPPParser.KeywordOrSymbolicContext k: kywdCtxList) {
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k = |" 
				+ k
				+ "|"
				);
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k.KEYWORD_VALUE() = |" 
				+ k.KEYWORD_VALUE()
				+ "|"
				);
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k.SYMBOLIC() = |" 
				+ k.SYMBOLIC()
				+ "|"
				);
			this.LOGGER.finest(
				this.myName 
				+ " addJcllib kywdCtxList k.QUOTED_STRING_FRAGMENT() = |" 
				+ k.QUOTED_STRING_FRAGMENT()
				+ "|"
				);
			for (TerminalNode t: k.KEYWORD_VALUE()) {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib kywdCtxList KEYWORD_VALUE() t.getSymbol().getText() = |" 
					+ t.getSymbol().getText()
					+ "|"
					);
			}
			for (TerminalNode t: k.SYMBOLIC()) {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib kywdCtxList SYMBOLIC() t.getSymbol().getText() + |" 
					+ t.getSymbol().getText()
					+ "|"
					);
			}
			for (TerminalNode t: k.QUOTED_STRING_FRAGMENT()) {
				this.LOGGER.finest(
					this.myName 
					+ " addJcllib kywdCtxList QUOTED_STRING_FRAGMENT() t.getSymbol().getText() = |" 
					+ t.getSymbol().getText()
					+ "|"
					);
			}
		}

		this.jcllib.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList, this.LOGGER, this.CLI));
	}

	/**
	Used by listeners to set the end line of this PPJob. A file can
	contain more than one JOB statement.
	*/
	public void setEndLine(int aLine) {
		this.LOGGER.finest(this.myName + " setEndLine(" + aLine + ")");
		this.endLine = aLine;
	}

	private void setTmpDirs(File baseDir) {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpJobDir == null) {
			this.tmpJobDir = this.newTempDir(baseDir, this.myName + "-" + this.getJobName() + "-", this.CLI.saveTemp);
			this.LOGGER.finest(this.myName + " setTmpDirs tmpJobDir set to |" + this.tmpJobDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = this.newTempDir(baseDir, this.myName + "-" + this.getJobName() + "-instreamprocs-", this.CLI.saveTemp);
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
	}

	private void setTmpDirs(File baseDir, File tmpJobDir, File tmpProcDir) {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + "," + tmpJobDir + "," + tmpProcDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpJobDir == null) {
			this.tmpJobDir = tmpJobDir;
			this.LOGGER.finest(this.myName + " setTmpDirs tmpJobDir set to |" + this.tmpJobDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
	}

	/**
	Used by listeners to add instream procs encountered to this "owning" job.
	*/
	public void addInstreamProc(PPProc iProc) {
		this.procs.add(iProc);
	}

	/**
	Used by listeners to add SET statements to this "owning" job.
	*/
	public void addSetSym(PPSetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	/**
	Used by listeners to add INCLUDE statements encountered to this "owning" job.
	*/
	public void addInclude(PPIncludeStatement include) {
		this.includes.add(include);
	}

	/**
	Used by listeners to add JCL steps encountered to this "owning" job.
	*/
	public void addJclStep(PPJclStep step) {
		this.nbSteps++;
		step.setOrdNb(this.nbSteps);
		step.setJobOrdNb(this.ordNb);
		this.steps.add(step);
		step.setJcllib(this.jcllib);
		step.setTmpDirs(this.baseDir, this.tmpProcDir);
	}

	/**
	Used by listeners to add generic JCL operations encountered to this "owning" job.
	*/
	public void addOp(PPOp anOp) {
		this.op.add(anOp);
	}

	/**
	Used in iterativelyResolveIncludes() to set the newly parsed PPJob instance
	ordNb to this PPJob instance's ordNb.

	<p>The ordNb is used in the job name suffix which allows subsequent
	instances to iteratively resolve parameters.
	*/
	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public File getJobDir() {
		return this.tmpJobDir;
	}

	public File getProcDir() {
		return this.tmpProcDir;
	}

	public int getOrdNb() {
		return this.ordNb;
	}

	public StringBuffer getResolvedSuffix() {
		StringBuffer sb = new StringBuffer(String.format("%06d", this.fileNb));
		sb.append("-");
		sb.append(String.format("%06d", this.ordNb));
		return sb;
	}

	/**
	Resolve INCLUDE statements that are parameterized, i.e. that take the
	form <code>INCLUDE MEMBER=LIB&ENV</code> where the value of the symbolic
	parameter ENV is set at execution time.

	<p>The symbolics in CLI used by this method come from a list provided at
	execution time.  These would typically be static and/or dynamic system
	symbols such as SYSCLONE or SYSUID.
	
	<p>These symbolics are merged with the relevant symbolics (those whose SET
	statement come before the include being processed) from this job.
	*/
	public void resolveParmedIncludes() {
		this.LOGGER.finer(this.myName + " resolveParmedIncludes " + this);

		for (PPIncludeStatement i: this.includes) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.PPsetSym);
			for (PPSetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < i.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			i.resolveParms(mergedSetSym);
		}

		this.LOGGER.finest(this.myName + " resolveParmedIncludes includes (after resolving): " + this.includes);
	}

	/**
	To the extent possible, resolve symbolic parameters to their values
	as indicated by corresponding PPSetSymbolValue instances.

	<p>The symbolics (setSym) in CLI used by this method come from a list 
	provided at execution time.  These would typically be static and/or 
	dynamic system symbols such as SYSCLONE or SYSUID.

	<p>These symbolics are merged with the relevant symbolics (those whose 
	SET statement come before the step being processed) from this job.

	<p>There is a great deal of delegation resulting from the relatively
	complex logic to resolve symbolics being encapsulated in the PPSymbolic 
	class.  PPSymbolic is contained in PPKeywordValueWrapper which is contained
	in PPKeywordOrSymbolicWrapper which may be contained in 
	PPSingleOrMultipleValueWrapper.
	*/
	private void resolveParms() {
		this.LOGGER.finer(this.myName + " resolveParms " + this);

		ArrayList<PPSetSymbolValue> allSym = new ArrayList<>(this.CLI.PPsetSym);
		allSym.addAll(this.setSym);
		for (PPSetSymbolValue s: this.setSym) {
			s.resolveParms(allSym);
		}

		for (PPOp o: this.op) {
			o.resolveParms(allSym);
		}

		for (PPJclStep step: this.steps) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.PPsetSym);
			for (PPSetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			step.resolveParms(mergedSetSym);
		}
	}

	public void resolveProcs() throws IOException {
		LOGGER.finer(this.myName + " resolveProcs " + this);

		for (PPJclStep step: this.steps) {
			step.resolveProc();
		}
	}

	public PPProc instreamProcThisLineIsIn(int aLine) {
		PPProc aProc = null;

		for (PPProc p: this.procs) {
			if (p.containsLine(aLine) && (p.getFileName().equals(this.fileName))) {
				aProc = p;
				break;
			}
		}

		return aProc;
	}

	public Boolean lineIsInThisJob(int aLine) {
		this.LOGGER.finest(this.myName + " lineIsInThisJob(" + aLine + ")");
		return ((aLine >= this.startLine) && (aLine <= this.endLine));
	}

	public PPIncludeStatement includeStatementAt(int aLine) {
		for (PPIncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int getFileNb() {
		return this.fileNb;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String getJobName() {
		return this.jobName;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public ArrayList<PPIncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<PPIncludeStatement> getAllUnresolvedIncludes() {
		PPIncludeStatement[] unresolved_includes = 
				this.getAllIncludes().stream()
				.filter(i -> !i.isResolved())
				.toArray(PPIncludeStatement[]::new);
		return new ArrayList<PPIncludeStatement>(Arrays.asList(unresolved_includes));
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
	This method is a final transition step between preprocessing, in which
	INCLUDEs, symbolic parameters, and PROCs are resolved through an iterative
	process, and processing the rewritten resolved JCL into objects which
	can be queried and write themselves in a hopefully meaningful fashion
	to a stream.
	*/
	public File rewriteWithParmsResolved() throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " rewriteWithParmsResolved job = |" 
			+ this 
			+ "| tmpJobDir = |" 
			+ this.tmpJobDir 
			+ "|"
			);

		this.resolveParms();
		this.sym = this.collectSymbolics();
		this.LOGGER.finest(this.myName + " sym = |" + this.sym + "|");
		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(
			this.tmpJobDir.toString() 
			+ File.separator 
			+ this.myName 
			+ "-" 
			+ this.getJobName() 
			+ "-resolved-" 
			+ this.getResolvedSuffix()
			);
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		StringBuffer outLine = new StringBuffer();
		ArrayList<Integer> lines = new ArrayList<>();
		for (PPJclStep aStep: this.steps) {
			lines.addAll(aStep.linesShouldBePrecededBySYSINDDSPLAT());
		}
		while ((inLine = src.readLine()) != null) {
			// first get just the symbolics on this line
			PPSymbolic[] symOnThisLineA = 
				this.sym.stream()
				.filter(s -> s.getLine() == src.getLineNumber())
				.toArray(PPSymbolic[]::new);
			// now sort them by size descending so we don't get confused over
			// replacing &A and &A1
			ArrayList<PPSymbolic> symOnThisLine = new ArrayList<>();
			symOnThisLine.addAll(Arrays.asList(symOnThisLineA));
			symOnThisLine.sort(Comparator.comparingInt(PPSymbolic::getLen).reversed());
			this.LOGGER.finest(this.myName + " symOnThisLine = |" + symOnThisLine + "|");
			outLine = new StringBuffer(inLine);
			this.LOGGER.finest(this.myName + " outLine before = |" + outLine + "|");
			// replace symbolics with their resolved value - if the
			// symbolic is followed by a dot, get rid of the dot
			for (PPSymbolic s: symOnThisLine) {
				this.LOGGER.finest(this.myName + " s = " + s);
				int start = outLine.indexOf(s.getText());
				int end = start + s.getLen();
				this.LOGGER.finest(this.myName + " start = " + start);
				this.LOGGER.finest(this.myName + " end   = " + end);
				if ((end < outLine.length()) && (outLine.substring(end, end + 1).equals("."))) {
					end++;
				}
				if (s.getResolvedText() == null) {
					/*
					Particularly if unlocatable INCLUDEs are encountered, 
					a symbolic without its resolved text is possible.
					*/
				} else {
					outLine.replace(start, end, s.getResolvedText());
				}
			}
			if (lines.contains(src.getLineNumber())) {
				this.LOGGER.finest(this.myName + " adding SYSIN DD *");
				out.println("//SYSIN DD * GENERATED STATEMENT");
			}
			this.LOGGER.finest(this.myName + " outLine after  = |" + outLine + "|");
			out.println(outLine);
		}
		src.close();
		out.close();
		this.CLI.setPosixAttributes(tmp);
		return tmp;
	}

	/**
	Return a collection of PPSymbolic to be used when rewriting this
	PPJob with each of its symbolic parameters resolved to their set value.
	*/
	private ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " collectSymbolics");

		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		for (PPJclStep j: steps) {
			symbolics.addAll(j.collectSymbolics());
		}

		for (PPOp o: this.op) {
			symbolics.addAll(o.collectSymbolics());
		}

		// these should be resolved?
		for (PPIncludeStatement i: includes) {
			symbolics.addAll(i.collectSymbolics());
		}

		return symbolics;
	}

	/**
	Iteratively lex/parse, resolve INCLUDE statement symbolic parameters, 
	and rewrite this job until all INCLUDEs are resolved or all that
	remains are unresolvable INCLUDEs.

	<p>A JCL INCLUDE member can contain an INCLUDE statement; further, a JCL
	INCLUDE member can be composed of symbolic parameters; further yet, a
	JCL INCLUDE member can contain SET statements for symbolic parameters;
	and so parameterized JCL INCLUDE statements have their symbolic parameters
	resolved, are rewritten to a temporary file which is lexed and parsed and
	has its parameterized JCL INCLUDE statements' symbolic parameters resolved,
	and so on, iteratively, until all INCLUDEs are resolved or all that
	remains are unresolvable INCLUDEs.
	*/
	public PPJob iterativelyResolveIncludes(File initialJobFile) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " iterativelyResolveIncludes this = |" 
			+ this 
			+ "| initialJobFile = |" 
			+ initialJobFile.getName() 
			+ "|"
			);

		PPJob aJob = this;
		File jobFile = initialJobFile;
		Boolean iterating = true;
		int sanity = 0;
		do {
			this.LOGGER.finest(this.myName + " jobFile = |" + jobFile.getName() + "|");
			ArrayList<PPJob> thisJob = new ArrayList<>();
			String fileToParse = this.tmpJobDir.getCanonicalPath() + File.separator + jobFile.getName();
			lexAndParse(thisJob, null, fileToParse);
			thisJob.get(0).resolveParmedIncludes();
			ArrayList<PPIncludeStatement> includes_after = thisJob.get(0).getAllUnresolvedIncludes();
			this.LOGGER.finest(this.myName + " includes_after  = " + includes_after);
			aJob = thisJob.get(0);
			jobFile = aJob.rewriteJobWithIncludesResolved();
			sanity++;
			if (includes_after.size() == 0) {
				//includes resolved, parse one last time to get resolved PPJob instance
				iterating = false;
				thisJob = new ArrayList<>();
				lexAndParse(
					thisJob
					, null
					, this.tmpJobDir.getCanonicalPath() + File.separator + jobFile.getName()
					);
				aJob = thisJob.get(0);
				aJob.setOrdNb(this.ordNb);
			}
		} while(iterating && (sanity < CLI.getSanity()));
		if (sanity >= CLI.getSanity()) 
			this.LOGGER.warning(
				this.myName 
				+ " sanity check failed in iterativelyResolveIncludes for job " 
				+ this
				);

		return aJob;
	}

	/**
	The generated ANTLR lexer does its lexing, then the ANTLR generated
	parser does its parsing, and then the listener walks the parse tree
	looking for items of interest.
	*/
	public void lexAndParse(
				ArrayList<PPJob> jobs
				, ArrayList<PPProc> procs
				, String fileName
				) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " lexAndParse jobs = |" 
			+ jobs 
			+ "| procs = |" 
			+ procs 
			+ "| fileName = |" 
			+ fileName + "|"
			);

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
				jobs
				, procs
				, fileName
				, this.fileNb
				, this.baseDir
				, this.tmpJobDir
				, this.tmpProcDir
				, LOGGER
				, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	/**
	This method rewrites the job represented by this instance with any
	INCLUDE statements replaced by the contents of the member they point to.
	*/
	private File rewriteJobWithIncludesResolved() throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " rewriteJobWithIncludesResolved job = |" 
			+ this 
			+ "| tmpJobDir = |" 
			+ this.tmpJobDir 
			+ "|"
			);

		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(
			this.tmpJobDir.toString() 
			+ File.separator 
			+ this.myName 
			+ "-" 
			+ this.getJobName() 
			+ "-" + this.getUUID()
			);
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		while ((inLine = src.readLine()) != null) {
			PPIncludeStatement i = this.includeStatementAt(src.getLineNumber());
			if (i == null) {
				out.println(inLine);
			} else {
				if (writeTheIncludeContent(i, out)) {
				} else {
					out.println(inLine);
				}
			}
		}
		src.close();
		out.close();
		this.CLI.setPosixAttributes(tmp);
		return tmp;
	}

	/**
	Rewrite one job from the current file, separating any instream procs into
	their own files to be processed later.

	<p>An initial file could contain multiple jobs, each of which could
	contain multiple instream procs.
	*/
	public File rewriteJobAndSeparateInstreamProcs() throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " rewriteJobAndSeparateInstreamProcs job = |" 
			+ this 
			+ "|"
			);

		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(
			this.tmpJobDir.toString() 
			+ File.separator 
			+ this.myName 
			+ "-" 
			+ this.getJobName() 
			+ "-" 
			+ this.getUUID()
			);
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		PPProc aProc = null;
		File procTmp = null;
		PrintWriter procOut = null;
		while ((inLine = src.readLine()) != null) {
			if (this.lineIsInThisJob(src.getLineNumber())) {
			} else {
				this.LOGGER.finest(this.myName + " line " + src.getLineNumber() + " is not in this job");
				continue;
			}
			aProc = this.instreamProcThisLineIsIn(src.getLineNumber());
			if (aProc == null) {
				if (procOut == null) {
				} else {
					procOut.close();
					procTmp = null;
					procOut = null;
				}
				out.println(inLine);
				this.LOGGER.finest(this.myName + " output to job  = |" + inLine + "|");
			} else {
				if (procOut == null) {
					procTmp = new File(this.tmpProcDir.toString() + File.separator + aProc.getProcName());
					if (this.CLI.saveTemp) {
					} else {
						procTmp.deleteOnExit();
					}
					procOut = new PrintWriter(procTmp);
					this.LOGGER.finest(this.myName + " procTmp = |" + procTmp.getName() + "|");
				}
				procOut.println(inLine);
				this.LOGGER.finest(this.myName + " output to proc = |" + inLine + "|");
			}
			if (src.getLineNumber() == this.getEndLine()) break; //end of this job in this file
		}
		src.close();
		out.close();
		this.CLI.setPosixAttributes(tmp);
		return tmp;
	}

	/**
	Locate the file pointed to by the passed INCLUDE statement and write
	its contents to the passed PrintWriter.
	*/
	private Boolean writeTheIncludeContent(
							PPIncludeStatement i
							, PrintWriter out
							)
						throws IOException {

		this.LOGGER.finer(this.myName + " writeTheIncludeContent i =|" + i + "|");

		if (i.isResolved()) {
		} else {
			return false;
		}

		Boolean foundIt = true;
		String includeFile = i.getResolvedText();

		String includeFileFull = searchProcPathsFor(includeFile);

		if (includeFileFull == null) {
			foundIt = false;
		} else {
			List<String> list = 
				Files.readAllLines(Paths.get(includeFileFull));
			for (String line: list) out.println(line);
		}

		return foundIt;
	}

	/**
	Search what corresponds to the libraries that JES would search for
	the passed file name.

	<p>The first location being searched is contrived - it's where the
	instream procs were written by rewriteJobAndSeparateInstreamProcs().

	<p>The second set of locations are what correspond to the JCLLIB
	ORDER= libraries (if any were supplied).

	<p>The last set of locations are what correspond to the various PROCxx
	statements used at JES startup.

	<p>Processing continues if the passed file name cannot be found, but
	a warning is issued which should indicate the results will be incomplete.
	*/
	private String searchProcPathsFor(String fileName) throws IOException {
		File aFile = new File(this.tmpProcDir.getPath() + File.separator + fileName);
		if (aFile.exists()) {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
			return aFile.getPath();
		}

		ArrayList<String> jcllib = this.getJcllibStrings();
		for (String lib: jcllib) {
			if (this.CLI.mappedProcPaths.containsKey(lib)) {
				aFile = new File(this.CLI.mappedProcPaths.get(lib) + File.separator + fileName);
				if (aFile.exists()) {
					this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
					return aFile.getPath();
				}
			}
		}

		for (String path: this.CLI.staticProcPaths) {
			aFile = new File(path + File.separator + fileName);
			if (aFile.exists()) {
				this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
				return aFile.getPath();
			}
		}

		this.LOGGER.warning(this.myName + " searchProcPathsFor() did not find " + fileName);
		return null;
	}

	public File newTempDir(File baseDir, String prfx, Boolean saveTemp) {
		return this.CLI.newTempDir(baseDir, prfx, saveTemp);
	}

	public String toString() {
		return 
			this.getJobName() 
			+ " @ " 
			+ this.jobCardCtx.jobName().NAME_FIELD().getSymbol().getLine() 
			+ " in " 
			+ this.fileName;
	}
}

