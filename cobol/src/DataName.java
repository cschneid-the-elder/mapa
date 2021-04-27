
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class DataName {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.DataNameContext ctx = null;
	private CobolParser.CobolWordContext cwCtx = null;
	private CobolWord cw = null;
	private String text = null;

	/**
	*/
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
