
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class MoveStatement {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.MoveStatementContext ctx = null;
	private CobolParser.MoveToStatementContext mtCtx = null;
	private CobolParser.MoveCorrespondingToStatementContext mctCtx = null;
	private CobolParser.MoveToSendingAreaContext mtsaCtx = null;
	private List<CobolParser.IdentifierContext> idCtxList = null;
	private String literalText = null;

	public MoveStatement(
			CobolParser.MoveStatementContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		mcCtx = this.ctx.moveToStatement();
		mctCtx = this.ctx.moveCorrespondingToStatement();
		if (mcCtx == null) {
		} else {
			mtsaCtx = mcCtx.moveToSendingArea();
			CobolParser.LiteralContext lCtx = mtsaCtx.literal();
			this.literalText = lCtx.NONNUMERICLITERAL();
			this.idCtxList = mcCtx.identifier();
		}
	}

	public String getText() {
		return this.literalText;
	}

}
