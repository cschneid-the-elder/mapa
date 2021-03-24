
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class CharDataLineWrapper {

	private String myName = this.getClass().getName();
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private long line = -1;
	private long posn = -1;
	private long sortKey = -1;
	private String text = null;

	public CharDataLineWrapper(TerminalNode tn) {
		this.tn = tn;

		this.line = this.tn.getSymbol().getLine();
		this.posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
		this.text = "@ " + this.line + " @ " + this.posn + " " + this.tn.getSymbol().getText();

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public long getLine() {
		return this.line;
	}

	public long getPosn() {
		return this.posn;
	}

	public String getText() {
		return this.tn.getSymbol().getText();
	}

	public String toString() {
		return this.text;
	}
}

