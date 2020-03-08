
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class PPSetSymbolValue {

	private String myName = null;
	private ParserRuleContext ctx = null;
	private String fileName = null;
	private String parentFileName = null;
	private SetTypeOfSymbolValue setType = null;
	private PPKeywordOrSymbolicWrapper kywd = null;
	private String parmValue = null;
	private String parmName = null;
	private int line = -1;
	public Boolean inProc = false;
	public String procName = null;
	private String procBeingExecuted = null;

	public PPSetSymbolValue(JCLPPParser.SetOperationContext ctx) {
		this.ctx = ctx;
		this.setType = SetTypeOfSymbolValue.SYS;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		}
		this.initialize();
	}

	public PPSetSymbolValue(JCLPPParser.SetOperationContext ctx, String fileName, String procName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.SET;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		}
		this.initialize();
	}

	public PPSetSymbolValue(JCLPPParser.ExecProcParmContext ctx, String fileName, String procName, String procBeingExecuted) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.procBeingExecuted = procBeingExecuted;
		this.setType = SetTypeOfSymbolValue.EXEC;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		}
		this.initialize();
	}

	public PPSetSymbolValue(JCLPPParser.DefineSymbolicParameterContext ctx, String fileName, String procName) {
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.PROC;
		if (ctx.keywordOrSymbolic() == null) {
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName);
		}
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		Demo01.LOGGER.fine(myName + " resolveParms this = |" + this + "| sets = |" + sets +"|");

		ArrayList<PPSetSymbolValue> notThisSet = new ArrayList<>(sets);
		notThisSet.remove(this);

		Demo01.LOGGER.finest(myName + " resolveParms notThisSet = |" + notThisSet + "|");

		this.kywd.resolveParms(notThisSet);
	}

	public Boolean isParameterized() {
		return this.kywd.isParameterized();
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
				case SYS:
					theParmName = getParmNameForSetOperationContext();
					break;
				default:
					Demo01.LOGGER.severe(
						this.myName
						+ " getParmName() found " 
						+ this.ctx.getClass().getName()
						+ " "
						+ this.setType
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
				case SYS:
					theLine = 0;
					break;
				default:
					Demo01.LOGGER.severe(
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
				case SYS:
					theText = getParmValueForSetOperationContext();
					break;
				default:
					Demo01.LOGGER.severe(
						this.myName
						+ " getParmValue() found " 
						+ this.ctx.getClass().getName()
						+ " "
						+ this.setType
					);
					break;
			}
			this.parmValue = theText;
		}

		return this.parmValue;
	}

	public String getResolvedValue() {
		return kywd.getResolvedValue();
	}

	private String getParmNameForSetOperationContext() {
		JCLPPParser.SetOperationContext ctx = (JCLPPParser.SetOperationContext)this.ctx;

		return ctx.SET_PARM_NAME().getSymbol().getText();
	}

	private String getParmNameForExecProcParmContext() {
		JCLPPParser.ExecProcParmContext ctx = (JCLPPParser.ExecProcParmContext)this.ctx;

		return ctx.EXEC_PROC_PARM().getSymbol().getText();
	}

	private String getParmNameForDefineSymbolicParameterContext() {
		JCLPPParser.DefineSymbolicParameterContext ctx = (JCLPPParser.DefineSymbolicParameterContext)this.ctx;

		return ctx.PROC_PARM_NAME().getSymbol().getText();
	}

	private int getLineForSetOperationContext() {
		JCLPPParser.SetOperationContext ctx = (JCLPPParser.SetOperationContext)this.ctx;
		int theLine = -1;

		if (ctx.SET_PARM_NAME() == null) {
			Demo01.LOGGER.severe(
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
		JCLPPParser.ExecProcParmContext ctx = (JCLPPParser.ExecProcParmContext)this.ctx;
		int theLine = -1;

		if (ctx.EXEC_PROC_PARM() == null) {
			Demo01.LOGGER.severe(
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
		JCLPPParser.DefineSymbolicParameterContext ctx = (JCLPPParser.DefineSymbolicParameterContext)this.ctx;
		int theLine = -1;

		if (ctx.PROC_PARM_NAME() == null) {
			Demo01.LOGGER.severe(
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
		JCLPPParser.SetOperationContext ctx = (JCLPPParser.SetOperationContext)this.ctx;
		String theText = new String();

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				// SET TALYN=

				In this instance the parm TALYN is set to nothing.
			*/
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	private String getParmValueForExecProcParmContext() {
		JCLPPParser.ExecProcParmContext ctx = (JCLPPParser.ExecProcParmContext)this.ctx;
		String theText = new String();

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				//JS01 EXEC PROC=MOYA,TALYN=

				In this instance the parm TALYN is set to nothing.  Any default value
				set in the PROC statement for the proc MOYA is nullified.  Any value
				set in a SET statement prior to this EXEC statement is nullified.
			*/
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	private String getParmValueForDefineSymbolicParameterContext() {
		JCLPPParser.DefineSymbolicParameterContext ctx = (JCLPPParser.DefineSymbolicParameterContext)this.ctx;
		String theText = new String();

		if (this.kywd == null) {
			/*
				It's legal for this to be null.  The following is syntactically correct.

				//MOYA PROC TALYN=

				In this instance the parm TALYN is set to nothing.  Any value
				set in a SET statement prior to execution of the proc MOYA is nullified.
			*/
		} else {
			theText = kywd.getValue();
		}

		return theText;
	}

	public String getProcBeingExecuted() {
		return this.procBeingExecuted;
	}

	public Boolean parmSetByExec(ArrayList<PPSetSymbolValue> sets, String procName) {
		Boolean rc = false;

		for(PPSetSymbolValue s: sets) {
			if (s.getParmName().equals(this.getParmName())
			&& s.getSetType() == SetTypeOfSymbolValue.EXEC
			&& s.getProcBeingExecuted().equals(procName)
			&& s != this
			) {
				rc = true;
				break;
			}
		}

		return rc;
	}

	public Boolean parmDefinedByProc(ArrayList<PPSetSymbolValue> sets) {
		Boolean rc = false;

		for(PPSetSymbolValue s: sets) {
			if (s.getParmName().equals(this.getParmName())
			&& s.getSetType() == SetTypeOfSymbolValue.PROC
			&& s != this
			) {
				rc = true;
				break;
			}
		}

		return rc;
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