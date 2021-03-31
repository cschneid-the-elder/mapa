
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class TerminalNodeWrapper {

	private String myName = this.getClass().getName();
	private TerminalNode tn = null;
	private long line = -1;
	private long posn = -1;
	private long sortKey = -1;
	private Boolean isFirst = false;
	private Boolean precededByNewline = false;
	private String text = null;

	public static ArrayList<TerminalNodeWrapper> bunchOfThese(List<TerminalNode> tnList) {
		ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();

		for (TerminalNode tn: tnList) {
			tnwList.add(new TerminalNodeWrapper(tn));
		}

		return tnwList;
	}

	public TerminalNodeWrapper(TerminalNode tn) {
		this.tn = tn;

		this.line = this.tn.getSymbol().getLine();
		this.posn = this.tn.getSymbol().getCharPositionInLine();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
		this.text = "@ " + this.line + " @ " + this.posn + " " + this.tn.getSymbol().getText() + " type = " + this.tn.getSymbol().getType();

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

	public int getTextLength() {
		return this.getText().length();
	}

	public int getType() {
		return this.tn.getSymbol().getType();
	}

	public Boolean isNewline() {
		return (this.getType() == CobolPreprocessorParser.NEWLINE);
	}

	public void setIsFirst(Boolean isFirst) {
		this.isFirst = isFirst;
	}

	public Boolean isFirst() {
		return this.isFirst;
	}

	public void setPrecededByNewline(Boolean precededByNewline) {
		this.precededByNewline = precededByNewline;
	}

	public Boolean precededByNewline() {
		return this.precededByNewline;
	}

	public Boolean textIsEqual(TerminalNodeWrapper tnw) {
		return this.getText().equals(tnw.getText());
	}

	public Boolean textIsEqual(TerminalNode tn) {
		return this.getText().equals(tn.getSymbol().getText());
	}

	public Boolean textAndLocAreEqual(TerminalNode tn) {
		return (this.getLine() == tn.getSymbol().getLine()
				&& this.getPosn() == tn.getSymbol().getCharPositionInLine()
				&& this.textIsEqual(tn));
	}

	public String toString() {
		return this.text;
	}
}

