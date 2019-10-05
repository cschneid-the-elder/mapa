
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

	public SetSymbolValue(JCLParser.DefineSymbolicParameterContext ctx, String fileName) {
		this.ctx = ctx;
		this.fileName = fileName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public String getParmName() {
		String theParmName = new String();

		switch(this.ctx.getClass().getName()) {
			case "JCLParser$SetOperationContext":
				theParmName = getParmNameForSetOperationContext();
				break;
			case "JCLParser$ExecProcParmContext":
				theParmName = getParmNameForExecProcParmContext();
				break;
			case "JCLParser$DefineSymbolicParameterContext":
				theParmName = getParmNameForDefineSymbolicParameterContext();
				break;
			default:
				Demo01.LOGGER.severe(this.getClass().getName() + "getParmName() found " + this.ctx.getClass().getName());
				break;
		}

		return theParmName;
	}

	public int getLine() {
		int theLine = -1;

		switch(this.ctx.getClass().getName()) {
			case "JCLParser$SetOperationContext":
				theLine = getLineForSetOperationContext();
				break;
			case "JCLParser$ExecProcParmContext":
				theLine = getLineForExecProcParmContext();
				break;
			case "JCLParser$DefineSymbolicParameterContext":
				theLine = getLineForDefineSymbolicParameterContext();
				break;
			default:
				Demo01.LOGGER.severe(this.getClass().getName() + "getLine() found " + this.ctx.getClass().getName());
				break;
		}

		return theLine;
	}

	public String getParmValue() {
		String theText = new String();

		switch(this.ctx.getClass().getName()) {
			case "JCLParser$SetOperationContext":
				theText = getParmValueForSetOperationContext();
				break;
			case "JCLParser$ExecProcParmContext":
				theText = getParmValueForExecProcParmContext();
				break;
			case "JCLParser$DefineSymbolicParameterContext":
				theText = getParmValueForDefineSymbolicParameterContext();
				break;
			default:
				Demo01.LOGGER.severe(this.getClass().getName() + "getParmValue() found " + this.ctx.getClass().getName());
				break;
		}

		return theText;
	}

	private String getParmNameForSetOperationContext() {
		JCLParser.SetOperationContext ctx = (JCLParser.SetOperationContext)this.ctx;

		return ctx.SET_PARM_NAME().getSymbol().getText();
	}

	private String getParmNameForExecProcParmContext() {
		JCLParser.ExecProcParmContext ctx = (JCLParser.ExecProcParmContext)this.ctx;

		return ctx.EXEC_PROC_PARM().getSymbol().getText();
	}

	private String getParmNameForDefineSymbolicParameterContext() {
		JCLParser.DefineSymbolicParameterContext ctx = (JCLParser.DefineSymbolicParameterContext)this.ctx;

		return ctx.PROC_PARM_NAME().getSymbol().getText();
	}

	private int getLineForSetOperationContext() {
		JCLParser.SetOperationContext ctx = (JCLParser.SetOperationContext)this.ctx;
		int theLine = -1;

		if (ctx.SET_PARM_NAME() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getLineForSetOperationContext() found " + ctx.getClass().getName() + "SET_PARM_NAME() == null");
		} else {
			theLine = ctx.SET_PARM_NAME().getSymbol().getLine();
		}

		return theLine;
	}

	private int getLineForExecProcParmContext() {
		JCLParser.ExecProcParmContext ctx = (JCLParser.ExecProcParmContext)this.ctx;
		int theLine = -1;

		if (ctx.EXEC_PROC_PARM() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getLineForExecProcParmContext() found " + ctx.getClass().getName() + "EXEC_PROC_PARM() == null");
		} else {
			theLine = ctx.EXEC_PROC_PARM().getSymbol().getLine();
		}

		return theLine;
	}

	private int getLineForDefineSymbolicParameterContext() {
		JCLParser.DefineSymbolicParameterContext ctx = (JCLParser.DefineSymbolicParameterContext)this.ctx;
		int theLine = -1;

		if (ctx.PROC_PARM_NAME() == null) {
			Demo01.LOGGER.severe(this.getClass().getName() + "getLineForDefineSymbolicParameterContext() found " + ctx.getClass().getName() + "PROC_PARM_NAME() == null");
		} else {
			theLine = ctx.PROC_PARM_NAME().getSymbol().getLine();
		}

		return theLine;
	}

	private String getParmValueForSetOperationContext() {
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

	private String getParmValueForExecProcParmContext() {
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

	private String getParmValueForDefineSymbolicParameterContext() {
		JCLParser.DefineSymbolicParameterContext ctx = (JCLParser.DefineSymbolicParameterContext)this.ctx;
		String theText = new String();

			if (ctx.PROC_PARM_VALUE() == null) {
				if (ctx.QUOTED_STRING_FRAGMENT() == null) {
				} else {
					theText = ctx.QUOTED_STRING_FRAGMENT().getSymbol().getText();
				}
			} else {
				theText = ctx.PROC_PARM_VALUE().getSymbol().getText();
			}

		return theText;
	}

	public String toString() {
		return ctx.getClass().getName() + " fileName: |" + this.fileName + "| line: |" + this.getLine() + "| parmName: |" + this.getParmName() + "| parmValue: |" + this.getParmValue() + "|";
	}
}
