
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompGroupOp implements CondCompToken {

	private String myName = this.getClass().getName();
	private CondCompTokenType type = null;
	private TerminalNode tn = null;
	private long sortKey = -1;
	private String text = null;

	public static List<CondCompGroupOp> bunchOfThese(List<TerminalNode> list) {
		ArrayList<CondCompGroupOp> ccgoList = new ArrayList<>();

		for (TerminalNode tn: list) {
			ccgoList.add(new CondCompGroupOp(tn));
		}

		return ccgoList;
	}

	public CondCompGroupOp(TerminalNode tn) {
		this.tn = tn;
		if (this.tn.getSymbol().getText().equals("(")) {
			this.type = CondCompTokenType.GROUPOP_BEGIN;
		} else if (this.tn.getSymbol().getText().equals(")")) {
			this.type = CondCompTokenType.GROUPOP_END;
		} else {
			throw new IllegalArgumentException(
				"CondCompGroupOp"
				+ " without a recognizable group operator"
				+ " at "
				+ this.tn.getSymbol().getText()
				+ " on line "
				+ this.tn.getSymbol().getLine());
		}

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
		this.text = this.tn.getSymbol().getText();

	}

	public long getSortKey() {
		return this.sortKey;
	}

	public CondCompTokenType getType() {
		return this.type;
	}

	public String toString() {
		return this.text;
	}
}
