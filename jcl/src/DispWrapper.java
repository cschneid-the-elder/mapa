
import java.util.*;
import java.util.logging.*;

/**
This class represents the DISP parameter of a DD statement, including
its status, normal termination disposition, and abnormal termination
disposition.

<p>This might serve as a template for constructing other such wrappers
as may be of interest, e.g. VOLUME or LABEL.
*/
public class DispWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.DdParmDISPContext ctx = null;
	private JCLParser.SingleOrMultipleValueContext somvCtx = null;
	private SingleOrMultipleValueWrapper somv = null;
	private String procName = null;
	private Boolean inProc = null;
	private String status = null;
	private String normalTerm = null;
	private String abnormalTerm = null;

	public DispWrapper(
			JCLParser.DdParmDISPContext ctx
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
		this.setStatus();
		this.setNormalTerm();
		this.setAbnormalTerm();
	}

	private void setStatus() {

		if (this.somvCtx == null) {
			this.status = "NEW";
			return;
		}

		/*
		1	DISP=something
		3	DISP=(something)
		4	DISP=(,something)
		5	DISP=(something,something)
		5	DISP=(,,something)
		6	DISP=(,something,something)
		6	DISP=(something,,something)
		7	DISP=(something,something,something)
		*/

		ArrayList<ParameterString> ps = this.somv.getParameterStrings();
		switch(ps.size()) {
			case 1 :
				this.status = ps.get(0).getValue();
				break;
			case 3 :
				this.status = ps.get(1).getValue();
				break;
			case 4 :
				this.status = "NEW";
				break;
			case 5 :
			case 6 :
				if (ps.get(1).getValue().equals(",")) {
					this.status = "NEW";
				} else {
					this.status = ps.get(1).getValue();
				}
				break;
			case 7 :
				this.status = ps.get(1).getValue();
				break;
			default :
				this.LOGGER.severe(
					this.myName 
					+ " setStatus() ps.size() = " 
					+ ps.size() 
					+ " must be {1,3,4,5,6,7} ps = |" 
					+ ps 
					+ "|"
					);
				break;
		}
	}

	private void setNormalTerm() {
		if (this.somvCtx == null) {
			this.normalTerm = "DELETE";
			return;
		}

		/*
		1	DISP=something
		3	DISP=(something)
		4	DISP=(,something)
		5	DISP=(something,something)
		5	DISP=(,,something)
		6	DISP=(,something,something)
		6	DISP=(something,,something)
		7	DISP=(something,something,something)
		*/

		ArrayList<ParameterString> ps = this.somv.getParameterStrings();
		switch(ps.size()) {
			case 1 :
			case 3 :
				if (this.status.equals("NEW")) {
					this.normalTerm = "DELETE";
				} else {
					this.normalTerm = "KEEP";
				}
				break;
			case 4 :
				this.normalTerm = ps.get(2).getValue();
				break;
			case 5 :
				if (ps.get(1).getValue().equals(",")) {
					if (ps.get(2).getValue().equals(",")) {
						this.normalTerm = "DELETE";
					}
				} else {
					this.normalTerm = ps.get(3).getValue();
				}
				break;
			case 6 :
				if (ps.get(2).getValue().equals(",")) {
					if (this.status.equals("NEW")) {
						this.normalTerm = "DELETE";
					} else {
						this.normalTerm = "KEEP";
					}
				} else {
					this.normalTerm = ps.get(2).getValue();
				}
				break;
			case 7 :
				this.normalTerm = ps.get(3).getValue();
				break;
			default :
				this.LOGGER.severe(
					this.myName 
					+ " setNormalTerm() ps.size() = " 
					+ ps.size() 
					+ " must be {1,3,4,5,6,7} ps = |" 
					+ ps 
					+ "|"
					);
				break;
		}
	}

	private void setAbnormalTerm() {
		if (this.somvCtx == null) {
			this.abnormalTerm = "DELETE";
			return;
		}

		/*
		1	DISP=something
		3	DISP=(something)
		4	DISP=(,something)
		5	DISP=(something,something)
		5	DISP=(,,something)
		6	DISP=(,something,something)
		6	DISP=(something,,something)
		7	DISP=(something,something,something)
		*/

		ArrayList<ParameterString> ps = this.somv.getParameterStrings();
		switch(ps.size()) {
			case 1 :
			case 3 :
			case 4 :
				this.abnormalTerm = this.normalTerm;
				break;
			case 5 :
				this.abnormalTerm = ps.get(3).getValue();
				break;
			case 6 :
				this.abnormalTerm = ps.get(4).getValue();
				break;
			case 7 :
				this.abnormalTerm = ps.get(5).getValue();
				break;
			default :
				this.LOGGER.severe(
					this.myName 
					+ " setAbnormalTerm() ps.size() = " 
					+ ps.size() 
					+ " must be {1,3,4,5,6,7} ps = |" 
					+ ps 
					+ "|"
					);
				break;
		}
	}

	public String getStatus() {
		return this.status;
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
				+ " status = |" 
				+ this.status 
				+ "| normalTerm = |" 
				+ this.normalTerm 
				+ "| abnormalTerm = |" 
				+ this.abnormalTerm 
				+ "|"
				);

		return buf.toString();
	}
}
