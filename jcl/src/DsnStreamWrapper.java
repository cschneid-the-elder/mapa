/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Currently the purpose of this class is to obtain the program and
plan values for any DSN RUN commands.  Instantiation is via a stream
of DSN commands obtained from the TSO command parser, so really any
other DSN commands of interest could be obtained here with the
appropriate listener.
*/
public class DsnStreamWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private TSOParser.DsnStreamContext ctx = null;
	/**
	The ParameterString ArrayList in DsnStreamWrapper is intended to
	assist in getting the DSN command stream in the proper order so it
	can itself be parsed.
	*/
	private ArrayList<ParameterString> parameterStrings = new ArrayList<>();

	/**
	This instance of StringBuilder will contain the DSN command stream and
	will be parsed with the DSN TSO lexer/parser to obtain any RUN command
	options, which is where the PROGRAM() and PLAN() reside.
	*/
	private StringBuilder sb = new StringBuilder();
	private ArrayList<DSNTSOParser.RunContext> runCtxs = new ArrayList<>();
	private ArrayList<String> pgms = new ArrayList<>();
	private ArrayList<String> plans = new ArrayList<>();
	private ArrayList<UUID> uuids = new ArrayList<>();

	public DsnStreamWrapper(
			TSOParser.DsnStreamContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		this.buildParameterStrings();

		for (ParameterString ps: this.parameterStrings) {
			sb.append(ps.getValue());
		}

		this.parsePgmsAndPlans();
	}

	private void buildParameterStrings() {
		this.addTerminalNodeToParameterStrings(this.ctx.DSN());
		this.addTerminalNodesToParameterStrings(this.ctx.DSN_CMD_STREAM());
		if (this.ctx.DSN_END() != null) {
			this.addTerminalNodeToParameterStrings(this.ctx.DSN_END());
		}

		this.parameterStrings.sort(Comparator.comparingLong(ParameterString::getSortKey));
	}

	private void addTerminalNodesToParameterStrings(List<TerminalNode> lt) {
		this.LOGGER.finer(this.myName + " addTerminalNodesToParameterStrings()");

		for (TerminalNode t: lt) {
			this.addTerminalNodeToParameterStrings(t);
		}
	}

	private void addTerminalNodeToParameterStrings(TerminalNode t) {
		this.LOGGER.finer(this.myName + " addTerminalNodeToParameterStrings()");

		this.parameterStrings.add(
			new ParameterString(
				t
				, this.LOGGER
				, this.CLI
			)
		);
	}

	/**
	The primary reason for this class: obtain the values for the PROGRAM()
	and PLAN() options of the RUN statement of the DSN command, if any of 
	those are present.  According to the documentation, if there is no 
	PLAN() then it has the same name as the PROGRAM().  And I wish I'd known
	that for all the time I spent coding these things since the late 1980s.
	There it was, right there in the documentation, and I didn't read it.
	Learn from my mistakes, <strong>read the documentation</strong>.
	*/
	private void parsePgmsAndPlans() {
		this.LOGGER.finer(myName + " parsePgmsAndPlans");
		this.lexAndParse(this.runCtxs);

		for (DSNTSOParser.RunContext runc: this.runCtxs) {
			if (runc.runOptions() == null) {
				this.LOGGER.finest(myName + " parsePgmsAndPlans runc.runOptions() == null");
				continue;
			}
			DSNTSOParser.RunOptionsContext roc = runc.runOptions();
			if (roc.program() == null) {
				this.LOGGER.finest(myName + " parsePgmsAndPlans roc.program() == null");
				continue;
			}
			StringBuilder pgmName = new StringBuilder();
			for (TerminalNode t: roc.program().arg().ARG()) {
				pgmName.append(t.getText());
			}
			this.pgms.add(pgmName.toString());
			StringBuilder planName = new StringBuilder();
			if (roc.plan() == null) {
				this.LOGGER.finest(myName + " parsePgmsAndPlans roc.plan() == null");
				planName = new StringBuilder(pgmName.toString());
			} else {
				for (TerminalNode t: roc.plan().arg().ARG()) {
					planName.append(t.getText());
				}
			}
			this.plans.add(planName.toString());
			this.uuids.add(UUID.randomUUID());
		}

		this.LOGGER.finer(
				myName 
				+ " parsePgmsAndPlans pgms = |" 
				+ this.pgms
				+ "| plans = |"
				+ this.plans
				+ "|"
				);
	}

	/**
	Parse the DSN stream extracted from the IKJEFT01/IKJEFT1A/IKJEFT1B
	SYSTSIN DD, obtaining any programs and plans.
	*/
	private void lexAndParse(
					ArrayList<DSNTSOParser.RunContext> runCtxs
					) {
		LOGGER.fine("lexAndParse runCtxs = |" + runCtxs + "|");

		CharStream cs = CharStreams.fromString(this.sb.toString());  //data to be parsed
		DSNTSOLexer lexer = new DSNTSOLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		DSNTSOParser parser = new DSNTSOParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		DsnRunListener listener = new DsnRunListener(runCtxs, this.LOGGER, this.CLI);
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	public ArrayList<String> getPgms() {
		return this.pgms;
	}

	public ArrayList<String> getPlans() {
		return this.plans;
	}

	public String toString() {
		return this.myName + " pgms = |" + this.pgms + "| plans = |" + this.plans + "|";
	}
}
