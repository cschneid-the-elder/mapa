
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class CompilerOptionsListener extends CobolPreprocessorParserBaseListener {
	public ArrayList<CompilerOptionsWrapper> compilerOpts = null;
	public ArrayList<CompOptDefine> defines = null;

	public CompilerOptionsListener(
			ArrayList<CompilerOptionsWrapper> compilerOpts
			, ArrayList<CompOptDefine> defines
			) {
		super();
		this.compilerOpts = compilerOpts;
		this.defines = defines;
	}

	public void enterCompilerOptions(CobolPreprocessorParser.CompilerOptionsContext ctx) { 
		this.compilerOpts.add(new CompilerOptionsWrapper(ctx));
	}

	public void enterDefine_opt(CobolPreprocessorParser.Define_optContext ctx) {
		this.defines.add(new CompOptDefine(ctx));
	}

}
