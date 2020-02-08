
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class PPSetSymbolValueListener extends JCLPPParserBaseListener {

	public ArrayList<PPSetSymbolValue> sets = null;
	public String fileName = null;

	public PPSetSymbolValueListener(
			ArrayList<PPSetSymbolValue> sets
			, String fileName
			) {
		super();
		this.sets = sets;
		this.fileName = fileName;
	}

	@Override public void enterSetOperation(JCLPPParser.SetOperationContext ctx) { 
		this.sets.add(new PPSetSymbolValue(ctx));
	}

}
