
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CondCompLogicOp implements CondCompToken {

	private String myName = this.getClass().getName();
	private Boolean value = null;
	private CondCompTokenType type = null;
	private TerminalNode tn = null;
	private long sortKey = -1;
	private String text = null;

	public static List<CondCompLogicOp> bunchOfThese(List<TerminalNode> list) {
		ArrayList<CondCompLogicOp> ccloList = new ArrayList<>();

		for (TerminalNode tn: list) {
			ccloList.add(new CondCompLogicOp(tn));
		}

		return ccloList;
	}

	public CondCompLogicOp(TerminalNode tn) {
		this.tn = tn;
		if (this.tn.getSymbol().getText().toUpperCase().equals("AND")) {
			this.type = CondCompTokenType.LOGICOP_AND;
		} else if (this.tn.getSymbol().getText().toUpperCase().equals("OR")) {
			this.type = CondCompTokenType.LOGICOP_OR;
		} else {
			throw new IllegalArgumentException(
				"CondCompLogicOp"
				+ " without a recognizable logical operator"
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
}
