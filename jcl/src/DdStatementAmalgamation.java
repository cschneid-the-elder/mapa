
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
	private String fileName = null;
	private Boolean inProc = null;
	private JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx = null;
	private ArrayList<DdStatement> dds = null;

	public DdStatementAmalgamation(JCLParser.DdStatementAmalgamationContext ddStmtAmlgnCtx, String procName, String fileName) {
		this.ddStmtAmlgnCtx = ddStmtAmlgnCtx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		Demo01.LOGGER.finest(this.myName + " initialize");
		this.setDdName(this.ddStmtAmlgnCtx.ddStatement().ddName().DOT()
			, this.ddStmtAmlgnCtx.ddStatement().ddName().NAME_FIELD());
		this.dds = DdStatement.bunchOfThese(this.ddStmtAmlgnCtx, this.procName, this.ddName, this.fileName);
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

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(this.myName + " resolveParms symbolics = |" + symbolics + "|");
		for (DdStatement dd: dds) {
			dd.resolveParms(symbolics);
			Demo01.LOGGER.finest(this.myName + " resolved dsn = |" + dd.getResolvedValue("DSNAME") + "|");
		}
	}

	public ArrayList<Symbolic> collectSymbolics() {
		Demo01.LOGGER.finest(this.myName + " collectSymbolics");

		ArrayList<Symbolic> symbolics = new ArrayList<>();

		for (DdStatement dd: dds) {
			symbolics.addAll(dd.collectSymbolics());
		}

		return symbolics;
	}

}
