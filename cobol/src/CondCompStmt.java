public interface CondCompStmt {

	public int getLine();

	public CondCompStmtType getType();

	enum CondCompStmtType {
			STMT_DEFINE
			, STMT_IF
			, STMT_ELSE
			, STMT_END_IF
			, STMT_EVALUATE
			, STMT_WHEN
			, STMT_END_EVALUATE
	}

}
