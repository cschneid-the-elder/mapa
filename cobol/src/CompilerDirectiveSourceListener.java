
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerDirectiveSourceListener extends CobolPreprocessorParserBaseListener {
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public ArrayList<CompilerDirectiveSource> compilerDirectiveSourceStatements = new ArrayList<>();

	public CompilerDirectiveSourceListener(
			Logger LOGGER
			, TheCLI CLI) {
		super();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	@Override public void enterCompilerDirectiveSource(CobolPreprocessorParser.CompilerDirectiveSourceContext ctx) {
		CompilerDirectiveSource cds = new CompilerDirectiveSource(ctx, this.LOGGER, this.CLI);
		int cdsListSize = compilerDirectiveSourceStatements.size();
		
		if (cdsListSize > 0) {
			compilerDirectiveSourceStatements.get(cdsListSize -1).setLastLine(cds.getStartLine() - 1);
		}
		
		compilerDirectiveSourceStatements.add(cds);
	}

}

