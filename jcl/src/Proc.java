/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL Procedure - cataloged or instream.

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
the rewritten JCL, continuing until all INCLUDEs are resolved.

<p>This is accomplished via two separate grammars, one used by the preprocessing 
code to resolve symbolics and INCLUDEs, the other to lex and parse the 
resulting JCL.

<p>An unfortunate side effect of this class and its brethren being created
by an ANTLR listener class is that not all instance variables are known at
instantiation time, they must be added as they are encountered by the listener.

*/
public class Proc {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLParser.ProcStatementContext procCtx = null;
	private JCLParser.PendStatementContext pendCtx = null;
	private ArrayList<SetSymbolValue> setSym = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<KeywordOrSymbolicWrapper> jcllib = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private ArrayList<Symbolic> sym = new ArrayList<>();
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
	private JclStep parentJclStep = null;

	public Proc(
				String fileName
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.myName = this.getClass().getName();
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.procName = this.procNameFromFileName();
		this.initialize();
		LOGGER.fine(this.myName + " " + this.procName + " instantiated from " + this.fileName);
	}

	public Proc(
				JCLParser.ProcStatementContext procCtx
				, String fileName
				, int fileNb
				, Logger LOGGER
				, TheCLI CLI
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.fileNb = fileNb;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
		LOGGER.fine(this.myName + " " + this.procName + " instantiated from " + this.fileName);
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

	So the proc name is set from the value returned by this method, which is
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

		this.LOGGER.finer(this.myName + " procNameFromFileName fileName = |" + this.fileName + "|");
		this.LOGGER.finer(this.myName + " procNameFromFileName s = |" + s + "| i = |" + i + "|");

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

	public void setTmpDirs(File baseDir, File tmpProcDir) throws IOException {
		this.LOGGER.finer(this.myName + " setTmpDirs(" + baseDir + "," + tmpProcDir + ")");
		if (this.baseDir == null) {
			this.baseDir = baseDir;
			this.LOGGER.finest(this.myName + " setTmpDirs baseDir set to |" + this.baseDir + "|");
		}

		if (this.tmpProcDir == null) {
			this.tmpProcDir = tmpProcDir;
			this.LOGGER.finest(this.myName + " setTmpDirs tmpProcDir set to |" + this.tmpProcDir + "|");
		}
		
		for (JclStep step: this.steps) {
			step.setTmpDirs(this.baseDir, this.tmpProcDir);
		}
	}

	/**
	Used by listeners in constructing instances of Proc.

	<p>A PEND statement is optional, if present it is used to determine
	the endLine for this Proc.
	*/
	public void addPendCtx(JCLParser.PendStatementContext pendCtx) {
		this.pendCtx = pendCtx;
		this.initialize();
	}

	/**
	Used by listeners in constructing instances of Proc.

	<p>A PEND statement is optional, when absent the listener manually sets
	the endLine for this Proc.
	*/
	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	/**
	Used by JclStep and Proc in constructing instances of Proc.

	<p>The JCLLIB concatenation is needed to resolve INCLUDE statements and
	PROCs executed by JclSteps in this Proc.
	*/
	public void setJcllib(ArrayList<KeywordOrSymbolicWrapper> jcllib) {
		this.jcllib = jcllib;
		for (JclStep step: this.steps) {
			step.setJcllib(jcllib);
		}
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addSetSym(SetSymbolValue setSym) {
		this.setSym.add(setSym);
	}

	/**
	Add a JclStep to this Proc.

	<p>Note that this is similar to addJclStep in Job, but neither
	<code>setJcllib()</code> nor <code>setJobOrdNb</code> are executed
	from here.  Instead, those methods are executed in Proc's implementation
	of them, for the collection of JclSteps.
	*/
	public void addJclStep(JclStep step) {
		this.nbSteps++;
		step.setOrdNb(this.nbSteps);
		this.steps.add(step);
	}

	public String getProcName() {
		return this.procName;
	}

	public int getFileNb() {
		return this.fileNb;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public void setOrdNb(int ordNb) {
		this.ordNb = ordNb;
	}

	public void setJobOrdNb(int jobOrdNb) {
		this.jobOrdNb = jobOrdNb;
		for (JclStep step: this.steps) {
			step.setJobOrdNb(jobOrdNb);
		}
	}

	public void setParentJclStep(JclStep jclStep) {
		this.parentJclStep = jclStep;
	}

	public JclStep getParentJclStep() {
		return this.parentJclStep;
	}

	/**
	Return the suffix to be used in the file name of the fully resolved 
	version of this Proc.  If there is a parent JCL step, then defer to
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

	public void lexAndParseProcs() throws IOException {
		this.LOGGER.fine(this.myName + " " + this.procName + " lexAndParseProcs");
		for (JclStep s: this.steps) {
			s.lexAndParseProc();
		}
	}

	/**
	Add a "tree" representation of this Proc to the passed
	StringBuffer.

	The tricky <code>while</code> is to get the indentation right by
	working through the tree of JclSteps and Procs leading to this instance.
	*/
	public void toTree(StringBuffer treeOut) {
		this.LOGGER.fine(this.myName + " " + this.procName + " toTree");

		StringBuffer prefix = new StringBuffer();
		JclStep aStep = this.parentJclStep;
		while (aStep != null) {
			prefix.append("\t\t\t\t");
			Proc aProc = aStep.getParentProc();
			if (aProc == null) {
				aStep = null;
			} else {
				aStep = aProc.getParentJclStep();
			}
		}
		treeOut.append(prefix);
		treeOut.append(this.procName);
		for (JclStep s: this.steps) {
			treeOut.append(System.getProperty("line.separator"));
			treeOut.append(prefix);
			s.toTree(treeOut);
		}
	}

	/**
	Add a comma separated value representation of this Proc to the passed
	StringBuffer.

	<p>The parentUUID is used to tie this Proc to its executing JclStep or
	the file in which it resides if there is no owning JclStep.

	<p>The csvOut StringBuffer is eventually written to a file which can be
	used to load a database with information gathered in parsing.
	*/
	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		this.LOGGER.fine(this.myName + " " + this.procName + " toCSV");

		csvOut.append("PROC");
		csvOut.append(",");
		csvOut.append(this.procName);
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
			this.procName 
			+ " @ " 
			+ this.startLine 
			+ " to " 
			+ this.endLine 
			+ " in " 
			+ this.fileName;
	}

}
