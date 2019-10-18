
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class SetSymbolValue {

	private ParserRuleContext ctx = null;
	private String fileName = null;
	private String parentFileName = null;
	private SetTypeOfSymbolValue setType = null;
	private KeywordOrSymbolicWrapper kywd = null;
	private String parmValue = null;
	private String parmName = null;
	private int line = -1;
	public Boolean inProc = false;
	public String procName = null;

	public SetSymbolValue(JCLParser.SetOperationContext ctx, String fileName, Boolean inProc, String procName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = inProc;
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.SET;
	}

	public SetSymbolValue(JCLParser.ExecProcParmContext ctx, String fileName, Boolean inProc, String procName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = inProc;
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.EXEC;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		}
	}

	public SetSymbolValue(JCLParser.DefineSymbolicParameterContext ctx, String fileName, Boolean inProc, String procName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = inProc;
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.PROC;
	}

	public String getFileName() {
		return this.fileName;
	}

	public SetTypeOfSymbolValue getSetType() {
		return this.setType;
	}

	public String getParmName() {

		if (this.parmName == null) {
			String theParmName = new String();
			switch(this.setType) {
				case SET:
					theParmName = getParmNameForSetOperationContext();
					break;
				case EXEC:
					theParmName = getParmNameForExecProcParmContext();
					break;
				case PROC:
					theParmName = getParmNameForDefineSymbolicParameterContext();
					break;
				default:
					Demo01.LOGGER.severe(
						this.getClass().getName() 
						+ "getParmName() found " 
						+ this.ctx.getClass().getName()
					);
					break;
			}
			this.parmName = theParmName;
		}

		return this.parmName;
	}

	public int getLine() {

		if (this.line == -1) {
			int theLine = -1;
			switch(this.setType) {
				case SET:
					theLine = getLineForSetOperationContext();
					break;
				case EXEC:
					theLine = getLineForExecProcParmContext();
					break;
				case PROC:
					theLine = getLineForDefineSymbolicParameterContext();
					break;
				default:
					Demo01.LOGGER.severe(
						this.getClass().getName() 
						+ "getLine() found " 
						+ this.ctx.getClass().getName()
					);
					break;
			}
			this.line = theLine;
		}

		return this.line;
	}

	public String getParmValue() {

		if (this.parmValue == null) {
			String theText = new String();
			switch(this.setType) {
				case SET:
					theText = getParmValueForSetOperationContext();
					break;
				case EXEC:
					theText = getParmValueForExecProcParmContext();
					break;
				case PROC:
					theText = getParmValueForDefineSymbolicParameterContext();
					break;
				default:
					Demo01.LOGGER.severe(
						this.getClass().getName() 
						+ "getParmValue() found " 
						+ this.ctx.getClass().getName()
					);
					break;
			}
			this.parmValue = theText;
		}

		return this.parmValue;
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
			Demo01.LOGGER.severe(
				this.getClass().getName() 
				+ "getLineForSetOperationContext() found " 
				+ ctx.getClass().getName() 
				+ "SET_PARM_NAME() == null"
			);
		} else {
			theLine = ctx.SET_PARM_NAME().getSymbol().getLine();
		}

		return theLine;
	}

	private int getLineForExecProcParmContext() {
		JCLParser.ExecProcParmContext ctx = (JCLParser.ExecProcParmContext)this.ctx;
		int theLine = -1;

		if (ctx.EXEC_PROC_PARM() == null) {
			Demo01.LOGGER.severe(
				this.getClass().getName() 
				+ "getLineForExecProcParmContext() found " 
				+ ctx.getClass().getName() 
				+ "EXEC_PROC_PARM() == null"
			);
		} else {
			theLine = ctx.EXEC_PROC_PARM().getSymbol().getLine();
		}

		return theLine;
	}

	private int getLineForDefineSymbolicParameterContext() {
		JCLParser.DefineSymbolicParameterContext ctx = (JCLParser.DefineSymbolicParameterContext)this.ctx;
		int theLine = -1;

		if (ctx.PROC_PARM_NAME() == null) {
			Demo01.LOGGER.severe(
				this.getClass().getName() 
				+ "getLineForDefineSymbolicParameterContext() found " 
				+ ctx.getClass().getName() 
				+ "PROC_PARM_NAME() == null"
			);
		} else {
			theLine = ctx.PROC_PARM_NAME().getSymbol().getLine();
		}

		return theLine;
	}

	private String getParmValueForSetOperationContext() {
		JCLParser.SetOperationContext ctx = (JCLParser.SetOperationContext)this.ctx;
		String theText = new String();

		if (ctx.SET_PARM_VALUE() == null) {
			if (ctx.QUOTED_STRING_FRAGMENT() == null || ctx.QUOTED_STRING_FRAGMENT().size() == 0) {
			} else {
				for (TerminalNode t: ctx.QUOTED_STRING_FRAGMENT()) {
					theText = t.getSymbol().getText();
				}
			}
		} else {
			theText = ctx.SET_PARM_VALUE().getSymbol().getText();
		}

		return theText;
	}

	private String getParmValueForExecProcParmContext() {
		JCLParser.ExecProcParmContext ctx = (JCLParser.ExecProcParmContext)this.ctx;
		String theText = new String();

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				//JS01 EXEC PROC=MOYA,TALYN=

				In this instance the parm TALYN is set to nothing.  Any default value
				set in the PROC statement for the proc MOYA is nullified.
			*/
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	private String getParmValueForDefineSymbolicParameterContext() {
		JCLParser.DefineSymbolicParameterContext ctx = (JCLParser.DefineSymbolicParameterContext)this.ctx;
		String theText = new String();

		if (ctx.PROC_PARM_VALUE() == null) {
			if (ctx.QUOTED_STRING_FRAGMENT() == null || ctx.QUOTED_STRING_FRAGMENT().size() == 0) {
			} else {
				for (TerminalNode t: ctx.QUOTED_STRING_FRAGMENT()) {
					theText = t.getSymbol().getText();
				}
			}
		} else {
			theText = ctx.PROC_PARM_VALUE().getSymbol().getText();
		}

		return theText;
	}

	public String toString() {
		return 
			ctx.getClass().getName() 
			+ " fileName: |" 
			+ this.fileName 
			+ "| line: |" 
			+ this.getLine() 
			+ "| parmName: |" 
			+ this.getParmName() 
			+ "| parmValue: |" 
			+ this.getParmValue() 
			+ "|"
		;
	}
}
