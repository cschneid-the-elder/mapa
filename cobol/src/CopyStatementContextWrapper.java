import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CopyStatementContextWrapper implements CompilerDirectingStatement {

	private CobolPreprocessorParser.CopyStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_COPY;
	private int line = -1;

	CopyStatementContextWrapper(CobolPreprocessorParser.CopyStatementContext ctx) {
		this.ctx = ctx;
		this.line = this.ctx.COPY().getSymbol().getLine();
	}

	public int getLine() {
		return this.line;
	}

	public CompilerDirectingStatementType getType() {
		return this.type;
	}

	int startLine() {
		return this.ctx.COPY().getSymbol().getLine();
	}

	int endLine() {
		return this.ctx.DOT().getSymbol().getLine();
	}

	int startPositionInLine() {
		return this.ctx.COPY().getSymbol().getCharPositionInLine();
	}

	int endPositionInLine() {
		return this.ctx.DOT().getSymbol().getCharPositionInLine();
	}

	String getText() {
		return this.ctx.getText();
	}

	public String getCopyFile() {
		String copyFile = null;

		if (this.ctx.copySource().literal() != null) {
			copyFile = this.ctx.copySource().literal().getText();
		} else if (this.ctx.copySource().cobolWord() != null) {
			copyFile = this.ctx.copySource().cobolWord().getText();
		} else if (this.ctx.copySource().filename() != null) {
			copyFile = this.ctx.copySource().filename().getText();
		}

		if (copyFile.indexOf("'") != -1) {
			copyFile = 
				copyFile.substring(copyFile.indexOf("'") + 1, copyFile.lastIndexOf("'"));
		}

		return copyFile;
	}

	public String applyReplacingPhrases(String line) {
		String newLine = new String(line);

		if (this.ctx.replacingPhrase() == null) {
		} else {
			for (CobolPreprocessorParser.ReplacingPhraseContext rpc: this.ctx.replacingPhrase()) {
				for (CobolPreprocessorParser.ReplaceClauseContext rcc: rpc.replaceClause()) {
					String replaceable = getReplaceable(rcc);
					String replacement = getReplacement(rcc);
					newLine = newLineWithReplacingApplied(replaceable, replacement, newLine);
				}
			}
		}

		return newLine;
	}

	public String getReplaceable(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		String replaceable = new String();

		if (rcc.replaceable().pseudoText() == null) {
			if (rcc.replaceable().cobolWord() == null) {
				if (rcc.replaceable().literal() == null) {
					if (rcc.replaceable().charDataLine() == null) {
						TestIntegration.LOGGER.warning("replacing phrase found with no replaceable content replaceable().charDataLine() == null");
					} else {
						// cheating, there's more than one  TODO: don't cheat
						//replaceable = rcc.replaceable().charDataLine().cobolWord(0).IDENTIFIER().getText();
						// still cheating
						replaceable = rcc.replaceable().charDataLine().getText();
					}
				} else {
					if (rcc.replaceable().literal().NONNUMERICLITERAL() == null) {
						if (rcc.replaceable().literal().NUMERICLITERAL() == null) {
							TestIntegration.LOGGER.warning("replacing phrase found with no replaceable content replaceable().literal().NUMERICLITERAL() == null");
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
						TestIntegration.LOGGER.warning("replacing phrase found with no replacement content replacement().charDataLine() == null");
					} else {
						// cheating, there's more than one  TODO: don't cheat
						//replacement = rcc.replacement().charDataLine().cobolWord(0).IDENTIFIER().getText();
						// still cheating
						replacement = rcc.replacement().charDataLine().getText();
					}
				} else {
					if (rcc.replacement().literal().NONNUMERICLITERAL() == null) {
						if (rcc.replacement().literal().NUMERICLITERAL() == null) {
							TestIntegration.LOGGER.warning("replacing phrase found with no replacement content replacement().literal().NUMERICLITERAL() == null");
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

	public String newLineWithReplacingApplied(String replaceable
							, String replacement
							, String aLine) {
		String newLine = new String(aLine);

		if (replaceable != null && replacement != null) {
			if (newLine.length() < 80) newLine = String.format("%-80s", newLine);
			if (replaceable.length() == replacement.length()) {
				newLine = newLine.replace(replaceable, replacement);
			} else if (replaceable.length() > replacement.length()) {
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				frontBits = String.format("%-72s", frontBits);
				newLine = frontBits.concat(endLine);
			} else if (replaceable.length() < replacement.length()) {
				String endLine = newLine.substring(72);
				String frontBits = newLine.substring(0, 72);
				frontBits = frontBits.replace(replaceable, replacement);
				if (frontBits.substring(71,72).equals(" ")) {
					frontBits = frontBits.substring(0,72);
				} else {
					TestIntegration.LOGGER.warning("REPLACING phrase for " + this.getCopyFile() + " cannot be honored");
					TestIntegration.LOGGER.warning("replaceable = " + replaceable);
					TestIntegration.LOGGER.warning("replacement = " + replacement);
				}
				newLine = frontBits.concat(endLine);
			}
		}

		return newLine;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("copy @" + this.ctx.start.getLine() + ": " + this.ctx.getText());
		sb.append("\n\tstop = " + this.ctx.stop.getLine());
		sb.append("\n\tcopySource = " + this.ctx.copySource().getText());
		if (this.ctx.copySource().literal() != null) {
			sb.append("\n\tcopySource.literal = " + this.ctx.copySource().literal().getText());
		} else if (this.ctx.copySource().cobolWord() != null) {
			sb.append("\n\tcopySource.cobolWord = " + this.ctx.copySource().cobolWord().getText());
		} else if (this.ctx.copySource().filename() != null) {
			sb.append("\n\tcopySource.filename = " + this.ctx.copySource().filename().getText());
		}

		if (this.ctx.replacingPhrase() == null) {
			sb.append("\n\tcopy.replacingPhrase() = null");
		} else {
			for (CobolPreprocessorParser.ReplacingPhraseContext rpc: this.ctx.replacingPhrase()) {
				for (CobolPreprocessorParser.ReplaceClauseContext rcc: rpc.replaceClause()) {
					if (rcc.replaceable().pseudoText() == null) {
						sb.append("\n\treplaceable().pseudoText() = null");
					} else {
						if (rcc.replaceable().pseudoText().charData() == null) {
							sb.append("\n\treplaceable().pseudoText().charData() = null");
						} else {
							if (rcc.replaceable().pseudoText().charData().charDataLine() == null) {
								sb.append("\n\treplaceable().pseudoText().charData().charDataLine() = null");
							} else {
								if (rcc.replaceable().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER() == null) {
									sb.append("\n\treplaceable().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER() = null");
								} else {
									if (rcc.replaceable().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER(0) == null) {
										sb.append("\n\treplaceable().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER(0) = null");
									} else {
										sb.append("\n\treplaceable().pseudoText() = " + rcc.replaceable().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER(0).getText());
									}
								}
							}
						}
					}
					if (rcc.replacement().pseudoText() == null) {
						sb.append("\n\treplacement().pseudoText() = null");
					} else {
						if (rcc.replacement().pseudoText().charData() == null) {
							sb.append("\n\treplacement().pseudoText().charData() = null");
						} else {
							if (rcc.replacement().pseudoText().charData().charDataLine() == null) {
								sb.append("\n\treplacement().pseudoText().charData().charDataLine() = null");
							} else {
								if (rcc.replacement().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER() == null) {
									sb.append("\n\treplacement().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER() = null");
								} else {
									if (rcc.replacement().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER(0) == null) {
										sb.append("\n\treplacement().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER(0) = null");
									} else {
										sb.append("\n\treplacement().pseudoText() = " + rcc.replacement().pseudoText().charData().charDataLine(0).PSEUDOTEXTIDENTIFIER(0).getText());
									}
								}
							}
						}
					}
					if (rcc.replaceable().cobolWord() == null) {
						sb.append("\n\treplaceable().cobolWord() = null");
					} else {
						sb.append("\n\treplaceable().cobolWord() = " + rcc.replaceable().cobolWord().IDENTIFIER().getText());
					}
					if (rcc.replacement().cobolWord() == null) {
						sb.append("\n\treplacement().cobolWord() = null");
					} else {
						sb.append("\n\treplacement().cobolWord() = " + rcc.replacement().cobolWord().IDENTIFIER().getText());
					}
					if (rcc.replaceable().literal() == null) {
						sb.append("\n\treplaceable().literal() = null");
					} else {
						if (rcc.replaceable().literal().NONNUMERICLITERAL() == null) {
							sb.append("\n\treplaceable().literal().NONNUMERICLITERAL() = null");
						} else {
							sb.append("\n\treplaceable().literal() = " + rcc.replaceable().literal().NONNUMERICLITERAL().getText());
						}
					}
					if (rcc.replacement().literal() == null) {
						sb.append("\n\treplacement().literal() = null");
					} else {
						if (rcc.replacement().literal().NONNUMERICLITERAL() == null) {
							sb.append("\n\treplacement).literal().NONNUMERICLITERAL() = null");
						} else {
							sb.append("\n\treplacement().literal() = " + rcc.replacement().literal().NONNUMERICLITERAL().getText());
						}
					}
					if (rcc.replaceable().literal() == null) {
						sb.append("\n\treplaceable().literal() = null");
					} else {
						if (rcc.replaceable().literal().NUMERICLITERAL() == null) {
							sb.append("\n\treplaceable().literal().NUMERICLITERAL() = null");
						} else {
							sb.append("\n\treplaceable().literal() = " + rcc.replaceable().literal().NUMERICLITERAL().getText());
						}
					}
					if (rcc.replacement().literal() == null) {
						sb.append("\n\treplacement().literal() = null");
					} else {
						if (rcc.replacement().literal().NUMERICLITERAL() == null) {
							sb.append("\n\treplacement).literal().NUMERICLITERAL() = null");
						} else {
							sb.append("\n\treplacement().literal() = " + rcc.replacement().literal().NUMERICLITERAL().getText());
						}
					}
					if (rcc.replaceable().charDataLine() == null) {
						sb.append("\n\treplaceable().charDataLine() = null");
					} else {
						if (rcc.replaceable().charDataLine().cobolWord() == null) {
							sb.append("\n\treplaceable().charDataLine().cobolWord() = null");
						} else {
							if (rcc.replaceable().charDataLine().cobolWord(0) == null) {
								sb.append("\n\treplaceable().charDataLine().cobolWord(0) = null");
							} else {
								if (rcc.replaceable().charDataLine().cobolWord(0).IDENTIFIER() == null) {
									sb.append("\n\treplaceable().charDataLine().cobolWord(0).IDENTIFIER() = null");
								} else {
									sb.append("\n\treplaceable().charDataLine() = " + rcc.replaceable().charDataLine().cobolWord(0).IDENTIFIER().getText());
								}
							}
						}
					}
					if (rcc.replacement().charDataLine() == null) {
						sb.append("\n\treplacement().charDataLine() = null");
					} else {
						if (rcc.replacement().charDataLine().cobolWord() == null) {
							sb.append("\n\treplacement().charDataLine().cobolWord() = null");
						} else {
							if (rcc.replacement().charDataLine().cobolWord(0) == null) {
								sb.append("\n\treplacement().charDataLine().cobolWord(0) = null");
							} else {
								if (rcc.replacement().charDataLine().cobolWord(0).IDENTIFIER() == null) {
									sb.append("\n\treplacement().charDataLine().cobolWord(0).IDENTIFIER() = null");
								} else {
									sb.append("\n\treplacement().charDataLine() = " + rcc.replacement().charDataLine().cobolWord(0).IDENTIFIER().getText());
								}
							}
						}
					}
				}
			}
		}

		return sb.toString();
	}

}
