/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/
package cschneid.mapa.jcl;

import java.util.*;
import java.util.logging.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class is used in extracting information from a parsed AMP
parameter.  Current known users are the AmpWrapper class.
*/
public class AmpParmListener extends JCLDDAMPParserBaseListener {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<AmpParmWrapper> ampws = null;
	public String fileName = null;

	public AmpParmListener(
			ArrayList<AmpParmWrapper> ampws
			, Logger LOGGER
			, TheCLI CLI
			) {
		super();
		this.ampws = ampws;
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterAccbias(JCLDDAMPParser.AccbiasContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterAmorg(JCLDDAMPParser.AmorgContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterBufnd(JCLDDAMPParser.BufndContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterBufni(JCLDDAMPParser.BufniContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterBufsp(JCLDDAMPParser.BufspContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterCrops(JCLDDAMPParser.CropsContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterFrlog(JCLDDAMPParser.FrlogContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterMsg(JCLDDAMPParser.MsgContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterOptcd(JCLDDAMPParser.OptcdContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterRecfm(JCLDDAMPParser.RecfmContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterRmode31(JCLDDAMPParser.Rmode31Context ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterSmbdfr(JCLDDAMPParser.SmbdfrContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterSmbhwt(JCLDDAMPParser.SmbhwtContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterSmbvsp(JCLDDAMPParser.SmbvspContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterSmbvspi(JCLDDAMPParser.SmbvspiContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterStrno(JCLDDAMPParser.StrnoContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterSynad(JCLDDAMPParser.SynadContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

	@Override public void enterTrace(JCLDDAMPParser.TraceContext ctx) {
		this.ampws.add(new AmpParmWrapper(ctx, this.LOGGER, this.CLI));
	}

}
