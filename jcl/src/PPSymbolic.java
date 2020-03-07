
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPSymbolic {

	private String myName = null;
	private String fileName = null;
	private String text = null;
	private String resolvedText = null;
	private org.antlr.v4.runtime.Token token = null;
	private org.antlr.v4.runtime.tree.TerminalNode terminalNode = null;
	private String procName = null;
	private Boolean inProc = null;
	private int line = -1;
	private int posn = -1;
	private int len = -1;
	private PPSetSymbolValue ssv = null;

	public static ArrayList<PPSymbolic> bunchOfThese(List<org.antlr.v4.runtime.tree.TerminalNode> tn
			, String fileName
			, String procName
			) {
		ArrayList<PPSymbolic> symbolics = new ArrayList<>();		

		for (org.antlr.v4.runtime.tree.TerminalNode aNode: tn) {
			symbolics.add(new PPSymbolic(aNode, fileName, procName));
		}

		return symbolics;
	}

	public PPSymbolic(org.antlr.v4.runtime.tree.TerminalNode tn, String fileName, String procName) {
		this.myName = this.getClass().getName();
		this.terminalNode = tn;
		this.token = tn.getSymbol();
		this.fileName = fileName;
		this.procName = procName;
		this.line = this.token.getLine();
		this.posn = this.token.getCharPositionInLine();
		this.text = this.token.getText();
		this.len = this.text.length();
		this.inProc = !(procName == null);
		Demo01.LOGGER.finer(this.myName + " " + this.getText() + " instantiated from " + this.fileName);
	}

	public String getText() {
		return this.text;
	}

	public String getParmName() {
		return this.getText().substring(1);
	}

	public int getLine() {
		return this.line;
	}

	public int getPosn() {
		return this.posn;
	}

	public int getLen() {
		return this.len;
	}

	public String getFileName() {
		return this.fileName;
	}

	public String getProcName() {
		return this.procName;
	}

	public Boolean isResolved() {
		return (this.resolvedText != null && !this.ssv.isParameterized());
	}

	public void setResolvedValue(PPSetSymbolValue s) {
		Demo01.LOGGER.finer(myName + " text = |" + this.getText() + "| setResolvedValue(" + s.getParmValue() + ")");
		this.resolvedText = s.getParmValue();
		this.ssv = s;
	}

	public String getResolvedText() {
		//return this.resolvedText;
		if (this.ssv == null || !this.ssv.isParameterized()) {
			return this.resolvedText;
		} else {
			return this.ssv.getResolvedValue();
		}
	}

	public void resolve(ArrayList<PPSetSymbolValue> sets) {
		Demo01.LOGGER.finer(myName + " resolve this: |" + this + "| sets: " + sets + "|");

		PPSetSymbolValue[] matching_sets =
			sets.stream()
			.filter(s -> s.getParmName().equals(this.getParmName()))
			.toArray(PPSetSymbolValue[]::new);
		for(PPSetSymbolValue s: matching_sets) {
			Demo01.LOGGER.finest(myName + " s: " + s);
			switch(s.getSetType()) {
				case SET:
					if ((this.inProc  
						&& !s.parmSetByExec(sets, this.procName) && !s.parmDefinedByProc(sets))
					|| (!this.inProc && !s.inProc && this.getLine() > s.getLine())
					) {
						this.setResolvedValue(s);
					}
					break;
				case PROC:
					if ((this.inProc && s.inProc && s.procName.equals(this.procName) 
						&& !s.parmSetByExec(sets, this.procName))
					) {
						this.setResolvedValue(s);
					}
					break;
				case EXEC:
					if (this.inProc) {
						this.setResolvedValue(s);
					}
					break;
				case SYS:
					this.setResolvedValue(s);
					break;
				default:
					break;
			}
		}
	}

	public String toString() {
		return
			this.myName
			+ " text = |" + this.getText()
			+ "| resolvedText = |" + this.getResolvedText()
			+ "| line = |" + this.getLine()
			+ "| posn = |" + this.getPosn()
			+ "| fileName = |" + this.getFileName()
			+ "| procName = |" + this.getProcName()
			+ "|";
	}

	public Boolean equals(PPSymbolic s) {
		return
			this.getText().equals(s.getText())
			&& this.getLine() == s.getLine()
			&& this.getPosn() == s.getPosn()
			&& this.getFileName().equals(s.getFileName())
			&& this.getProcName().equals(s.getProcName())
		;
	}

	public int hashCode() {
		StringBuffer buf = new StringBuffer(this.getText() + this.getFileName() + this.getProcName());

		buf.append(String.valueOf(this.getLine()));
		buf.append(String.valueOf(this.getPosn()));

		return buf.toString().hashCode();
	}
}

