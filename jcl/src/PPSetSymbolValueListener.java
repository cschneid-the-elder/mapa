
import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class PPSetSymbolValueListener extends JCLPPParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<PPSetSymbolValue> sets = null;
	public String fileName = null;

	public PPSetSymbolValueListener(
			ArrayList<PPSetSymbolValue> sets
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

	@Override public void enterSetOperation(JCLPPParser.SetOperationContext ctx) { 
		this.sets.add(new PPSetSymbolValue(ctx, this.LOGGER, this.CLI));
	}

}
