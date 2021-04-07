
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
	private Boolean isFirst = false;
	private Boolean precededByNewline = false;
	private Boolean precededByWhitespace = false;
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
/*
	public void setLine(long aLine) {
		this.line = aLine;
		this.setSortKey();
	}

	public void setPosn(long aPosn) {
		this.posn = aPosn;
		this.setSortKey();
	}
*/
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

