
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class Proc {

	private String myName = null;
	private JCLParser.ProcStatementContext procCtx = null;
	private JCLParser.PendStatementContext pendCtx = null;
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private String fileName = null;
	private String procName = null;
	private int startLine = -1;
	private int endLine = -1;

	/*public InstreamProc(
				JCLParser.ProcStatementContext procCtx
				, JCLParser.PendStatementContext pendCtx
				, ArrayList<SetSymbolValue> symbolics
				, ArrayList<IncludeStatement> includes
				, String fileName
				) {
		this.procCtx = procCtx;
		this.pendCtx = pendCtx;
		this.symbolics = symbolics;
		this.includes = includes;
		this.fileName = fileName;
		this.initialize();
	}*/

	public Proc(
				JCLParser.ProcStatementContext procCtx
				, String fileName
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {
		if (this.myName == null) {
			this.myName = this.getClass().getName();
		}
		if (this.procName == null) {
			this.procName = this.procCtx.procName().NAME_FIELD().getSymbol().getText();
		}
		if (this.procCtx != null) {
			this.startLine = this.procCtx.PROC().getSymbol().getLine();
		}
		if (this.pendCtx != null) {
			this.endLine = this.pendCtx.PEND().getSymbol().getLine();
		}
	}

	public void addPendCtx(JCLParser.PendStatementContext pendCtx) {
		this.pendCtx = pendCtx;
		this.initialize();
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public void addInclude(IncludeStatement include) {
		this.includes.add(include);
	}

	public void addSymbolic(SetSymbolValue symbolic) {
		this.symbolics.add(symbolic);
	}

	public void addJclStep(JclStep step) {
		this.steps.add(step);
	}

	public String getProcName() {
		return this.procName;
	}

	public void resolveParmedIncludes(ArrayList<SetSymbolValue> symbolics) {
		ArrayList<SetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		Demo01.LOGGER.finest(myName + " resolveParmedIncludes: " + this.procName);
		for (IncludeStatement i: includes) {
			i.resolveParms(mergedSymbolics);
		}
		Demo01.LOGGER.finest(myName + " includes (after resolving): " + includes);

		Demo01.LOGGER.finest(myName + " resolveParmedIncludes resolving steps " + steps);
		for (JclStep s: steps) {
			s.resolveParmedIncludes(mergedSymbolics);
		}

	}

	public ArrayList<JclStep> stepsInNeedOfProc() {
		ArrayList<JclStep> stepsInNeed = new ArrayList<>();

		for (JclStep step: this.steps) {
			if (step.isExecProc()) {
				if (step.needsCatalogedProc()) {
					stepsInNeed.add(step);
				} else {
					stepsInNeed.addAll(step.getProc().stepsInNeedOfProc());
				} 
			}
		}

		return stepsInNeed;
	}

	public String toString() {
		return this.procName + " @ " + this.startLine + " to " + this.endLine + " in " + this.fileName;
	}

}
