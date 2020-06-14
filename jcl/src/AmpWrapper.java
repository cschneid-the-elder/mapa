/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents the AMP parameter of a DD statement, which is
relatively complex in syntax, such that I've decided it must be 
processed via its own grammar.

*/
public class AmpWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = this.getClass().getName();
	private JCLParser.DdParmAMPContext ctx = null;
	private JCLParser.SingleOrMultipleValueContext somvCtx = null;
	private SingleOrMultipleValueWrapper somv = null;
	private String procName = null;
	private ArrayList<AmpParmWrapper> ampws = new ArrayList<>();

	public AmpWrapper(
			JCLParser.DdParmAMPContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.procName = procName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		this.LOGGER.fine(this.myName + " initialize()");
		if (this.ctx == null) {
		} else {
			this.somvCtx = this.ctx.singleOrMultipleValue();
			this.somv = new SingleOrMultipleValueWrapper(this.somvCtx, this.procName, this.LOGGER, this.CLI);
		}
		String toParse = this.getStringForParsing();
		this.LOGGER.finest(this.myName + " toParse = |" + toParse + "|");
		this.lexAndParseAmpParms(toParse, this.ampws);
		this.LOGGER.finest(this.myName + " ampws = |" + this.ampws + "|");
	}

	private String getStringForParsing() {
		StringBuffer sb = new StringBuffer();

		for (ParameterString ps: this.somv.getParameterStrings()) {
			sb.append(ps.getValue());
		}

		return sb.toString();
	}

	private void lexAndParseAmpParms(
					String toParse
					, ArrayList<AmpParmWrapper> ampws
					) {
		LOGGER.fine("lexAndParseAmpParms toParse = |" + toParse + "|");

		CharStream cs = CharStreams.fromString(toParse);  //data to be parsed
		JCLDDAMPLexer lexer = new JCLDDAMPLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		JCLDDAMPParser parser = new JCLDDAMPParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		AmpParmListener listener = new AmpParmListener(ampws, this.LOGGER, this.CLI);
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		for (AmpParmWrapper apw: this.ampws) {
			apw.toCSV(csvOut, parentUUID);
		}
	}

	public String toString() {
		StringBuffer buf = 
			new StringBuffer(
				this.myName 
				);

		return buf.toString();
	}
}
