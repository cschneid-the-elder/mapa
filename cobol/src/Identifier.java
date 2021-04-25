
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class Identifier {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.IdentifierContext ctx = null;
	private CobolParser.QualifiedDataNameContext qdnCtx = null;
	private CobolParser.TableCallContext tcCtx = null;
	private CobolParser.FunctionCallContext fcCtx = null;
	private CobolParser.SpecialRegisterContext srCtx = null;

	/**
	Ultimately, in the context important to this application, an 
	Identifier is either an IDENTIFIER followed by a list of qualifying
	IDENTIFIERs -or- an IDENTIFIER followed by a list of subscripts
	which are themselves IDENTIFIERs or INTEGERLITERALs.  In either case
	the most important thing is the initial IDENTIFIER.
	*/
	public Identifier(
			CobolParser.IdentifierContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		this.qdnCtx = this.ctx.qualifiedDataName();
		this.tcCtx = this.ctx.tableCall();
		this.fcCtx = this.ctx.functionCall();
		this.srCtx = this.ctx.specialRegister();

	}


}
