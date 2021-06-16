
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class BasisListener extends CobolPreprocessorParserBaseListener {
	private Logger LOGGER = null;
	private TheCLI CLI = null;
	public BasisStatement basisStatement = null;
	public ArrayList<InsertStatement> insertStatements = new ArrayList<>();
	public ArrayList<DeleteStatement> deleteStatements = new ArrayList<>();

	public BasisListener(
			Logger LOGGER
			, TheCLI CLI) {
		super();
		this.LOGGER = LOGGER;
		this.CLI = CLI;
	}

	public void enterCompilerDirectiveBasis(CobolPreprocessorParser.CompilerDirectiveBasisContext ctx) {
		if (this.basisStatement == null) {
			this.basisStatement = new BasisStatement(ctx, LOGGER, CLI);
		} else {
			this.LOGGER.warning("subsequent BASIS statement ignored");
		}
	}

	public void enterCompilerDirectiveInsert(CobolPreprocessorParser.CompilerDirectiveInsertContext ctx) {
		if (this.basisStatement == null) {
			this.LOGGER.warning("INSERT statement found with no extant BASIS statement");
		} else {
			this.basisStatement.addInsertStatement(new InsertStatement(ctx, LOGGER));
		}
	}

	public void enterCompilerDirectiveDelete(CobolPreprocessorParser.CompilerDirectiveDeleteContext ctx) {
		if (this.basisStatement == null) {
			this.LOGGER.warning("DELETE statement found with no extant BASIS statement");
		} else {
			this.basisStatement.addDeleteStatement(new DeleteStatement(ctx, LOGGER));
		}
	}

}
