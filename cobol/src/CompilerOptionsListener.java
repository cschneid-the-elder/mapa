
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerOptionsListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<CompilerOptionsWrapper> compilerOpts = null;

	public CompilerOptionsListener(
			ArrayList<CompilerOptionsWrapper> compilerOpts
			) {
		super();
		this.compilerOpts = compilerOpts;
	}

	public void enterCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx) { 
		this.compilerOpts.add(new CompilerOptionsWrapper(ctx));
	}

}
