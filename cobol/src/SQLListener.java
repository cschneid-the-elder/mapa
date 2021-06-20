
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SQLListener extends DB2zSQLParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<DB2zTableName> db2Tables = new ArrayList<>();
	public DB2zCallStatement db2Call = null;

	public SQLListener(Logger LOGGER) {
		super();
		this.LOGGER = LOGGER;
	}

	public void enterEveryRule(ParserRuleContext ctx) { 
		this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterTableName(DB2zSQLParser.TableNameContext ctx) {
		this.db2Tables.add(new DB2zTableName(ctx, this.LOGGER));
	}

	public void enterCallStatement(DB2zSQLParser.CallStatementContext ctx) {
		this.db2Call = new DB2zCallStatement(ctx, this.LOGGER);
	}

}
