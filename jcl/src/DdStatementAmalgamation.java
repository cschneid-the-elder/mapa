
import java.util.*;
import java.util.logging.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent a DD statement and any/all DD
statements concatenated to it.

*/
public class DdStatementAmalgamation {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private String ddName = null;
	private String procName = null;
	private String fileName = null;
	private Boolean inProc = null;
	private JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx = null;
	private ArrayList<DdStatement> dds = null;

	public DdStatementAmalgamation(
			JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx
			, String procName
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ddStmtAmlgnCtx = ddStmtAmlgnCtx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		this.LOGGER.fine(this.myName + " initialize()");
		this.setDdName(this.ddStmtAmlgnCtx.ddStatement().ddName().DOT()
			, this.ddStmtAmlgnCtx.ddStatement().ddName().NAME_FIELD());
		this.dds = DdStatement.bunchOfThese(this.ddStmtAmlgnCtx, this.procName, this.ddName, this.fileName, this.LOGGER, this.CLI);
	}

	private void setDdName(TerminalNode dot, List<TerminalNode> name_field) {
		this.LOGGER.fine(this.myName + " setDdName()");
		StringBuffer buf = new StringBuffer();

		if (dot == null) {
			buf.append(name_field.get(0).getSymbol().getText());
		} else {
			buf.append(name_field.get(0).getSymbol().getText());
			buf.append(dot.getSymbol().getText());
			buf.append(name_field.get(1).getSymbol().getText());
		}

		this.ddName = buf.toString();
	}

	public String getDdName() {
		return this.ddName;
	}

	/**
	The <code>SYSTSIN DD</code> is how commands are fed into TSO in 
	batch.  For current purposes, commands of interest are CALL and 
	the RUN subcommand of the DSN command.  Additional parsers are
	called into service to process the input.
	*/
	public void processSYSTSIN(ArrayList<String> tsoCallPgms
							, ArrayList<String> tsoDSNPgms
							, ArrayList<String> tsoDSNPlans) {

		this.LOGGER.fine(this.myName + " " + this.getDdName() + " processSYSTSIN");

		if (this.getDdName().equals("SYSTSIN")) {
		} else {
			this.LOGGER.fine(this.myName + " ddName = |" + this.getDdName() + "| returning...");
			return;
		}

		String contents = null;
		try {
			contents = this.getDatasetContents();
			this.LOGGER.finest(this.myName + " processSYSTSIN contents = |" + contents + "|"); 
		} catch (Exception e) {
			this.LOGGER.warning(this.myName + " exception " + e + " processing SYSTSIN");
			return;
		}

		ArrayList<TSOParser.DsnStreamContext> dsnStreams = new ArrayList<>();
		this.lexAndParseDsnStreams(contents, dsnStreams);

		for (TSOParser.DsnStreamContext dsnsCtx: dsnStreams) {
			DsnStreamWrapper dsnsw = new DsnStreamWrapper(dsnsCtx, this.LOGGER, this.CLI);
			tsoDSNPgms.addAll(dsnsw.getPgms());
			tsoDSNPlans.addAll(dsnsw.getPlans());
		}

		ArrayList<TSOParser.CallMemberContext> callMemberCtxs = new ArrayList<>();
		this.lexAndParseTSOCalls(contents, callMemberCtxs);

		for (TSOParser.CallMemberContext callMemberCtx: callMemberCtxs) {
			tsoCallPgms.add(callMemberCtx.CALL_MEMBER().getText());
		}

	}

	/**
	Obtain the contents of all files concatenated to this DD.  Currently this
	only applies to SYSTSIN, but could work for any DD.
	*/
	private String getDatasetContents() throws Exception {
		StringBuilder contents = new StringBuilder();

		for (DdStatement dd: dds) {
			dd.getDatasetContents(contents);
		}

		return contents.toString();
	}

	private void lexAndParseDsnStreams(
					String toParse
					, ArrayList<TSOParser.DsnStreamContext> dsnStreams
					) {
		LOGGER.fine(this.myName + " lexAndParseDsnStreams() toParse = |" + toParse + "|");

		CharStream cs = CharStreams.fromString(toParse);  //data to be parsed
		TSOLexer lexer = new TSOLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		TSOParser parser = new TSOParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		DsnStreamListener listener = new DsnStreamListener(dsnStreams, this.LOGGER, this.CLI);
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	private void lexAndParseTSOCalls(
					String toParse
					, ArrayList<TSOParser.CallMemberContext> callMemberCtxs
					) {
		LOGGER.fine(this.myName + " lexAndParseTSOCalls() toParse = |" + toParse + "|");

		CharStream cs = CharStreams.fromString(toParse);  //data to be parsed
		TSOLexer lexer = new TSOLexer(cs);  //instantiate a lexer
		lexer.removeErrorListeners();
		lexer.addErrorListener(new StdoutLexerErrorListener());
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		TSOParser parser = new TSOParser(tokens);  //parse the tokens	
		parser.removeErrorListeners();
		parser.addErrorListener(new StdoutParserErrorListener());

		ParseTree tree = parser.startRule(); // parse the content and get the tree
	
		ParseTreeWalker walker = new ParseTreeWalker();
	
		TSOCallMemberListener listener = new TSOCallMemberListener(callMemberCtxs, this.LOGGER, this.CLI);
	
		LOGGER.finer("----------walking tree with " + listener.getClass().getName());
	
		walker.walk(listener, tree);

	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		this.LOGGER.fine(this.myName + " toCSV");

		for (DdStatement dd: this.dds) {
			csvOut.append(System.getProperty("line.separator"));
			dd.toCSV(csvOut, parentUUID);
		}
	}

}
