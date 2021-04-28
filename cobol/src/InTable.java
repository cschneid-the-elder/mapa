
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class InTable {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.InTableContext ctx = null;
	private CobolParser.TableCallContext tcCtx = null;
	private TableCall tableCall = null;

	/**
	*/
	public InTable(
			CobolParser.InTableContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.tcCtx = this.ctx.tableCall();
		this.tableCall = new TableCall(this.tcCtx, LOGGER);
	}

	public String getDataNameText() {
		return this.tableCall.getDataNameText();
	}

}
