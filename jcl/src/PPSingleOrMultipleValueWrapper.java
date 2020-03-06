
import java.util.*;

public class PPSingleOrMultipleValueWrapper {

	private String myName = null;
	private JCLPPParser.SingleOrMultipleValueContext ctx = null;
	private ArrayList<PPKeywordOrSymbolicWrapper> kosw = new ArrayList<>();
	private String procName = null;
	private Boolean inProc = null;

	public PPSingleOrMultipleValueWrapper(JCLPPParser.SingleOrMultipleValueContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.kosw.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(ctx.keywordOrSymbolic()));
		this.kosw.addAll(PPKeywordOrSymbolicWrapper.bunchOfThese(ctx.parenList().keywordOrSymbolic()));
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.fine(this.myName + " resolveParms symbolics = |" + symbolics + "|");
		for (PPKeywordOrSymbolicWrapper k: this.kosw) {
			k.resolveParms(symbolics);
		}
	}

	public String getResolvedValue() {
		StringBuffer buf = new StringBuffer();

		for (PPKeywordOrSymbolicWrapper k: this.kosw) {
			buf.append(k.getResolvedValue());
			buf.append(" ");
		}

		return buf.toString();
	}

	public ArrayList<PPSymbolic> collectSymbolics() {
		ArrayList<PPSymbolic> symbolics = new ArrayList<>();

		for (PPKeywordOrSymbolicWrapper k: this.kosw) {
			symbolics.addAll(k.collectSymbolics());
		}

		return symbolics;
	}

	public String toString() {
		return this.myName + " procName = |" + this.procName + "| kosw = |" + this.kosw + "|";
	}
}
