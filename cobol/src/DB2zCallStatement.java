
import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**

*/
class DB2zCallStatement {

	private Logger LOGGER = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = this.getClass().getName();
	private DB2zSQLParser.CallStatementContext ctx = null;

	public DB2zCallStatement(
			DB2zSQLParser.CallStatementContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
	}

	public int getLine() {
		return this.ctx.start.getLine();
	}

	public String getModuleName() {
		if (this.ctx.procedureName() != null) {
			return this.ctx.procedureName().getText();
		}
		return null;	
	}

	public ArrayList<String> getVariableName() {
		DB2zSQLParser.HostVariableContext var = null;
		DB2zSQLParser.HostStructureContext struct = null;
		ArrayList<String> reply = new ArrayList<>();

		if (this.ctx.hostVariable() != null) {
			var = this.ctx.hostVariable(0);
			reply.add(var.hostIdentifier().getText());
			if (var.hostStructure() != null) {
				reply.add(var.hostStructure().getText());
			}
		} else {
			return null;
		}

		return reply;
	}

}
