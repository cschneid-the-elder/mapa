/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL Job, consisting of one or more JCL steps, each
of which executes either a program or a procedure.

<p>There are a host of other statements that could be represented here, but for
demonstration purposes they are superfluous.  The intent is to provide some
basic functionality to demonstrate what can be done with the lexer/parser.

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
public class Job {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private JCLParser.JobCardContext jobCardCtx = null;
	private JCLParser.JcllibStatementContext jcllibCtx = null;
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<Proc> procs  = new ArrayList<>();
	private ArrayList<SetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private ArrayList<Symbolic> sym = new ArrayList<>();
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

	public Job(
			JCLParser.JobCardContext ctx
			, String fileName
			, int ordNb
			, int fileNb
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
	Used by listeners constructing instances of Job.

	<p>Note that a JCLLIB statement is optional, and if absent then
	the path(s) to search for INCLUDEs and PROCs must be set via (in
	this case) the CLI.
	*/
	public void addJcllib(JCLParser.JcllibStatementContext ctx) {
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
		ArrayList<JCLParser.KeywordOrSymbolicContext> kywdCtxList = new ArrayList<>();
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
				for (JCLParser.ParenListContext p: ctx.singleOrMultipleValue().parenList()) {
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

		for (JCLParser.KeywordOrSymbolicContext k: kywdCtxList) {
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

		this.jcllib.addAll(KeywordOrSymbolicWrapper.bunchOfThese(kywdCtxList, this.LOGGER, this.CLI));
	}

	/**
	Used by listeners to set the end line of this Job. A file can
	contain more than one JOB statement.
	*/
	public void setEndLine(int aLine) {
		this.endLine = aLine;
	}

	public void setTmpDirs(File baseDir, File tmpJobDir, File tmpProcDir) throws IOException {
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
		
		for (JclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	public void addInstreamProc(Proc iProc) {
		this.procs.add(iProc);
	}

	public void addSetSym(SetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addJclStep(JclStep step) {
		this.nbSteps++;
		step.setOrdNb(this.nbSteps);
		step.setJobOrdNb(this.ordNb);
		this.steps.add(step);
		step.setJcllib(this.jcllib);
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public StringBuffer getResolvedSuffix() {
		StringBuffer sb = new StringBuffer(String.format("%06d", this.fileNb));
		sb.append("-");
		sb.append(String.format("%06d", this.ordNb));
		return sb;
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

	public void processSYSTSIN() {
		this.LOGGER.fine(this.myName + " " + this.jobName + " processSYSTSIN");
		for (JclStep s: this.steps) {
			s.processSYSTSIN();
		}
	}

	public void lexAndParseProcs() throws IOException {
		for (JclStep s: this.steps) {
			s.lexAndParseProc();
		}
	}

	public void toTree(StringBuffer treeOut) {
		this.LOGGER.fine(this.myName + " " + this.jobName + " toTree");

		treeOut.append(this.jobName);
		treeOut.append('\t');
		treeOut.append(this.ordNb);
		for (JclStep s: this.steps) {
			treeOut.append(System.getProperty("line.separator"));
			s.toTree(treeOut);
		}
	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		this.LOGGER.fine(this.myName + " " + this.jobName + " toCSV");

		csvOut.append("JOB");
		csvOut.append(",");
		csvOut.append(this.jobName);
		csvOut.append(",");
		csvOut.append(this.ordNb);
		csvOut.append(",");
		csvOut.append(parentUUID.toString());
		csvOut.append(",");
		csvOut.append(this.uuid.toString());

		for (JclStep s: this.steps) {
			csvOut.append(System.getProperty("line.separator"));
			s.toCSV(csvOut, this.uuid);
		}
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

