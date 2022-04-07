import java.util.*;
import java.util.logging.Logger;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
Instances of this class serve two purposes.  First, act as an end point
for the scope of a REPLACE statement.  Second, remove itself from a
collection of TerminalNodeWrappers representing the source code being
processed.
*/

public class ReplaceOffStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	public CobolPreprocessorParser.ReplaceOffStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_REPLACE_OFF;
	//private int line = -1; //TODO remove
	private int startLine = -1;
	private int endLine = -1;
	private Boolean enabled = false;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Logger LOGGER = null;

	public ReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx, Logger LOGGER) {
		this.LOGGER = LOGGER;
		this.ctx = ctx;
		//this.line = this.ctx.REPLACE().getSymbol().getLine(); //TODO remove
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
		this.tnwList.add(new TerminalNodeWrapper(this.ctx.REPLACE()));
		this.tnwList.add(new TerminalNodeWrapper(this.ctx.OFF()));
		this.tnwList.add(new TerminalNodeWrapper(this.ctx.DOT()));
		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE()));
		}
		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	private void iWasNeverHere(CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes) {
		ArrayList<TerminalNodeWrapper> toRemove = new ArrayList<>();
		for (TerminalNodeWrapper sourceNode: sourceNodes) {
			for (TerminalNodeWrapper tnw: this.tnwList) {
				if (sourceNode.textAndLocAreEqual(tnw)) {
					toRemove.add(sourceNode);
					break;
				}
			}
		}
		sourceNodes.removeAll(toRemove);
	}

	public void apply(
			CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes
			) {
		this.LOGGER.fine(this.myName + " apply() ");

		this.iWasNeverHere(sourceNodes);
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean isEnabled() {
		return this.enabled;
	}

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	int startLine() {
		return this.ctx.start.getLine();
	}

	int endLine() {
		return this.ctx.stop.getLine();
	}

	public String toString() {
		StringBuilder sb = 
			new StringBuilder(
					myName 
					+ " replace OFF @" 
					+ this.startLine() 
					+ ": " 
					+ this.ctx.getText());

		return sb.toString();

	}

}
