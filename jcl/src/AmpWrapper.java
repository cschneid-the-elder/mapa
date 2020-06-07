/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;

/**
This class represents the DISP parameter of a DD statement, including
its status, normal termination disposition, and abnormal termination
disposition.

<p>This might serve as a template for constructing other such wrappers
as may be of interest, e.g. VOLUME or LABEL.
*/
public class AmpWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.DdParmAMPContext ctx = null;
	private JCLParser.SingleOrMultipleValueContext somvCtx = null;
	private SingleOrMultipleValueWrapper somv = null;
	private String procName = null;
	private Boolean inProc = null;
	private String accbias = null;
	private String amorg = null;
	private String bufnd = null;
	private String bufni = null;
	private String bufsp = null;
	private String crops = null;
	private String frlog = null;
	private String msg = null;
	private String optcd = null;
	private String recfm = null;
	private String rmode31 = null;
	private String smbdfr = null;
	private String smbhwt = null;
	private String smbvsp = null;
	private String smbvspi = null;
	private String strno = null;
	private String synad = null;
	private String trace = null;

	public AmpWrapper(
			JCLParser.DdParmAMPContext ctx
			, String procName
			, Logger LOGGER
			, TheCLI CLI
			) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.LOGGER = LOGGER;
		this.CLI = CLI;
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		if (this.ctx == null) {
		} else {
			this.somvCtx = this.ctx.singleOrMultipleValue();
			this.somv = new SingleOrMultipleValueWrapper(this.somvCtx, this.procName, this.LOGGER, this.CLI);
		}
		String toParse = this.getStringForParsing();
	}

	private String getStringForParsing() {
		StringBuffer sb = new StringBuffer();

		for (ParameterString ps: this.somv.getParameterStrings()) {
			sb.append(ps.getValue());
		}

		return sb.toString();
	}

	public String toString() {
		StringBuffer buf = 
			new StringBuffer(
				this.myName 
				);

		return buf.toString();
	}
}
