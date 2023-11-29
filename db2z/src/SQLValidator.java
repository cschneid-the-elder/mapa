
/*Copyright (C) 2023 Craig Schneiderwent.  All rights reserved.*/

/*
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import java.util.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
This isn't very elegant, but it is intended to show how to perform validation
that may be more complex than allowed in an ANTLR parser.
*/
public class SQLValidator {

	public static String inputFileName = null;
	
	public static void main(String[] args) throws Exception {

		inputFileName = args[0];
				
		CharStream cs = CharStreams.fromFileName(inputFileName);  //load the file

		System.out.println("lexing " + inputFileName);
		DB2zSQLLexer lexer = new DB2zSQLLexer(cs);  //instantiate a lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens

		System.out.println("parsing " + inputFileName);
		DB2zSQLParser parser = new DB2zSQLParser(tokens);  //parse the tokens	

		ParseTree tree = null;
		try {
			tree = parser.startRule(); // parse the content and get the tree
		} catch(Exception e) {
			System.out.println("Parser error " + e);
			System.exit(12);
		}
		
		ParseTreeWalker walker = new ParseTreeWalker();

		ArrayList<String> errorMessages = new ArrayList<>();
		ArrayList<String> warningMessages = new ArrayList<>();
		ArrayList<String> informationMessages = new ArrayList<>();
		/*
		This listener validates the DSSIZE value, accumulating errors in
		the passed ArrayList.
		*/
		ValidatingListener listener = 
			new ValidatingListener(errorMessages
								, warningMessages
								, informationMessages);
	
		System.out.println("walking parse tree with " + listener.getClass().getName());
	
		try {
			walker.walk(listener, tree);
		} catch(Exception e) {
			System.out.println(listener.getClass().getName() + " error " + e);
			System.exit(12);
		}

		for (String errMsg: errorMessages) {
			System.out.println(errMsg);
		}

		for (String errMsg: warningMessages) {
			System.out.println(errMsg);
		}

		for (String errMsg: informationMessages) {
			System.out.println(errMsg);
		}

	}
}
