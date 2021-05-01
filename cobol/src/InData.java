
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.
*/

class InData {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.InDataContext ctx = null;
	private CobolParser.DataNameContext dnCtx = null;
	private DataName dataName = null;

	public InData(
			CobolParser.InDataContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.dnCtx = this.ctx.dataName();
		this.dataName = new DataName(this.dnCtx, LOGGER);
	}

	public String getDataNameText() {
		return this.dataName.getText();
	}

}
