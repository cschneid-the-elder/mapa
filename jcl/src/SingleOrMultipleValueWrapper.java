
import java.util.*;

public class SingleOrMultipleValueWrapper {

	private String myName = null;
	private JCLParser.SingleOrMultipleValueContext ctx = null;
	private ArrayList<KeywordOrSymbolicWrapper> kosw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;

	public SingleOrMultipleValueWrapper(JCLParser.SingleOrMultipleValueContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.kosw.addAll(KeywordOrSymbolicWrapper.bunchOfThese(ctx.keywordOrSymbolic()));
		this.kosw.addAll(KeywordOrSymbolicWrapper.bunchOfThese(ctx.parenList().keywordOrSymbolic()));
	}

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		Demo01.LOGGER.fine(this.myName + " resolveParms symbolics = |" + symbolics + "|");
		for (KeywordOrSymbolicWrapper k: this.kosw) {
			k.resolveParms(symbolics);
		}
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		for (KeywordOrSymbolicWrapper k: this.kosw) {
			buf.append(k.getResolvedValue());
			buf.append(" ");
		}

		return buf.toString();
	}

	public ArrayList<Symbolic> collectSymbolics() {
		ArrayList<Symbolic> symbolics = new ArrayList<>();

		for (KeywordOrSymbolicWrapper k: this.kosw) {
			symbolics.addAll(k.collectSymbolics());
		}

		return symbolics;
	}

	public String toString() {
		return this.myName + " procName = |" + this.procName + "| kosw = |" + this.kosw + "|";
	}
}
