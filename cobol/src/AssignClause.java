
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.tree.*;

/**
Representing the ASSIGN clause of the SELECT statement, the primary
purpose of this class is to encapsulate the parsing out of the 
DDName which someone might want to match up with the JCL.
*/
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
			int apos1 = this.assignName.indexOf('\'');
			int apos2 = this.assignName.lastIndexOf('\'');
			if (apos1 != -1 && apos2 != -1 && apos1 != apos2) {
				this.assignName = this.assignName.substring(++apos1, apos2);
			}
			int quot1 = this.assignName.indexOf('\"');
			int quot2 = this.assignName.lastIndexOf('\"');
			if (quot1 != -1 && quot2 != -1 && quot1 != quot2) {
				this.assignName = this.assignName.substring(++quot1, quot2);
			}
		} else {
			CobolParser.AssignmentNameContext anc = this.ctx.assignmentName();
			CobolParser.SystemNameContext snc = anc.systemName();
			CobolWord cw = new CobolWord(snc.cobolWord());
			this.assignName = cw.getTerminalNode().getSymbol().getText();
		}

		int i = this.assignName.lastIndexOf('-');
		if (i == -1) {
			this.ddName = this.assignName;
		} else {
			this.ddName = this.assignName.substring(++i);
		}
	}

	public String getDDname() {
		return this.ddName;
	}

	public void writeOn(PrintWriter out, UUID parentUUID) {
		out.printf(
			"DD,%s,%s,%s\n"
			, this.uuid.toString()
			, parentUUID.toString()
			, this.getDDname());
	}

}
