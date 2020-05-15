/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents individual components of a JCL statement parameter,
including any commas and parentheses.

<p>KeywordValueWrapper is insufficient to task as it does not and cannot
know about COMMA, LPAREN, and RPAREN.
*/

public class ParameterString {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private String value = null;
	private long sortKey = -1;
	private int len = -1;

	public ParameterString(
			TerminalNode t
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.value = t.getSymbol().getText();
		this.len = this.value.length();
		this.myName = this.getClass().getName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;

		long line = t.getSymbol().getLine();
		long posn = t.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

		this.LOGGER.fine(
			this.myName 
			+ " value = |" 
			+ this.value 
			+ "| sortKey = |" 
			+ this.sortKey 
			+ "|"
			);
	}

	public ParameterString(
			String s
			, long sortKey
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.value = s;
		this.len = this.value.length();
		this.sortKey = sortKey;
		this.LOGGER = LOGGER;
		this.CLI = CLI;

		this.LOGGER.fine(
			this.myName 
			+ " value = |" 
			+ this.value 
			+ "| sortKey = |" 
			+ this.sortKey 
			+ "|"
			);
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public String getValue() {
		return this.value;
	}
}
