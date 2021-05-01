
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.
*/

class DataName {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.DataNameContext ctx = null;
	private CobolParser.CobolWordContext cwCtx = null;
	private CobolWord cw = null;
	private String text = null;

	public DataName(
			CobolParser.DataNameContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;
		this.cwCtx = this.ctx.cobolWord();
		this.cw = new CobolWord(this.cwCtx);
		this.text = this.cw.getText();
	}

	public String getText() {
		return this.text;
	}
}
