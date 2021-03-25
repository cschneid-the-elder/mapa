
import java.util.*;
import java.lang.reflect.*;
import org.antlr.v4.runtime.tree.*;

class CharDataLineWrapper {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CharDataLineContext ctx = null;
	private ArrayList<TerminalNodeWrapper> tnwList = new ArrayList<>();
	private long line = -1;
	private long lastLine = -1;
	private long posn = -1;
	private long sortKey = -1;
	private String text = null;
	private StringBuilder concatenatedText = new StringBuilder();

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

		if (this.ctx.cobolWord() != null) {
			for (CobolPreprocessorParser.CobolWordContext cwCtx: this.ctx.cobolWord()) {
				if (cwCtx.IDENTIFIER() != null) {
					tnwList.add(new TerminalNodeWrapper(cwCtx.IDENTIFIER()));
				}
				CobolPreprocessorParser.CharDataKeywordContext cdkCtx = cwCtx.charDataKeyword();
				if (cdkCtx != null) {
					/*
					There are a _lot_ of methods of the type we're interested in, and
					they are subject to change.  This is the most future-proof way I
					could think of to deal with the requirement.
					*/
					Method[] allMethods = cdkCtx.getClass().getDeclaredMethods();
					for (Method method : allMethods) {
					    if (Modifier.isPublic(method.getModifiers())) {
							if (method.getReturnType() == TerminalNode.class) {
								TerminalNode tn = null;
								try {
									tn = (TerminalNode)method.invoke(cdkCtx);
								} catch(Exception e) {
									TestIntegration.LOGGER.severe("Exception " + e + " encountered instantiating "+ this.myName);
									e.printStackTrace();
									System.exit(16);
								}
								if (tn != null) {
									tnwList.add(new TerminalNodeWrapper(tn));
								}
							}
					    }
					}
				}
			}
		}

		if (this.ctx.literal() != null) {
			for (CobolPreprocessorParser.LiteralContext litCtx: this.ctx.literal()) {
				if (litCtx.NONNUMERICLITERAL() != null) {
					tnwList.add(new TerminalNodeWrapper(litCtx.NONNUMERICLITERAL()));
				}
				if (litCtx.NUMERICLITERAL() != null) {
					tnwList.add(new TerminalNodeWrapper(litCtx.NUMERICLITERAL()));
				}
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

