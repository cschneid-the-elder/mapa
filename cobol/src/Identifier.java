
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

/**
Ultimately, in the context important to this application, an 
Identifier is either an IDENTIFIER followed by a list of qualifying
IDENTIFIERs -or- an IDENTIFIER followed by a list of subscripts
which are themselves IDENTIFIERs or INTEGERLITERALs.

<p>The primary function of instances of this class is to assist in
determining if one instances matches another.

<p>QualifiedDataName, QualifiedDataNameFormat1, DataName, QualifiedInData, 
InData, TableCall, InTable, and CobolWord all assist Identifier in performing
its primary function of being able to equate one instance of Identifier with
another.

*/

class Identifier {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolParser.IdentifierContext ctx = null;
	private CobolParser.QualifiedDataNameContext qdnCtx = null;
	private CobolParser.TableCallContext tcCtx = null;
	private CobolParser.FunctionCallContext fcCtx = null;
	private CobolParser.SpecialRegisterContext srCtx = null;
	private QualifiedDataName qdn = null;
	private TableCall tableCall = null;

	public static ArrayList<Identifier> bunchOfThese(
			List<CobolParser.IdentifierContext> ctxList
			, Logger LOGGER
			) {
		ArrayList<Identifier> aList = new ArrayList<>();

		for (CobolParser.IdentifierContext ctx: ctxList) {
			aList.add(new Identifier(ctx, LOGGER));
		}

		return aList;
	}

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

		if (this.qdnCtx != null) {
			this.qdn = new QualifiedDataName(this.qdnCtx, LOGGER);
		}

		if (this.tcCtx != null) {
			this.tableCall = new TableCall(this.tcCtx, LOGGER);
		}

	}

	public Boolean seemsToMatch(Identifier anIdentifier) {
		Boolean match = false;
		QualifiedDataName qdn = anIdentifier.getQualifiedDataName();
		TableCall tableCall = anIdentifier.getTableCall();

		if (this.qdn == null && qdn != null) {
		} else if (this.qdn != null && qdn == null) {
		} else if (this.tableCall == null && tableCall != null) {
		} else if (this.tableCall != null && tableCall == null) {
		} else if (this.qdn != null && qdn != null) {
			match = (this.qdn.getDataNameText().equals(qdn.getDataNameText())
					&& this.qdn.getInDataText().equals(qdn.getInDataText()));
		} else if (this.tableCall != null && tableCall != null) {
			match = (this.tableCall.getDataNameText().equals(tableCall.getDataNameText())
					&& this.tableCall.getInDataText().equals(tableCall.getInDataText()));
		}

		return match;
	}

	public String getDataNameText() {
		if (this.getQualifiedDataName() == null) {
			if (this.getTableCall() != null) {
				return this.getTableCall().getDataNameText();
			} else {
				return null;
			}
		} else {
			return this.getQualifiedDataName().getDataNameText();
		}
	}

	public QualifiedDataName getQualifiedDataName() {
		return this.qdn;
	}

	public ArrayList<String> getInDataText() {
		if (this.getQualifiedDataName() == null) {
			if (this.getTableCall() != null) {
				return this.getTableCall().getInDataText();
			} else {
				return null;
			}
		} else {
			return this.getQualifiedDataName().getInDataText();
		}
	}

	public TableCall getTableCall() {
		return this.tableCall;
	}
	
	public CobolParser.IdentifierContext getIdentifierContext() {
		return this.ctx;
	}
	
}
