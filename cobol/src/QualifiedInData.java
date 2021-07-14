
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.
*/

class QualifiedInData {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.QualifiedInDataContext ctx = null;

	/**
	*/
	public static ArrayList<QualifiedInData> bunchOfThese(
			List<CobolParser.QualifiedInDataContext> qidCtxList
			, Logger LOGGER) {
		ArrayList<QualifiedInData> qidList = new ArrayList<>();

		for (CobolParser.QualifiedInDataContext qidCtx: qidCtxList) {
			qidList.add(new QualifiedInData(qidCtx, LOGGER));
		}

		return qidList;
	}

	public QualifiedInData(
			CobolParser.QualifiedInDataContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
	}

	public String getInDataText() {
		if (this.ctx.dataName() == null) {
			return null;
		} else {
			return this.ctx.dataName().getText();
		}
	}

	public String getInTableText() {
		if (this.ctx.fileName() == null) {
			return null;
		} else {
			return this.ctx.fileName().getText();
		}
	}

	public String getText() {
		if (this.ctx.dataName() == null) {
			return this.getInTableText();
		}
		return this.getInDataText();
	}		
}
