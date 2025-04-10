/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents the parser construct singleOrMultipleValue, which
is intended to accomodate a wide range of JCL statement parameter values...

<p><ul>
<li><code>PARM=VAL</code>
<li><code>PARM=(VAL)</code>
<li><code>PARM=(VAL,VAL,VAL)</code>
<li><code>PARM=((VAL,VAL),VAL)</code>
<li><code>PARM=(VAL,(VAL,VAL))</code>
<li><code>PARM=(,(,VAL))</code>
<li><code>PARM=A=B</code>
<li><code>PARM=(VAL,A=B)</code>
<li><code>PARM=(VAL,,A=B)</code>
<li><code>PARM=(,,,A=B)</code>
<li><code>PARM=(,VAL,,A=B)</code>
</ul><p>

*/
public class SingleOrMultipleValueWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private JCLParser.SingleOrMultipleValueContext ctx = null;
	private ArrayList<KeywordOrSymbolicWrapper> kosw = new ArrayList<>();
	private ArrayList<EmbeddedEqualityWrapper> eew = new ArrayList<>();
	/**
	The ParameterString ArrayList in SingleOrMultipleValueWrapper is intended to
	assist in understanding JCL parameters with multiple values, e.g.
	<code>DISP</code>, <code>UNIT</code>, <code>VOL</code>, et. al.  It contains 
	commas and parentheses which
	are used to delineate the various values any of which may be missing.
	Without this list, determining the difference between <code>DISP=(&D)</code> and
	<code>DISP=(,&D)</code> would be difficult if <code>&D</code> remains unresolved.
	*/
	private ArrayList<ParameterString> parameterStrings = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;

	public SingleOrMultipleValueWrapper(
			JCLParser.SingleOrMultipleValueContext ctx
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
		this.LOGGER.fine(this.myName + " initialize()");

		this.kosw.addAll(
			KeywordOrSymbolicWrapper.bunchOfThese(
				ctx.keywordOrSymbolic()
				, this.procName
				, this.LOGGER
				, this.CLI
			)
		);

		for (JCLParser.ParenListContext p: this.ctx.parenList()) {
			this.kosw.addAll(
				KeywordOrSymbolicWrapper.bunchOfThese(
					p.keywordOrSymbolic()
					, this.procName
					, this.LOGGER
					, this.CLI
				)
			);
		}

		this.eew.addAll(
			EmbeddedEqualityWrapper.bunchOfThese(
				this.ctx.embeddedEquality()
				, this.procName
				,  this.LOGGER
				, this.CLI
			)
		);

		this.buildParameterStrings();
	}


	/**
	The ParameterString class is handy for reconstructing tokens separated
	by the ANTLR lexer +? operator.  The addToParameterStringsIfAbsent method
	to deduplicate these tokens is necessary but I have no idea why there ended
	up being duplicate tokens.  Possibly it's due to the complex nested
	nature of this class.
	*/
	private void buildParameterStrings() {
		this.LOGGER.fine(this.myName + " buildParameterStrings()");

		this.LOGGER.finest(this.myName + " buildParameterStrings() KeywordOrSymbolicWrapper");
		for (KeywordOrSymbolicWrapper k: this.kosw) {
			this.addToParameterStringsIfAbsent(
				new ParameterString(
					k.getResolvedValue()
					, k.getSortKey()
					, this.LOGGER
					, this.CLI
				)
			);
		}

		this.addTerminalNodesToParameterStrings(this.ctx.COMMA());
		this.addTerminalNodesToParameterStrings(this.ctx.LPAREN());
		this.addTerminalNodesToParameterStrings(this.ctx.RPAREN());

		this.LOGGER.finest(this.myName + " buildParameterStrings() ParenListContext");
		for (JCLParser.ParenListContext p: this.ctx.parenList()) {
			for (TerminalNode t: p.COMMA()) {
				this.addTerminalNodeToParameterStrings(t);
			}
			this.addTerminalNodeToParameterStrings(p.LPAREN());
			this.addTerminalNodeToParameterStrings(p.RPAREN());
		}

		this.LOGGER.finest(this.myName + " buildParameterStrings() EmbeddedEqualityWrapper");
		for (EmbeddedEqualityWrapper e: this.eew) {
			this.addToParameterStringsIfAbsent(
				new ParameterString(
					e.getResolvedKywd()
					, e.getKywdSortKey()
					, this.LOGGER
					, this.CLI
				)
			);
			this.LOGGER.finest(this.myName + " buildParameterStrings() e.getSingleOrMultipleValueWrapper().getKeywordOrSymbolicWrapper()");
			for (KeywordOrSymbolicWrapper k: e.
											getSingleOrMultipleValueWrapper().
											getKeywordOrSymbolicWrappers()) {
				this.addToParameterStringsIfAbsent(
					new ParameterString(
						k.getResolvedValue()
						, k.getSortKey()
						, this.LOGGER
						, this.CLI
					)
				);
			}
			this.LOGGER.finest(this.myName + " buildParameterStrings() e.getSingleOrMultipleValueWrapper().getParameterStrings()");
			for (ParameterString ps: e.getSingleOrMultipleValueWrapper().getParameterStrings()) {
				this.addToParameterStringsIfAbsent(ps);
			}
			this.LOGGER.finest(this.myName + " buildParameterStrings() e.getEqual()");
			this.addToParameterStringsIfAbsent(
				new ParameterString(
					e.getEqual()
					, this.LOGGER
					, this.CLI
				)
			);
		}

		this.parameterStrings.sort(Comparator.comparingLong(ParameterString::getSortKey));
	}

	private void addTerminalNodesToParameterStrings(List<TerminalNode> lt) {
		this.LOGGER.finer(this.myName + " addTerminalNodesToParameterStrings()");

		for (TerminalNode t: lt) {
			this.addTerminalNodeToParameterStrings(t);
		}
	}

	private void addTerminalNodeToParameterStrings(TerminalNode t) {
		this.LOGGER.finer(this.myName + " addTerminalNodeToParameterStrings()");

		this.addToParameterStringsIfAbsent(
			new ParameterString(
				t
				, this.LOGGER
				, this.CLI
			)
		);
	}

	/**
	Yes, this is a manual reimplementation of Collection.contains().  When I 
	named isProbablyTheSameAs() equals() in ParameterString and tried using
	contains(), it didn't work.  The equals() method was never executed.  When
	I used a HashSet to attempt deduplication, it didn't work.
	<p>I have neither the time nor the patience to debug further, I just want 
	something that works.
	*/
	private void addToParameterStringsIfAbsent(ParameterString ps) {
		this.LOGGER.finest(this.myName + "addToParameterStringsIfAbsent() ps = |" + ps + "|");
		for (ParameterString ps0: this.parameterStrings) {
			if (ps0.isProbablyTheSameAs(ps)) return;
		}

		this.parameterStrings.add(ps);
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		for (KeywordOrSymbolicWrapper k: this.kosw) {
			buf.append(k.getResolvedValue());
			buf.append(" ");
		}

		return buf.toString();
	}

	public ArrayList<KeywordOrSymbolicWrapper> getKeywordOrSymbolicWrappers() {
		return this.kosw;
	}

	/**
	Classes implementing wrappers for DD statement parameters can use
	this method to retrieve an ordered collection of parameter strings 
	which can be used to create meaningful data structures.
	*/
	public ArrayList<ParameterString> getParameterStrings() {
		return this.parameterStrings;
	}

	public String toString() {
		return this.myName + " procName = |" + this.procName + "| kosw = |" + this.kosw + "|";
	}
}
