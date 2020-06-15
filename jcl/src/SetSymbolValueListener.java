/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This listener is used by TheCLI to obtain the values of Symbols whose
value is/are set via command line parameter.
*/
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
