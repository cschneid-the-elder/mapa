import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReplaceStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	public CobolPreprocessorParser.ReplaceByStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_REPLACE;
	//private int line = -1;
	private int startLine = -1;
	private int endLine = -1; //end of this REPLACE statement
	private int stopLine = -1; //end of the scope of this REPLACE statement
	private String replaceable = null;
	private String replacement = null;

	ReplaceStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) {
		this.ctx = ctx;
		//this.line = this.ctx.REPLACE().getSymbol().getLine();
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
	}

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
	}

	public int getStopLine() {
		return this.stopLine;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	int startLine() {
		return this.ctx.start.getLine();
	}

	int endLine() {
		return this.ctx.stop.getLine();
	}

	public void setStopLine(int stopLine) {
		this.stopLine = stopLine;
	}

	public String getReplaceable(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		TestIntegration.LOGGER.fine(myName + " getReplaceable");

		if (this.replaceable != null) return this.replaceable;

		String replaceable = new String();

		if (rcc.replaceable().pseudoText() == null) {
			TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().pseudoText() == null");
			if (rcc.replaceable().cobolWord() == null) {
				TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().cobolWord() == null");
				if (rcc.replaceable().literal() == null) {
					TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().literal() == null");
					if (rcc.replaceable().charDataLine() == null) {
						TestIntegration.LOGGER.warning(myName + " getReplaceable replacing statement found with no replaceable content replaceable().charDataLine() == null");
					} else {
						TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().charDataLine() != null");
						// cheating, there's more than one  TODO: don't cheat
						//replaceable = rcc.replaceable().charDataLine().cobolWord(0).IDENTIFIER().getText();
						// still cheating
						replaceable = rcc.replaceable().charDataLine().getText();
					}
				} else {
					TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().literal() != null");
					if (rcc.replaceable().literal().NONNUMERICLITERAL() == null) {
						TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().literal().NONNUMERICLITERAL() == null");
						if (rcc.replaceable().literal().NUMERICLITERAL() == null) {
							TestIntegration.LOGGER.warning(myName + " getReplaceable replacing statement found with no replaceable content replaceable().literal().NUMERICLITERAL() == null");
						} else {
							TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().literal().NUMERICLITERAL() != null");
							replaceable = rcc.replaceable().literal().NUMERICLITERAL().getText();
						}
					} else {
						TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().literal().NONNUMERICLITERAL() != null");
						replaceable = rcc.replaceable().literal().NONNUMERICLITERAL().getText();
					}
				}
			} else {
				TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().cobolWord() != null");
				replaceable = rcc.replaceable().cobolWord().IDENTIFIER().getText();
			}
		} else {
			TestIntegration.LOGGER.finest(myName + " getReplaceable rcc.replaceable().pseudoText() != null");
			replaceable = rcc.replaceable().pseudoText().charData().getText();
		}

		TestIntegration.LOGGER.finest(myName + " getReplacement replaceable = |" + replaceable + "|");
		this.replaceable = replaceable;
		return replaceable;
	}

	public String getReplacement(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		TestIntegration.LOGGER.fine(myName + " getReplacement");

		if (this.replacement == null) return this.replacement;

		String replacement = new String();

		if (rcc.replacement().pseudoText() == null) {
			TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().pseudoText() == null");
			if (rcc.replacement().cobolWord() == null) {
				TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().cobolWord() == null");
				if (rcc.replacement().literal() == null) {
					TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().literal() == null");
					if (rcc.replacement().charDataLine() == null) {
						TestIntegration.LOGGER.warning(myName + " getReplacement replacing statement found with no replacement content replacement().charDataLine() == null");
					} else {
						TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().charDataLine() != null");
						// cheating, there's more than one  TODO: don't cheat
						//replacement = rcc.replacement().charDataLine().cobolWord(0).IDENTIFIER().getText();
						// still cheating
						replacement = rcc.replacement().charDataLine().getText();
					}
				} else {
					TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().literal() != null");
					if (rcc.replacement().literal().NONNUMERICLITERAL() == null) {
						TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().literal().NONNUMERICLITERAL() == null");
						if (rcc.replacement().literal().NUMERICLITERAL() == null) {
							TestIntegration.LOGGER.warning(myName + " getReplacement replacing statement found with no replacement content replacement().literal().NUMERICLITERAL() == null");
						} else {
							TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().literal().NUMERICLITERAL() != null");
							replacement = rcc.replacement().literal().NUMERICLITERAL().getText();
						}
					} else {
						TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().literal().NONNUMERICLITERAL() != null");
						replacement = rcc.replacement().literal().NONNUMERICLITERAL().getText();
					}
				}
			} else {
				TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().cobolWord() != null");
				replacement = rcc.replacement().cobolWord().IDENTIFIER().getText();
			}
		} else {
			TestIntegration.LOGGER.finest(myName + " getReplacement rcc.replacement().pseudoText() != null");
			replacement = rcc.replacement().pseudoText().charData().getText();
		}

		TestIntegration.LOGGER.finest(myName + " getReplacement replacement = |" + replacement + "|");
		this.replacement = replacement;
		return replacement;
	}

	public String newLineWithReplacingApplied(CobolPreprocessorParser.ReplaceClauseContext rcc, String aLine) {
		TestIntegration.LOGGER.fine(myName + " newLineWithReplacingApplied");
		String newLine = new String(aLine);
		String replaceable = this.getReplaceable(rcc);
		String replacement = this.getReplacement(rcc);

		TestIntegration.LOGGER.finer(myName + " changing " + replaceable + " to " + replacement + " in " + aLine);

		if (replaceable != null && replacement != null) {
			if (newLine.length() < 80) newLine = String.format("%-80s", newLine);
			if (replaceable.length() == replacement.length()) {
				TestIntegration.LOGGER.finest(myName + " replaceable.length() == replacement.length()");
				newLine = newLine.replace(replaceable, replacement);
			} else if (replaceable.length() > replacement.length()) {
				TestIntegration.LOGGER.finest(myName + " replaceable.length() > replacement.length()");
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				frontBits = String.format("%-72s", frontBits);
				newLine = frontBits.concat(endLine);
			} else if (replaceable.length() < replacement.length()) {
				TestIntegration.LOGGER.finest(myName + " replaceable.length() < replacement.length()");
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				if (frontBits.substring(71,72).equals(" ")) {
					frontBits = frontBits.substring(0,72);
				} else {
					TestIntegration.LOGGER.warning(myName + " REPLACING statement @ " + this.startLine() + " cannot be honored");
					TestIntegration.LOGGER.warning(myName + " replaceable = " + replaceable);
					TestIntegration.LOGGER.warning(myName + " replacement = " + replacement);
				}
				newLine = frontBits.concat(endLine);
			}
		}

		TestIntegration.LOGGER.finer(myName + " newLine = " + newLine);
		return newLine;
	}

	public String applyTo(String line) {
		String newLine = new String(line);

		for (CobolPreprocessorParser.ReplaceClauseContext rcc: this.ctx.replaceClause()) {
			newLine = this.newLineWithReplacingApplied(rcc, newLine);
		}

		return newLine;
	}

	public String toString() {
		StringBuilder sb = 
			new StringBuilder(
					myName 
					+ " replace BY @" 
					+ this.startLine() 
					+ ": " 
					+ this.ctx.getText());

		if (this.ctx.replaceClause() == null) {
			sb.append("\n\treplaceClause() == null");
		} else {
			for (CobolPreprocessorParser.ReplaceClauseContext rcc: this.ctx.replaceClause()) {
				if (rcc.replaceable().pseudoText() == null) {
					sb.append("\n\treplaceable().pseudoText(): null");
				} else {
					sb.append("\n\treplaceable().pseudoText(): " + rcc.replaceable().pseudoText().getText());
					sb.append("\n\treplaceable().pseudoText().charData(): " + rcc.replaceable().pseudoText().charData().getText());
					sb.append("\n\treplaceable().pseudoText().charData().charDataLine(0): " + rcc.replaceable().pseudoText().charData().charDataLine(0).getText());
				}
			}
		}		

		return sb.toString();

	}

}
