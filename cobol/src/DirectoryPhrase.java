
import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DirectoryPhrase {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.DirectoryPhraseContext ctx = null;
	private int startLine = -1;
	private int endLine = -1;
	private int startPosn = -1;
	private int endPosn = -1;
	private Boolean leading = false;
	private Boolean trailing = false;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();

	public DirectoryPhrase (CobolPreprocessorParser.DirectoryPhraseContext ctx) {
		this.ctx = ctx;
		LiteralWrapper literal = null;
		CobolWordWrapper cobolWord = null;
		CobolPreprocessorParser.LiteralContext lCtx = this.ctx.literal();
		CobolPreprocessorParser.CobolWordContext cwCtx = this.ctx.cobolWord();

		if (lCtx != null) {
			literal = new LiteralWrapper(lCtx);
			this.tnwList.addAll(literal.getTerminalNodeWrappers());
		}

		if (cwCtx != null) {
			cobolWord = new CobolWordWrapper(cwCtx);
			this.tnwList.addAll(cobolWord.getTerminalNodeWrappers());
		}

		if (this.ctx.OF() != null) {
			this.tnwList.add(new TerminalNodeWrapper(this.ctx.OF()));
		}

		if (this.ctx.IN() != null) {
			this.tnwList.add(new TerminalNodeWrapper(this.ctx.IN()));
		}

		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			this.tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE()));
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));
	}

	public ArrayList<TerminalNodeWrapper> getTerminalNodeWrappers() {
		return this.tnwList;
	}

}
