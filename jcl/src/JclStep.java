
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class JclStep {

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
	private List<JCLParser.IncludeStatementContext> includeStmtCtxs = null;
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<DdStatementAmalgamation> ddStatements = new ArrayList<>();

	public JclStep(JCLParser.JclStepContext jclStepCtx, String fileName, String procName) {
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
		
		for (JCLParser.IncludeStatementContext i: this.includeStmtCtxs) {
			this.includes.add(new IncludeStatement(i, this.fileName, this.procName));
		}

		if (this.isExecProc() && this.isExecPgm()) {
			Demo01.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are not null");
		} else if (!this.isExecProc() && !this.isExecPgm()) {
			Demo01.LOGGER.severe(this.myName + " both execPgmStmtCtx and ExecProcStmtCtx are null");
		}

		if (this.isExecPgm()) {
			this.line = this.execPgmStmtCtx.EXEC().getSymbol().getLine();
			this.stepName = this.execPgmStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			this.pgmExecuted = new KeywordOrSymbolicWrapper(this.execPgmStmtCtx.keywordOrSymbolic(), this.procName);
		} else {
			this.line = this.execProcStmtCtx.EXEC().getSymbol().getLine();
			this.stepName = this.execProcStmtCtx.stepName().NAME_FIELD().getSymbol().getText();
			this.procExecuted = new KeywordOrSymbolicWrapper(this.execProcStmtCtx.keywordOrSymbolic(), this.procName);
			for (JCLParser.ExecProcParmContext epp: this.execProcStmtCtx.execProcParm()) {
				this.symbolics.add(new SetSymbolValue(epp, this.fileName, this.procName, this.getProcExecuted()));
			}
		}

		if (this.ddStmtAmlgnCtxs == null) {
		} else {
			for (JCLParser.DdStatementAmalgamationContext d: this.ddStmtAmlgnCtxs) {
				this.ddStatements.add(new DdStatementAmalgamation(d, this.procName));
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

	public void resolveParmedIncludes(ArrayList<SetSymbolValue> symbolics) {
		/**
			Of note here: an INCLUDE that is attached to a JclStep may not have
			anything to do with the JclStep.  It is syntactically impossible to
			discern the coder's intent.  Consider...

			//RIGEL   EXEC PGM=IEFBR14
			//        INCLUDE MEMBER=DARGO
			//PILOT   EXEC PGM=IEFBR14

			...where the member DARGO contains...

			//        SET A=1,B=2,C=3
			//STARK   EXEC PROC=NORANTI
			//        INCLUDE MEMBER=SIKOZU&A

			...and thus statements unrelated to the JclStep will be inserted into
			the jobstream.

			Subsequent parsing takes care of this, and in fact is one of the reasons
			the original JCL is parsed iteratively.
		*/

		Demo01.LOGGER.finest(this.myName + " resolveParmedIncludes: " + this.stepName);
		for (IncludeStatement i: this.includes) {
			i.resolveParms(symbolics);
		}
		Demo01.LOGGER.finest(this.myName + " includes (after resolving): " + this.includes);

		if (this.proc == null) {
		} else {
			ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>();
			for (SetSymbolValue s: symbolics) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < this.line)
					|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSymbolics.add(s);
				}
			}
			mergedSymbolics.addAll(this.symbolics);
			Demo01.LOGGER.finest(myName + " resolveParmedIncludes resolving proc " + proc);
			proc.resolveParmedIncludes(mergedSymbolics);
		}
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public IncludeStatement includeStatementAt(int aLine) {
		for (IncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public ArrayList<IncludeStatement> getIncludes() {
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
