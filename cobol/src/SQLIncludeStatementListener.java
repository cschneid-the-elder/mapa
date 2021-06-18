
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SQLIncludeStatementListener extends DB2zSQLParserBaseListener {
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public DB2zIncludeStatement includeStatement = null;

	public SQLIncludeStatementListener(
			Logger LOGGER
			, TheCLI CLI) {
		super();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public void enterIncludeStatement(DB2zSQLParser.IncludeStatementContext ctx) {
		includeStatement = new DB2zIncludeStatement(ctx, this.LOGGER, this.CLI);
	}


}
