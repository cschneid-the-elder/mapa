/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class TSOCallMemberListener extends TSOParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<TSOParser.CallMemberContext> callMemberCtxs = null;
	public String fileName = null;

	public TSOCallMemberListener(
			ArrayList<TSOParser.CallMemberContext> callMemberCtxs
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.callMemberCtxs = callMemberCtxs;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterCallMember(TSOParser.CallMemberContext ctx) {
		this.callMemberCtxs.add(ctx);
	}

}
