/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This is a simple and straightforward listener whose purpose is to
gather all RUN command contexts for processing in the invoking application.
In this case, the intent is to determine which programs and plans are
being executed.
*/
public class DsnRunListener extends DSNTSOParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<DSNTSOParser.RunContext> runCtxs = null;
	public String fileName = null;

	public DsnRunListener(
			ArrayList<DSNTSOParser.RunContext> runCtxs
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.runCtxs = runCtxs;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterRun(DSNTSOParser.RunContext ctx) {
		this.runCtxs.add(ctx);
	}

}
