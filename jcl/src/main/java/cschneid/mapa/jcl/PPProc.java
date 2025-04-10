/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL Procedure - cataloged or instream - which is
used in PreProcessing to resolve parms and INCLUDEs.

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
public class PPProc {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private JCLPPParser.ProcStatementContext procCtx = null;
	private JCLPPParser.PendStatementContext pendCtx = null;
	private ArrayList<PPSetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<PPIncludeStatement> includes = new ArrayList<>();
	private ArrayList<PPKeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<PPJclStep> steps = new ArrayList<>();
	private ArrayList<PPSymbolic> sym = new ArrayList<>();
	/**
	This collection of PPOp instances is only used in the generated PPProc
	class;  PPOp is a generic representation of most JCL statements that are
	not needed in preprocessing other than for resolving INCLUDEs and 
	symbolics;  The primary function of PPOp is to hold symbolics that must be
	iteratively resolved as the JCL is rewritten. 
	*/
	private ArrayList<PPOp> op = new ArrayList<>();
	private String fileName = null;
	private String procName = null;
	private int startLine = -1;
	private int endLine = -1;
	private int jobOrdNb = 0;
	private int ordNb = 0;
	private int fileNb = 0;
	private int nbSteps = 0;
	private File baseDir = null;
	private File tmpProcDir = null;
	private PPJclStep parentJclStep = null;

	/**
	This constructor is used when a cataloged proc is encountered by
	a listener but no PROC statement exists.

	<p>Instream procs must have a PROC statement and a PEND statement,
	cataloged procs can have one, the other, both, or neither.
	*/
	public PPProc(
				String fileName
				, int fileNb
				, File baseDir
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.procName = this.procNameFromFileName();
		this.initialize();
		this.setTmpDirs(baseDir);
		LOGGER.fine(
			this.myName 
			+ " " 
			+ this.procName 
			+ " instantiated from " 
			+ this.fileName);
	}

	/**
	This constructor is used when a cataloged proc is encountered by
	a listener but no PROC statement exists.

	<p>Instream procs must have a PROC statement and a PEND statement,
	cataloged procs can have one, the other, both, or neither.
	*/
	public PPProc(
				String fileName
				, int fileNb
				, File baseDir
				, File tmpProcDir
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.procName = this.procNameFromFileName();
		this.initialize();
		this.setTmpDirs(baseDir, tmpProcDir);
		LOGGER.fine(
			this.myName 
			+ " " 
			+ this.procName 
			+ " instantiated from " 
			+ this.fileName);
	}

	/**
	This constructor is used when a PROC statement is encountered by 
	a listener.
	*/
	public PPProc(
				JCLPPParser.ProcStatementContext procCtx
				, String fileName
				, int fileNb
				, File baseDir
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		this.setTmpDirs(baseDir);
		LOGGER.fine(
			this.myName 
			+ " " 
			+ this.procName 
			+ " instantiated from " 
			+ this.fileName);
	}

	/**
	This constructor is used when a PROC statement is encountered by 
	a listener.
	*/
	public PPProc(
				JCLPPParser.ProcStatementContext procCtx
				, String fileName
				, int fileNb
				, File baseDir
				, File tmpProcDir
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		this.setTmpDirs(baseDir, tmpProcDir);
		LOGGER.fine(
			this.myName 
			+ " " 
			+ this.procName 
			+ " instantiated from " 
			+ this.fileName);
	}

	private void initialize() {
		if (this.myName == null) {
			this.myName = this.getClass().getName();
		}

		if (this.procName == null) {
			if (this.procCtx.procName() == null) {
				this.procName = this.procNameFromFileName();
			} else {
				this.procName = this.procCtx.procName().NAME_FIELD().getSymbol().getText();
			}
		}

		if (this.procCtx == null) {
			this.startLine = 1;
		} else {
			this.startLine = this.procCtx.PROC().getSymbol().getLine();
		}

		if (this.pendCtx == null) {
		} else {
			this.endLine = this.pendCtx.PEND().getSymbol().getLine();
		}
	}

	/**
	This may be awful, but it turns out the PROC statement is optional for 
	a cataloged proc, and even if present, the name field on the PROC statement
	is optional; this is not true for an instream proc, where the PROC
	statement is required and must contain a name field.

	<p>So the proc name is set from the value returned by this method, which is
	dependent on the naming convention used for temp files.  Which I invented.
	*/
	private String procNameFromFileName() {
		int s = this.fileName.lastIndexOf(File.separator);
		int i = -1;

		if (s > -1) {
			s++;
			i = this.fileName.indexOf('-', s);
		} else {
			i = this.fileName.indexOf('-');
		}

		this.LOGGER.finer(
			this.myName 
			+ " procNameFromFileName fileName = |" 
			+ this.fileName 
			+ "|");
		this.LOGGER.finer(
			this.myName 
			+ " procNameFromFileName s = |" 
			+ s 
			+ "| i = |" 
			+ i 
			+ "|");

		if (s == -1 && i == -1) {
			return this.fileName;
		} else if (s == -1) {
			return this.fileName.substring(0, i);
		} else if (i == -1) {
			return this.fileName.substring(s);
		} else {
			return this.fileName.substring(s, i);
		}
	}

	private void setTmpDirs(File baseDir) {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(
				this.myName 
				+ " setTmpDirs baseDir set to |" 
				+ this.baseDir 
				+ "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = 
				this.newTempDir(
					baseDir
					, this.myName 
						+ "-" 
						+ this.procName 
						+ "-" 
						+ this.uuid
					, this.CLI.saveTemp);
			this.LOGGER.finest(
				this.myName 
				+ " setTmpDirs tmpProcDir set to |" 
				+ this.tmpProcDir 
				+ "|");
		}
	}

	private void setTmpDirs(File baseDir, File tmpProcDir) {
		this.LOGGER.finer(
			this.myName 
			+ " setTmpDirs(" 
			+ baseDir 
			+ "," 
			+ tmpProcDir 
			+ ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(
				this.myName 
				+ " setTmpDirs baseDir set to |" 
				+ this.baseDir 
				+ "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(
				this.myName 
				+ " setTmpDirs tmpProcDir set to |" 
				+ this.tmpProcDir 
				+ "|");
		}
	}

	/**
	Used by listeners in constructing instances of PPProc.

	<p>A PEND statement is optional, if present it is used to determine
	the endLine for this PPProc.
	*/
	public void addPendCtx(JCLPPParser.PendStatementContext pendCtx) {
		this.pendCtx = pendCtx;
		this.initialize();
	}

	/**
	Used by listeners in constructing instances of PPProc.

	<p>A PEND statement is optional, when absent the listener manually sets
	the endLine for this PPProc.
	*/
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	/**
	Used by PPJclStep and PPProc in constructing instances of PPProc.

	<p>The JCLLIB concatenation is needed to resolve INCLUDE statements and
	PROCs executed by PPJclSteps in this PPProc.
	*/
	public void setJcllib(ArrayList<PPKeywordOrSymbolicWrapper> jcllib) {
		this.jcllib = jcllib;
		for (PPJclStep step: this.steps) {
			step.setJcllib(jcllib);
		}
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
	Used by listeners in construction of instances of this class.
	*/
	public void addInclude(PPIncludeStatement include) {
		this.includes.add(include);
	}

	/**
	Used by listeners in construction of instances of this class.
	*/
	public void addSetSym(PPSetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	/**
	Add a PPJclStep to this PPProc.

	<p>Note that this is similar to addJclStep in PPJob, but neither
	<code>setJcllib()</code> nor <code>setJobOrdNb</code> are executed
	from here.  Instead, those methods are executed in PPProc's implementation
	of them, for the collection of PPJclSteps.
	*/
	public void addJclStep(PPJclStep step) {
		this.nbSteps++;
		step.setOrdNb(this.nbSteps);
		this.steps.add(step);
		step.setTmpDirs(this.baseDir, this.tmpProcDir);
	}

	public void addOp(PPOp anOp) {
		this.op.add(anOp);
	}

	public String getProcName() {
		return this.procName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int getFileNb() {
		return this.fileNb;
	}

	public File getProcDir() {
		return this.tmpProcDir;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public int getOrdNb() {
		return this.ordNb;
	}

	public void setJobOrdNb(int jobOrdNb) {
		this.jobOrdNb = jobOrdNb;
		for (PPJclStep step: this.steps) {
			step.setJobOrdNb(jobOrdNb);
		}
	}

	public void setParentJclStep(PPJclStep jclStep) {
		this.parentJclStep = jclStep;
	}

	/**
	Return the suffix to be used in the file name of the fully resolved 
	version of this PPProc.  If there is a parent JCL step, then defer to
	its resolved suffix, otherwise construct our own.

	<p>A predictable file name is needed so the transition from preprocessing
	to "normal" lexing/parsing works seamlessly.
	*/
	public StringBuffer getResolvedSuffix() {
		if (this.parentJclStep == null) {
			StringBuffer sb = new StringBuffer(String.format("%06d", this.fileNb));
			sb.append("-");
			sb.append(String.format("%06d", this.ordNb));
			return sb;
		} else {
			return this.parentJclStep.getResolvedSuffix();
		}
	}

	public StringBuffer getResolvedFileName() {
		StringBuffer sb = new StringBuffer(this.tmpProcDir.toString());
		sb.append(File.separator);
		sb.append(this.procName);
		sb.append("-resolved-");
		sb.append(this.getResolvedSuffix());

		return sb;
	}

	public PPIncludeStatement includeStatementAt(int aLine) {
		for (PPIncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public ArrayList<PPIncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public Boolean containsLine(int aLine) {
		if (this.endLine <= this.startLine) {
			this.LOGGER.severe(
				this.myName 
				+ " " 
				+ this.procName 
				+ " containsLine detected either endLine or startLine not set |" 
				+ this
				+ "|"
				);
		}

		return (aLine >= startLine) && (aLine <= endLine);
	}

	public void resolveProcs() throws IOException {
		this.LOGGER.finer(this.myName + " " + this.procName + " resolveProcs " + this);

		for (PPJclStep step: this.steps) {
			step.resolveProc();
		}
	}

	/**
	Resolve INCLUDE statements that are parameterized, i.e. that take the
	form <code>INCLUDE MEMBER=LIB&ENV</code> where the value of the symbolic
	parameter ENV is set at execution time.

	<p>The symbolics passed into this method come from a list provided at
	execution time.  These would typically be static and/or dynamic system
	symbols such as SYSCLONE or SYSUID.
	
	<p>These symbolics are merged with the relevant symbolics (those whose SET
	statement come before the include being processed or are set on the PROC
	statement) from this proc.
	*/
	public void resolveParmedIncludes(ArrayList<PPSetSymbolValue> execSetSym) {
		this.LOGGER.finer(
			this.myName 
			+ " " 
			+ this.procName 
			+ " resolveParmedIncludes execSetSym = |" 
			+ execSetSym 
			+ "|"
			);

		for (PPIncludeStatement i: this.includes) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.PPsetSym);
			for (PPSetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < i.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					this.LOGGER.finest(this.myName + " mergedSetSym.add |" + s + "|");
					mergedSetSym.add(s);
				} else {
					this.LOGGER.finest(this.myName + " mergedSetSym discarding |" + s + "|");
				}
			}
			mergedSetSym.addAll(execSetSym);
			i.resolveParms(mergedSetSym);
		}

		this.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);
	}

	/**
	Resolve symbolic parameters with respect to values set at execution
	time.

	<p>These values may be set as command line parameters or may be in the
	SET statements in the execution JCL.  INCLUDE members may also contain
	SET statements.

	<p>There is a great deal of delegation resulting from the relatively
	complex logic to resolve symbolics being encapsulated in the PPSymbolic 
	class.  PPSymbolic is contained in PPKeywordValueWrapper which is contained
	in PPKeywordOrSymbolicWrapper which may be contained in 
	PPSingleOrMultipleValueWrapper.
	*/
	public void resolveParms(ArrayList<PPSetSymbolValue> execSetSym) {
		LOGGER.finer(this.myName + " resolveParms " + this);

		ArrayList<PPSetSymbolValue> allSym = new ArrayList<>(this.CLI.PPsetSym);
		allSym.addAll(this.setSym);
		allSym.addAll(execSetSym);
		for (PPSetSymbolValue s: this.setSym) {
			s.resolveParms(allSym);
		}

		for (PPJclStep step: steps) {
			ArrayList<PPSetSymbolValue> mergedSetSym = new ArrayList<>(this.CLI.PPsetSym);
			for (PPSetSymbolValue s: this.setSym) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSetSym.add(s);
				}
			}
			mergedSetSym.addAll(execSetSym);
			step.resolveParms(mergedSetSym);
		}

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
			+ " "
			+ this.procName
			+ " rewriteWithParmsResolved proc = |" 
			+ this 
			+ "| tmpProcDir = |" 
			+ this.tmpProcDir 
			+ "|"
			);

		this.sym = this.collectSymbolics();
		this.LOGGER.finest(this.myName + " sym = |" + this.sym + "|");
		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = new File(this.getResolvedFileName().toString());
		if (this.CLI.saveTemp) {
		} else {
			tmp.deleteOnExit();
		}
		PrintWriter out = new PrintWriter(tmp);
		this.LOGGER.finest(this.myName + " tmp = |" + tmp.getName() + "|");
		String inLine = new String();
		StringBuffer outLine = new StringBuffer();
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
				int start = outLine.indexOf(s.getText());
				int end = start + s.getLen();
				if (end < outLine.length() && outLine.substring(end, end + 1).equals(".")) {
					end++;
				}
				if (s.getResolvedText() == null || s.getResolvedText().length() == 0) {
					/*
					Particularly if PROCs without execution JCL are being processed, 
					encountering a symbolic without its resolved text is possible.
					*/
				} else {
					outLine.replace(start, end, s.getResolvedText());
				}
			}
			this.LOGGER.finest(this.myName + " outLine after  = |" + outLine + "|");
			out.println(outLine);
		}
		src.close();
		out.close();
		this.CLI.setPosixAttributes(tmp);
		return tmp;
	}

	private ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " collectSymbolics proc = " + this.procName);

		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		for (PPJclStep j: steps) {
			symbolics.addAll(j.collectSymbolics());
		}

		// these should be resolved?
		for (PPIncludeStatement i: includes) {
			symbolics.addAll(i.collectSymbolics());
		}

		return symbolics;
	}

	/**
	Iteratively lex/parse, resolve INCLUDE statement symbolic parameters, 
	and rewrite this proc until all INCLUDEs are resolved or all that
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
	public PPProc iterativelyResolveIncludes(
					ArrayList<PPSetSymbolValue> execSetSym
					, File initialFile
					) throws IOException {
		this.LOGGER.finer(
			this.myName 
			+ " iterativelyResolveIncludes this = |" 
			+ this 
			+ "| initialFile = |" 
			+ initialFile.getName() 
			+ "| execSetSym = |"
			+ execSetSym
			+ "|"
			);

		PPProc aProc = this;
		File procFile = initialFile;
		Boolean iterating = true;
		int sanity = 0;
		do {
			this.LOGGER.finest(this.myName + " procFile = |" + procFile.getName() + "|");
			aProc = this.lexAndParseAndStuff(procFile, execSetSym);
			procFile = aProc.rewriteWithIncludedContent();
			ArrayList<PPIncludeStatement> includes_after = aProc.getAllIncludes();
			this.LOGGER.finest(this.myName + " includes_after (1)  = |" + includes_after + "|");
			sanity++;
			if (includes_after.size() == 0) {
				aProc = this.lexAndParseAndStuff(procFile, execSetSym);
				includes_after = aProc.getAllIncludes();
				this.LOGGER.finest(this.myName + " includes_after (2)  = |" + includes_after + "|");
				if (includes_after.size() == 0) {
					iterating = false;
				}
			} else {
				// if any INCLUDEs remain that can be resolved, continue
				Boolean found = false;
				for (PPIncludeStatement i: includes_after) {
					found = (searchProcPathsFor(i.getResolvedText()) != null);
					if (found) break;
				}
				iterating = found;
			}
		} while(iterating && (sanity < CLI.getSanity()));
		if (sanity >= CLI.getSanity()) 
			this.LOGGER.warning(
				this.myName 
				+ " sanity check failed in iterativelyResolveIncludes for proc " 
				+ this
				);

		return aProc;
	}

	private PPProc lexAndParseAndStuff(
				File procFile
				, ArrayList<PPSetSymbolValue> execSetSym
				) throws IOException {
		this.LOGGER.finer(this.myName + " " + this.procName + " lexAndParseAndStuff");

		String procFileFull = searchProcPathsFor(procFile.getName());
		ArrayList<PPProc> thisProc = new ArrayList<>();
		lexAndParse(null, thisProc, procFileFull);
		thisProc.get(0).resolveParmedIncludes(execSetSym);
		PPProc aProc = thisProc.get(0);
		//aProc.setTmpDirs(this.baseDir, this.tmpProcDir);
		aProc.setJcllib(this.jcllib);
		aProc.setOrdNb(this.ordNb);
		aProc.setJobOrdNb(this.jobOrdNb);
		aProc.setParentJclStep(this.parentJclStep);

		return aProc;
	}

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
	
		PPListener listener = new PPListener(jobs, procs, fileName, this.getFileNb(), this.baseDir, null, this.tmpProcDir, LOGGER, CLI);
	
		this.LOGGER.finer(this.myName + " ----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	public File rewriteWithIncludedContent() throws IOException {
		this.LOGGER.finer(this.myName + " rewriteWithIncludedContent " + this);

		File aFile = new File(this.getFileName());
		LineNumberReader src = new LineNumberReader(new FileReader(aFile));
		File tmp = 
			new File(
				this.tmpProcDir.toString() 
				+ File.separator 
				+ this.procName 
				+ "-" 
				+ this.getUUID());
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

	public Boolean writeTheIncludeContent(
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
			//LOGGER.warning(includeFile + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
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

	<p>The first location being searched is contrived - it's where the Demo01
	application writes the initial file, removing the troublesome contents
	of columns 72 - 80 in a semi-intelligent fashion.

	<p>The second location being searched is contrived - it's where the
	instream procs were written by PPJob.rewriteJobAndSeparateInstreamProcs().

	<p>The third set of locations are what correspond to the JCLLIB
	ORDER= libraries (if any were supplied).

	<p>The last set of locations are what correspond to the various PROCxx
	statements used at JES startup.

	<p>Processing continues if the passed file name cannot be found, but
	a warning is issued which should indicate the results will be incomplete.
	*/
	private String searchProcPathsFor(String fileName) throws IOException {
		/*
		The baseDir is searched because the first thing done in the Demo01
		application is to rewrite the initial file removing the troublesome
		columns 72 - 80 in a semi-intelligent manner.  At that point it is
		not known if this is a proc or a job.
		*/
		File aFile = new File(this.baseDir.getPath() + File.separator + fileName);
		if (aFile.exists()) {
			this.LOGGER.finer(this.myName + " searchProcPathsFor() found " + aFile.getPath());
			return aFile.getPath();
		}

		aFile = new File(this.tmpProcDir.getPath() + File.separator + fileName);
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
			this.procName 
			+ " @ " 
			+ this.startLine 
			+ " to " 
			+ this.endLine 
			+ " in " 
			+ this.fileName;
	}

}
