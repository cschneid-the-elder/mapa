
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

class CharDataWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CharDataContext ctx = null;
	private ArrayList<CharDataLineWrapper> charData = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private Boolean leading = false;
	private Boolean trailing = false;

	public CharDataWrapper(CobolPreprocessorParser.CharDataContext ctx) {
		this.ctx = ctx;
		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE()));
		}

		if (this.ctx.charDataLine() != null && this.ctx.charDataLine().size() > 0) {
			this.charData = CharDataLineWrapper.bunchOfThese(this.ctx.charDataLine());
			for (CharDataLineWrapper w: this.charData) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public CharDataWrapper(CobolPreprocessorParser.CharDataContext ctx, Boolean leading, Boolean trailing) {
		this.ctx = ctx;
		this.leading = leading;
		this.trailing = trailing;
		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE(), this.leading, this.trailing));
		}

		if (this.ctx.charDataLine() != null && this.ctx.charDataLine().size() > 0) {
			this.charData = CharDataLineWrapper.bunchOfThese(this.ctx.charDataLine(), this.leading, this.trailing);
			for (CharDataLineWrapper w: this.charData) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public ArrayList<TerminalNodeWrapper> getTerminalNodeWrappers() {
		return this.tnwList;
	}

}

