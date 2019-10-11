

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class IncludeStatementListener extends JCLParserBaseListener {

	public ArrayList<IncludeStatement> includes = null;
	public String fileName = null;
	public Boolean inProc = false;
	public String procName = null;

	public IncludeStatementListener(
			ArrayList<IncludeStatement> includes
			, String fileName
			) {
		super();
		this.includes = includes;
		this.fileName = fileName;
	}

	@Override public void enterIncludeStatement(JCLParser.IncludeStatementContext ctx) {
		includes.add(new IncludeStatement(ctx, fileName, inProc, procName));
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		inProc = true;
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		inProc = false;
		this.procName = null;
	}

}
