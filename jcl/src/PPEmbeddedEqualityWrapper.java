/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;

public class PPEmbeddedEqualityWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private JCLPPParser.EmbeddedEqualityContext ctx = null;
	private PPKeywordOrSymbolicWrapper kywd = null;
	private PPSingleOrMultipleValueWrapper val = null;
	private String procName = null;
	private Boolean inProc = null;

	public static ArrayList<PPEmbeddedEqualityWrapper> bunchOfThese(
			List<JCLPPParser.EmbeddedEqualityContext> ctxList
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<PPEmbeddedEqualityWrapper> eewList = new ArrayList<>();

		for (JCLPPParser.EmbeddedEqualityContext e: ctxList) {
			eewList.add(new PPEmbeddedEqualityWrapper(e, procName, LOGGER, CLI));
		}

		LOGGER.finest("PPEmbeddedEqualityWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("PPEmbeddedEqualityWrapper bunchOfThese eewList: " + eewList);
		return eewList;
	}

	public PPEmbeddedEqualityWrapper(
			JCLPPParser.EmbeddedEqualityContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI);
		this.val = new PPSingleOrMultipleValueWrapper(ctx.singleOrMultipleValue(), this.procName, this.LOGGER, this.CLI);
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> symbolics) {
		LOGGER.fine(this.myName + " resolveParms symbolics = |" + symbolics + "|");
		kywd.resolveParms(symbolics);
		val.resolveParms(symbolics);
	}

	public String getResolvedKywd() {
		StringBuffer buf = new StringBuffer();

		buf.append(this.kywd.getResolvedValue());

		return buf.toString();
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		buf.append(this.val.getResolvedValue());

		return buf.toString();
	}

	public ArrayList<PPSymbolic> collectSymbolics() {
		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		symbolics.addAll(kywd.collectSymbolics());
		symbolics.addAll(val.collectSymbolics());

		return symbolics;
	}

	public String toString() {
		return 
			this.myName 
			+ " procName = |" 
			+ this.procName 
			+ "| kywd = |" 
			+ this.kywd 
			+ "| val = |" 
			+ this.val 
			+ "|";
	}
}
