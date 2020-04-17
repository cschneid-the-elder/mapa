
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Symbolic {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
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
	private SetSymbolValue ssv = null;

	public static ArrayList<Symbolic> bunchOfThese(List<org.antlr.v4.runtime.tree.TerminalNode> tn
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		ArrayList<Symbolic> symbolics = new ArrayList<>();		

		for (org.antlr.v4.runtime.tree.TerminalNode aNode: tn) {
			symbolics.add(new Symbolic(aNode, fileName, procName, LOGGER, CLI));
		}

		return symbolics;
	}

	public Symbolic(
			org.antlr.v4.runtime.tree.TerminalNode tn
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
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
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.LOGGER.finer(this.myName + " " + this.getText() + " instantiated from " + this.fileName);
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

	public String getFileName() {
		return this.fileName;
	}

	public String getProcName() {
		return this.procName;
	}

	public Boolean isResolved() {
		return (this.resolvedText != null && !this.ssv.isParameterized());
	}

	public String getResolvedText() {
		if (this.ssv == null || !this.ssv.isParameterized()) {
			return this.resolvedText;
		} else {
			return this.ssv.getResolvedValue();
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

	public Boolean equals(Symbolic s) {
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

