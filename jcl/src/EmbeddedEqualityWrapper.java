/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents the parser construct embeddedEquality, which 
attempts to capture constructs such as...

<p><ul>
<li><code>UNIT=AFF=DDNAME01</code>
<li><code>UNIT=(SYSDA,SEP=(SYSLIN,SYSLMOD))</code>
</ul>

*/

public class EmbeddedEqualityWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private JCLParser.EmbeddedEqualityContext ctx = null;
	private KeywordOrSymbolicWrapper kywd = null;
	private TerminalNode equal = null;
	private SingleOrMultipleValueWrapper val = null;
	private String procName = null;
	private Boolean inProc = null;

	/**
	Factory method to construct a collection of instances of this class
	from a List obtained from the parser.
	*/
	public static ArrayList<EmbeddedEqualityWrapper> bunchOfThese(
			List<JCLParser.EmbeddedEqualityContext> ctxList
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<EmbeddedEqualityWrapper> eewList = new ArrayList<>();

		for (JCLParser.EmbeddedEqualityContext e: ctxList) {
			eewList.add(new EmbeddedEqualityWrapper(e, procName, LOGGER, CLI));
		}

		LOGGER.finest("EmbeddedEqualityWrapper bunchOfThese ctxList.size(): " + ctxList.size());
		LOGGER.finest("EmbeddedEqualityWrapper bunchOfThese eewList: " + eewList);
		return eewList;
	}

	public EmbeddedEqualityWrapper(
			JCLParser.EmbeddedEqualityContext ctx
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
		this.kywd = 
			new KeywordOrSymbolicWrapper(
				ctx.keywordOrSymbolic()
				, this.procName
				, this.LOGGER
				, this.CLI
				);

		this.val = 
			new SingleOrMultipleValueWrapper(
				ctx.singleOrMultipleValue()
				, this.procName
				, this.LOGGER
				, this.CLI
				);

		this.equal = ctx.EQUAL();
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

	public long getKywdSortKey() {
		return this.kywd.getSortKey();
	}

	public KeywordOrSymbolicWrapper getKeywordOrSymbolicWrapper() {
		return this.kywd;
	}

	public SingleOrMultipleValueWrapper getSingleOrMultipleValueWrapper() {
		return this.val;
	}

	public TerminalNode getEqual() {
		return this.equal;
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
