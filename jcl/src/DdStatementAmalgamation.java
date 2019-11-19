
import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class represent a DD statement and any/all DD
statements concatenated to it.

*/
public class DdStatementAmalgamation {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private String ddName = null;
	private String procName = null;
	private Boolean inProc = null;
	private JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx = null;
	private ArrayList<String> blankParms = new ArrayList<>();
	private Hashtable<String, KeywordOrSymbolicWrapper> kosParms = new Hashtable<>();
	private Hashtable<String, SingleOrMultipleValueWrapper> somvParms = new Hashtable<>();
	private Hashtable<String, DatasetNameWrapper> dsnParms = new Hashtable<>();
	private DispWrapper dispw = null;
	private DsidWrapper dsidw = null;

	public DdStatementAmalgamation(JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx, String procName) {
		this.ddStmtAmlgnCtx = ddStmtAmlgnCtx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		Demo01.LOGGER.finest(this.myName + " initialize");
		this.setDdName(this.ddStmtAmlgnCtx.ddStatement().ddName().DOT()
			, this.ddStmtAmlgnCtx.ddStatement().ddName().NAME_FIELD());
		this.initializeTediously();
	}

	private void initializeTediously() {
		/*
			The following bad idea is brought to you by the dozens of parameters of
			the DD statement.
		*/
		for (JCLParser.DdParameterContext ddParm: this.ddStmtAmlgnCtx.ddStatement().ddParameter()) {
		}
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

}
