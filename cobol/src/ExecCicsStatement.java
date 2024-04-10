
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
*/

class ExecCicsStatement {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.ExecCicsStatementContext ctx = null;
	private ArrayList<String> cicsKeywords = new ArrayList<>();
	private ArrayList<CicsKeywordWithArg> cicsKeywordsWithArg = new ArrayList<>();
	private ExecCicsStatementType type = null;
	private CicsKeywordWithArg program = null;
	private CicsKeywordWithArg transID = null;
	private CicsKeywordWithArg file = null;
	private StringBuffer cicsText = null;
	private StringBuffer programText = null;
	private StringBuffer transidText = null;
	private StringBuffer fileText = null;
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
		this.parseCicsCommandArg();
		
		// previous code follows
		for (CobolParser.CicsKeywordContext kywdCtx: this.ctx.cicsKeyword()) {
			if (kywdCtx.cobolWord() != null) {
				CobolWord source = new CobolWord(kywdCtx.cobolWord()); 
				this.cicsKeywords.add(source.getText().toUpperCase());
			} else {
				CicsWord source = new CicsWord(kywdCtx.cicsWord()); 
				this.cicsKeywords.add(source.getText().toUpperCase());
			}
		}
		for (CobolParser.CicsKeywordWithArgContext kywdWithArgCtx: this.ctx.cicsKeywordWithArg()) {
			this.cicsKeywordsWithArg.add(new CicsKeywordWithArg(kywdWithArgCtx, this.LOGGER));
		}
		String aKywd = null;
        if (this.cicsKeywords.size() > 0) {
			aKywd = this.cicsKeywords.get(0);
		} else if (this.cicsKeywordsWithArg.size() > 0) {
			aKywd = this.cicsKeywordsWithArg.get(0).getKeyword();
		} else {
			aKywd = "";
		}
		switch(aKywd) {
			case "LINK":
				this.type = ExecCicsStatementType.CICSLINK;
				this.findProgram();
				if (this.program == null) {
					this.type = ExecCicsStatementType.CICSOTHER;
				}
				break;
			case "XCTL":
				this.type = ExecCicsStatementType.CICSXCTL;
				this.findProgram();
				break;
			case "START":
				this.type = ExecCicsStatementType.CICSSTARTTRANSID;
				this.findTransID();
				break;
			case "RUN":
				this.type = ExecCicsStatementType.CICSRUNTRANSID;
				this.findTransID();
                if (this.transID == null) {
					this.type = ExecCicsStatementType.CICSOTHER;
				}
				break;
			case "DELETE":
				this.type = ExecCicsStatementType.CICSDELETE;
				this.findFile();
				if (this.file == null) {
					this.type = ExecCicsStatementType.CICSOTHER;
				}
				break;
			case "READ":
				this.type = ExecCicsStatementType.CICSREAD;
				this.findFile();
				if (this.file == null) {
					this.type = ExecCicsStatementType.CICSOTHER;
				}
				break;
			case "REWRITE":
				this.type = ExecCicsStatementType.CICSREWRITE;
				this.findFile();
				break;
			case "WRITE":
				this.type = ExecCicsStatementType.CICSWRITE;
				this.findFile();
				if (this.file == null) {
					this.type = ExecCicsStatementType.CICSOTHER;
				}
				break;
			case "STARTBR":
				this.type = ExecCicsStatementType.CICSSTARTBR;
				this.findFile();
				break;
			case "READNEXT":
				this.type = ExecCicsStatementType.CICSREADNEXT;
				this.findFile();
				break;
			case "READPREV":
				this.type = ExecCicsStatementType.CICSREADPREV;
				this.findFile();
				break;
			default:
				this.type = ExecCicsStatementType.CICSOTHER;

		}

	}

	private void parseCicsCommand() {
		StringBuilder sb = new StringBuilder();

		for (TerminalNode tn: this.ctx.CICS_TEXT()) {
			sb.append(tn.getSymbol().getText());
		}
		this.LOGGER.finest("CICS_TEXT = |" + sb + "|");
		this.cicsText = sb;
		sb.insert(0, "EXEC CICS\n");
		sb.append("\nEND-EXEC");
		CharStream aCharStream = CharStreams.fromString(sb.toString());
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
		if (this.programText != null) {
			aCharStream = CharStreams.fromString(this.programText.toString());
		} else if (this.fileText != null) {
			aCharStream = CharStreams.fromString(this.fileText.toString());
		} else if (this.transidText != null) {
			aCharStream = CharStreams.fromString(this.transidText.toString());
		} else {
			throw new IllegalArgumentException("CICS command arg problem with " + this.cicsText);
		}

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
	
	private void findProgram() {
		for (CicsKeywordWithArg kywd: this.cicsKeywordsWithArg) {
			if (kywd.isProgram()) {
				this.program = kywd;
				break;
			}
		}
	}

	private void findTransID() {
		for (CicsKeywordWithArg kywd: this.cicsKeywordsWithArg) {
			if (kywd.isTransID()) {
				this.transID = kywd;
				break;
			}
		}
	}

	private void findFile() {
		for (CicsKeywordWithArg kywd: this.cicsKeywordsWithArg) {
			if (kywd.isFile()) {
				this.file = kywd;
				break;
			}
		}
	}

	public CicsKeywordWithArg getProgram() {
		return this.program;
	}

	public ExecCicsStatementType getType() {
		return this.type;
	}

	public int getLine() {
		return this.line;
	}
	
	@SuppressWarnings({"fallthrough"})
	public void writeOn(PrintWriter out, UUID parentUUID) {
		String name = null;

		switch (this.getType()) {
			case CICSSTARTTRANSID:
			case CICSRUNTRANSID: //intentional fall through
				name = this.transID.getArgString();
				break;
			case CICSSTARTBR:
			case CICSREADNEXT:
			case CICSREADPREV:
			case CICSDELETE:
			case CICSREAD:
			case CICSREWRITE:
			case CICSWRITE: //intentional fall through
				name = this.file.getArgString();
				break;
			default:
				name = "<NOTFND>";
				break;
		}

		out.printf(
			"%s,%s,%s,%s\n"
			, this.getType().name()
			, this.uuid.toString()
			, parentUUID.toString()
			, name);
	}

}
