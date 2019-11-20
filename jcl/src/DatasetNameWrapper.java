
import java.util.*;

public class DatasetNameWrapper {

	private String myName = null;
	private JCLParser.DatasetNameContext ctx = null;
	private KeywordOrSymbolicWrapper dsn = null;
	private KeywordOrSymbolicWrapper mem = null;
	private String procName = null;
	private Boolean inProc = null;

	public DatasetNameWrapper(JCLParser.DatasetNameContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.dsn = new KeywordOrSymbolicWrapper(this.ctx.keywordOrSymbolic(0), this.procName);
		if (this.ctx.keywordOrSymbolic(1) == null) {
		} else {
			this.mem = new KeywordOrSymbolicWrapper(this.ctx.keywordOrSymbolic(1), this.procName);
		}
	}

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.fine(myName + " resolveParms symbolics = |" + symbolics + "|");
		this.dsn.resolveParms(symbolics);
		if (this.mem == null) {
		} else {
			this.mem.resolveParms(symbolics);
		}
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(this.myName + " procName = |" + this.procName + "| dsn = |" + this.dsn.getResolvedValue());
		if (this.mem == null) {
			buf.append("|");
		} else {
			buf.append("(" + this.mem.getResolvedValue() + ")|)");
		}

		return buf.toString();
	}
}
