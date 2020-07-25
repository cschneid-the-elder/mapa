
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerOptionsListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<CompilerOptionsWrapper> compilerOpts = null;
	public ArrayList<CondCompVar> compOptDefines = null;

	public CompilerOptionsListener(
			ArrayList<CompilerOptionsWrapper> compilerOpts
			, ArrayList<CondCompVar> compOptDefines
			) {
		super();
		this.compilerOpts = compilerOpts;
		this.compOptDefines = compOptDefines;
	}

	public void enterCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx) { 
		this.compilerOpts.add(new CompilerOptionsWrapper(ctx));
	}

	public void enterDefine_opt(CobolPreprocessorParser.Define_optContext ctx) {
		this.compOptDefines.add(new CondCompVar(ctx));
	}

}
