import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.concurrent.CopyOnWriteArrayList;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

abstract class CopyReplaceParent {
	
	public static StringBuilder createStringBuilderFromTerminalNodeWrappers(
		CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes
		) {

		long prevLine = -1;
		int prevTextLength = -1;
		long prevPosn = -1;
		TerminalNodeWrapper prevToken = null;
		StringBuilder outLine = new StringBuilder();

		for (TerminalNodeWrapper token: sourceNodes) {
			TestIntegration.LOGGER.finest(" token = " + token);
			TestIntegration.LOGGER.finest(" prevLine = " + prevLine);
			TestIntegration.LOGGER.finest(" prevPosn = " + prevPosn);
			TestIntegration.LOGGER.finest(" prevTextLength = " + prevTextLength);
			long clonedPosn = token.getClonedPosn();
			if (token.isPrecededByNewline() || token.isFirst()) {
				TestIntegration.LOGGER.finest(" token.isPrecededByNewline() == true || token.isFirst() == true");
				if (token.getClonedPosn() == -1) {
					outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
				} else {
					outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + token.getClonedPosn()));
				}
			} else if (token.getClonedLine() == prevLine) {
				TestIntegration.LOGGER.finest(" token.getClonedLine() == prevLine ws = " + token.isPrecededByWhitespace());
				if (token.isPrecededByWhitespace()) {
					outLine.append(" ");
					long extraPadding = 0;
					if (token.getClonedPosn() == -1) {
						extraPadding = token.getPosn() - (prevPosn + prevTextLength);
					} else {
						extraPadding = token.getClonedPosn() - (prevPosn + prevTextLength);
					}
					outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + extraPadding));
				} else {
					outLine.append(token.getText());
				}
			} else if (token.getClonedLine() == -1) {
				TestIntegration.LOGGER.finest(" token.getClonedLine() == -1");
				if (prevToken != null && prevToken.getClonedLine() != -1) {
					if (token.isPrecededByWhitespace()) {
						outLine.append(" ");
					}
				}
				long extraPadding = 0;
				if (prevToken.isNewline()) {
					extraPadding = token.getPosn();
				} else {
					extraPadding = token.getPosn() - (prevPosn + prevTextLength);
				}
				outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + extraPadding));
			} else {
				TestIntegration.LOGGER.finest(" else");
				outLine.append(TestIntegration.CLI.padLeft(token.getText(), token.getTextLength() + token.getPosn()));
			}
			if (token.getClonedLine() == -1) {
				prevLine = token.getLine();
				prevPosn = token.getPosn();
			} else {
				prevLine = token.getClonedLine();
				prevPosn = token.getClonedPosn();
			}
			prevTextLength = token.getTextLength();
			prevToken = token;
		}

		return outLine;
	}

	public ArrayList<TerminalNodeWrapper> subListTerminalNodeWrapper(
			CopyOnWriteArrayList<TerminalNodeWrapper> tnwList
			, int from
			, int size
			) {
		ArrayList<TerminalNodeWrapper> newList = new ArrayList<>();
		int i = from;
		int j = 0;

		while (i < tnwList.size() && j < size) {
			if (!tnwList.get(i).isNewline()) {
				newList.add(tnwList.get(i));
				j++;
			}
			i++;
		}

		return newList;
	} 

	public ArrayList<TerminalNodeWrapper> cloneTerminalNodeWrapperList(
				ArrayList<TerminalNodeWrapper> source
				, ArrayList<TerminalNodeWrapper> fudge) {
		ArrayList<TerminalNodeWrapper> newList = new ArrayList<>();
		int i = 0;
		long clonedLine = -1;
		long clonedPosn = -1;
		TerminalNodeWrapper prevTNW = null;

		for (TerminalNodeWrapper tnw: source) {
			Boolean precededByNewline = false;
			Boolean precededByWhitespace = false;
			if (i < fudge.size()) {
				clonedLine = fudge.get(i).getLine();
				clonedPosn = fudge.get(i).getPosn();
				precededByNewline = fudge.get(i).isPrecededByNewline();
			} else {
				clonedPosn = clonedPosn + tnw.getTextLength();
			}
			if (i == 0) {
				precededByWhitespace = fudge.get(i).isPrecededByWhitespace();
			} else {
				precededByWhitespace = tnw.isPrecededByWhitespace();
			}
			TerminalNodeWrapper newNode = 
				new TerminalNodeWrapper(
					tnw
					, clonedLine
					, clonedPosn
					, precededByNewline
					, precededByWhitespace);
			newList.add(newNode);
			i++;
			prevTNW = tnw;
		}

		return newList;
	}

	public void applyReplacingPhrase(
			CopyOnWriteArrayList<TerminalNodeWrapper> sourceNodes
			, ArrayList<ArrayList<TerminalNodeWrapper>> replaceable
			, ArrayList<ArrayList<TerminalNodeWrapper>> replacement
			, Boolean adjustmentNeeded
			, int thisEndLine
			, int thisStopLine
			) {
		TestIntegration.LOGGER.fine("applyReplacingPhrase() ");
		TestIntegration.LOGGER.finest(" replaceable = " + replaceable);
		TestIntegration.LOGGER.finest(" replacement = " + replacement);
		TestIntegration.LOGGER.finest(" adjustmentNeeded = " + adjustmentNeeded);
		TestIntegration.LOGGER.finest(" thisEndLine = " + thisEndLine);
		TestIntegration.LOGGER.finest(" thisStopLine = " + thisStopLine);

		int matchedIndex = 0;

		for (ArrayList<TerminalNodeWrapper> matchList1: replaceable) {
			ArrayList<TerminalNodeWrapper> matchList = new ArrayList<>(matchList1);
			ArrayList<TerminalNodeWrapper> toRemove = new ArrayList<>();
			for (TerminalNodeWrapper tnw: matchList) {
				if (tnw.isNewline()) toRemove.add(tnw);
			}
			matchList.removeAll(toRemove);
			TestIntegration.LOGGER.finest(" matchList = " + matchList);
			matchedIndex = replaceable.indexOf(matchList1);
			int from = 0;
			int to = -1;
			if (adjustmentNeeded) {
				for (TerminalNodeWrapper sourceNode: sourceNodes) {
					if (sourceNode.getLine() > thisEndLine) break;
					from++;
				}
			}
			matchLoop:
			while (from < sourceNodes.size() && sourceNodes.get(from).getLine() < thisStopLine) {
				TestIntegration.LOGGER.finest(" while (" + from + " < " + sourceNodes.size() + " && " + sourceNodes.get(from).getLine() + " < " + thisStopLine + ")");
				Boolean matched = false;
				ArrayList<TerminalNodeWrapper> subList = null;
				if (sourceNodes.size() - from >= matchList.size()) {
					TestIntegration.LOGGER.finest(" sourceNodes.size() |" + sourceNodes.size() + "| - from |" + from + "| >= matchList.size() |" + matchList.size() + "|");
					to = from + matchList.size();
					int i = 0;
					subList = this.subListTerminalNodeWrapper(sourceNodes, from, matchList.size());
					TestIntegration.LOGGER.finest(" subList = " + subList);
					if (subList.size() == matchList.size()) {
						TestIntegration.LOGGER.finest(" subList.size() |" + subList.size() + "| == matchList.size() |" + matchList.size() + "|");
						matched = true;
						for (TerminalNodeWrapper sourceNode: subList) {
							TestIntegration.LOGGER.finest(" sourceNode = |" + sourceNode + "|");
							if (!matchList.get(i).textIsEqual(sourceNode)) {
								TestIntegration.LOGGER.finest(" !matchList.get(" + i + ").textIsEqual(sourceNode) i.e. |" + matchList.get(i) + "| != |" + sourceNode + "|");
								matched = false;
								break;
							}
							i++;
						}
					} else {
						TestIntegration.LOGGER.finest(" subList.size() |" + subList.size() + "| != matchList.size() |" + matchList.size() + "|");
						matched = false;
					}
				}
				TestIntegration.LOGGER.finest(" matched = " + matched);
				if (matched) {
					if (matchList.get(0).isDelimited()) {
						subList.get(0).alterText(matchList.get(0), replacement.get(matchedIndex).get(0));
					} else {
						sourceNodes.removeAll(subList);
						//TestIntegration.LOGGER.finest(" sourceNodes after removeAll = " + sourceNodes);
						sourceNodes.addAll(from, this.cloneTerminalNodeWrapperList(replacement.get(matchedIndex), subList));
						//TestIntegration.LOGGER.finest(" sourceNodes after addAll    = " + sourceNodes);
					}
					from = from + replacement.get(matchedIndex).size();
				} else {
					from++;
				}
			}
		}
	}

}

