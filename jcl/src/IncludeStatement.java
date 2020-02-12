
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class IncludeStatement {

	private String myName = null;
	private JCLParser.IncludeStatementContext ctx = null;
	private String fileName = null;
	private String originalText = null;
	private String resolvedText = null;
	private KeywordOrSymbolicWrapper kywd = null;
	private int line = -1;  // 1 to n
	private int posn = -1;  // 0 to n-1
	public Boolean inProc = false;
	public String procName = null;
	private String nameField = null;

	public IncludeStatement(
		JCLParser.IncludeStatementContext ctx
		, String fileName
		, String procName
		) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		this.initialize();
		Demo01.LOGGER.finer(this.myName + " " + this.nameField + " instantiated from " + this.fileName);
	}

	private void initialize() {
		myName = this.getClass().getName();
		if (this.ctx.NAME_FIELD() == null) {
		} else {
			this.nameField = this.ctx.NAME_FIELD().getSymbol().getText();
		}
	}

	public int getLine() {
		if (this.line == -1) {
			if (this.ctx.INCLUDE_PARM_MEMBER() == null) {
				Demo01.LOGGER.severe(
					this.myName
					+ "getLine() found " 
					+ this.ctx.getClass().getName() 
					+ "INCLUDE_PARM_MEMBER() == null"
				);
			} else {
				this.line = this.ctx.INCLUDE_PARM_MEMBER().getSymbol().getLine();
			}
		}

		return this.line;
	}

	public int getPosn() {
		if (this.posn == -1) {
			if (this.ctx.EQUAL() == null) {
				Demo01.LOGGER.severe(
					this.myName 
					+ "getPosn() found " 
					+ this.ctx.getClass().getName() 
					+ "EQUAL() == null"
				);
			} else {
				this.posn = this.ctx.EQUAL().getSymbol().getCharPositionInLine() + 1;
			}
		}

		return this.posn;
	}

	public String getOriginalText() {
		if (this.originalText == null) {
			this.originalText = kywd.getValue();
		}

		return this.originalText;
	}

	public String getResolvedText() {
		return this.kywd.getResolvedValue();
	}

	public void resolveParms(ArrayList<SetSymbolValue> sets) {
		Demo01.LOGGER.fine(this + " resolveParms");
		this.kywd.resolveParms(sets);
	}

	public Boolean isResolved() {
		return this.kywd.isResolved();
	}

	public Boolean isProbablyTheSame(IncludeStatement i) {
		return this.getOriginalText().equals(i.getOriginalText());
	}

	public String toString() {
		return 
			this.myName 
			+ " fileName: |" 
			+ this.fileName 
			+ "| line: |" 
			+ this.getLine() 
			+ "| posn: |" 
			+ this.getPosn() 
			+ "| originalText: |" 
			+ this.getOriginalText() 
			+ "| resolvedText: |"
			+ this.getResolvedText()
			+ "| inProc: |" 
			+ this.inProc + "|"
		;
	}

}
