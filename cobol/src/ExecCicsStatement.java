
import java.util.*;
import java.io.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent an EXEC CICS API or SPI command.

This application only needs to know about a small subset of the API
commands, others are ignored.
*/

class ExecCicsStatement {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.ExecCicsStatementContext ctx = null;
	private ExecCicsStatementType type = null;
	private String program = null;
	private String transID = null;
	private String file = null;
	/*
	cicsText is what lies between EXEC CICS and END-EXEC.  This must
	be parsed with the CICSz parser.
	*/
	private StringBuffer cicsText = null;
	/*
	programText is what lies betweent the parentheses in a PROGRAM(...)
	option for a CICS command.  This must be parsed with the host
	language parser.  programText, transidText, and fileText are all
	mutually exclusive.
	*/
	private StringBuffer programText = null;
	/*
	transidText is what lies betweent the parentheses in a TRANSID(...)
	option for a CICS command.  This must be parsed with the host
	language parser.  programText, transidText, and fileText are all
	mutually exclusive.
	*/
	private StringBuffer transidText = null;
	/*
	fileText is what lies betweent the parentheses in a FILE(...)
	option for a CICS command.  This must be parsed with the host
	language parser.  programText, transidText, and fileText are all
	mutually exclusive.
	*/
	private StringBuffer fileText = null;
	/*
	When programText, transidText, or fileText are parsed with the
	host language parser, either an Identifier or a Literal results.
	*/
	private Identifier identifier = null;
	private Literal literal = null;
	private int line = -1;


	public ExecCicsStatement(
			CobolParser.ExecCicsStatementContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.line = ctx.start.getLine();

		this.parseCicsCommand();
		
		if (this.type != ExecCicsStatementType.CICSOTHER) {
			this.parseCicsCommandArg();
		}
		

	}

	private void parseCicsCommand() {
		StringBuffer sb = new StringBuffer();

		for (TerminalNode tn: this.ctx.CICS_TEXT()) {
			sb.append(tn.getSymbol().getText());
		}
		this.LOGGER.finest("CICS_TEXT = |" + sb + "|");
		this.cicsText = sb;
		sb.insert(0, "            EXEC CICS");
		sb.append("            END-EXEC");
		CharStream aCharStream = CharStreams.fromString(sb.toString());
		CICSzLexer.classicCOBOLCode = true;
		CICSzLexer lexer = new CICSzLexer(aCharStream);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CICSzParser parser = new CICSzParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		CICSzCommandListener listener = 
			new CICSzCommandListener(this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);

		this.type = listener.getType();
		this.programText = listener.getProgramText();
		this.fileText = listener.getFileText();
		this.transidText = listener.getTransidText();
	}
	
	private void parseCicsCommandArg() {
		// start the buffer with 12 spaces to get to COBOL area B
		StringBuffer sb = new StringBuffer("            ");
		
		if (this.programText != null) {
			sb.append(this.programText);
		} else if (this.fileText != null) {
			sb.append(this.fileText);
		} else if (this.transidText != null) {
			sb.append(this.transidText);
		} else {
			return;
		}

		CharStream aCharStream = CharStreams.fromString(sb.toString());
		CobolLexer lexer = new CobolLexer(aCharStream);
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
		CobolParser parser = new CobolParser(tokens);  //parse the tokens

		ParseTree tree = parser.startRule(); // parse the content and get the tree

		ParseTreeWalker walker = new ParseTreeWalker();

		IdentifierEtAlListener listener = 
			new IdentifierEtAlListener(this.LOGGER);

		LOGGER.finer("----------walking tree with " + listener.getClass().getName());

		walker.walk(listener, tree);
		
		if (listener.getIdentifierCtx() != null) {
			this.identifier = new Identifier(listener.getIdentifierCtx(), this.LOGGER);
		} else if (listener.getLiteralCtx() != null) {
			this.literal = new Literal(listener.getLiteralCtx());
		}
	}
	
	public ExecCicsStatementType getType() {
		return this.type;
	}

	public int getLine() {
		return this.line;
	}
	
	public Identifier getIdentifier() {
		return this.identifier;
	}
	
	public Literal getLiteral() {
		return this.literal;
	}
	
	public void writeOn(PrintWriter out, UUID parentUUID) {
		if (this.type == ExecCicsStatementType.CICSOTHER) {
			return;
		}
		
		String name = null;

		if (this.identifier != null) {
			name = this.identifier.getDataNameText();
		} else if (this.literal != null) {
			name = this.literal.getText();
		} else {
			name = "<NOTFND>";
		}

		out.printf(
			"%s,%s,%s,%s\n"
			, this.getType().name()
			, this.uuid.toString()
			, parentUUID.toString()
			, name);
	}

}
