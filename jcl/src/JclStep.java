
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class JclStep {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private String fileName = null;
	private String procName = null;
	private String stepName = null;
	private int line = -1;
	private KeywordOrSymbolicWrapper procExecuted = null;
	private KeywordOrSymbolicWrapper pgmExecuted = null;
	private Proc proc = null;
	private Boolean inProc = null;
	private JCLParser.JclStepContext jclStepCtx = null;
	private JCLParser.ExecStatementContext execStmtCtx = null;
	private JCLParser.ExecPgmStatementContext execPgmStmtCtx = null;
	private JCLParser.ExecProcStatementContext execProcStmtCtx = null;
	private List<JCLParser.DdStatementAmalgamationContext> ddStmtAmlgnCtxs = null;
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<DdStatementAmalgamation> ddStatements = new ArrayList<>();

	public JclStep(JCLParser.JclStepContext jclStepCtx, String fileName, String procName, Logger LOGGER, TheCLI CLI) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.procName = procName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.inProc = !(procName == null);
		this.initialize();
		LOGGER.finer(this.myName + " " + this.stepName + " instantiated from " + this.fileName);

	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.execStmtCtx = this.jclStepCtx.execStatement();
		this.execPgmStmtCtx = this.execStmtCtx.execPgmStatement();
		this.execProcStmtCtx = this.execStmtCtx.execProcStatement();
		this.ddStmtAmlgnCtxs = this.jclStepCtx.ddStatementAmalgamation();
		
		if (this.isExecProc() && this.isExecPgm()) {
			LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are not null");
		} else if (!this.isExecProc() && !this.isExecPgm()) {
			LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are null");
		}

		if (this.isExecPgm()) {
			this.line = this.execPgmStmtCtx.EXEC().getSymbol().getLine();
			if (this.execPgmStmtCtx.stepName() == null) {
			} else {
				this.stepName = this.execPgmStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.pgmExecuted = new KeywordOrSymbolicWrapper(this.execPgmStmtCtx.keywordOrSymbolic(), this.procName);
		} else {
			this.line = this.execProcStmtCtx.EXEC().getSymbol().getLine();
			if (this.execProcStmtCtx.stepName() == null) {
			} else {
				this.stepName = this.execProcStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.procExecuted = new KeywordOrSymbolicWrapper(this.execProcStmtCtx.keywordOrSymbolic(), this.procName);
			for (JCLParser.ExecProcParmContext epp: this.execProcStmtCtx.execProcParm()) {
				this.symbolics.add(new SetSymbolValue(epp, this.fileName, this.procName, this.getProcExecuted()));
			}
		}

		if (this.ddStmtAmlgnCtxs == null) {
		} else {
			for (JCLParser.DdStatementAmalgamationContext d: this.ddStmtAmlgnCtxs) {
				this.ddStatements.add(new DdStatementAmalgamation(d, this.procName, this.fileName));
			}
		}	
	}

	public Boolean isExecProc() {
		return this.execProcStmtCtx != null;
	}

	public Boolean isExecPgm() {
		return this.execPgmStmtCtx != null;
	}

	public Boolean needsProc() {
		return this.isExecProc() && (this.proc == null);
	}

	public String getProcExecuted() {
		return this.procExecuted.getValue();
	}

	public void setProc(Proc proc) {
		this.proc = proc;
	}

	public Proc getProc() {
		return this.proc;
	}

	public int getLine() {
		return this.line;
	}

	public void resolveParms(ArrayList<SetSymbolValue> symbolics) {
		LOGGER.finest(myName + " " + this.stepName + " resolveParms symbolics = |" + symbolics + "|");
		ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		for (DdStatementAmalgamation dda: ddStatements) {
			dda.resolveParms(mergedSymbolics);
		}

		if (this.proc != null) {
			this.proc.resolveParms(mergedSymbolics);
		}
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(this.myName);

		sb.append(" " + this.stepName);

		if (this.isExecProc()) {
			sb.append(" proc " + this.procExecuted.getValue());
		} else {
			sb.append(" pgm " + this.pgmExecuted.getValue());
		}

		return sb.toString();
	}
}
