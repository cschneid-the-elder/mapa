import java.util.*;
import java.io.*;
import java.nio.file.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CopyStatement implements CompilerDirectingStatement {

	private String myName = this.getClass().getName();
	private CobolPreprocessorParser.CopyStatementContext ctx = null;
	private CompilerDirectingStatementType type = CompilerDirectingStatementType.STMT_COPY;
	private int startLine = -1;
	private int endLine = -1;
	private int startPosn = -1;
	private int endPosn = -1;
	private String replaceable = null;
	private String replacement = null;

	CopyStatement(CobolPreprocessorParser.CopyStatementContext ctx) {
		this.ctx = ctx;
		//this.startLine = this.ctx.COPY().getSymbol().getLine();
		this.startLine = this.ctx.start.getLine();
		this.endLine = this.ctx.stop.getLine();
		this.startPosn = this.ctx.start.getCharPositionInLine();
		this.endPosn = this.ctx.stop.getCharPositionInLine();
		TestIntegration.LOGGER.fine(myName + " " + this.getCopyFile());
		TestIntegration.LOGGER.fine(myName + " this.ctx.start.getLine() = " + this.ctx.start.getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.COPY().getSymbol().getLine() = " + this.ctx.COPY().getSymbol().getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.stop.getLine() = " + this.ctx.stop.getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.DOT().getSymbol().getLine() = " + this.ctx.DOT().getSymbol().getLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.start.getCharPositionInLine() = " + this.ctx.start.getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.COPY().getSymbol().getCharPositionInLine() = " + this.ctx.COPY().getSymbol().getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.stop.getCharPositionInLine() = " + this.ctx.stop.getCharPositionInLine());
		TestIntegration.LOGGER.fine(myName + " this.ctx.DOT().getSymbol().getCharPositionInLine() = " + this.ctx.DOT().getSymbol().getCharPositionInLine());
	}

	public int getLine() {
		return this.startLine;
	}

	public int getEndLine() {
		return this.endLine;
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

	public void apply(
			LineNumberReader src
			, PrintWriter out
			, String currLine
			) throws IOException {
		TestIntegration.LOGGER.fine(myName + " apply() " + this.getCopyFile());
		String inLine = currLine;
		Boolean pleaseWrite = true;
		while (inLine != null) {
			pleaseWrite = true;
			if (src.getLineNumber() < this.getLine() || src.getLineNumber() > this.getEndLine()) {
					// outside of this COPY statement
					TestIntegration.LOGGER.finer("outside this COPY statement");
					return;
					//if (pleaseWrite) {
					//	TestIntegration.LOGGER.finer("out = |" + inLine + "|");
					//	out.println(inLine);
					//	pleaseWrite = false;
					//}
				} else if (src.getLineNumber() > this.getLine() && src.getLineNumber() < this.getEndLine()) {
					// inside of a multi-line COPY statement - we just discard these
					TestIntegration.LOGGER.finer("inside multi-line COPY statement");
					TestIntegration.LOGGER.finer("discarding " + inLine);
					pleaseWrite = false;
				} else if (src.getLineNumber() == this.getLine() && this.getLine() == this.getEndLine()) {
					// single line COPY statement
					TestIntegration.LOGGER.finer("single-line COPY statement");
					TestIntegration.LOGGER.finer("startPosn = " + this.startPosn);
					TestIntegration.LOGGER.finer("endPosn   = " + this.endPosn);
					String aLine = inLine.substring(0, this.startPosn - 1);
					for (int i = this.startPosn; i <= this.endPosn + 1; i++) aLine = aLine.concat(" "); 
					if (inLine.length() > this.endPosn) {
						aLine = aLine.concat(inLine.substring(this.endPosn + 1));
					}
					TestIntegration.LOGGER.finer("in  = |" + inLine + "|");
					TestIntegration.LOGGER.finer("out = |" + aLine + "|");
					out.println(aLine);
					pleaseWrite = false;
					writeTheCopyContent(out);
					return;
				} else if (src.getLineNumber() == this.getLine() && this.getLine() < this.getEndLine()) {
					// first line of a multi-line COPY statement
					TestIntegration.LOGGER.finer("first line of a multi-line COPY statement");
					int endPosn = 71;
					if (inLine.length() <= endPosn) endPosn = inLine.length() - 1;
					String aLine = inLine.substring(0, this.startPosn - 1);
					for (int i = this.startPosn; i <= endPosn + 1; i++) {
						aLine = aLine.concat(" ");
						TestIntegration.LOGGER.finer("i = " + i);
						TestIntegration.LOGGER.finer("aLine = |" + aLine + "|");
					} 
					aLine = aLine.concat(inLine.substring(endPosn + 1));
					TestIntegration.LOGGER.finer("startPosn = " + this.startPosn);
					TestIntegration.LOGGER.finer("endPosn   = " + endPosn);
					TestIntegration.LOGGER.finer("in  = |" + inLine + "|");
					TestIntegration.LOGGER.finer("out = |" + aLine + "|");
					out.println(aLine);
					pleaseWrite = false;
					writeTheCopyContent(out);
				} else if (src.getLineNumber() == this.getEndLine()) {
					// last line of a multi-line COPY statement
					TestIntegration.LOGGER.finer("last line of a multi-line COPY statement");
					int startPosn = 7;
					String aLine = inLine.substring(0, startPosn - 1);
					for (int i = startPosn; i <= this.endPosn + 1; i++) {
						aLine = aLine.concat(" ");
						TestIntegration.LOGGER.finer("i = " + i);
						TestIntegration.LOGGER.finer("aLine = |" + aLine + "|");
					} 
					aLine = aLine.concat(inLine.substring(this.endPosn + 1));
					TestIntegration.LOGGER.finer("startPosn = " + startPosn);
					TestIntegration.LOGGER.finer("endPosn   = " + this.endPosn);
					TestIntegration.LOGGER.finer("in  = |" + inLine + "|");
					TestIntegration.LOGGER.finer("out = |" + aLine + "|");
					out.println(aLine);
					pleaseWrite = false;
					return;
				}
			if (pleaseWrite) {
				TestIntegration.LOGGER.finer("out = |" + inLine + "|");
				out.println(inLine);
			}
			inLine = src.readLine();
		}

	}

	public void writeTheCopyContent(
							PrintWriter out)
						throws IOException {

		TestIntegration.LOGGER.fine("writeTheCopyContent");
		String copyFileFull = null;
		String copyFile = this.getCopyFile();

		for (String path: TestIntegration.CLI.copyPaths) {
			File aFile = new File(path + "/" + copyFile);
			if (aFile.exists()) {
				copyFileFull = path + "/" + copyFile;
				break;
			}
		}

		if (copyFileFull == null) {
			TestIntegration.LOGGER.warning(copyFile + " not found in any path specified");
			//throw new FileNotFoundException(copyFile + " not found in any path specified");
		} else {
			List<String> list = 
				Files.readAllLines(Paths.get(copyFileFull));
			for (String line: list) out.println(this.applyReplacingPhrases(line));
		}
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
		if (this.replaceable != null) return this.replaceable;

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

		this.replaceable = replaceable;
		return replaceable;
	}

	public String getReplacement(CobolPreprocessorParser.ReplaceClauseContext rcc) {
		if (this.replacement != null) return this.replacement;

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

		this.replacement = replacement;
		return replacement;
	}

	public String newLineWithReplacingApplied(String replaceable
							, String replacement
							, String aLine) {

		TestIntegration.LOGGER.finer(
			this.myName
			+ " newLineWithReplacingApplied(|"
			+ replaceable
			+ "|, |"
			+ replacement
			+ "|, |"
			+ aLine
			+ "|");
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
