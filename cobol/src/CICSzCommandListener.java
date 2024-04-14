
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
CICS commands are parsed individually, and only a small subset are
of interest in the context of this application.  This listener
captures command option arguments that are pertinent.
*/

public class CICSzCommandListener extends CICSzParserBaseListener {
	private Logger LOGGER = null;
	private ExecCicsStatementType type = ExecCicsStatementType.CICSOTHER;
	private StringBuffer programText = null;
	private StringBuffer transidText = null;
	private StringBuffer fileText = null;

	public CICSzCommandListener(Logger LOGGER) {
		super();
		this.LOGGER = LOGGER;
	}

	@Override public void enterDatasetOption(CICSzParser.DatasetOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.fileText = sb;
			}
		}
	}

	@Override public void enterFileOption(CICSzParser.FileOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.fileText = sb;
			}
		}
	}

	@Override public void enterProgramOption(CICSzParser.ProgramOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.programText = sb;
			}
		}
	}

	@Override public void enterTransidOption(CICSzParser.TransidOptionContext ctx) {
		StringBuffer sb = new StringBuffer();
	
		if (ctx.arg() != null) {
			if (ctx.arg().ARG() != null) {
				for (TerminalNode tn: ctx.arg().ARG()) {
					sb.append(tn.getSymbol().getText());
				}
				this.transidText = sb;
			}
		}
	}

	@Override public void enterLink(CICSzParser.LinkContext ctx) {
		this.type = ExecCicsStatementType.CICSLINK;
	}

	@Override public void enterXctl(CICSzParser.XctlContext ctx) {
		type = ExecCicsStatementType.CICSXCTL;
	}

	@Override public void enterStart(CICSzParser.StartContext ctx) {
		type = ExecCicsStatementType.CICSSTARTTRANSID;
	}

	@Override public void enterStartbr(CICSzParser.StartbrContext ctx) {
		type = ExecCicsStatementType.CICSSTARTBR;
	}

	@Override public void enterReadnext(CICSzParser.ReadnextContext ctx) {
		type = ExecCicsStatementType.CICSREADNEXT;
	}

	@Override public void enterReadprev(CICSzParser.ReadprevContext ctx) {
		type = ExecCicsStatementType.CICSREADPREV;
	}

	@Override public void enterDelete(CICSzParser.DeleteContext ctx) {
		type = ExecCicsStatementType.CICSDELETE;
	}

	@Override public void enterRead(CICSzParser.ReadContext ctx) {
		type = ExecCicsStatementType.CICSREAD;
	}

	@Override public void enterRewrite(CICSzParser.RewriteContext ctx) {
		type = ExecCicsStatementType.CICSREWRITE;
	}

	@Override public void enterWrite(CICSzParser.WriteContext ctx) {
		type = ExecCicsStatementType.CICSWRITE;
	}

	@Override public void enterRunTransid(CICSzParser.RunTransidContext ctx) {
		type = ExecCicsStatementType.CICSRUNTRANSID;
	}
	
	public ExecCicsStatementType getType() {
		return this.type;
	}

	public StringBuffer getProgramText() {
		return this.programText;
	}
	
	public StringBuffer getTransidText() {
		return this.transidText;
	}
	
	public StringBuffer getFileText() {
		return this.fileText;
	}
	
}
