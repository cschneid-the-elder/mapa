
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.tree.*;

class CallWrapper {

	public UUID uuid = UUID.randomUUID();
	public CallType callType = null;
	public String identifier = null; //COBOL identifier
	public List<String> calledModuleNames = new ArrayList<>();
	public String callingModuleName = null;
	public List<DDNode> eightyEights = new ArrayList<>();
	public ArrayList<String> subNames = null;
	public List<CobolParser.SubscriptContext> subctxs = null;
	public List<CobolParser.QualifiedInDataContext> inDataCtxs = null;
	public ArrayList<String> ofs = new ArrayList<>();
	public CobolParser.CallStatementContext ctxCall = null;
	public CobolParser.ExecCicsLinkStatementContext ctxLink = null;
	public CobolParser.ExecCicsXctlStatementContext ctxXctl = null;
	public CobolParser.ExecSqlCallStatementContext ctxSqlCall = null;
	public DDNode dataNode = null;
	public int line = -1;
	public String aLib = null;

	public CallWrapper(
			CobolParser.CallStatementContext ctx
			, String callingModuleName
			, String aLib
			) {
		this.ctxCall = ctx;
		this.callingModuleName = callingModuleName;
		this.aLib = aLib;
		this.initialize(ctx);
	}

	public CallWrapper(
			CobolParser.ExecCicsLinkStatementContext ctx
			, String callingModuleName
			, String aLib
			) {
		this.ctxLink = ctx;
		this.callingModuleName = callingModuleName;
		this.aLib = aLib;
		this.initialize(ctx);
	}

	public CallWrapper(
			CobolParser.ExecCicsXctlStatementContext ctx
			, String callingModuleName
			, String aLib
			) {
		this.ctxXctl = ctx;
		this.callingModuleName = callingModuleName;
		this.aLib = aLib;
		this.initialize(ctx);
	}

	public CallWrapper(
			CobolParser.ExecSqlCallStatementContext ctx
			, String callingModuleName
			, String aLib
			) {
		this.ctxSqlCall = ctx;
		this.callingModuleName = callingModuleName;
		this.aLib = aLib;
		this.initialize(ctx);
	}

	public void addCalledModuleName(String calledModuleName) {
		if (calledModuleName != null) {
			String aString = calledModuleName.replace("'", "");
			aString = aString.replace("\"", "");
			if (!this.includes(calledModuleName)) {
				this.calledModuleNames.add(aString);
			}
		}
		return;
	}

	public Boolean seemsLike(CallWrapper cw) {
		/*
			Only unique CALLs (et. al.) are interesting.  If the source contains
			multiple CALLs to the same identifier, it's not necessary to record that.

		*/
		Boolean is = this.callingModuleName.equals(cw.callingModuleName);
		is = is && this.callType == cw.callType;
		if (is && (this.callType == CallType.CALLBYLITERAL
					|| this.callType == CallType.CICSLINKBYLITERAL
					|| this.callType == CallType.CICSXCTLBYLITERAL
					|| this.callType == CallType.SQLCALLBYLITERAL)
					) {
			is = is && this.calledModuleNames.equals(cw.calledModuleNames);
		} else {
			if (this.identifier != null && identifier != null) {
				is = is && this.identifier.equals(cw.identifier);
			}
		}
		is = is && this.ofs.equals(cw.ofs);
		return is; 
	}

	public Boolean selectDataNode(List<DDNode> dataNodes, ArrayList<DDNode> allDataNodes) {
		/**
			The CALL statement represented by this instance may be of the form
			CALL <identifier> where <identifier> is a field name possibly qualified
			by a QualifiedInDataContext.  A concrete example might take the form
			CALL PGM OF ACCOUNT OF SAVINGS.

			This method runs through a List of DDNode instances, each of which
			represents an identifier in the Data Division, attempting to match
			the <identifier> and its optional QualifiedInDataContext.
		*/

		Boolean found = false;

		for (DDNode node: dataNodes) {
			if (node.identifier.equals(this.identifier)) {
				if (this.ofs.size() == 0) {
					found = true;
					this.dataNode = node;
					this.addCalledModuleName(this.dataNode.valueInValueClause);
					break;
				} else {
					DDNode parent = node.parent;
					Boolean foundOf = true;
					for (String of: this.ofs) {
						while (parent != null && !parent.identifier.equals(of)) {
							parent = parent.parent;
						}
						if (parent == null) {
							foundOf = false;
							break;
						}
					}
					found = foundOf;
					if (found) {
						this.dataNode = node;
						this.addCalledModuleName(this.dataNode.valueInValueClause);
						break;
					}
				}
			}
		}

		if (this.dataNode == null) {
			TestIntegration.LOGGER.warning(
				"identifier " 
				+ this.identifier 
				+ " not found in " 
				+ this.callingModuleName);
		} else {
			TestIntegration.LOGGER.fine(
				"valueInValueClause = |" +
				 this.dataNode.valueInValueClause + "|");
			if (this.dataNode.valueInValueClause == null) {
				TestIntegration.LOGGER.fine("valueInValueClause == null");
				if (this.dataNode.redefinesIdentifier != null) {
					TestIntegration.LOGGER.fine(
						"redefinesIdentifier = " 
						+ this.dataNode.redefinesIdentifier);
					List<DDNode> list = 
						this.dataNode.parent.findChildrenNamed(
							this
							.dataNode
							.redefinesIdentifier);
					TestIntegration.LOGGER.fine("list.size() = " + list.size());
					if (list.size() > 0) {
						this.addCalledModuleName(list.get(0).valueInValueClause);
					}
				}
			}
		}

		return found;
	}

	private void initialize(CobolParser.CallStatementContext ctx) {
		this.line = ctx.start.getLine();
		this.initialize(
			ctx.literal()
			, ctx.identifier()
			, CallType.CALLBYLITERAL
			, CallType.CALLBYIDENTIFIER
			);
	}

	public void initialize(CobolParser.ExecCicsLinkStatementContext ctx) {
		this.line = ctx.start.getLine();
		this.initialize(
			ctx.literal()
			, ctx.identifier()
			, CallType.CICSLINKBYLITERAL
			, CallType.CICSLINKBYIDENTIFIER
			);
	}

	public void initialize(CobolParser.ExecCicsXctlStatementContext ctx) {
		this.line = ctx.start.getLine();
		this.initialize(
			ctx.literal()
			, ctx.identifier()
			, CallType.CICSXCTLBYLITERAL
			, CallType.CICSXCTLBYIDENTIFIER
			);
	}

	public void initialize(CobolParser.ExecSqlCallStatementContext ctx) {
		this.line = ctx.start.getLine();
		if ( ctx.identifier() == null ) {
			// CALL literal syntax
			this.addCalledModuleName(
				ctx
				.IDENTIFIER(0)
				.toString());
			this.callType = CallType.SQLCALLBYLITERAL;
		} else {
			this.initialize(
				null
				, ctx.identifier()
				, CallType.SQLCALLBYLITERAL
				, CallType.SQLCALLBYIDENTIFIER
				);
		}
	}

	private void initialize(
			CobolParser.LiteralContext litCtx
			, CobolParser.IdentifierContext idCtx
			, CallType litCallType
			, CallType idCallType
			) {
		if ( idCtx == null ) {
			// CALL literal syntax
			if (litCtx == null) {
				// ExecSqlCallStatementContext is handled on its own
			} else {
				this.addCalledModuleName(
					litCtx
					.NONNUMERICLITERAL()
					.toString());
				this.callType = litCallType;
			}
		} else {
			this.callType = idCallType;
			if (idCtx.qualifiedDataName() == null ) {
				// CALL identifier(subscript) syntax (sneaky)
				this.identifier = 
					idCtx
					.tableCall()
					.qualifiedDataName()
					.qualifiedDataNameFormat1()
					.dataName()
					.cobolWord()
					.IDENTIFIER()
					.toString();
				this.subctxs = idCtx.tableCall().subscript();
				this.subNames = new ArrayList<>();
				for (CobolParser.SubscriptContext sub: subctxs) {
					this.subNames.add(
						sub
						.qualifiedDataName()
						.qualifiedDataNameFormat1()
						.dataName()
						.cobolWord()
						.IDENTIFIER()
						.toString());
				}
				this.inDataCtxs = 
					idCtx
					.tableCall()
					.qualifiedDataName()
					.qualifiedDataNameFormat1()
					.qualifiedInData();
			} else {
				// CALL identifier syntax
				this.identifier = 
					idCtx
					.qualifiedDataName()
					.qualifiedDataNameFormat1()
					.dataName()
					.cobolWord()
					.IDENTIFIER()
					.toString();
				this.inDataCtxs = 
					idCtx
					.qualifiedDataName()
					.qualifiedDataNameFormat1()
					.qualifiedInData();
				if (this.inDataCtxs != null) {
					for (CobolParser.QualifiedInDataContext qindc: this.inDataCtxs) {
						this.ofs.add(
							qindc
							.inData()
							.dataName()
							.cobolWord()
							.IDENTIFIER()
							.toString());
					}
				}
			}
		}


	}

	public Boolean includes(String callee) {
		return this.calledModuleNames.contains(callee);
	}

	public Boolean includes(String caller, String callee) {
		return (this.calledModuleNames.contains(callee) 
				&& this.callingModuleName.equals(caller));
	}

	public Boolean includes(String caller, String callee, CallType ty) {
		/**/
		TestIntegration.LOGGER.fine(
			"this.calledModuleNames.contains(callee) = " 
			+ this.calledModuleNames.contains(callee));
		TestIntegration.LOGGER.fine("calledModuleNames = " + calledModuleNames);
		TestIntegration.LOGGER.fine(
			"this.callingModuleName.equals(caller) = " 
			+ this.callingModuleName.equals(caller));
		TestIntegration.LOGGER.fine("callingModuleName = " + callingModuleName);
		TestIntegration.LOGGER.fine("caller = " + caller);
		TestIntegration.LOGGER.fine("this.callType = " + this.callType);
		TestIntegration.LOGGER.fine("ty = " + ty);
		/**/

		return (this.calledModuleNames.contains(callee) 
				&& this.callingModuleName.equals(caller) && this.callType == ty);
	}

	public String toString() {
		switch (callType) {
			case CALLBYLITERAL:
				return callingModuleName + " CALL literal @" + this.line + ": " + this.calledModuleNames;
			case CICSLINKBYLITERAL:
				return callingModuleName + " CICS LINK literal @" + this.line + ": " + this.calledModuleNames;
			case CICSXCTLBYLITERAL:
				return callingModuleName + " CICS XCTL literal @" + this.line + ": " + this.calledModuleNames;
			case SQLCALLBYLITERAL:
				return callingModuleName + " SQL CALL literal @" + this.line + ": " + this.calledModuleNames;
			case CALLBYIDENTIFIER:
				if (this.subNames == null) {
					return callingModuleName + " CALL identifier @" + this.line + ": " + this.identifier + " " + this.calledModuleNames;
				} else {
					return callingModuleName + " CALL identifier @" + this.line + ": " + this.identifier + " subs " + this.subNames;
				}
			case CICSLINKBYIDENTIFIER:
				if (this.subNames == null) {
					return callingModuleName + " CICS LINK identifier @" + this.line + ": " + this.identifier + " " + this.calledModuleNames;
				} else {
					return callingModuleName + " CICS LINK identifier @" + this.line + ": " + this.identifier + " subs " + this.subNames;
				}
			case CICSXCTLBYIDENTIFIER:
				if (this.subNames == null) {
					return callingModuleName + " CICS XCTL identifier @" + this.line + ": " + this.identifier + " " + this.calledModuleNames;
				} else {
					return callingModuleName + " CICS XCTL identifier @" + this.line + ": " + this.identifier + " subs " + this.subNames;
				}
			case SQLCALLBYIDENTIFIER:
				if (this.subNames == null) {
					return callingModuleName + " SQL CALL identifier @" + this.line + ": " + this.identifier + " " + this.calledModuleNames;
				} else {
					return callingModuleName + " SQL CALL identifier @" + this.line + ": " + this.identifier + " subs " + this.subNames;
				}
			default:
				return callingModuleName + " CALL of indeterminate nature";
		}
	}

	public void writeOn(PrintWriter out) throws IOException {
		/*
		uuid doesn't really mean much, it should uniquely identify
		a CALL but it doesn't
		*/
		for (String cm: calledModuleNames) {
			out.printf(
				"%s,%s,%s,%s\n"
				, this.aLib
				, this.callingModuleName
				, this.callType
				, cm);
		}

	}
}
