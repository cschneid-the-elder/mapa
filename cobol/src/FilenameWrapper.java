
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

class FilenameWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.FilenameContext ctx = null;
	private CharDataWrapper charData = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Boolean leading = false;
	private Boolean trailing = false;

	public static ArrayList<FilenameWrapper> bunchOfThese(List<CobolPreprocessorParser.FilenameContext> ctxList) {
		ArrayList<FilenameWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.FilenameContext aCtx: ctxList) {
			aList.add(new FilenameWrapper(aCtx));
		}

		return aList;
	}

	public static ArrayList<FilenameWrapper> bunchOfThese(List<CobolPreprocessorParser.FilenameContext> ctxList, Boolean leading, Boolean trailing) {
		ArrayList<FilenameWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.FilenameContext aCtx: ctxList) {
			aList.add(new FilenameWrapper(aCtx, leading, trailing));
		}

		return aList;
	}

	public FilenameWrapper(CobolPreprocessorParser.FilenameContext ctx) {
		this.ctx = ctx;
		this.populateTerminalNodeWrapperList();
		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public FilenameWrapper(CobolPreprocessorParser.FilenameContext ctx, Boolean leading, Boolean trailing) {
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

