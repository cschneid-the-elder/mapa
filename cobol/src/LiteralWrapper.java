
import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

class LiteralWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.LiteralContext ctx = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Boolean leading = false;
	private Boolean trailing = false;

	public static ArrayList<LiteralWrapper> bunchOfThese(List<CobolPreprocessorParser.LiteralContext> ctxList) {
		ArrayList<LiteralWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.LiteralContext aCtx: ctxList) {
			aList.add(new LiteralWrapper(aCtx));
		}

		return aList;
	}

	public static ArrayList<LiteralWrapper> bunchOfThese(List<CobolPreprocessorParser.LiteralContext> ctxList, Boolean leading, Boolean trailing) {
		ArrayList<LiteralWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.LiteralContext aCtx: ctxList) {
			aList.add(new LiteralWrapper(aCtx, leading, trailing));
		}

		return aList;
	}

	public LiteralWrapper(CobolPreprocessorParser.LiteralContext ctx) {
		this.ctx = ctx;
		this.populateTerminalNodeWrapperList();
		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public LiteralWrapper(CobolPreprocessorParser.LiteralContext ctx, Boolean leading, Boolean trailing) {
		this.ctx = ctx;
		this.leading = leading;
		this.trailing = trailing;
		this.populateTerminalNodeWrapperList();
		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public ArrayList<TerminalNodeWrapper> getTerminalNodeWrappers() {
		return this.tnwList;
	}

	public void populateTerminalNodeWrapperList() {
		/*
		There are a _lot_ of methods of the type we're interested in, and
		they are subject to change.  This is the most future-proof way I
		could think of to deal with the requirement.
		*/
		Method[] allMethods = this.ctx.getClass().getDeclaredMethods();
		for (Method method : allMethods) {
		    if (Modifier.isPublic(method.getModifiers())) {
				if (method.getReturnType() == TerminalNode.class) {
					TerminalNode tn = null;
					try {
						tn = (TerminalNode)method.invoke(this.ctx);
					} catch(Exception e) {
						System.err.println(method.toGenericString());
						e.printStackTrace();
						System.exit(16);
					}
					if (tn != null) {
						tnwList.add(new TerminalNodeWrapper(tn, this.leading, this.trailing));
					}
				}
		    }
		}
	}

}

