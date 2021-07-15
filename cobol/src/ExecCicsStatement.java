
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
		switch(this.cicsKeywords.get(0)) {
			case "LINK":
				this.type = ExecCicsStatementType.CICSLINK;
				this.findProgram();
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
				break;
			case "DELETE":
				this.type = ExecCicsStatementType.CICSDELETE;
				this.findFile();
				break;
			case "READ":
				this.type = ExecCicsStatementType.CICSREAD;
				this.findFile();
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
			case CICSREWRITE: //intentional fall through
				name = this.file.getArgString();
				break;
			case CICSWRITE:
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
