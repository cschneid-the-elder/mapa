
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SQLListener extends DB2zSQLParserBaseListener {
	private Logger LOGGER = null;
	public ArrayList<DB2zTableName> db2Tables = new ArrayList<>();
	public DB2zCallStatement db2Call = null;
	private Boolean isDB2 = true;

	public SQLListener(Logger LOGGER, Boolean isDB2) {
		super();
		this.LOGGER = LOGGER;
		this.isDB2 = isDB2; //listener also used for SQLIMS statements
	}

	public void enterEveryRule(ParserRuleContext ctx) { 
		this.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	public void enterTableName(DB2zSQLParser.TableNameContext ctx) {
		this.db2Tables.add(new DB2zTableName(ctx, this.LOGGER, this.isDB2));
	}

	public void enterCallStatement(DB2zSQLParser.CallStatementContext ctx) {
		this.db2Call = new DB2zCallStatement(ctx, this.LOGGER);
	}

}
