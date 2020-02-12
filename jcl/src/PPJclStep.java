
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class PPJclStep {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private String fileName = null;
	private String procName = null;
	private String stepName = null;
	private int line = -1;
	private PPKeywordOrSymbolicWrapper procExecuted = null;
	private PPKeywordOrSymbolicWrapper pgmExecuted = null;
	private PPProc proc = null;
	private Boolean inProc = null;
	private JCLPPParser.JclStepContext jclStepCtx = null;
	private JCLPPParser.ExecStatementContext execStmtCtx = null;
	private JCLPPParser.ExecPgmStatementContext execPgmStmtCtx = null;
	private JCLPPParser.ExecProcStatementContext execProcStmtCtx = null;
	private List<JCLPPParser.DdStatementAmalgamationContext> ddStmtAmlgnCtxs = null;
	private ArrayList<PPSetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<PPDdStatementAmalgamation> ddStatements = new ArrayList<>();

	public PPJclStep(JCLPPParser.JclStepContext jclStepCtx, String fileName, String procName) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
		Demo01.LOGGER.finer(this.myName + " " + this.stepName + " instantiated from " + this.fileName);

	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.execStmtCtx = this.jclStepCtx.execStatement();
		this.execPgmStmtCtx = this.execStmtCtx.execPgmStatement();
		this.execProcStmtCtx = this.execStmtCtx.execProcStatement();
		this.ddStmtAmlgnCtxs = this.jclStepCtx.ddStatementAmalgamation();
		
		if (this.isExecProc() && this.isExecPgm()) {
			Demo01.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are not null");
		} else if (!this.isExecProc() && !this.isExecPgm()) {
			Demo01.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are null");
		}

		if (this.isExecPgm()) {
			this.line = this.execPgmStmtCtx.EXEC().getSymbol().getLine();
			if (this.execPgmStmtCtx.stepName() == null) {
			} else {
				this.stepName = this.execPgmStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.pgmExecuted = new PPKeywordOrSymbolicWrapper(this.execPgmStmtCtx.keywordOrSymbolic(), this.procName);
		} else {
			this.line = this.execProcStmtCtx.EXEC().getSymbol().getLine();
			if (this.execProcStmtCtx.stepName() == null) {
			} else {
				this.stepName = this.execProcStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			}
			this.procExecuted = new PPKeywordOrSymbolicWrapper(this.execProcStmtCtx.keywordOrSymbolic(), this.procName);
			for (JCLPPParser.ExecProcParmContext epp: this.execProcStmtCtx.execProcParm()) {
				this.symbolics.add(new PPSetSymbolValue(epp, this.fileName, this.procName, this.getProcExecuted()));
			}
		}

		if (this.ddStmtAmlgnCtxs == null) {
		} else {
			for (JCLPPParser.DdStatementAmalgamationContext d: this.ddStmtAmlgnCtxs) {
				this.ddStatements.add(new PPDdStatementAmalgamation(d, this.procName, this.fileName));
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

	public void setProc(PPProc proc) {
		this.proc = proc;
	}

	public PPProc getProc() {
		return this.proc;
	}

	public int getLine() {
		return this.line;
	}

	public void resolveParms(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(myName + " " + this.stepName + " resolveParms symbolics = |" + symbolics + "|");
		ArrayList<PPSetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		for (PPDdStatementAmalgamation dda: ddStatements) {
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
