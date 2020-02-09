
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class PPProc {

	private UUID uuid = UUID.randomUUID();
	private String myName = null;
	private JCLPPParser.ProcStatementContext procCtx = null;
	private JCLPPParser.PendStatementContext pendCtx = null;
	private ArrayList<PPSetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<PPIncludeStatement> includes = new ArrayList<>();
	private ArrayList<PPJclStep> steps = new ArrayList<>();
	private String fileName = null;
	private String procName = null;
	private int startLine = -1;
	private int endLine = -1;

	/*public InstreamProc(
				JCLPPParser.ProcStatementContext procCtx
				, JCLPPParser.PendStatementContext pendCtx
				, ArrayList<PPSetSymbolValue> symbolics
				, ArrayList<PPIncludeStatement> includes
				, String fileName
				) {
		this.procCtx = procCtx;
		this.pendCtx = pendCtx;
		this.symbolics = symbolics;
		this.includes = includes;
		this.fileName = fileName;
		this.initialize();
	}*/

	public PPProc(
				JCLPPParser.ProcStatementContext procCtx
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

	public void addPendCtx(JCLPPParser.PendStatementContext pendCtx) {
		this.pendCtx = pendCtx;
		this.initialize();
	}

	public void setEndLine(int endLine) {
		this.endLine = endLine;
	}

	public void addInclude(PPIncludeStatement include) {
		this.includes.add(include);
	}

	public void addSymbolic(PPSetSymbolValue symbolic) {
		this.symbolics.add(symbolic);
	}

	public void addJclStep(PPJclStep step) {
		this.steps.add(step);
	}

	public String getProcName() {
		return this.procName;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public int getStartLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public PPIncludeStatement includeStatementAt(int aLine) {
		for (PPIncludeStatement i: this.includes) {
			if (i.getLine() == aLine) return i;
		}

		return null;
	}

	public ArrayList<PPIncludeStatement> getAllIncludes() {
		return this.includes;
	}

	public ArrayList<PPIncludeStatement> getAllUnresolvedIncludes() {
		PPIncludeStatement[] unresolved_includes = 
				this.getAllIncludes().stream()
				.filter(i -> !i.isResolved())
				.toArray(PPIncludeStatement[]::new);
		return new ArrayList<PPIncludeStatement>(Arrays.asList(unresolved_includes));
	}

	public void resolveParmedIncludes(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(myName + " " + this.procName + " resolveParmedIncludes");
		ArrayList<PPSetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
		mergedSymbolics.addAll(this.symbolics);

		for (PPIncludeStatement i: includes) {
			i.resolveParms(mergedSymbolics);
		}
		Demo01.LOGGER.finest(myName + " includes (after resolving): " + includes);

	}

	public void resolveParms(ArrayList<PPSetSymbolValue> symbolics) {
		Demo01.LOGGER.finest(myName + " " + this.procName + " resolveParms");

		for (PPJclStep step: steps) {
			ArrayList<PPSetSymbolValue> mergedSymbolics = new ArrayList<>(symbolics);
			for (PPSetSymbolValue s: this.symbolics) {
				if ((s.getSetType() == SetTypeOfSymbolValue.SET && s.getLine() < step.getLine())
				|| s.getSetType() != SetTypeOfSymbolValue.SET
				) {
					mergedSymbolics.add(s);
				}
			}
			step.resolveParms(mergedSymbolics);
		}

	}

	public ArrayList<PPJclStep> stepsInNeedOfProc() {
		ArrayList<PPJclStep> stepsInNeed = new ArrayList<>();

		for (PPJclStep step: this.steps) {
			if (step.isExecProc()) {
				if (step.needsProc()) {
					stepsInNeed.add(step);
				} else {
					stepsInNeed.addAll(step.getProc().stepsInNeedOfProc());
				} 
			}
		}

		return stepsInNeed;
	}

	public Boolean containsLine(int aLine) {
		return (aLine >= startLine) && (aLine <= endLine);
	}

	public String toString() {
		return this.procName + " @ " + this.startLine + " to " + this.endLine + " in " + this.fileName;
	}

}
