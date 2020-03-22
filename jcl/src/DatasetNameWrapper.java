
import java.util.*;
import java.util.logging.*;

public class DatasetNameWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.DatasetNameContext ctx = null;
	private KeywordOrSymbolicWrapper dsn = null;
	private KeywordOrSymbolicWrapper mem = null;
	private String procName = null;
	private Boolean inProc = null;

	public DatasetNameWrapper(
			JCLParser.DatasetNameContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.dsn = new KeywordOrSymbolicWrapper(this.ctx.keywordOrSymbolic(0), this.procName, this.LOGGER, this.CLI);
		if (this.ctx.keywordOrSymbolic(1) == null) {
		} else {
			this.mem = new KeywordOrSymbolicWrapper(this.ctx.keywordOrSymbolic(1), this.procName, this.LOGGER, this.CLI);
		}
	}

	public void resolveParms(ArrayList<SetSymbolValue> setSym) {
		this.LOGGER.fine(myName + " resolveParms setSym = |" + setSym + "|");
		this.dsn.resolveParms(setSym);
		if (this.mem == null) {
		} else {
			this.mem.resolveParms(setSym);
		}
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer(this.dsn.getResolvedValue());

		if (this.mem == null) {
		} else {
			buf.append("(" + this.mem.getResolvedValue() + ")");
		}

		return buf.toString();
	}

	public ArrayList<Symbolic> collectSymbolics() {
		ArrayList<Symbolic> symbolics = new ArrayList<>();

		if (this.dsn == null) {
		} else {
			symbolics.addAll(dsn.collectSymbolics());
		}

		if (this.mem == null) {
		} else {
			symbolics.addAll(mem.collectSymbolics());
		}

		return symbolics;
	}

	public String toString() {
		StringBuffer buf = 
			new StringBuffer(
				this.myName 
				+ " procName = |" 
				+ this.procName 
				+ "| dsn = |" 
				+ this.dsn.getResolvedValue()
				);
		if (this.mem == null) {
			buf.append("|");
		} else {
			buf.append("(" + this.mem.getResolvedValue() + ")|)");
		}

		return buf.toString();
	}
}
