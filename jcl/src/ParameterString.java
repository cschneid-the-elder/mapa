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

	public static ArrayList<ParameterString> bunchOfThese(
			List<TerminalNode> listOfT
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<ParameterString> ps = new ArrayList<>();
		for (TerminalNode t: listOfT) {
			ps.add(new ParameterString(t, LOGGER, CLI));
		}
		return ps;
	}

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

		this.LOGGER.fine(this.toString());
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
		this.myName = this.getClass().getName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;

		this.LOGGER.fine(this.toString());
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public String getValue() {
		return this.value;
	}

	/**
	This isn't an equals() method because, well, if it returns true there's
	a non-zero probability that the same value is in the same place in a 
	different file.  This method is only intended to be used in the
	buildParameterStrings() method in class SingleOrMultipleValueWrapper.
	*/
	public Boolean isProbablyTheSameAs(ParameterString ps) {
		if (ps == null) return false;

		return (this.getValue().equals(ps.getValue()) && (this.getSortKey() == ps.getSortKey()));
	}

	public String toString() {
		return 
			this.myName 
			+ " value = |" 
			+ this.value 
			+ "| sortKey = |" 
			+ this.sortKey 
			+ "|"
			;
	}
}
