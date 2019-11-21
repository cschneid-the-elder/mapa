
import java.util.*;
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
		this.sets.add(new SetSymbolValue(ctx));
	}

}
