
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class TableCall {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.TableCallContext ctx = null;
	private CobolParser.QualifiedDataNameContext qdnCtx = null;
	private QualifiedDataName qdn = null;

	/**
	*/
	public TableCall(
			CobolParser.TableCallContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.qdnCtx = this.ctx.qualifiedDataName();
		this.qdn = new QualifiedDataName(this.qdnCtx, LOGGER);
	}


}
