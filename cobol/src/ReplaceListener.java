
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ReplaceListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<ReplaceStatementContextWrapper> replaces = null;
	public String callingModuleName = null;

	public ReplaceListener(
			ArrayList<ReplaceStatementContextWrapper> replaces
			) {
		super();
		this.replaces = replaces;
	}

	@Override public void enterReplaceByStatement(CobolPreprocessorParser.ReplaceByStatementContext ctx) { 
		this.replaces.add(new ReplaceStatementContextWrapper(ctx));
	}

	@Override public void enterReplaceOffStatement(CobolPreprocessorParser.ReplaceOffStatementContext ctx) { 
		this.replaces.add(new ReplaceStatementContextWrapper(ctx));
	}

}
