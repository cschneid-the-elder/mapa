
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

class AssignClause {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private CobolParser.AssignClauseContext ctx = null;
	private String assignName = null;
	private String ddName = null;

	public AssignClause(
			CobolParser.AssignClauseContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		if (this.ctx.assignmentName() == null) {
			CobolParser.LiteralContext lc = this.ctx.literal();
			/*
			There are many, many other options for the text of a
			literal, but effectively the only one used in the
			context of an ASSIGN clause is the non-numeric literal.
			*/
			this.assignName = lc.NONNUMERICLITERAL().getSymbol().getText();
		} else {
			CobolParser.AssignmentNameContext anc = this.ctx.assignmentName();
			CobolParser.SystemNameContext snc = anc.systemName();
			CobolWord cw = new CobolWord(snc.cobolWord());
			this.assignName = cw.getTerminalNode().getSymbol().getText();
		}

		int i = this.assignName.lastIndexOf('-');
		if (i != -1) {
			this.ddName = this.assignName.substring(++i);
		}
	}

	public String getDDname() {
		return this.ddName;
	}

}
