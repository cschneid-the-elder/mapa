/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This is a simple and straightforward listener whose purpose is to
gather up all DsnStreams.  These will be processed with a specialized
parser for DSN commands.
*/
public class DsnStreamListener extends TSOParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<TSOParser.DsnStreamContext> dsnStreams = null;
	public String fileName = null;

	public DsnStreamListener(
			ArrayList<TSOParser.DsnStreamContext> dsnStreams
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.dsnStreams = dsnStreams;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterDsnStream(TSOParser.DsnStreamContext ctx) { 
		this.dsnStreams.add(ctx);
	}

}
