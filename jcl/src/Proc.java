
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class Proc {

	private String myName = null;
	private JCLParser.ProcStatementContext procCtx = null;
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = new ArrayList<>();
	private ArrayList<JclStep> steps = new ArrayList<>();
	private String fileName = null;
	private String procName = null;

	public Proc(
				JCLParser.ProcStatementContext procCtx
				, String fileName
				) {
		this.procCtx = procCtx;
		this.fileName = fileName;
		this.initialize();
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.procName = this.procCtx.procName().NAME_FIELD().getSymbol().getText();
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

	public void resolveParmedIncludes() {
		Demo01.LOGGER.finest(myName + " resolveParmedIncludes: " + this.procName);
		for (IncludeStatement i: includes) {
			i.resolveParms(symbolics);
		}
		Demo01.LOGGER.finest(myName + " includes (after resolving): " + includes);
	}

	public String toString() {
		return this.procName + " in " + this.fileName;
	}

}
