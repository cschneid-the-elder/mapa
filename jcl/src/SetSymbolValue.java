
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class SetSymbolValue {

	private ParserRuleContext ctx = null;
	private String fileName = null;
	private String parentFileName = null;

	public SetSymbolValue(JCLParser.SetOperationContext ctx, String fileName) {
		this.ctx = ctx;
		this.fileName = fileName;
	}

	public SetSymbolValue(JCLParser.ExecProcParmContext ctx, String fileName) {
		this.ctx = ctx;
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public int getLine() {
		int theLine = -1;

		switch(this.ctx.getClass().getName()) {
			case "SetOperationContext":
				theLine = getLineForSetOperationContext();
				break;
			case "ExecProcParmContext":
				theLine = getLineForExecProcParmContext();
				break;
			default:
				Demo01.LOGGER.severe(this.getClass().getName() + "getLine() found " + this.ctx.getClass().getName());
				break;
		}

		return theLine;
	}

	public String getText() {
		String theText = new String();

		switch(this.ctx.getClass().getName()) {
			case "SetOperationContext":
				theText = getTextForSetOperationContext();
				break;
			case "ExecProcParmContext":
				theText = getTextForExecProcParmContext();
				break;
			default:
				Demo01.LOGGER.severe(this.getClass().getName() + "getText() found " + this.ctx.getClass().getName());
				break;
		}

		return theText;
	}

	private int getLineForSetOperationContext() {
		JCLParser.SetOperationContext ctx = (JCLParser.SetOperationContext)this.ctx;
		int theLine = -1;

		if (ctx.SET_PARM_NAME() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getLine() found " + ctx.getClass().getName() + "SET_PARM_NAME() == null");
		} else {
			theLine = ctx.SET_PARM_NAME().getSymbol().getLine();
		}

		return theLine;
	}

	private int getLineForExecProcParmContext() {
		JCLParser.ExecProcParmContext ctx = (JCLParser.ExecProcParmContext)this.ctx;
		int theLine = -1;

		if (ctx.EXEC_PROC_PARM() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getLine() found " + ctx.getClass().getName() + "EXEC_PROC_PARM() == null");
		} else {
			theLine = ctx.EXEC_PROC_PARM().getSymbol().getLine();
		}

		return theLine;
	}

	private String getTextForSetOperationContext() {
		JCLParser.SetOperationContext ctx = (JCLParser.SetOperationContext)this.ctx;
		String theText = new String();

		if (ctx.SET_PARM_VALUE() == null) {
			if (ctx.QUOTED_STRING_FRAGMENT() == null) {
			} else {
				theText = ctx.QUOTED_STRING_FRAGMENT().getSymbol().getText();
			}
		} else {
			theText = ctx.SET_PARM_VALUE().getSymbol().getText();
		}

		return theText;
	}

	private String getTextForExecProcParmContext() {
		JCLParser.ExecProcParmContext ctx = (JCLParser.ExecProcParmContext)this.ctx;
		String theText = new String();

		if (ctx.keywordOrSymbolic() == null) {
		} else {
			if (ctx.keywordOrSymbolic().KEYWORD_VALUE() == null) {
				if (ctx.keywordOrSymbolic().QUOTED_STRING_FRAGMENT() == null || ctx.keywordOrSymbolic().QUOTED_STRING_FRAGMENT().size() == 0) {
				} else {
					for (TerminalNode t: ctx.keywordOrSymbolic().QUOTED_STRING_FRAGMENT()) {
						theText = theText.concat(t.getSymbol().getText());
					}
				}
			} else {
				theText = ctx.keywordOrSymbolic().KEYWORD_VALUE().getSymbol().getText();
			}
		}

		return theText;
	}

}
