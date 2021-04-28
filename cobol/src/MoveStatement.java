
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
	private ArrayList<Identifier> identifiers = null;

	public MoveStatement(
			CobolParser.MoveStatementContext ctx
			, Logger LOGGER
			) {
		this.ctx = ctx;
		this.LOGGER = LOGGER;

		mtCtx = this.ctx.moveToStatement();
		mctCtx = this.ctx.moveCorrespondingToStatement();
		if (mtCtx == null) {
		} else {
			mtsaCtx = mtCtx.moveToSendingArea();
			CobolParser.LiteralContext lCtx = mtsaCtx.literal();
			if (lCtx != null && lCtx.NONNUMERICLITERAL() != null) {
				this.literalText = lCtx.NONNUMERICLITERAL().getSymbol().getText();
			}
			this.idCtxList = mtCtx.identifier();
		}

		if (this.idCtxList != null) {
			this.identifiers = Identifier.bunchOfThese(this.idCtxList, LOGGER);
		}
	}

	public String getText() {
		return this.literalText;
	}

	public ArrayList<Identifier> getIdentifiers() {
		return this.identifiers;
	}


}
