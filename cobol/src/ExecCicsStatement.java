
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

	public ExecCicsStatement(
			CobolParser.ExecCicsStatementContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		StringBuilder sb = new StringBuilder();

		for (TerminalNode tn: ctx.CICS_TEXT()) {
			sb.append(tn.getSymbol().getText());
		}
		this.LOGGER.finest("CICS_TEXT = |" + sb + "|");
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
