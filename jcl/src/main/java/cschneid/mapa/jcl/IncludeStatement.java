/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a JCL INCLUDE statement.  Note that the Demo01
application resolves INCLUDE statements and removes them, instances
of this class will represent INCLUDE statements that could not be
resolved in preprocessing.

*/

public class IncludeStatement {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private JCLParser.IncludeStatementContext ctx = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private KeywordOrSymbolicWrapper kywd = null;
	private int line = -1;  // 1 to n
	private int posn = -1;  // 0 to n-1
	public Boolean inProc = false;
	public String procName = null;
	private String nameField = null;

	public IncludeStatement(
		JCLParser.IncludeStatementContext ctx
		, String fileName
		, String procName
		, Logger LOGGER
		, TheCLI CLI
		) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		this.initialize(LOGGER, CLI);
		LOGGER.fine(this.myName + " " + this.nameField + " instantiated from " + this.fileName);
	}

	private void initialize(Logger LOGGER, TheCLI CLI) {
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		if (this.ctx.NAME_FIELD() == null) {
			this.nameField = "_NONAME_";
		} else {
			this.nameField = this.ctx.NAME_FIELD().getSymbol().getText();
		}
	}

	public int getLine() {
		if (this.line == -1) {
			if (this.ctx.INCLUDE_PARM_MEMBER() == null) {
				this.LOGGER.severe(
					this.myName
					+ "getLine() found " 
					+ this.ctx.getClass().getName() 
					+ "INCLUDE_PARM_MEMBER() == null"
				);
			} else {
				this.line = this.ctx.INCLUDE_PARM_MEMBER().getSymbol().getLine();
			}
		}

		return this.line;
	}

	public int getPosn() {
		if (this.posn == -1) {
			if (this.ctx.EQUAL() == null) {
				this.LOGGER.severe(
					this.myName 
					+ "getPosn() found " 
					+ this.ctx.getClass().getName() 
					+ "EQUAL() == null"
				);
			} else {
				this.posn = this.ctx.EQUAL().getSymbol().getCharPositionInLine() + 1;
			}
		}

		return this.posn;
	}

	public String getOriginalText() {
		if (this.originalText == null) {
			this.originalText = kywd.getValue();
		}

		return this.originalText;
	}

	public String getResolvedText() {
		return this.kywd.getResolvedValue();
	}

	public String toString() {
		return 
			this.myName 
			+ " fileName: |" 
			+ this.fileName 
			+ "| line: |" 
			+ this.getLine() 
			+ "| posn: |" 
			+ this.getPosn() 
			+ "| originalText: |" 
			+ this.getOriginalText() 
			+ "| resolvedText: |"
			+ this.getResolvedText()
			+ "| inProc: |" 
			+ this.inProc + "|"
		;
	}

}
