/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/


import java.util.*;
import java.util.logging.*;

public class PathDispWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.DdParmPATHDISPContext ctx = null;
	private JCLParser.SingleOrMultipleValueContext somvCtx = null;
	private SingleOrMultipleValueWrapper somv = null;
	private String procName = null;
	private Boolean inProc = null;
	private String status = null;
	private String normalTerm = null;
	private String abnormalTerm = null;

	public PathDispWrapper(
			JCLParser.DdParmPATHDISPContext ctx
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
		this.setNormalTerm();
		this.setAbnormalTerm();
	}

	private void setNormalTerm() {
		if (this.somvCtx == null) {
			this.normalTerm = "KEEP";
			return;
		}

		/*
		1	PATHDISP=something
		3	PATHDISP=(something)
		4	PATHDISP=(,something)
		5	PATHDISP=(something,something)
		*/

		ArrayList<ParameterString> ps = this.somv.getParameterStrings();
		switch(ps.size()) {
			case 1 :
				this.normalTerm = ps.get(0).getValue();
				break;
			case 3 :
			case 5 :
				this.normalTerm = ps.get(1).getValue();
				break;
			case 4 :
				this.normalTerm = "KEEP";
				break;
			default :
				this.LOGGER.severe(
					this.myName 
					+ " setNormalTerm() ps.size() = " 
					+ ps.size() 
					+ " must be {1,3,4,5} ps = |" 
					+ ps 
					+ "|"
					);
				break;
		}
	}

	private void setAbnormalTerm() {
		if (this.somvCtx == null) {
			this.abnormalTerm = "KEEP";
			return;
		}

		/*
		1	PATHDISP=something
		3	PATHDISP=(something)
		4	PATHDISP=(,something)
		5	PATHDISP=(something,something)
		*/

		ArrayList<ParameterString> ps = this.somv.getParameterStrings();
		switch(ps.size()) {
			case 1 :
			case 3 :
				this.abnormalTerm = this.normalTerm;
				break;
			case 4 :
				this.abnormalTerm = ps.get(2).getValue();
				break;
			case 5 :
				this.abnormalTerm = ps.get(3).getValue();
				break;
			default :
				this.LOGGER.severe(
					this.myName 
					+ " setAbnormalTerm() ps.size() = " 
					+ ps.size() 
					+ " must be {1,3,4,5} ps = |" 
					+ ps 
					+ "|"
					);
				break;
		}
	}

	public String getNormalTerm() {
		return this.normalTerm;
	}

	public String getAbnormalTerm() {
		return this.abnormalTerm;
	}

	public String toString() {
		StringBuffer buf = 
			new StringBuffer(
				this.myName 
				+ " normalTerm = |" 
				+ this.normalTerm 
				+ "| abnormalTerm = |" 
				+ this.abnormalTerm 
				+ "|"
				);

		return buf.toString();
	}
}
