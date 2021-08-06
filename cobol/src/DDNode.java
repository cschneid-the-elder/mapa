
import java.util.*;

/**
This is an attempt at making my processing easier by creating
a tree representation of the data structures in the Data Division
and a certain degree of "flattening" of what ANTLR4 creates from
the ProLeap COBOL grammar.

*/

class DDNode {
	public List<DDNode> children = new ArrayList<>();
	public DDNode parent = null;
	public UUID uuid = UUID.randomUUID();
	public String redefinesIdentifier = null;
	public List<String> renamesIdentifier = null;
	public String identifier = null;
	public Integer level = null;
	public String valueInValueClause = null;
	public List<String> valuesSet = new ArrayList<>();
	public CobolProgram program = null;
	public String programName = null;
	public DataLocation locn = null;
	public Boolean global = false;
	public Boolean external = false;
	public CobolParser.DataDescriptionEntryContext ddeCtx = null;
	public CobolParser.DataDescriptionEntryFormat1Context dde1Ctx = null;
	public CobolParser.DataDescriptionEntryFormat2Context dde2Ctx = null;
	public CobolParser.DataDescriptionEntryFormat3Context dde3Ctx = null;
	
	public DDNode(
			CobolProgram program
			, CobolParser.DataDescriptionEntryContext ctx
			, DataLocation locn
			) {
		this.program = program;
		this.programName = program.getProgramName();
		this.ddeCtx = ctx;
		this.locn = locn;
		this.initialize();
	}

	public void initialize() {
		if (this.ddeCtx.dataDescriptionEntryFormat1() == null) {
			if (this.ddeCtx.dataDescriptionEntryFormat2() == null) {
				if (this.ddeCtx.dataDescriptionEntryFormat3() == null) {
					TestIntegration.LOGGER.info("! dataDescriptionEntryExecSql ignored");
				} else {
					this.dde3Ctx = this.ddeCtx.dataDescriptionEntryFormat3();
					this.setIdentifierFromDDE3CTX();
					this.setLevelFromDDE3CTX();
					this.setValueFromDDE3CTX();
				}
			} else {
				this.dde2Ctx = this.ddeCtx.dataDescriptionEntryFormat2();
				this.setIdentifierFromDDE2CTX();
				this.setLevelFromDDE2CTX();
				this.setRenamesFromDDE2CTX();
			}
		} else {
			this.dde1Ctx = this.ddeCtx.dataDescriptionEntryFormat1();
			this.setIdentifierFromDDE1CTX();
			this.setLevelFromDDE1CTX();
			this.setValueFromDDE1CTX();
			this.setRedefinesFromDDE1CTX();
			if (dde1Ctx.dataGlobalClause() != null && dde1Ctx.dataGlobalClause().size() > 0) {
				this.global = true;
			}
			if (dde1Ctx.dataExternalClause() != null && dde1Ctx.dataExternalClause().size() > 0) {
				this.external = true;
			}
		}
	}

	private void setIdentifierFromDDE1CTX() {
		if (this.dde1Ctx.dataName() == null) {
			if (this.dde1Ctx.FILLER() == null) {
				this.identifier = "";
			} else {
				this.identifier = "FILLER";
			}
		} else {
			this.identifier = this.dde1Ctx.dataName().cobolWord().getText();
		}

	}

	private void setIdentifierFromDDE2CTX() {
		this.identifier = this.dde2Ctx.dataName().cobolWord().getText();
	}

	private void setIdentifierFromDDE3CTX() {
		this.identifier = this.dde3Ctx.conditionName().cobolWord().getText();
	}

	private void setLevelFromDDE1CTX() {
		if (this.dde1Ctx.INTEGERLITERAL() == null) {
			this.level = new Integer(this.dde1Ctx.LEVEL_NUMBER_77().toString());
		} else {
			this.level = new Integer(this.dde1Ctx.INTEGERLITERAL().toString());
		}
	}

	private void setLevelFromDDE2CTX() {
		this.level = new Integer(this.dde2Ctx.LEVEL_NUMBER_66().toString());
	}

	private void setLevelFromDDE3CTX() {
		this.level = new Integer(this.dde3Ctx.LEVEL_NUMBER_88().toString());
	}

	private void setValueFromDDE1CTX() {
		if (this.dde1Ctx.dataValueClause() == null || this.dde1Ctx.dataValueClause().size() == 0) {
			return;
		} else {
			/**
				There is a List of dataValueClauses, but for our purposes we
				only care about identifiers where there is exactly one.  So 
				we're going to pretend there's only one for all identifiers.
			*/
			if (this.dde1Ctx.dataValueClause(0).dataValueInterval(0).dataValueIntervalFrom().literal() == null) {
				return;
			} else {
				if (this.dde1Ctx.dataValueClause(0).dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL() == null) {
					return;
				} else {
					this.valueInValueClause = this.dde1Ctx.dataValueClause(0).dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL().toString();
				}
			}
		}

	}

	private void setValueFromDDE3CTX() {
		if (this.dde3Ctx.dataValueClause() == null) {
			return;
		} else {
			/**
				There is a List of dataValueClauses, but for our purposes we
				only care about identifiers where there is exactly one.  So 
				we're going to pretend there's only one for all identifiers.
			*/
			if (this.dde3Ctx.dataValueClause().dataValueInterval(0).dataValueIntervalFrom().literal() == null) {
				return;
			} else {
				if (this.dde3Ctx.dataValueClause().dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL() == null) {
					return;
				} else {
					this.valueInValueClause = this.dde3Ctx.dataValueClause().dataValueInterval(0).dataValueIntervalFrom().literal().NONNUMERICLITERAL().toString();
				}
			}
		}

	}

	private void setRedefinesFromDDE1CTX() {
		if (this.dde1Ctx.dataRedefinesClause() == null | this.dde1Ctx.dataRedefinesClause().size() == 0) {
			return;
		} else {
			this.redefinesIdentifier = this.dde1Ctx.dataRedefinesClause(0).dataName().cobolWord().IDENTIFIER().toString();
		}
	}

	private void setRenamesFromDDE2CTX() {
		this.renamesIdentifier = new ArrayList<>();

		for (CobolParser.QualifiedDataNameContext qdnc: this.dde2Ctx.dataRenamesClause().qualifiedDataName()) {
			if (qdnc.qualifiedDataNameFormat1().dataName() == null) {
				this.renamesIdentifier.add(qdnc.qualifiedDataNameFormat1().conditionName().cobolWord().IDENTIFIER().toString());
			} else {
				this.renamesIdentifier.add(qdnc.qualifiedDataNameFormat1().dataName().cobolWord().IDENTIFIER().toString());
			}
		}
	}

	public void adopt(DDNode child) {
		switch(this.level) {
			case 66:
				break;
			case 77: 
				break;
			default:
				this.children.add(child);
				child.setGlobal(this.isGlobal());
				child.setExternal(this.isExternal());
		}
	}

	public Boolean isSpecialLevel() {
		return(this.level.intValue() == 66 || this.level.intValue() == 77 || this.level.intValue() == 88);
	}

	public Boolean hasNoParent() {
		return(this.level.intValue() == 77 || this.level.intValue() == 1);
	}

	public Boolean isNewRoot() {
		return(this.level.intValue() == 1);
	}

	public Boolean isCondition() {
		return(this.level.intValue() == 88);
	}

	public Boolean isGlobal() {
		return this.global;
	}

	public Boolean isExternal() {
		return this.external;
	}

	public void setGlobal(Boolean global) {
		this.global = global;
	}

	public void setExternal(Boolean external) {
		this.external = external;
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public Integer getLevel() {
		return this.level;
	}

	public DDNode getParent() {
		return this.parent;
	}

	public String getIdentifier() {
		return this.identifier;
	}

	public List<DDNode> getChildren() {
		return this.children;
	}

	public String getValueInValueClause() {
		return this.valueInValueClause;
	}

	public DataLocation getLocn() {
		return this.locn;
	}

	public DDNode findChild(DDNode child) {
		DDNode result = null;

		if (this.uuid.equals(child.uuid)) {return(this);}

		for (DDNode node: this.children) {
			if (node.getUUID().equals(child.getUUID())) {
				result = node;
				break;
			} else {
				result = node.findChild(child);
				if (result != null) {break;}
			}
		}

		return( result );
	}

	public List<DDNode> findChildrenNamed(String identifier) {
		ArrayList<DDNode> result = new ArrayList<>();

		if (this.identifier.equals(identifier)) {
			result.add(this);
		} else {
			for (DDNode node: this.children) {
				if (node.getIdentifier().equals(identifier)) {
					result.add(node);
				} else {
					result.addAll(node.findChildrenNamed(identifier));
				}
			}
		}

		return( result );
	}

	public String toString() {
		return this.level.toString() + " " + this.identifier + " [parent=" + this.parent + "] " + this.locn;
	}

}
