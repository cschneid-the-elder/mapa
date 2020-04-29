
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class represents a symbolic being set to a value, whether it be via
a SET statement, a system symbol (as simulated by the CLI options -set
or -setList), an EXEC statement, or a PROC statement.

<p>Instances of this class are used to resolve symbolics "owned" by other
classes, which are represented by instances of the PPSymbolic class.

*/

public class PPSetSymbolValue {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
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

	public PPSetSymbolValue(
			JCLPPParser.SetOperationContext ctx
			, Logger LOGGER
			, TheCLI CLI
			) {
		LOGGER.fine(this.getClass().getName() + " instantiation with " + ctx.getClass().getName());
		this.ctx = ctx;
		this.setType = SetTypeOfSymbolValue.SYS;
		if (ctx.keywordOrSymbolic() == null) {
			LOGGER.finest(this.getClass().getName() + " ctx.keywordOrSymbolic() == null");
			LOGGER.finest(
				this.getClass().getName() 
				+ " SET_PARM_NAME().getSymbol().getText() = |" 
				+ ctx.SET_PARM_NAME().getSymbol().getText() 
				+ "|"
				);
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	public PPSetSymbolValue(
			JCLPPParser.SetOperationContext ctx
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		LOGGER.fine(this.getClass().getName() + " instantiation with " + ctx.getClass().getName());
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.SET;
		if (ctx.keywordOrSymbolic() == null) {
			LOGGER.finest(this.getClass().getName() + " ctx.keywordOrSymbolic() == null");
			LOGGER.finest(
				this.getClass().getName() 
				+ " SET_PARM_NAME().getSymbol().getText() = |" 
				+ ctx.SET_PARM_NAME().getSymbol().getText() 
				+ "|"
				);
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	public PPSetSymbolValue(
			JCLPPParser.ExecProcParmContext ctx
			, String fileName
			, String procName
			, String procBeingExecuted
			, Logger LOGGER
			, TheCLI CLI
			) {
		LOGGER.fine(this.getClass().getName() + " instantiation with " + ctx.getClass().getName());
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.procBeingExecuted = procBeingExecuted;
		this.setType = SetTypeOfSymbolValue.EXEC;
		if (ctx.keywordOrSymbolic() == null) {
			LOGGER.finest(this.getClass().getName() + " ctx.keywordOrSymbolic() == null");
			LOGGER.finest(
				this.getClass().getName() 
				+ " EXEC_PROC_PARM().getSymbol().getText() = |" 
				+ ctx.EXEC_PROC_PARM().getSymbol().getText() 
				+ "|"
				);
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	public PPSetSymbolValue(
			JCLPPParser.DefineSymbolicParameterContext ctx
			, String fileName
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		LOGGER.fine(this.getClass().getName() + " instantiation with " + ctx.getClass().getName());
		this.ctx = ctx;
		this.fileName = fileName;
		this.inProc = !(procName == null);
		this.procName = procName;
		this.setType = SetTypeOfSymbolValue.PROC;
		if (ctx.keywordOrSymbolic() == null) {
			LOGGER.finest(this.getClass().getName() + " ctx.keywordOrSymbolic() == null");
			LOGGER.finest(
				this.getClass().getName() 
				+ " PROC_PARM_NAME().getSymbol().getText() = |" 
				+ ctx.PROC_PARM_NAME().getSymbol().getText() 
				+ "|"
				);
		} else {
			this.kywd = new PPKeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), procName, LOGGER, CLI);
		}
		this.initialize(LOGGER, CLI);
	}

	private void initialize(Logger LOGGER, TheCLI CLI) {
		myName = this.getClass().getName();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> sets) {
		this.LOGGER.fine(myName + " resolveParms this = |" + this + "| sets = |" + sets +"|");

		ArrayList<PPSetSymbolValue> notThisSet = new ArrayList<>(sets);
		notThisSet.remove(this);

		this.LOGGER.finest(myName + " resolveParms notThisSet = |" + notThisSet + "|");

		if (this.kywd == null) {
			this.LOGGER.finest(myName + " this.kywd == null");
		} else {
			this.kywd.resolveParms(notThisSet);
		}
	}

	public Boolean isParameterized() {
		if (this.kywd == null) {
			return false;
		} else {
			return this.kywd.isParameterized();
		}
	}

	public SetTypeOfSymbolValue getSetType() {
		return this.setType;
	}

	/**
	Return the name of the symbolic whose value is set, used to match
	with symbolic parameters when resolving their value.
	*/
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

	/**
	Return the line on which the value for this symbol was set, used
	in determining which instances are relevant when resolving symbolic 
	parameters.
	*/
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
			if (this.kywd == null) {
				/*
				It's legal for this to be null.  The following is syntactically correct.

				// SET TALYN=

				In this instance the parm TALYN is set to nothing.
				*/
				this.parmValue = "";
			} else {
				this.parmValue = kywd.getValue();
			}
		}

		return this.parmValue;
	}

	/**
	Return the value to which this symbol is set, used when resolving
	the values of symbolic parameters.

	<p>This is distinct from <code>getValue()</code> in that a symbolic
	can be set to another symbolic.
	*/
	public String getResolvedValue() {
		if (this.kywd == null) {
			return "";
		} else {
			return kywd.getResolvedValue();
		}
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
		JCLPPParser.ExecProcParmContext ctx = (JCLPPParser.ExecProcParmContext)this.ctx;
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
		JCLPPParser.DefineSymbolicParameterContext ctx = (JCLPPParser.DefineSymbolicParameterContext)this.ctx;
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

	public String getProcBeingExecuted() {
		return this.procBeingExecuted;
	}

	/**
	Used by PPSymbolic in resolution of the value of a symbolic parameter.

	<p>What is being determined is if the value set on this EXEC statement
	is applicable to setting the value of a symbolic.
	*/
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

	/**
	Used by PPSymbolic in resolution of the value of a symbolic parameter.

	<p>What is being determined is if the value set on this EXEC statement
	is applicable to setting the value of a symbolic.
	*/
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
