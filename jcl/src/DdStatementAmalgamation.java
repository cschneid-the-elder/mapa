
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent a DD statement and any/all DD
statements concatenated to it.

*/
public class DdStatementAmalgamation {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private String ddName = null;
	private String procName = null;
	private String fileName = null;
	private Boolean inProc = null;
	private JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx = null;
	private ArrayList<DdStatement> dds = null;

	public DdStatementAmalgamation(
			JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx
			, String procName
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ddStmtAmlgnCtx = ddStmtAmlgnCtx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.LOGGER.finest(this.myName + " initialize");
		this.setDdName(this.ddStmtAmlgnCtx.ddStatement().ddName().DOT()
			, this.ddStmtAmlgnCtx.ddStatement().ddName().NAME_FIELD());
		this.dds = DdStatement.bunchOfThese(this.ddStmtAmlgnCtx, this.procName, this.ddName, this.fileName, this.LOGGER, this.CLI);
	}

	private void setDdName(TerminalNode dot, List<TerminalNode> name_field) {
		StringBuffer buf = new StringBuffer();

		if (dot == null) {
			buf.append(name_field.get(0).getSymbol().getText());
		} else {
			buf.append(name_field.get(0).getSymbol().getText());
			buf.append(dot.getSymbol().getText());
			buf.append(name_field.get(1).getSymbol().getText());
		}

		this.ddName = buf.toString();
	}

	public String getDdName() {
		return this.ddName;
	}

	public void toCSV(StringBuffer csvOut, UUID parentUUID) {
		this.LOGGER.fine(this.myName + " toCSV");

		for (DdStatement dd: this.dds) {
			csvOut.append(System.getProperty("line.separator"));
			dd.toCSV(csvOut, parentUUID);
		}
	}

}
