
import java.util.*;

public class DispWrapper {

	private String myName = null;
	private JCLParser.DdParmDISPContext ctx = null;
	private JCLParser.DdParmDISP_STATUSContext statusCtx = null;
	private JCLParser.DdParmDISP_NORMAL_TERMContext normalTermCtx = null;
	private JCLParser.DdParmDISP_ABNORMAL_TERMContext abnormalTermCtx = null;
	private String procName = null;
	private Boolean inProc = null;
	private String status = null;
	private String normalTerm = null;
	private String abnormalTerm = null;

	public DispWrapper(JCLParser.DdParmDISPContext ctx, String procName) {
		this.ctx = ctx;
		this.procName = procName;
		this.inProc = !(procName == null);
		this.initialize();
	}

	private void initialize() {
		myName = this.getClass().getName();
		this.statusCtx = this.ctx.ddParmDISP_STATUS();
		this.normalTermCtx = this.ctx.ddParmDISP_NORMAL_TERM();
		this.abnormalTermCtx = this.ctx.ddParmDISP_ABNORMAL_TERM();
		this.setStatus();
		this.setNormalTerm();
		this.setAbnormalTerm();
	}

	private void setStatus() {
		if (this.statusCtx == null) {
			this.status = "NEW";
		} else if (this.statusCtx.DISP_MOD() != null) {
			this.status = this.statusCtx.DISP_MOD().getSymbol().getText();
		} else if (this.statusCtx.DISP_NEW() != null) {
			this.status = this.statusCtx.DISP_NEW().getSymbol().getText();
		} else if (this.statusCtx.DISP_OLD() != null) {
			this.status = this.statusCtx.DISP_OLD().getSymbol().getText();
		} else if (this.statusCtx.DISP_SHR() != null) {
			this.status = this.statusCtx.DISP_SHR().getSymbol().getText();
		} else if (this.statusCtx.SYMBOLIC() != null) {
			this.status = this.statusCtx.SYMBOLIC().getSymbol().getText();
		}

	}

	private void setNormalTerm() {
		if (this.normalTermCtx == null) {
			this.normalTerm = "DELETE";
		} else if (this.normalTermCtx.DISP_CATLG() != null) {
			this.normalTerm = this.normalTermCtx.DISP_CATLG().getSymbol().getText();
		} else if (this.normalTermCtx.DISP_DELETE() != null) {
			this.normalTerm = this.normalTermCtx.DISP_DELETE().getSymbol().getText();
		} else if (this.normalTermCtx.DISP_KEEP() != null) {
			this.normalTerm = this.normalTermCtx.DISP_KEEP().getSymbol().getText();
		} else if (this.normalTermCtx.DISP_PASS() != null) {
			this.normalTerm = this.normalTermCtx.DISP_PASS().getSymbol().getText();
		} else if (this.normalTermCtx.DISP_UNCATLG() != null) {
			this.normalTerm = this.normalTermCtx.DISP_UNCATLG().getSymbol().getText();
		} else if (this.normalTermCtx.SYMBOLIC() != null) {
			this.normalTerm = this.normalTermCtx.SYMBOLIC().getSymbol().getText();
		}

	}

	private void setAbnormalTerm() {
		if (this.abnormalTermCtx == null) {
			this.abnormalTerm = this.normalTerm;
		} else if (this.abnormalTermCtx.DISP_CATLG() != null) {
			this.abnormalTerm = this.abnormalTermCtx.DISP_CATLG().getSymbol().getText();
		} else if (this.abnormalTermCtx.DISP_DELETE() != null) {
			this.abnormalTerm = this.abnormalTermCtx.DISP_DELETE().getSymbol().getText();
		} else if (this.abnormalTermCtx.DISP_KEEP() != null) {
			this.abnormalTerm = this.abnormalTermCtx.DISP_KEEP().getSymbol().getText();
		} else if (this.abnormalTermCtx.DISP_PASS() != null) {
			this.abnormalTerm = this.abnormalTermCtx.DISP_PASS().getSymbol().getText();
		} else if (this.abnormalTermCtx.DISP_UNCATLG() != null) {
			this.abnormalTerm = this.abnormalTermCtx.DISP_UNCATLG().getSymbol().getText();
		} else if (this.abnormalTermCtx.SYMBOLIC() != null) {
			this.abnormalTerm = this.abnormalTermCtx.SYMBOLIC().getSymbol().getText();
		}

	}

	public void resolveParms(ArrayList<SetSymbolValue> sets) {
		Demo01.LOGGER.fine(myName + " resolveParms sets = |" + sets + "|");
	}

	public String toString() {
		StringBuffer buf = new StringBuffer(this.myName + " status = |" + this.status + "| normalTerm = |" + this.normalTerm + "| abnormalTerm = |" + this.abnormalTerm + "|");

		return buf.toString();
	}
}
