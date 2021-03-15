public interface CompilerDirectingStatement {

	public int getLine();

	public int getEndLine();

	public CompilerDirectingStatementType getType();

	enum CompilerDirectingStatementType {
			STMT_COMPILE_OPTION
			, STMT_COPY
			, STMT_REPLACE
			, STMT_REPLACE_OFF
			, STMT_DEFINE
			, STMT_IF
			, STMT_ELSE
			, STMT_END_IF
			, STMT_EVALUATE
			, STMT_WHEN
			, STMT_END_EVALUATE
	}

}
