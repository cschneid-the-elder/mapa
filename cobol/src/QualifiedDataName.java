
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.
*/

class QualifiedDataName {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.QualifiedDataNameContext ctx = null;
	private CobolParser.QualifiedDataNameFormat1Context qdnf1Ctx = null;
	private QualifiedDataNameFormat1 qdnf1 = null;

	public QualifiedDataName(
			CobolParser.QualifiedDataNameContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.qdnf1Ctx = this.ctx.qualifiedDataNameFormat1();
		if (this.qdnf1Ctx != null) {
			this.qdnf1 = new QualifiedDataNameFormat1(this.qdnf1Ctx, LOGGER);
		}

	}

	public String getDataNameText() {
		if (this.qdnf1 == null) {
			return null;
		} else {
			return this.qdnf1.getDataNameText();
		}
	}

	public ArrayList<String> getInDataText() {
		if (this.qdnf1 == null) {
			return null;
		} else {
			return this.qdnf1.getInDataText();
		}
	}
}
