
import java.util.*;
import java.util.logging.*;

public class DsidWrapper {

	private Logger LOGGER = null;
	private TheCLI CLI = null;
	private String myName = null;
	private JCLParser.DdParmDSIDContext ctx = null;
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
		if (this.ctx.DSID_VALUE() == null) {
			this.dsid = this.ctx.SYMBOLIC(0).getSymbol().getText();
		} else {
			this.dsid = this.ctx.DSID_VALUE().getSymbol().getText();
		}

		if (this.ctx.DSID_VERIFIED() == null) {
			if (this.ctx.SYMBOLIC().size() > 1) {
				this.verified = this.ctx.SYMBOLIC(1).getSymbol().getText();
			}
		} else {
			this.verified = this.ctx.DSID_VERIFIED().getSymbol().getText();
		}
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(this.myName + " dsid = |" + this.dsid + "| verified = |" + this.verified);

		return buf.toString();
	}
}
