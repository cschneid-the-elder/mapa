
import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

class CharDataLineWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CharDataLineContext ctx = null;
	private ArrayList<CobolWordWrapper> cobolWords = null;
	private ArrayList<LiteralWrapper> literals = null;
	private ArrayList<FilenameWrapper> filenames = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private long line = -1;
	private long lastLine = -1;
	private long posn = -1;
	private long sortKey = -1;
	private Boolean leading = false;
	private Boolean trailing = false;
	private String text = null;
	private StringBuilder concatenatedText = new StringBuilder();

	public static ArrayList<CharDataLineWrapper> bunchOfThese(List<CobolPreprocessorParser.CharDataLineContext> ctxList) {
		ArrayList<CharDataLineWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.CharDataLineContext aCtx: ctxList) {
			aList.add(new CharDataLineWrapper(aCtx));
		}

		return aList;
	}

	public static ArrayList<CharDataLineWrapper> bunchOfThese(List<CobolPreprocessorParser.CharDataLineContext> ctxList, Boolean leading, Boolean trailing) {
		ArrayList<CharDataLineWrapper> aList = new ArrayList<>();

		for (CobolPreprocessorParser.CharDataLineContext aCtx: ctxList) {
			aList.add(new CharDataLineWrapper(aCtx));
		}

		return aList;
	}

	public CharDataLineWrapper(CobolPreprocessorParser.CharDataLineContext ctx) {
		this.ctx = ctx;

		if (this.ctx.PSEUDOTEXTIDENTIFIER() != null && this.ctx.PSEUDOTEXTIDENTIFIER().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.PSEUDOTEXTIDENTIFIER()));
		}

		if (this.ctx.TEXT() != null && this.ctx.TEXT().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.TEXT()));
		}

		if (this.ctx.DOT() != null && this.ctx.DOT().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.DOT()));
		}

		if (this.ctx.LPARENCHAR() != null && this.ctx.LPARENCHAR().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.LPARENCHAR()));
		}

		if (this.ctx.RPARENCHAR() != null && this.ctx.RPARENCHAR().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.RPARENCHAR()));
		}

		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE()));
		}

		if (this.ctx.CLASSIC_CONTINUATION() != null && this.ctx.CLASSIC_CONTINUATION().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.CLASSIC_CONTINUATION()));
		}

		if (this.ctx.cobolWord() != null && this.ctx.cobolWord().size() > 0) {
			this.cobolWords = CobolWordWrapper.bunchOfThese(this.ctx.cobolWord());
			for (CobolWordWrapper w: this.cobolWords) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		if (this.ctx.literal() != null && this.ctx.literal().size() > 0) {
			this.literals = LiteralWrapper.bunchOfThese(this.ctx.literal());
			for (LiteralWrapper w: this.literals) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		if (this.ctx.filename() != null && this.ctx.filename().size() > 0) {
			this.filenames = FilenameWrapper.bunchOfThese(this.ctx.filename());
			for (FilenameWrapper w: this.filenames) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));

		this.line = this.tnwList.get(0).getLine();
		this.posn = this.tnwList.get(0).getPosn();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
		this.text = this.myName + " @ " + this.line + " @ " + this.posn + " " + this.tnwList.get(0).getText();
		this.lastLine = this.tnwList.get(this.tnwList.size() - 1).getLine();

		this.buildConcatenatedText();
	}

	public CharDataLineWrapper(CobolPreprocessorParser.CharDataLineContext ctx, Boolean leading, Boolean trailing) {
		this.ctx = ctx;
		this.leading = leading;
		this.trailing = trailing;

		if (this.ctx.PSEUDOTEXTIDENTIFIER() != null && this.ctx.PSEUDOTEXTIDENTIFIER().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.PSEUDOTEXTIDENTIFIER(), this.leading, this.trailing));
		}

		if (this.ctx.TEXT() != null && this.ctx.TEXT().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.TEXT(), this.leading, this.trailing));
		}

		if (this.ctx.DOT() != null && this.ctx.DOT().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.DOT(), this.leading, this.trailing));
		}

		if (this.ctx.LPARENCHAR() != null && this.ctx.LPARENCHAR().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.LPARENCHAR(), this.leading, this.trailing));
		}

		if (this.ctx.RPARENCHAR() != null && this.ctx.RPARENCHAR().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.RPARENCHAR(), this.leading, this.trailing));
		}

		if (this.ctx.NEWLINE() != null && this.ctx.NEWLINE().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.NEWLINE(), this.leading, this.trailing));
		}

		if (this.ctx.CLASSIC_CONTINUATION() != null && this.ctx.CLASSIC_CONTINUATION().size() > 0) {
			tnwList.addAll(TerminalNodeWrapper.bunchOfThese(this.ctx.CLASSIC_CONTINUATION(), this.leading, this.trailing));
		}

		if (this.ctx.cobolWord() != null && this.ctx.cobolWord().size() > 0) {
			this.cobolWords = CobolWordWrapper.bunchOfThese(this.ctx.cobolWord(), this.leading, this.trailing);
			for (CobolWordWrapper w: this.cobolWords) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		if (this.ctx.literal() != null && this.ctx.literal().size() > 0) {
			this.literals = LiteralWrapper.bunchOfThese(this.ctx.literal(), this.leading, this.trailing);
			for (LiteralWrapper w: this.literals) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		if (this.ctx.filename() != null && this.ctx.filename().size() > 0) {
			this.filenames = FilenameWrapper.bunchOfThese(this.ctx.filename(), this.leading, this.trailing);
			for (FilenameWrapper w: this.filenames) {
				this.tnwList.addAll(w.getTerminalNodeWrappers());
			}
		}

		this.tnwList.sort(Comparator.comparingLong(TerminalNodeWrapper::getSortKey));

		this.line = this.tnwList.get(0).getLine();
		this.posn = this.tnwList.get(0).getPosn();
		this.sortKey = (line * (long)Integer.MAX_VALUE) + posn;
		this.text = this.myName + " @ " + this.line + " @ " + this.posn + " " + this.tnwList.get(0).getText();
		this.lastLine = this.tnwList.get(this.tnwList.size() - 1).getLine();

		this.buildConcatenatedText();
	}

	@SuppressWarnings({"fallthrough"})
	private void buildConcatenatedText() {
		TerminalNodeWrapper token = null;
		Boolean newline = false;
		Boolean continuation = false;

		for (int i = 0; i < this.tnwList.size(); i++) {
			token = tnwList.get(i);
			TestIntegration.LOGGER.finest(this.myName + " buildConcatenatedText()" + " token = |" + token + "|");
			switch(token.getType()) {
				case CobolPreprocessorParser.NEWLINE:
					newline = true;
					break;
				case CobolPreprocessorParser.CLASSIC_CONTINUATION: // intentional fall-through!
				case CobolPreprocessorParser.REPLACE_CONTINUATION: // intentional fall-through!
				case CobolPreprocessorParser.PSEUDOTEXT_CONTINUATION: // intentional fall-through!
					continuation = true;
					break;
				default:
					if (newline && continuation) {
						this.concatenatedText.append(token.getText());
					} else if (newline) {
						this.concatenatedText.append("\n");
						this.concatenatedText.append(token.getText());
					} else {
						if (i > 0) {
							this.concatenatedText.append(" ");
						}
						this.concatenatedText.append(token.getText());
					}
					newline = false;
					continuation = false;
			}
		}
	}

	public ArrayList<TerminalNodeWrapper> getTerminalNodeWrappers() {
		return this.tnwList;
	}

	public long getSortKey() {
		return this.sortKey;
	}

	public long getLine() {
		return this.line;
	}

	public long getLastLine() {
		return this.lastLine;
	}

	public long getPosn() {
		return this.posn;
	}

	public String getText() {
		return this.concatenatedText.toString();
	}

	public String toString() {
		return this.text;
	}
}

