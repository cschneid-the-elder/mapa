
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetSymbolValueListener extends JCLParserBaseListener {

	public ArrayList<SetSymbolValue> sets = null;
	public String fileName = null;
	public Boolean inProc = false;
	public String procName = null;
	public String procBeingExecuted = null;

	public SetSymbolValueListener(
			ArrayList<SetSymbolValue> sets
			, String fileName
			) {
		super();
		this.sets = sets;
		this.fileName = fileName;
	}

	@Override public void enterSetOperation(JCLParser.SetOperationContext ctx) { 
		this.sets.add(new SetSymbolValue(ctx, this.fileName, this.inProc, this.procName));
	}

	@Override public void enterExecProcStatement(JCLParser.ExecProcStatementContext ctx) {
		KeywordOrSymbolicWrapper k = new KeywordOrSymbolicWrapper(ctx.keywordOrSymbolic(), this.procName);
		this.procBeingExecuted = k.getValue();
	}

	@Override public void enterExecProcParm(JCLParser.ExecProcParmContext ctx) { 
		this.sets.add(new SetSymbolValue(ctx, this.fileName, this.inProc, this.procName, this.procBeingExecuted));
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		this.sets.add(new SetSymbolValue(ctx, this.fileName, this.inProc, this.procName));
	}

	@Override public void enterProcStatement(JCLParser.ProcStatementContext ctx) {
		inProc = true;
		this.procName = ctx.procName().NAME_FIELD().getSymbol().getText();
	}

	@Override public void enterPendStatement(JCLParser.PendStatementContext ctx) {
		inProc = false;
		procName = null;
	}

}
