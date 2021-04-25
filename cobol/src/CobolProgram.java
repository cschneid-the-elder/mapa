
import java.util.*;
import java.io.*;
import java.util.logging.Logger;

class CobolProgram {

	private String myName = this.getClass().getName();
	private UUID uuid = UUID.randomUUID();
	private Logger LOGGER = null;
	private CobolSource cobolSource = null;
	private String programName = null;
	private ArrayList<CallWrapper> calledNodes = new ArrayList<>();
	private ArrayList<AssignClause> assignClauses = new ArrayList<>();
	public ArrayList<DDNode> dataNodes = new ArrayList<>();
	public ArrayList<CobolProgram> programs = new ArrayList<>();
	private CobolProgram parent = null;
	private int conditionalStatementCount = 0;
	private int statementCount = 0;

	public CobolProgram(
			String programName
			, Logger LOGGER
			) {
		this.programName = programName;
		this.LOGGER = LOGGER;
	}

	public Boolean hasThisProgramName(String programName) {
		return this.programName.equals(programName);
	}

	public Boolean hasThisProgramName(CobolProgram pgm) {
		return this.hasThisProgramName(pgm.getProgramName());
	}

	public Boolean hasThisDDNode01(DDNode ddNode) {
		for (DDNode dataNode: this.dataNodes) {
			if (dataNode.getLevel() != 1) continue;
			if (dataNode.getUUID() == ddNode.getUUID()) {
				return true;
			}
		}

		return false;
	}

	public void resolveCalledNodes() {
		LOGGER.fine(this.myName + " resolveCalledNodes");

		for (CallWrapper call: this.calledNodes) {
			LOGGER.finest("  call.identifier = " + call.getIdentifier());
			if (call.getIdentifier() == null) {
			} else {
				ArrayList<DDNode> calledDataNodes = new ArrayList<>();
				for (DDNode node: this.dataNodes) {
					if (node.getParent() == null) {
						calledDataNodes.addAll(node.findChildrenNamed(call.getIdentifier()));
					}
				}
				LOGGER.finest("  all node children named " + call.getIdentifier() + " = " + calledDataNodes);
				if (!call.selectDataNode(calledDataNodes)) {
					LOGGER.warning("!no data node selected");
				}
				LOGGER.finest("call.dataNode = " + call.dataNode);
			}
		}
	}

	public UUID getUUID() {
		return this.uuid;
	}

	public String getProgramName() {
		return this.programName;
	}

	public ArrayList<CallWrapper> getCalledNodes() {
		return this.calledNodes;
	}

	public ArrayList<DDNode> getDataNodes() {
		return this.dataNodes;
	}

	public void addProgram(CobolProgram pgm) {
		this.programs.add(pgm);
	}

	public void setParent(CobolProgram parent) {
		this.parent = parent;
	}

	public CobolProgram nestedProgramNamed(String nestedProgramName) {
		CobolProgram pgm = null;
		for (CobolProgram nestedProgram: this.programs) {
			if (nestedProgram.hasThisProgramName(nestedProgramName)) return nestedProgram;
			pgm = nestedProgram.nestedProgramNamed(nestedProgramName);
			if (pgm != null) break;
		}
		return pgm;
	}

	public void addCall(CallWrapper aCall) {
		Boolean found = false;
		for (CallWrapper cw: this.calledNodes) {
			if (cw.seemsLike(aCall)) {
				found = true;
				break;
			}
		}
		if (!found) this.calledNodes.add(aCall);
	}

	public void addDDNode(DDNode node) {
		this.dataNodes.add(node);
	}

	public void addAssignClause(AssignClause assignClause) {
		this.assignClauses.add(assignClause);
	}

	public void incrementStatementCounter(CobolParser.StatementContext ctx) {
		this.statementCount++;

		if (ctx.ifStatement() != null) {
			CobolParser.IfStatementContext ifStmt = ctx.ifStatement();
			this.conditionalStatementCount++;
			if (ifStmt.ifElse() != null) {
				this.conditionalStatementCount++;
			}
		}

		if (ctx.evaluateStatement() != null) {
			CobolParser.EvaluateStatementContext evalStmt = ctx.evaluateStatement();
			if (evalStmt.evaluateWhenPhrase() != null) {
				this.conditionalStatementCount += evalStmt.evaluateWhenPhrase().size();
			}
			if (evalStmt.evaluateWhenOther() != null) {
				this.conditionalStatementCount++;
			}
		}
	}

	public void writeOn(PrintWriter out, UUID parentUUID) throws IOException {
		out.printf(
			"PGM,%s,%s,%s,%d,%d\n"
			, this.getUUID().toString()
			, parentUUID.toString()
			, this.programName
			, this.statementCount
			, this.conditionalStatementCount);

		for (CobolProgram pgm: this.programs) {
			pgm.writeOn(out, this.getUUID());
		}

		for (CallWrapper cw: this.calledNodes) {
			cw.writeOn(out, this.getUUID());
		}

		for (AssignClause ac: this.assignClauses) {
			ac.writeOn(out, this.getUUID());
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.programName);
		if (this.programs.size() > 0) {
			sb.append(" nested programs: ");
			sb.append(this.programs);
		}
		return sb.toString();
	}

}
