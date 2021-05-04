
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
	private ArrayList<CobolWord> cicsKeywords = new ArrayList<>();
	private ArrayList<CicsKeywordWithArg> cicsKeywordsWithArg = new ArrayList<>();
	private ExecCicsStatementType type = null;
	private CicsKeywordWithArg program = null;

	public ExecCicsStatement(
			CobolParser.ExecCicsStatementContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		for (CobolParser.CicsKeywordContext kywdCtx: this.ctx.cicsKeyword()) {
			this.cicsKeywords.add(new CobolWord(kywdCtx.cobolWord()));
		}
		for (CobolParser.CicsKeywordWithArgContext kywdWithArgCtx: this.ctx.cicsKeywordWithArg()) {
			this.cicsKeywordsWithArg.add(new CicsKeywordWithArg(kywdWithArgCtx, this.LOGGER));
		}
		switch(this.cicsKeywords.get(0).getText().toUpperCase()) {
			case "LINK":
				this.type = ExecCicsStatementType.CICSLINK;
				this.findProgram();
				break;
			case "XCTL":
				this.type = ExecCicsStatementType.CICSXCTL;
				this.findProgram();
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

	public CicsKeywordWithArg getProgram() {
		return this.program;
	}

	public ExecCicsStatementType getType() {
		return this.type;
	}
}
