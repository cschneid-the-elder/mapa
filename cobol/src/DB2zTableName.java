
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Representing the DB2z TableName token in the DB2zSQL grammar.
*/
class DB2zTableName {

	private Logger LOGGER = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private DB2zSQLParser.TableNameContext ctx = null;
	private String owningStatement = null;
	private Boolean isDB2 = true;

	public DB2zTableName(
			DB2zSQLParser.TableNameContext ctx
			, Logger LOGGER
			, Boolean isDB2
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.isDB2 = isDB2;
		this.getOwningSQLStatement();
	}

	public String getTableName() {
		return this.ctx.getText();
	}

	private void getOwningSQLStatement() {
		ParserRuleContext parent = null;
		ParserRuleContext currCtx = (ParserRuleContext)this.ctx;
		Boolean done = false;

		while (!done) {
			parent = currCtx.getParent();
			String owningStatement = DB2zSQLParser.ruleNames[parent.getRuleIndex()];
			if (owningStatement.endsWith("Statement")
			|| owningStatement.equals("fullSelect")
			|| owningStatement.equals("subSelect")
            || owningStatement.equals("query")) {
				this.owningStatement = owningStatement;
				done = true;
			}
			if (parent.getRuleIndex() == 0) {
				done = true;
			}
			currCtx = parent;
		}
	}

	public void writeOn(PrintWriter out, UUID parentUUID) {
		String label = null;
		
		if (this.isDB2) {
			label = "DB2TABLE";
		} else {
			label = "IMSSEGMENT";
		}
		
		out.printf(
			"%s,%s,%s,%s,%s\n"
			, label
			, this.uuid.toString()
			, parentUUID.toString()
			, this.getTableName()
			, this.owningStatement);
	}

}
