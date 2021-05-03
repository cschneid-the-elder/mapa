
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.
*/

class TableCall {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.TableCallContext ctx = null;
	private CobolParser.QualifiedDataNameContext qdnCtx = null;
	private List<CobolParser.SubscriptContext> sCtxList = null;
	private QualifiedDataName qdn = null;

	public TableCall(
			CobolParser.TableCallContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.qdnCtx = this.ctx.qualifiedDataName();
		this.sCtxList = this.ctx.subscript();
		this.qdn = new QualifiedDataName(this.qdnCtx, LOGGER);
	}

	public String getDataNameText() {
		return this.qdn.getDataNameText();
	}

	public ArrayList<String> getInDataText() {
		return this.qdn.getInDataText();
	}
}
