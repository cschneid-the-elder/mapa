
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.
*/

class QualifiedDataNameFormat1 {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.QualifiedDataNameFormat1Context ctx = null;
	private CobolParser.DataNameContext dnCtx = null;
	private List<CobolParser.QualifiedInDataContext> qidCtxList = null;
	private ArrayList<QualifiedInData> qidList = new ArrayList<>();
	private DataName dataName = null;
	private ArrayList<String> qidText = new ArrayList<>();
	private String dataNameText = null;
	/*
	The IBM extension in question allows the syntax...
	
	Z::Y::X
	
	...as an alternative to...
	
	X OF Y OF Z
	
	...and was added for IBM COBOL 6.5 in 2025.  Its use
	necessitates processing some things backwards.
	*/
	private Boolean qidUsesIBMextension = false;

	public QualifiedDataNameFormat1(
			CobolParser.QualifiedDataNameFormat1Context ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.initialize();
		
	}

	private void initialize() {
		this.qidCtxList = this.ctx.qualifiedInData();
		if (this.qidCtxList != null) {
			this.qidList = QualifiedInData.bunchOfThese(this.qidCtxList, LOGGER);
			if (this.qidList.size() > 0 && this.qidList.get(0).usesIBMextension()) {
				this.qidUsesIBMextension = true;
			}
		}

		this.dnCtx = this.ctx.dataName();
		if (this.dnCtx != null) {
			this.dataName = new DataName(this.dnCtx, LOGGER);
			if (this.qidUsesIBMextension) {
				this.dataNameText = this.qidList.get(this.qidList.size() - 1).getText();
			} else {
				this.dataNameText = this.dataName.getText();
			}
		}

		if (this.qidUsesIBMextension) {
			for (int i = this.qidList.size() - 2; i >= 0; i--) {
				this.qidText.add(this.qidList.get(i).getText());
			}
			qidText.add(dataName.getText());
		} else {
			for (QualifiedInData qid: this.qidList) {
				this.qidText.add(qid.getInDataText());
			}
		}
	}
	
	public String getDataNameText() {
		return this.dataNameText;
	}

	public ArrayList<String> getInDataText() {
		return this.qidText;
	}
}
