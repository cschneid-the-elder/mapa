/*Copyright (C) 2019, 2020 Craig Schneiderwent.  All rights reserved.*/

import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This class is used to override the standard ANTLR error listener,
primarily to route error messages to System.out instead of
System.err in order to keep them separate from Java logging.
*/
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
