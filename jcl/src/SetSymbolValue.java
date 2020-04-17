
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class SetSymbolValue {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
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
	private String procBeingExecuted = null;

	public SetSymbolValue(
			JCLParser.SetOperationContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.setType = SetTypeOfSymbolValue.SYS;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	public SetSymbolValue(
			JCLParser.SetOperationContext ctx
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.SET;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	public SetSymbolValue(
			JCLParser.ExecProcParmContext ctx
			, String fileName
			, String procName
			, String procBeingExecuted
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.procBeingExecuted = procBeingExecuted;
		this.setType = SetTypeOfSymbolValue.EXEC;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	public SetSymbolValue(
			JCLParser.DefineSymbolicParameterContext ctx
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.PROC;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	private void initialize(Logger LOGGER, TheCLI CLI) {
		myName = this.getClass().getName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public Boolean isParameterized() {
		return this.kywd.isParameterized();
	}

	public SetTypeOfSymbolValue getSetType() {
		return this.setType;
	}

	public String getParmName() {

		if (this.parmName == null) {
			switch(this.setType) {
				case SET:
					this.parmName = getParmNameForSetOperationContext();
					break;
				case EXEC:
					this.parmName = getParmNameForExecProcParmContext();
					break;
				case PROC:
					this.parmName = getParmNameForDefineSymbolicParameterContext();
					break;
				case SYS:
					this.parmName = getParmNameForSetOperationContext();
					break;
				default:
					this.LOGGER.severe(
						this.myName
						+ " getParmName() found " 
						+ this.ctx.getClass().getName()
						+ " "
						+ this.setType
					);
					this.parmName = new String();
					break;
			}
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
				case SYS:
					theLine = 0;
					break;
				default:
					this.LOGGER.severe(
						this.myName
						+ " getLine() found " 
						+ this.ctx.getClass().getName()
						+ " "
						+ this.setType
					);
					break;
			}
			this.line = theLine;
		}

		return this.line;
	}

	public String getParmValue() {

		if (this.parmValue == null) {
			switch(this.setType) {
				case SET:
					this.parmValue = getParmValueForSetOperationContext();
					break;
				case EXEC:
					this.parmValue = getParmValueForExecProcParmContext();
					break;
				case PROC:
					this.parmValue = getParmValueForDefineSymbolicParameterContext();
					break;
				case SYS:
					this.parmValue = getParmValueForSetOperationContext();
					break;
				default:
					this.LOGGER.severe(
						this.myName
						+ " getParmValue() found " 
						+ this.ctx.getClass().getName()
						+ " "
						+ this.setType
					);
					this.parmValue = new String();
					break;
			}
		}

		return this.parmValue;
	}

	public String getResolvedValue() {
		return kywd.getResolvedValue();
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
			this.LOGGER.severe(
				this.myName
				+ " getLineForSetOperationContext() found " 
				+ ctx.getClass().getName() 
				+ " SET_PARM_NAME() == null"
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
			this.LOGGER.severe(
				this.myName
				+ " getLineForExecProcParmContext() found " 
				+ ctx.getClass().getName() 
				+ " EXEC_PROC_PARM() == null"
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
			this.LOGGER.severe(
				this.myName
				+ " getLineForDefineSymbolicParameterContext() found " 
				+ ctx.getClass().getName() 
				+ " PROC_PARM_NAME() == null"
			);
		} else {
			theLine = ctx.PROC_PARM_NAME().getSymbol().getLine();
		}

		return theLine;
	}

	private String getParmValueForSetOperationContext() {
		String theText = null;

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				// SET TALYN=

				In this instance the parm TALYN is set to nothing.
			*/
			theText = new String();
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	private String getParmValueForExecProcParmContext() {
		String theText = null;

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				//JS01 EXEC PROC=MOYA,TALYN=

				In this instance the parm TALYN is set to nothing.  Any default value
				set in the PROC statement for the proc MOYA is nullified.  Any value
				set in a SET statement prior to this EXEC statement is nullified.
			*/
			theText = new String();
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	private String getParmValueForDefineSymbolicParameterContext() {
		String theText = null;

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				//MOYA PROC TALYN=

				In this instance the parm TALYN is set to nothing.  Any value
				set in a SET statement prior to execution of the proc MOYA is nullified.
			*/
			theText = new String();
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	public String toString() {
		return 
			this.myName 
			+ " fileName: |" 
			+ this.fileName 
			+ "| line: |" 
			+ this.getLine() 
			+ "| parmName: |" 
			+ this.getParmName() 
			+ "| parmValue: |" 
			+ this.getParmValue() 
			+ "| inProc: |"
			+ this.inProc
			+ "| procName: |"
			+ this.procName
			+ "| setType: |"
			+ this.getSetType()
			+ "|"
		;
	}
}
