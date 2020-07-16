
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

	public static List<CondCompLogicOp> bunchOfThese(List<TerminalNode> list) {
		ArrayList<CondCompLogicOp> ccloList = new ArrayList<>();

		for (TerminalNode tn: list) {
			ccloList.add(new CondCompLogicOp(tn));
		}

		return ccloList;
	}

	public CondCompLogicOp(TerminalNode tn) {
		this.tn = tn;
		if (this.tn.getSymbol().getText().toUpperCase() == "AND") {
			this.type = CondCompTokenType.LOGICOP_AND;
		} else if (this.tn.getSymbol().getText().toUpperCase() == "OR") {
			this.type = CondCompTokenType.LOGICOP_OR;
		}

		long line = this.tn.getSymbol().getLine();
		long posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;

	}

	public getSortKey() {
		return this.sortKey;
	}

}
