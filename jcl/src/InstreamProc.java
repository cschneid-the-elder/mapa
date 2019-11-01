
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**


*/
public class InstreamProc {

	private String myName = null;
	private JCLParser.ProcStatementContext procCtx = null;
	private JCLParser.PendStatementContext pendCtx = null;
	private ArrayList<SetSymbolValue> symbolics = new ArrayList<>();
	private ArrayList<IncludeStatement> includes = null;
	private String fileName = null;
	private String procName = null;
	private int startLine = -1;
	private int endLine = -1;

	public InstreamProc(
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
	}

	private void initialize() {
		this.myName = this.getClass().getName();
		this.procName = this.procCtx.procName().NAME_FIELD().getSymbol().getText();
		this.startLine = this.procCtx.PROC().getSymbol().getLine();
		this.endLine = this.pendCtx.PEND().getSymbol().getLine();
	}

	public void resolveParmedIncludes() {
		Demo01.LOGGER.finest(myName + " resolveParmedIncludes: " + this.procName);
		for (IncludeStatement i: includes) {
			i.resolveParms(symbolics);
		}
		Demo01.LOGGER.finest(myName + " includes (after resolving): " + includes);
	}

	public String toString() {
		return this.procName + " @ " + this.startLine + " to " + this.endLine + " in " + this.fileName;
	}

}
