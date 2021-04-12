
import java.util.*;
import org.antlr.v4.runtime.tree.*;

class TerminalNodeWrapper {

	private String myName = this.getClass().getName();
	private TerminalNode tn = null;
	private long line = -1;
	private long posn = -1;
	private long clonedLine = -1;
	private long clonedPosn = -1;
	private long sortKey = -1;
	private Boolean leading = false;
	private Boolean trailing = false;
	private Boolean isFirst = false;
	private Boolean precededByNewline = false;
	private Boolean precededByWhitespace = false;
	private String text = null;
	private String replacementText = null;

	public static ArrayList<TerminalNodeWrapper> bunchOfThese(List<TerminalNode> tnList) {
		ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();

		for (TerminalNode tn: tnList) {
			tnwList.add(new TerminalNodeWrapper(tn));
		}

		return tnwList;
	}

	public static ArrayList<TerminalNodeWrapper> bunchOfThese(List<TerminalNode> tnList, Boolean leading, Boolean trailing) {
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
		this.setSortKey();
		this.setText();

	}

	public TerminalNodeWrapper(TerminalNode tn, Boolean leading, Boolean trailing) {
		this.tn = tn;
		this.leading = leading;
		this.trailing = trailing;

		this.line = this.tn.getSymbol().getLine();
		this.posn = this.tn.getSymbol().getCharPositionInLine();
		this.setSortKey();
		this.setText();

	}

	public TerminalNodeWrapper(
			TerminalNodeWrapper tnw
			, long clonedLine
			, long clonedPosn
			, Boolean precededByNewline
			, Boolean precededByWhitespace) {
		this.tn = tnw.getTerminalNode();
		this.leading = tnw.isLeading();
		this.trailing = tnw.isTrailing();

		this.line = this.tn.getSymbol().getLine();
		this.posn = this.tn.getSymbol().getCharPositionInLine();
		this.precededByNewline = precededByNewline;
		this.precededByWhitespace = precededByWhitespace;
		this.clonedLine = clonedLine;
		this.clonedPosn = clonedPosn;
		this.setSortKey();
		this.setText();

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

	public long getClonedLine() {
		return this.clonedLine;
	}

	public long getClonedPosn() {
		return this.clonedPosn;
	}

	public TerminalNode getTerminalNode() {
		return this.tn;
	}

	private void setSortKey() {
		this.sortKey = (this.line * (long)Integer.MAX_VALUE) + this.posn;
	}

	private void setText() {
		this.text = 
			"@ " 
			+ this.line 
			+ " ["
			+ this.clonedLine
			+ "]"
			+ " @ " 
			+ this.posn 
			+ " ["
			+ this.clonedPosn
			+ "]"
			+ " " 
			+ this.getText() 
			+ " ["
			+ this.getTextLength()
			+ "]"
			+ " type = " 
			+ this.getType()
			+ " nl = "
			+ this.isPrecededByNewline()
			+ " ws = "
			+ this.isPrecededByWhitespace()
			+ " 1st = "
			+ this.isFirst();
			;
	}

	public String getText() {
		if (this.replacementText == null) {
			return this.tn.getSymbol().getText();
		}

		return this.replacementText;
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
		this.setText();
	}

	public Boolean isFirst() {
		return this.isFirst;
	}

	public void setPrecededByNewline(Boolean precededByNewline) {
		this.precededByNewline = precededByNewline;
		this.setText();
	}

	public Boolean isPrecededByNewline() {
		return this.precededByNewline;
	}

	public void setPrecededByWhitespace(Boolean precededByWhitespace) {
		this.precededByWhitespace = precededByWhitespace;
		this.setText();
	}

	public Boolean isPrecededByWhitespace() {
		return this.precededByWhitespace;
	}

	public Boolean isLeading() {
		return this.leading;
	}

	public Boolean isTrailing() {
		return this.trailing;
	}

	public Boolean isDelimited() {
		return this.getText().startsWith(":") && this.getText().endsWith(":");
	}

	public Boolean textIsEqual(TerminalNodeWrapper tnw) {
		if (this.isLeading()) {
			return tnw.getText().startsWith(this.getText());
		} else if (this.isTrailing()) {
			return tnw.getText().endsWith(this.getText());
		} else if (this.getText().startsWith(":") && this.getText().endsWith(":")) {
			return tnw.getText().contains(this.getText());
		} else {
			return this.getText().equals(tnw.getText());
		}
	}

	public Boolean textIsEqual(TerminalNode tn) {
		if (this.isLeading()) {
			return tn.getSymbol().getText().startsWith(this.getText());
		} else if (this.isTrailing()) {
			return tn.getSymbol().getText().endsWith(this.getText());
		} else if (this.isDelimited()) {
			return tn.getSymbol().getText().contains(this.getText());
		} else {
			return this.getText().equals(tn.getSymbol().getText());
		}
	}

	public Boolean textAndLocAreEqual(TerminalNode tn) {
		return (this.getLine() == tn.getSymbol().getLine()
				&& this.getPosn() == tn.getSymbol().getCharPositionInLine()
				&& this.textIsEqual(tn));
	}

	public void alterText(TerminalNodeWrapper replaceable, TerminalNodeWrapper replacement) {
		this.replacementText = this.getText().replace(replaceable.getText(), replacement.getText());
	}

	public String toString() {
		return this.text;
	}
}

