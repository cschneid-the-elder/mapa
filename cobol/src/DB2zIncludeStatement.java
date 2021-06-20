
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Representing the DB2z IncludeStatement token in the DB2zSQL grammar.
*/
class DB2zIncludeStatement {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private DB2zSQLParser.IncludeStatementContext ctx = null;

	public DB2zIncludeStatement(
			DB2zSQLParser.IncludeStatementContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public String getMemberName() {
		return this.ctx.memberName().getText();
	}

}
