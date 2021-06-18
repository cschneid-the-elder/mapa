
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SQLListener extends DB2zSQLParserBaseListener {
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<DB2zTableName> db2Tables = new ArrayList<>();

	public SQLListener(
			Logger LOGGER
			, TheCLI CLI) {
		super();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public void enterTableName(DB2zSQLParser.TableNameContext ctx) {
		this.db2Tables.add(new DB2zTableName(ctx, this.LOGGER));
	}

	public void enterCallStatement(DB2zSQLParser.CallStatementContext ctx) {

	}

	public void enterIncludeStatement(DB2zSQLParser.IncludeStatementContext ctx) {

	}


}
