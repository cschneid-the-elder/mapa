
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetSymbolValueListener extends JCLParserBaseListener {

	public ArrayList<SetSymbolValue> sets = null;
	public String fileName = null;

	public SetSymbolValueListener(
			ArrayList<SetSymbolValue> sets
			, String fileName
			) {
		super();
		this.sets = sets;
		this.fileName = fileName;
	}

	@Override public void enterSetOperation(JCLParser.SetOperationContext ctx) { 
		this.sets.add(new SetSymbolValue(ctx, this.fileName));
	}

	@Override public void enterExecProcParm(JCLParser.ExecProcParmContext ctx) { 
		this.sets.add(new SetSymbolValue(ctx, this.fileName));
	}

	@Override public void enterDefineSymbolicParameter(JCLParser.DefineSymbolicParameterContext ctx) {
		this.sets.add(new SetSymbolValue(ctx, this.fileName));
	}

}
