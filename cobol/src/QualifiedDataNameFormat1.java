
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class QualifiedDataNameFormat1 {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.QualifiedDataNameFormat1Context ctx = null;
	private CobolParser.DataNameContext dnCtx = null;
	private List<CobolParser.QualifiedInDataContext> qidCtxList = null;
	private ArrayList<QualifiedInData> qidList = null;
	private DataName dataName = null;

	/**
	*/
	public QualifiedDataNameFormat1(
			CobolParser.QualifiedDataNameFormat1Context ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.dnCtx = this.ctx.dataName();
		if (this.dnCtx != null) {
			this.dataName = new DataName(this.dnCtx, LOGGER);
		}

		this.qidCtxList = this.ctx.qualifiedInData();
		if (this.qidCtxList != null) {
			this.qidList = QualifiedInData.bunchOfThese(this.qidCtxList, LOGGER);
		}
	}

	public String getDataNameText() {
		return this.dataName.getText();
	}

	public ArrayList<String> getInDataText() {
		ArrayList<String> inDataText = new ArrayList<>();

		if (this.qidList != null) {
			for (QualifiedInData qid: this.qidList) {
				inDataText.add(qid.getInDataText());
			}
		}

		return inDataText;
	}
}
