
import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

class PseudoTextWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.PseudoTextContext ctx = null;
	private CharDataWrapper charData = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Boolean leading = false;
	private Boolean trailing = false;

	public static ArrayList<PseudoTextWrapper> bunchOfThese(List<CobolPreprocessorParser.PseudoTextContext> ctxList) {
		ArrayList<PseudoTextWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.PseudoTextContext aCtx: ctxList) {
			aList.add(new PseudoTextWrapper(aCtx));
		}

		return aList;
	}

	public static ArrayList<PseudoTextWrapper> bunchOfThese(List<CobolPreprocessorParser.PseudoTextContext> ctxList, Boolean leading, Boolean trailing) {
		ArrayList<PseudoTextWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.PseudoTextContext aCtx: ctxList) {
			aList.add(new PseudoTextWrapper(aCtx, leading, trailing));
		}

		return aList;
	}

	public PseudoTextWrapper(CobolPreprocessorParser.PseudoTextContext ctx) {
		this.ctx = ctx;
/*
		if (this.ctx.DOUBLEEQUALCHAR() != null && this.ctx.DOUBLEEQUALCHAR().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.DOUBLEEQUALCHAR()));
		}
*/
		if (this.ctx.charData() != null) {
			this.charData = new CharDataWrapper(this.ctx.charData());
			this.tnwList.addAll(this.charData.getTerminalNodeWrappers());
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public PseudoTextWrapper(CobolPreprocessorParser.PseudoTextContext ctx, Boolean leading, Boolean trailing) {
		this.ctx = ctx;
		this.leading = leading;
		this.trailing = trailing;
/*
		if (this.ctx.DOUBLEEQUALCHAR() != null && this.ctx.DOUBLEEQUALCHAR().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.DOUBLEEQUALCHAR()));
		}
*/
		if (this.ctx.charData() != null) {
			this.charData = new CharDataWrapper(this.ctx.charData(), this.leading, this.trailing);
			this.tnwList.addAll(this.charData.getTerminalNodeWrappers());
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public ArrayList<TerminalNodeWrapper> getTerminalNodeWrappers() {
		return this.tnwList;
	}

}

