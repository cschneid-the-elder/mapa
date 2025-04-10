/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPKeywordValueWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private String value = null;
	private String resolvedValue = null;
	private String procName = null;
	private int line = -1;
	private int posn = -1;
	private int len = -1;
	private KeywordValueType type = null;
	private PPSymbolic symbolic = null;

	public static ArrayList<PPKeywordValueWrapper> bunchOfThese(
			List<JCLPPParser.KeywordOrSymbolicContext> ctxList
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		LOGGER.finest(
			"PPKeywordOrSymbolicWrapper bunchOfThese ctxList.size(): " 
			+ ctxList.size());

		ArrayList<PPKeywordValueWrapper> kvw = new ArrayList<>();

		for (JCLPPParser.KeywordOrSymbolicContext k: ctxList) {
			kvw.addAll(PPKeywordValueWrapper.bunchOfThese(k, procName, LOGGER, CLI));
		}

		return kvw;
	}

	public static ArrayList<PPKeywordValueWrapper> bunchOfThese(
			JCLPPParser.KeywordOrSymbolicContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<PPKeywordValueWrapper> kvw = new ArrayList<>();

		if (ctx.QUOTED_STRING_FRAGMENT() == null 
		|| ctx.QUOTED_STRING_FRAGMENT().size() == 0) {
		} else {
			LOGGER.finest(
				"PPKeywordValueWrapper bunchOfThese ctx.QUOTED_STRING_FRAGMENT().size(): " 
				+ ctx.QUOTED_STRING_FRAGMENT().size());
			for (TerminalNode t: ctx.QUOTED_STRING_FRAGMENT()) {
				kvw.add(
					new PPKeywordValueWrapper(
						t
						, KeywordValueType.QUOTED_STRING
						, procName
						, LOGGER
						, CLI));
			}
		}

		if (ctx.KEYWORD_VALUE() == null 
		|| ctx.KEYWORD_VALUE().size() == 0) {
		} else {
			LOGGER.finest(
				"PPKeywordValueWrapper bunchOfThese ctx.KEYWORD_VALUE().size(): " 
				+ ctx.KEYWORD_VALUE().size());
			for (TerminalNode t: ctx.KEYWORD_VALUE()) {
				kvw.add(
					new PPKeywordValueWrapper(
						t
						, KeywordValueType.UNQUOTED_STRING
						, procName
						, LOGGER
						, CLI));
			}
		}

		if (ctx.SYMBOLIC() == null 
		|| ctx.SYMBOLIC().size() == 0) {
		} else {
			LOGGER.finest(
				"PPKeywordValueWrapper bunchOfThese ctx.SYMBOLIC().size(): " 
				+ ctx.SYMBOLIC().size());
			for (TerminalNode t: ctx.SYMBOLIC()) {
				kvw.add(
					new PPKeywordValueWrapper(
						t
						, KeywordValueType.SYMBOLIC
						, procName
						, LOGGER
						, CLI));
			}
		}

		if (ctx.QS_AMPERSAND() == null 
		|| ctx.QS_AMPERSAND().size() == 0) {
		} else {
			LOGGER.finest(
				"PPKeywordValueWrapper bunchOfThese ctx.QS_AMPERSAND().size(): " 
				+ ctx.QS_AMPERSAND().size());
			for (TerminalNode t: ctx.QS_AMPERSAND()) {
				kvw.add(
					new PPKeywordValueWrapper(
						t
						, KeywordValueType.AMPERSAND
						, procName
						, LOGGER
						, CLI));
			}
		}

		if (ctx.QS_SQUOTE2() == null 
		|| ctx.QS_SQUOTE2().size() == 0) {
		} else {
			LOGGER.finest(
				"PPKeywordValueWrapper bunchOfThese ctx.QS_SQUOTE2().size(): " 
				+ ctx.QS_SQUOTE2().size());
			for (TerminalNode t: ctx.QS_SQUOTE2()) {
				kvw.add(
					new PPKeywordValueWrapper(
						t
						, KeywordValueType.SINGLE_QUOTE
						, procName
						, LOGGER
						, CLI));
			}
		}

		return kvw;
	}

	public PPKeywordValueWrapper(
			TerminalNode t
			, KeywordValueType type
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.value = t.getSymbol().getText();
		this.line = t.getSymbol().getLine();
		this.posn = t.getSymbol().getCharPositionInLine();
		this.len = this.value.length();
		this.type = type;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.procName = procName;


		switch(this.type) {
			case AMPERSAND :
				this.setResolvedValue("&");
				break;
			case SINGLE_QUOTE :
				this.setResolvedValue("'");
				break;
			case SYMBOLIC :
				this.symbolic = new PPSymbolic(t, null, this.procName, this.LOGGER, this.CLI);
				break;
			default :
				break;
		}
	}

	public String getValue() {
		return this.value;
	}

	public String getResolvedValue() {
		if (this.isParm() && this.symbolic.isResolved()) {
			return this.symbolic.getResolvedText();
		} else {
			return this.getValue();
		}
	}

	public int getLine() {
		return this.line;
	}

	public int getPosn() {
		return this.posn;
	}

	public KeywordValueType getType() {
		return this.type;
	}

	public PPSymbolic getSymbolic() {
		return this.symbolic;
	}

	public Boolean isParm() {
		return this.type == KeywordValueType.SYMBOLIC;
	}

	public Boolean isResolved() {
		if (this.isParm()) {
			return this.symbolic.isResolved();
		} else {
			return true;
		}
	}

	public long getSortKey() {
		return ((long)this.line * (long)Integer.MAX_VALUE) + this.posn;
	}

	public String getParmName() {
		if (this.isParm()) {
			return this.value.substring(1);
		} else {
			return null;
		}
	}

	public void resolve(ArrayList<PPSetSymbolValue> sets) {
		switch(this.type) {
			case SYMBOLIC :
				this.symbolic.resolve(sets);
				break;
			default :
				break;
		}
	}

	public void setResolvedValue(String resolvedValue) {
		this.LOGGER.fine(
			this.myName 
			+ " setResolvedValue this = |" 
			+ this 
			+ "| resolvedValue = |" 
			+ resolvedValue + "|");

		this.resolvedValue = resolvedValue;
	}

	public String toString() {
		return
				"value = |" 
				+ this.getValue() 
				+ "| line = |"
				+ this.getLine()
				+ "| posn = |"
				+ this.getPosn()
				+ "| sortKey = |"
				+ this.getSortKey()
				+ "| type = |"
				+ this.getType()
				+ "|"
				;
	}
}
