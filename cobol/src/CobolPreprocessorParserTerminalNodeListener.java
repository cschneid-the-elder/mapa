
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CobolPreprocessorParserTerminalNodeListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<TerminalNodeWrapper> tNodes = null;

	public CobolPreprocessorParserTerminalNodeListener(
			ArrayList<TerminalNodeWrapper> tNodes
			) {
		super();
		this.tNodes = tNodes;
	}

	@Override public void visitTerminal(TerminalNode node) {
		if (node.getSymbol().getType() != Token.EOF) {
			this.tNodes.add(new TerminalNodeWrapper(node));
		}
	}
}


