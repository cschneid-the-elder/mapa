
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class QualifiedInData {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.QualifiedInDataContext ctx = null;
	private CobolParser.InDataContext idCtx = null;
	private CobolParser.InTableContext itCtx = null;
	private InData inData = null;
	private InTable inTable = null;

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

		this.idCtx = this.ctx.inData();
		this.itCtx = this.ctx.inTable();

		this.inData = new InData(this.idCtx, LOGGER);
		this.inTable = new InTable(this.itCtx, LOGGER);
	}


}
