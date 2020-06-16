/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a generic JCL statement whose primary purpose is
assisting in symbolic substitution during preprocessing.
*/

public class PPOp {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private String myType = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private ArrayList<PPSymbolic> symbolics = new ArrayList<>();
	private Boolean inProc = false;
	private String procName = null;

	public PPOp(
		JCLPPParser.CommandStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.JobCardContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.NotifyStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.OutputStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.ScheduleStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	public PPOp(
		JCLPPParser.JclCommandStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.myType = ctx.getClass().getName();
		this.initialize(fileName, procName, ctx.SYMBOLIC(), LOGGER, CLI);
	}

	private void initialize(
			String fileName
			, String procName
			, List<org.antlr.v4.runtime.tree.TerminalNode> tn
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		symbolics.addAll(PPSymbolic.bunchOfThese(tn, fileName, procName, LOGGER, CLI));
	}

	/**
	Using the collection of SetSymbolValue passed in, resolve the Symbolic
	values, then store the resolved value locally.
	*/
	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		this.LOGGER.finer(this.myName + " " + this.myType + " resolveParms");

		for (PPSymbolic s: this.symbolics) {
			s.resolve(sets);
		}
	}

	/**
	Return the local collection of symbolics.
	*/
	public ArrayList<PPSymbolic> collectSymbolics() {
		this.LOGGER.finer(this.myName + " " + this.myType + " collectSymbolics");

		return this.symbolics;
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(
			this.myName 
			+ " type = |"
			+ this.myType
			+ " fileName = |" 
			+ this.fileName 
			+ "| procName = |" 
			+ this.procName 
			+ "| symbolics = |" 
			+ symbolics 
			+ "|"
			);

		return buf.toString();
	}

}
