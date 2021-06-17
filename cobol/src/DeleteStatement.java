import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DeleteStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private Logger LOGGER = null;
	private CobolPreprocessorParser.CompilerDirectiveDeleteContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_DELETE;
	private CobolPreprocessorParser.CompilerDirectiveDeleteSequenceNumberContext seqNbCtx = null;
	private int startLine = -1;
	private int endLine = -1;
	private ArrayList<Integer> targetLines = new ArrayList<>();
	private int lastTargetLine = -1;
	private ArrayList<ArrayList<Integer>> targetRanges = new ArrayList<>();
	private ArrayList<String> src = new ArrayList<>();

	DeleteStatement(
			CobolPreprocessorParser.CompilerDirectiveDeleteContext ctx
			, Logger LOGGER
			) {
		this.LOGGER = LOGGER;
		this.ctx = ctx;
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
		this.setTargetLines();
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

	private void setTargetLines() {
		this.seqNbCtx = this.ctx.compilerDirectiveDeleteSequenceNumber();
		Integer ultimateLine = new Integer(0);

		List<CobolPreprocessorParser.CompilerDirectiveNumericRangeContext> ranges =
			this.seqNbCtx.compilerDirectiveNumericRange();
		if (ranges != null) {
			for (CobolPreprocessorParser.CompilerDirectiveNumericRangeContext range: ranges) {
				ArrayList<Integer> thisRange = new ArrayList<>();
				thisRange.add(new Integer(range.compilerDirectiveNumericAtom(0).NUMERICLITERAL().getText()));
				thisRange.add(new Integer(range.compilerDirectiveNumericAtom(1).NUMERICLITERAL().getText()));
				this.targetRanges.add(thisRange);
				if (thisRange.get(1).compareTo(ultimateLine) > 0) {
					ultimateLine = thisRange.get(1);
				}
			}
		}

		List<CobolPreprocessorParser.CompilerDirectiveNumericAtomContext> atoms =
			this.seqNbCtx.compilerDirectiveNumericAtom();
		if (atoms != null) {
			for (CobolPreprocessorParser.CompilerDirectiveNumericAtomContext atom: atoms) {
				Integer thisLine = new Integer(atom.NUMERICLITERAL().getText());
				this.targetLines.add(thisLine);
				if (thisLine.compareTo(ultimateLine) > 0) {
					ultimateLine = thisLine;
				}
			}
		}

		this.lastTargetLine = ultimateLine;
	}

	public Boolean appliesTo(int lineNb) {
		return this.appliesTo(new Integer(lineNb));
	}

	public Boolean appliesTo(Integer lineNb) {
		if (this.targetLines.contains(lineNb)) {
			return true;
		} else {
			this.LOGGER.finest(
				myName 
				+ " " + lineNb
				+ " is not present in "
				+ this.targetLines
				);
		}

		for (ArrayList<Integer> pair: this.targetRanges) {
			if (lineNb.compareTo(pair.get(0)) >= 0
			&& lineNb.compareTo(pair.get(1)) <= 0) {
				return true;
			} else {
				this.LOGGER.finest(
					myName
					+ " " + lineNb
					+ " is not >= " + pair.get(0)
					+ " or not <= " + pair.get(1)
					);
			}
		}

		return false;
	}

	public Boolean isLastTargetLine(int lineNb) {
		return (this.lastTargetLine == lineNb);
	}

	public void addSrc(String srcLine) {
		this.src.add(srcLine);
	}

	public ArrayList<String> getSrc() {
		return this.src;
	}

}
