import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReplaceStatementContextWrapper {

	public ParserRuleContext ctx = null;
	public CobolPreprocessorParser.ReplaceByStatementContext rbsc = null;
	public CobolPreprocessorParser.ReplaceOffStatementContext rosc = null;

	ReplaceStatementContextWrapper(ParserRuleContext ctx) {
		this.ctx = ctx;
		if (isReplaceByStatement())
			this.rbsc = (CobolPreprocessorParser.ReplaceByStatementContext)ctx;
		if (isReplaceOffStatement())
			this.rosc = (CobolPreprocessorParser.ReplaceOffStatementContext)ctx;
	}

	Boolean isReplaceByStatement() {
		return (this.ctx.getRuleIndex() == CobolPreprocessorParser.RULE_replaceByStatement);
	}

	Boolean isReplaceOffStatement() {
		return (this.ctx.getRuleIndex() == CobolPreprocessorParser.RULE_replaceOffStatement);
	}

	int startLine() {
		return this.ctx.start.getLine();
	}

	int endLine() {
		return this.ctx.stop.getLine();
	}

	public String getReplaceable(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		String replaceable = new String();

		if (rcc.replaceable().pseudoText() == null) {
			if (rcc.replaceable().cobolWord() == null) {
				if (rcc.replaceable().literal() == null) {
					if (rcc.replaceable().charDataLine() == null) {
						TestIntegration.LOGGER.warning("replacing statement found with no replaceable content replaceable().charDataLine() == null");
					} else {
						// cheating, there's more than one  TODO: don't cheat
						//replaceable = rcc.replaceable().charDataLine().cobolWord(0).IDENTIFIER().getText();
						// still cheating
						replaceable = rcc.replaceable().charDataLine().getText();
					}
				} else {
					if (rcc.replaceable().literal().NONNUMERICLITERAL() == null) {
						if (rcc.replaceable().literal().NUMERICLITERAL() == null) {
							TestIntegration.LOGGER.warning("replacing statement found with no replaceable content replaceable().literal().NUMERICLITERAL() == null");
						} else {
							replaceable = rcc.replaceable().literal().NUMERICLITERAL().getText();
						}
					} else {
						replaceable = rcc.replaceable().literal().NONNUMERICLITERAL().getText();
					}
				}
			} else {
				replaceable = rcc.replaceable().cobolWord().IDENTIFIER().getText();
			}
		} else {
			replaceable = rcc.replaceable().pseudoText().charData().getText();
		}

		return replaceable;
	}

	public String getReplacement(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		String replacement = new String();

		if (rcc.replacement().pseudoText() == null) {
			if (rcc.replacement().cobolWord() == null) {
				if (rcc.replacement().literal() == null) {
					if (rcc.replacement().charDataLine() == null) {
						TestIntegration.LOGGER.warning("replacing statement found with no replacement content replacement().charDataLine() == null");
					} else {
						// cheating, there's more than one  TODO: don't cheat
						//replacement = rcc.replacement().charDataLine().cobolWord(0).IDENTIFIER().getText();
						// still cheating
						replacement = rcc.replacement().charDataLine().getText();
					}
				} else {
					if (rcc.replacement().literal().NONNUMERICLITERAL() == null) {
						if (rcc.replacement().literal().NUMERICLITERAL() == null) {
							TestIntegration.LOGGER.warning("replacing statement found with no replacement content replacement().literal().NUMERICLITERAL() == null");
						} else {
							replacement = rcc.replacement().literal().NUMERICLITERAL().getText();
						}
					} else {
						replacement = rcc.replacement().literal().NONNUMERICLITERAL().getText();
					}
				}
			} else {
				replacement = rcc.replacement().cobolWord().IDENTIFIER().getText();
			}
		} else {
			replacement = rcc.replacement().pseudoText().charData().getText();
		}

		return replacement;
	}

	public String newLineWithReplacingApplied(CobolPreprocessorParser.ReplaceClauseContext rcc, String aLine) {
		TestIntegration.LOGGER.fine("newLineWithReplacingApplied");
		String newLine = new String(aLine);
		String replaceable = this.getReplaceable(rcc);
		String replacement = this.getReplacement(rcc);

		TestIntegration.LOGGER.finer("changing " + replaceable + " to " + replacement + " in " + aLine);

		if (replaceable != null && replacement != null) {
			if (newLine.length() < 80) newLine = String.format("%-80s", newLine);
			if (replaceable.length() == replacement.length()) {
				TestIntegration.LOGGER.finest("replaceable.length() == replacement.length()");
				newLine = newLine.replace(replaceable, replacement);
			} else if (replaceable.length() > replacement.length()) {
				TestIntegration.LOGGER.finest("replaceable.length() > replacement.length()");
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				frontBits = String.format("%-72s", frontBits);
				newLine = frontBits.concat(endLine);
			} else if (replaceable.length() < replacement.length()) {
				TestIntegration.LOGGER.finest("replaceable.length() < replacement.length()");
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				if (frontBits.substring(71,72).equals(" ")) {
					frontBits = frontBits.substring(0,72);
				} else {
					TestIntegration.LOGGER.warning("REPLACING statement @ " + this.startLine() + " cannot be honored");
					TestIntegration.LOGGER.warning("replaceable = " + replaceable);
					TestIntegration.LOGGER.warning("replacement = " + replacement);
				}
				newLine = frontBits.concat(endLine);
			}
		}

		TestIntegration.LOGGER.finer("newLine = " + newLine);
		return newLine;
	}

	public String applyTo(String line) {
		String newLine = new String(line);

		for (CobolPreprocessorParser.ReplaceClauseContext rcc: this.rbsc.replaceClause()) {
			newLine = this.newLineWithReplacingApplied(rcc, newLine);
		}

		return newLine;
	}

	public String toString() {
		String aString = null;

		if (this.isReplaceByStatement()) {
			aString = new String("replace BY @" + this.startLine() + ": " + this.ctx.getText());
			if (this.rbsc.replaceClause() == null) {
				aString = aString.concat("\n\treplaceClause() == null");
			} else {
				for (CobolPreprocessorParser.ReplaceClauseContext rcc: this.rbsc.replaceClause()) {
					if (rcc.replaceable().pseudoText() == null) {
						aString = aString.concat("\n\treplaceable().pseudoText(): null");
					} else {
						aString = aString.concat("\n\treplaceable().pseudoText(): " + rcc.replaceable().pseudoText().getText());
						aString = aString.concat("\n\treplaceable().pseudoText().charData(): " + rcc.replaceable().pseudoText().charData().getText());
						aString = aString.concat("\n\treplaceable().pseudoText().charData().charDataLine(0): " + rcc.replaceable().pseudoText().charData().charDataLine(0).getText());
					}
				}
			}		
		} else if (this.isReplaceOffStatement()) {
			aString = new String("replace OFF @" + this.startLine() + ": " + this.ctx.getText());
		}

		return aString;

	}

}
