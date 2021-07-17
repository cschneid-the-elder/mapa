
import java.util.*;
import org.antlr.v4.runtime.tree.*;

/**
*/

class DfhvalueWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.DfhvalueContext ctx = null;
	private CobolWordWrapper cobolWordW = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();

	public static ArrayList<DfhvalueWrapper> bunchOfThese(List<CobolPreprocessorParser.DfhvalueContext> ctxList) {
		ArrayList<DfhvalueWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.DfhvalueContext aCtx: ctxList) {
			aList.add(new DfhvalueWrapper(aCtx));
		}

		return aList;
	}

	public DfhvalueWrapper(CobolPreprocessorParser.DfhvalueContext ctx) {
		this.ctx = ctx;

		this.tnwList.add(new TerminalNodeWrapper(this.ctx.DFHVALUE()));
		this.tnwList.add(new TerminalNodeWrapper(this.ctx.LPARENCHAR()));
		this.tnwList.add(new TerminalNodeWrapper(this.ctx.RPARENCHAR()));

		if (this.ctx.COPY() != null) {
			this.tnwList.add(new TerminalNodeWrapper(this.ctx.COPY()));
		}

		if (this.ctx.PROCESS() != null) {
			this.tnwList.add(new TerminalNodeWrapper(this.ctx.PROCESS()));
		}

		if (this.ctx.cobolWord() != null) {
			this.cobolWordW = new CobolWordWrapper(this.ctx.cobolWord());
			this.tnwList.addAll(this.cobolWordW.getTerminalNodeWrappers());
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public ArrayList<TerminalNodeWrapper> getTerminalNodeWrappers() {
		return this.tnwList;
	}

}

