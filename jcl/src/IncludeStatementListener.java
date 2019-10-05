

import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class IncludeStatementListener extends JCLParserBaseListener {

	public ArrayList<IncludeStatement> includes = null;
	public String fileName = null;
	public Boolean inInStreamProc = false;
	public Boolean jobCardFound = false;

	public IncludeStatementListener(
			ArrayList<IncludeStatement> includes
			, String fileName
			) {
		super();
		this.includes = includes;
		this.fileName = fileName;
	}

	@Override public void enterIncludeStatement(JCLParser.IncludeStatementContext ctx) {

	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		inInStreamProc = true && jobCardFound;
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		inInStreamProc = false;
	}

	@Override public void enterJobCard(JCLParser.JobCardContext ctx) {
		jobCardFound = true;
	}

}
