/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;

public class PPSingleOrMultipleValueWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLPPParser.SingleOrMultipleValueContext ctx = null;
	private ArrayList<PPKeywordOrSymbolicWrapper> kosw = new ArrayList<>();
	private ArrayList<PPEmbeddedEqualityWrapper> eew = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;

	public PPSingleOrMultipleValueWrapper(
			JCLPPParser.SingleOrMultipleValueContext ctx
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
		myName = this.getClass().getName();
		this.kosw.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(this.ctx.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI));
		for (JCLPPParser.ParenListContext p: this.ctx.parenList()) {
			this.kosw.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(p.keywordOrSymbolic(), this.procName, this.LOGGER, this.CLI));
		}
		this.eew.addAll(PPEmbeddedEqualityWrapper.bunchOfThese(this.ctx.embeddedEquality(), this.procName,  this.LOGGER, this.CLI));
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.fine(this.myName + " resolveParms symbolics = |" + symbolics + "|");
		for (PPKeywordOrSymbolicWrapper k: this.kosw) {
			k.resolveParms(symbolics);
		}

		for (PPEmbeddedEqualityWrapper e: this.eew) {
			e.resolveParms(symbolics);
		}
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		for (PPKeywordOrSymbolicWrapper k: this.kosw) {
			buf.append(k.getResolvedValue());
			buf.append(" ");
		}

		return buf.toString();
	}

	public ArrayList<PPSymbolic> collectSymbolics() {
		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: this.kosw) {
			symbolics.addAll(k.collectSymbolics());
		}
		for (PPEmbeddedEqualityWrapper e: this.eew) {
			symbolics.addAll(e.collectSymbolics());
		}

		return symbolics;
	}

	public String toString() {
		return 
			this.myName 
			+ " procName = |" 
			+ this.procName 
			+ "| kosw = |" 
			+ this.kosw 
			+ "| eew = |"
			+ this.eew
			+ "|"
			;
	}
}
