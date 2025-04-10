/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;
import java.util.*;
import java.util.logging.*;

/**
Wrapper for the KeywordorSymbolicWrappers representing a dataset
name and member name.

Dataset name and member name are represented by instances of
KeywordOrSymbolicWrapper, which serves as a wrapper itself around
characters and/or symbolic parameters.

*/

public class DatasetNameWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private JCLParser.DatasetNameContext ctx = null;
	private KeywordOrSymbolicWrapper dsn = null;
	private KeywordOrSymbolicWrapper mem = null;
	private String procName = null;
	private Boolean inProc = null;

	public DatasetNameWrapper(
			JCLParser.DatasetNameContext ctx
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
		this.dsn = new KeywordOrSymbolicWrapper(this.ctx.keywordOrSymbolic(0), this.procName, this.LOGGER, this.CLI);
		if (this.ctx.keywordOrSymbolic(1) == null) {
		} else {
			this.mem = new KeywordOrSymbolicWrapper(this.ctx.keywordOrSymbolic(1), this.procName, this.LOGGER, this.CLI);
		}
	}

	/**
	Return a String comprised of the dataset name and its member, if extant.
	*/
	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer(this.getJustDSN());

		if (this.mem == null) {
		} else {
			buf.append("(" + this.getJustMember() + ")");
		}

		return buf.toString();
	}

	public String getJustDSN() {
		return this.dsn.getResolvedValue();
	}

	public String getJustMember() {
		if (this.mem == null) {
			return null;
		} else {
			return this.mem.getResolvedValue();
		}
	}

	public String toString() {
		StringBuffer buf = 
			new StringBuffer(
				this.myName 
				+ " procName = |" 
				+ this.procName 
				+ "| dsn = |" 
				+ this.dsn.getResolvedValue()
				);
		if (this.mem == null) {
			buf.append("|");
		} else {
			buf.append("(" + this.mem.getResolvedValue() + ")|)");
		}

		return buf.toString();
	}
}
