/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a single symbolic parameter, encapsulating
the logic necessary to correctly substitute its resolved value
given a list of system symbolics, symbolics whose value is set by
a SET statement, symbolics whose value is set on an EXEC statement,
and symbolics whose value is set on a PROC statement.
*/
public class PPSymbolic {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private String fileName = null;
	private String text = null;
	private String resolvedText = null;
	private org.antlr.v4.runtime.Token token = null;
	private org.antlr.v4.runtime.tree.TerminalNode terminalNode = null;
	private String procName = null;
	private Boolean inProc = null;
	private int line = -1;
	private int posn = -1;
	private int len = -1;
	private PPSetSymbolValue ssv = null;

	public static ArrayList<PPSymbolic> bunchOfThese(List<org.antlr.v4.runtime.tree.TerminalNode> tn
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<PPSymbolic> symbolics = new ArrayList<>();		

		for (org.antlr.v4.runtime.tree.TerminalNode aNode: tn) {
			symbolics.add(new PPSymbolic(aNode, fileName, procName, LOGGER, CLI));
		}

		return symbolics;
	}

	public PPSymbolic(
			org.antlr.v4.runtime.tree.TerminalNode tn
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.terminalNode = tn;
		this.token = tn.getSymbol();
		this.fileName = fileName;
		this.procName = procName;
		this.line = this.token.getLine();
		this.posn = this.token.getCharPositionInLine();
		this.text = this.token.getText();
		this.len = this.text.length();
		this.inProc = !(procName == null);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.LOGGER.finer(this.myName + " " + this.getText() + " instantiated from " + this.fileName);
	}

	public String getText() {
		return this.text;
	}

	public String getParmName() {
		return this.getText().substring(1);
	}

	public int getLine() {
		return this.line;
	}

	public int getPosn() {
		return this.posn;
	}

	public int getLen() {
		return this.len;
	}

	public String getFileName() {
		return this.fileName;
	}

	public String getProcName() {
		return this.procName;
	}

	public Boolean isResolved() {
		return (this.resolvedText != null && !this.ssv.isParameterized());
	}

	private void setResolvedValue(PPSetSymbolValue s) {
		this.LOGGER.finer(
			myName 
			+ " setResolvedValue text = |" 
			+ this.getText() 
			+ "| setResolvedValue(" 
			+ s.getParmValue() 
			+ ")"
			);
		this.resolvedText = s.getParmValue();
		this.ssv = s;
	}

	public String getResolvedText() {
		if (this.ssv == null || !this.ssv.isParameterized()) {
			return this.resolvedText;
		} else {
			return this.ssv.getResolvedValue();
		}
	}

	/**
	Resolve the value of this PPSymbolic according to the collection of
	PPSetSymbolValue instances passed in.

	<p>This is complex because the JCL rules for symbolic substitution are
	complex.
	*/
	public void resolve(ArrayList<PPSetSymbolValue> sets) {
		this.LOGGER.finer(myName + " resolve this: |" + this + "| sets: " + sets + "|");

		PPSetSymbolValue[] matching_sets =
			sets.stream()
			.filter(s -> s.getParmName().equals(this.getParmName()))
			.toArray(PPSetSymbolValue[]::new);
		for(PPSetSymbolValue s: matching_sets) {
			this.LOGGER.finest(myName + " resolve s: |" + s + "|");
			switch(s.getSetType()) {
				case SET:
					if ((this.inProc  
						&& !s.parmSetByExec(sets, this.procName) && !s.parmDefinedByProc(sets))
					|| (!this.inProc && !s.inProc && this.getLine() > s.getLine())
					) {
						this.setResolvedValue(s);
					}
					break;
				case PROC:
					if ((this.inProc && s.inProc && s.procName.equals(this.procName) 
						&& !s.parmSetByExec(sets, this.procName))
					) {
						this.setResolvedValue(s);
					}
					break;
				case EXEC:
					if (this.inProc) {
						this.setResolvedValue(s);
					}
					break;
				case SYS:
					this.setResolvedValue(s);
					break;
				default:
					break;
			}
		}
	}

	public String toString() {
		return
			this.myName
			+ " text = |" + this.getText()
			+ "| resolvedText = |" + this.getResolvedText()
			+ "| line = |" + this.getLine()
			+ "| posn = |" + this.getPosn()
			+ "| fileName = |" + this.getFileName()
			+ "| procName = |" + this.getProcName()
			+ "|";
	}

}

