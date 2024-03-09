
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
		compilerDirectiveSourceStatements.add(new CompilerDirectiveSource(ctx, this.LOGGER, this.CLI));
	}

}

