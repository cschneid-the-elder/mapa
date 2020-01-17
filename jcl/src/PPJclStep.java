
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
	private List<JCLPPParser.IncludeStatementContext> includeStmtCtxs = null;
	private ArrayList<PPIncludeStatement> includes = new ArrayList<>();
	private ArrayList<PPSetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<PPDdStatementAmalgamation> ddStatements = new ArrayList<>();

	public PPJclStep(JCLPPParser.JclStepContext jclStepCtx, String fileName, String procName) {
		this.jclStepCtx = jclStepCtx;
		this.fileName = fileName;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();

	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.execStmtCtx = this.jclStepCtx.execStatement();
		this.execPgmStmtCtx = this.execStmtCtx.execPgmStatement();
		this.execProcStmtCtx = this.execStmtCtx.execProcStatement();
		this.ddStmtAmlgnCtxs = this.jclStepCtx.ddStatementAmalgamation();
		this.includeStmtCtxs = this.jclStepCtx.includeStatement();
		
		for (JCLPPParser.IncludeStatementContext i: this.includeStmtCtxs) {
			this.includes.add(new PPIncludeStatement(i, this.fileName, this.procName));
		}

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

	public void resolveParmedIncludes(ArrayList<PPSetSymbolValue> symbolics) {
		/**
			Of note here: an INCLUDE that is attached to a PPJclStep may not have
			anything to do with the PPJclStep.  It is syntactically impossible to
			discern the coder's intent.  Consider...

			//RIGEL   EXEC PGM=IEFBR14
			//        INCLUDE MEMBER=DARGO
			//PILOT   EXEC PGM=IEFBR14

			...where the member DARGO contains...

			//        SET A=1,B=2,C=3
			//STARK   EXEC PROC=NORANTI
			//        INCLUDE MEMBER=SIKOZU&A

			...and thus statements unrelated to the PPJclStep will be inserted into
			the jobstream.

			Subsequent parsing takes care of this, and in fact is one of the reasons
			the original JCL is parsed iteratively.
		*/

		Demo01.LOGGER.finest(this.myName + " " + this.stepName + " resolveParmedIncludes");
		for (PPIncludeStatement i: this.includes) {
			i.resolveParms(symbolics);
		}
		Demo01.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);

		if (this.proc != null) {
			ArrayList<PPSetSymbolValue> mergedSymbolics = new ArrayList<>();
			for (PPSetSymbolValue s: symbolics) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < this.line)
					|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSymbolics.add(s);
				}
			}
			mergedSymbolics.addAll(this.symbolics);
			Demo01.LOGGER.finest(myName + " resolveParmedIncludes resolving proc " + this.proc);
			this.proc.resolveParmedIncludes(mergedSymbolics);
		}
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

	public PPIncludeStatement includeStatementAt(int aLine) {
		for (PPIncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public ArrayList<PPIncludeStatement> getIncludes() {
		return this.includes;
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
