
import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

/**
CharDataKeywordWrapper, CharDataLineWrapper, CharDataWrapper, CobolWordWrapper (not
to be confused with CobolWord), DirectoryPhrase, FilenameWrapper, LiteralWrapper,
and PseudoTextWrapper are all in service to the preprocessing that resolves COPY
REPLACING and REPLACE statements.  Their primary purpose is to create a collection
of TerminalNodeWrapper instances which are used in CopyReplaceParent::applyReplacingPhrase().
*/

class CobolWordWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CobolWordContext ctx = null;
	private CharDataKeywordWrapper charData = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Boolean leading = false;
	private Boolean trailing = false;

	public static ArrayList<CobolWordWrapper> bunchOfThese(List<CobolPreprocessorParser.CobolWordContext> ctxList) {
		ArrayList<CobolWordWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.CobolWordContext aCtx: ctxList) {
			aList.add(new CobolWordWrapper(aCtx));
		}

		return aList;
	}

	public static ArrayList<CobolWordWrapper> bunchOfThese(List<CobolPreprocessorParser.CobolWordContext> ctxList, Boolean leading, Boolean trailing) {
		ArrayList<CobolWordWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.CobolWordContext aCtx: ctxList) {
			aList.add(new CobolWordWrapper(aCtx, leading, trailing));
		}

		return aList;
	}

	public CobolWordWrapper(CobolPreprocessorParser.CobolWordContext ctx) {
		this.ctx = ctx;
		this.populateTerminalNodeWrapperList();
		if (this.ctx.charDataKeyword() != null) {
			this.charData = new CharDataKeywordWrapper(this.ctx.charDataKeyword());
			this.tnwList.addAll(this.charData.getTerminalNodeWrappers());
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public CobolWordWrapper(CobolPreprocessorParser.CobolWordContext ctx, Boolean leading, Boolean trailing) {
		this.ctx = ctx;
		this.leading = leading;
		this.trailing = trailing;
		this.populateTerminalNodeWrapperList();
		if (this.ctx.charDataKeyword() != null) {
			this.charData = new CharDataKeywordWrapper(this.ctx.charDataKeyword());
			this.tnwList.addAll(this.charData.getTerminalNodeWrappers());
		}

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

