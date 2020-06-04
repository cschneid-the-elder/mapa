/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class RunOptionsListener extends DSNTSOParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<DSNTSOParser.RunOptionsContext> runOpts = null;
	public String fileName = null;

	public RunOptionsListener(
			ArrayList<DSNTSOParser.RunOptionsContext> sets
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.runOpts = runOpts;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterRunOptions(DSNTSOParser.RunOptionsContext ctx) { 
		this.runOpts.add(ctx);
	}

}
