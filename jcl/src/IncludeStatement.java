
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class IncludeStatement {

	private JCLParser.IncludeStatementContext ctx = null;
	private String fileName = null;
	public Boolean inInStreamProc = false;

	public IncludeStatement(JCLParser.IncludeStatementContext ctx, String fileName, Boolean inInStreamProc) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inInStreamProc = inInStreamProc;
	}

	private int getLine() {
		int theLine = -1;

		if (this.ctx.INCLUDE_PARM_MEMBER() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getLine() found " + this.ctx.getClass().getName() + "INCLUDE_PARM_MEMBER() == null");
		} else {
			theLine = this.ctx.INCLUDE_PARM_MEMBER().getSymbol().getLine();
		}

		return theLine;
	}

	private String getText() {
		String theText = new String();

		if (this.ctx.keywordOrSymbolic() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getText() found " + this.ctx.getClass().getName() + "keywordOrSymbolic() == null");
		} else {
			if (this.ctx.keywordOrSymbolic().KEYWORD_VALUE() == null) {
				if (this.ctx.keywordOrSymbolic().QUOTED_STRING_FRAGMENT() == null || this.ctx.keywordOrSymbolic().QUOTED_STRING_FRAGMENT().size() == 0) {
					Demo01.LOGGER.severe(this.getClass().getName() + "getText() found " + this.ctx.getClass().getName() + "QUOTED_STRING_FRAGMENT() == null || QUOTED_STRING_FRAGMENT().size() == 0");
				} else {
					for (TerminalNode t: this.ctx.keywordOrSymbolic().QUOTED_STRING_FRAGMENT()) {
						theText = theText.concat(t.getSymbol().getText());
					}
				}
			} else {
				theText = this.ctx.keywordOrSymbolic().KEYWORD_VALUE().getSymbol().getText();
			}
		}

		return theText;
	}

	public String toString() {
		return this.ctx.getClass().getName() + " fileName: |" + this.fileName + "| line: |" + this.getLine() + "| text: |" + this.getText() + "| inInStreamProc: |" + this.inInStreamProc + "|";
	}

}
