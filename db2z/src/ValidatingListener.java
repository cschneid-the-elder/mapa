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
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class ValidatingListener extends DB2zSQLParserBaseListener {

	public ValidatingListener() {
		super();
	}

	/**
	Syntax possibilities:
	
	DSSIZE 4G
	DSSIZE 4 G
	
	If an INTEGERLITERAL is present, it must be a power of 2.
	
	If an INTEGERLITERAL is not present, the SqlIdentifier must begin with an
	integer that is a power of 2.
	
	You can see the available methods for any parameter to a listener method by
	looking in the generated parser Java source.  In this case, do a find for
	"public static class DssizeOptionContext".
	
	The getText() method is very useful, and is inherted from ParserRuleContext.
	
	*/
	@Override public void enterDssizeOption(DB2zSQLParser.DssizeOptionContext ctx) {
		int dssizeInt = -1;
		
		if (ctx.sqlidentifier() == null) {
			/*
			This should never happen.  The parser should have either generated an
			error before we got here, or it should have attempted to match a different
			parser rule.
			
			I just don't feel right not checking for this condition, so here it is.  I
			really dislike null pointer exceptions.
			*/
			throw new ParseCancellationException("DSSIZE option is syntactically invalid");
		} else {
			String sqlident1 = ctx.sqlidentifier().getText();
			if (sqlident1.endsWith("G")) {
				if (ctx.INTEGERLITERAL() == null) {
					/*
					Since an INTEGERLITERAL is not present, the entire sqlidentifier must
					constitute the DSSIZE value.  First, we must strip off the trailing "G".
					*/
					String sqlident2 = sqlident1.substring(0, sqlident1.length() - 1);
					/*
					The rest of the sqlidentifier must be the numeric portion of the
					DSSIZE value.
					*/
					try {
						dssizeInt = Integer.parseInt(sqlident2.trim());
					} catch (NumberFormatException e) {
						throw new ParseCancellationException("DSSIZE contains illegal value " + sqlident2);
					}
				} else {
					try {
						dssizeInt = Integer.parseInt(ctx.INTEGERLITERAL().getText().trim());
					} catch (NumberFormatException e) {
						throw new ParseCancellationException("DSSIZE contains illegal value " + ctx.INTEGERLITERAL().getText().trim());
					}
				}
			} else {
				throw new ParseCancellationException("DSSIZE value must end with G");
			}
		}
		
		if ((dssizeInt & -dssizeInt) == dssizeInt) {
			/*
			The DSSIZE value is a power of 2 and all is right with the world.
			*/
		} else {
			throw new ParseCancellationException("DSSIZE value must be a power of 2, not " + dssizeInt);
		}
	}

}
