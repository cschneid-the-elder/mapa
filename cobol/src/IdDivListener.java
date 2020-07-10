
import java.util.*;
import java.util.logging.Logger;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class IdDivListener extends CobolPreprocessorParserBaseListener {
	public Boolean idDivFound = false;

	@Override public void enterEveryRule(ParserRuleContext ctx) {  //see CobolBaseListener for allowed functions
		//TestIntegration.LOGGER.finest("enterEveryRule: " + ctx.getClass().getName() + " @line " + ctx.start.getLine() + ": " + ctx.getText());      //code that executes per rule
	}

	@Override public void enterIdentificationDivisionTag(CobolPreprocessorParser.IdentificationDivisionTagContext ctx) { 
		this.idDivFound = true;
	}

}
