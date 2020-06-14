import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class StdoutParserErrorListener extends BaseErrorListener {

	@Override
	public void syntaxError(
				Recognizer<?,?> recognizer
				, Object offendingSymbol
				, int line
				, int charPositionInLine
				, String msg
				, RecognitionException e) {

		System.out.println(
				"Parser error line "
				+ line
				+ ":"
				+ charPositionInLine
				+ " "
				+ msg
				);

		List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		System.out.println("Parser rule stack: " + stack);
	}

}
