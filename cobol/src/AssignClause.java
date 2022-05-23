
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
	private String cobolFileName = null;
	private int openInputCount = 0;
	private int openOutputCount = 0;
	private int openIOCount = 0;
	private int openExtendCount = 0;

	public AssignClause(
			CobolParser.AssignClauseContext ctx
			, String cobolFileName
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.cobolFileName = cobolFileName;
		this.LOGGER = LOGGER;
		this.LOGGER.finest(myName + " ctx = " + ctx.getText());

		if (this.ctx.assignClauseName() == null || this.ctx.assignClauseName().size() == 0) {
			if (this.ctx.literal() == null || this.ctx.literal().size() == 0) {
				if (this.ctx.dataName() == null) {
					this.assignName = "UNKNOWN!";
					this.LOGGER.info("unable to determine assignment name for " + ctx.getText());
				} else {
					this.assignName = this.ctx.dataName().getText();
				}
			} else {
				CobolParser.LiteralContext lc = this.ctx.literal(0);
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
			}
		} else {
			CobolParser.AssignClauseNameContext anc = this.ctx.assignClauseName(0);
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

	public void addOpenType(CobolParser.OpenInputContext ctx) {
		this.openInputCount++;
		this.LOGGER.finest(this.getCobolFileName() + " this.openInputCount = " + this.openInputCount);
	}

	public void addOpenType(CobolParser.OpenOutputContext ctx) {
		this.openOutputCount++;
		this.LOGGER.finest(this.getCobolFileName() + " this.openOutputCount = " + this.openOutputCount);
	}

	public void addOpenType(CobolParser.OpenIOStatementContext ctx) {
		this.openIOCount++;
		this.LOGGER.finest(this.getCobolFileName() + " this.openIOCount = " + this.openIOCount);
	}

	public void addOpenType(CobolParser.OpenExtendStatementContext ctx) {
		this.openExtendCount++;
		this.LOGGER.finest(this.getCobolFileName() + " this.openExtendCount = " + this.openExtendCount);
	}

	public String getCobolFileName() {
		return this.cobolFileName;
	}

	public String getDDname() {
		return this.ddName;
	}

	public void writeOn(PrintWriter out, UUID parentUUID) {
		out.printf(
			"DD,%s,%s,%s,%s,%d,%d,%d,%d\n"
			, this.uuid.toString()
			, parentUUID.toString()
			, this.getDDname()
			, this.getCobolFileName()
			, this.openInputCount
			, this.openOutputCount
			, this.openIOCount
			, this.openExtendCount
		);
	}

}
