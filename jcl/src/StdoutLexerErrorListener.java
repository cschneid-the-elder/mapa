import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class StdoutLexerErrorListener extends BaseErrorListener {

	@Override
	public void syntaxError(
				Recognizer<?,?> recognizer
				, Object offendingSymbol
				, int line
				, int charPositionInLine
				, String msg
				, RecognitionException e) {

		System.out.println(
				"Lexer error line "
				+ line
				+ ":"
				+ charPositionInLine
				+ " at "
				+ offendingSymbol
				+ ": "
				+ msg
				);
	}

}
