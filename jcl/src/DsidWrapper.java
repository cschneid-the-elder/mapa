
import java.util.*;
import java.util.logging.*;

public class DsidWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.DdParmDSIDContext ctx = null;
	private JCLParser.SingleOrMultipleValueContext somvCtx = null;
	private SingleOrMultipleValueWrapper somv = null;
	private String dsid = null;
	private String verified = null;
	private String procName = null;
	private Boolean inProc = null;

	public DsidWrapper(
			JCLParser.DdParmDSIDContext ctx
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

		/*
		1	DSID=AEIOU
		3	DSID=(AEIOU)
		4	DSID=(,V)
		5	DSID=(AEIOU,V)
		*/

		ArrayList<ParameterString> ps = this.somv.getParameterStrings();
		switch(ps.size()) {
			case 1 :
				this.dsid = ps.get(0).getValue();
				break;
			case 3 :
				this.dsid = ps.get(1).getValue();
				break;
			case 4 :
				this.verified = ps.get(2).getValue();
				break;
			case 5 :
				this.dsid = ps.get(2).getValue();
				this.verified = ps.get(4).getValue();
				break;
			default :
				this.LOGGER.severe(
					this.myName 
					+ " initialize() ps.size() = " 
					+ ps.size() 
					+ " must be {1,3,4,5} ps = |" 
					+ ps 
					+ "|"
					);
				break;
		}

	}

	public String toString() {
		StringBuffer buf = 
			new StringBuffer(
				this.myName 
				+ " dsid = |" 
				+ this.dsid 
				+ "| verified = |" 
				+ this.verified
				);

		return buf.toString();
	}
}
