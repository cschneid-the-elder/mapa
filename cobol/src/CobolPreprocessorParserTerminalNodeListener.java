
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CobolPreprocessorParserTerminalNodeListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<TerminalNode> tNodes = null;

	public CompilerDirectingStatementListener(
			ArrayList<TerminalNode> tNodes
			) {
		super();
		this.tNodes = tNodes;
	}

	@Override public void visitTerminal(TerminalNode node) {
		this.tNodes.add(node);
	}
}
