
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SetSymbolValueListener extends JCLParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<SetSymbolValue> sets = null;
	public String fileName = null;

	public SetSymbolValueListener(
			ArrayList<SetSymbolValue> sets
			, String fileName
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.sets = sets;
		this.fileName = fileName;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterSetOperation(JCLParser.SetOperationContext ctx) { 
		this.sets.add(new SetSymbolValue(ctx, this.LOGGER, this.CLI));
	}

}
