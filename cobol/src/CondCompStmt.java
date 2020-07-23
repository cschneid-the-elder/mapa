public interface CondCompStmt {

	public long getLine();

	public CondCompStmtType getType();

	enum CondCompStmtType {
			STMT_IF
			, STMT_WHEN
			, STMT_ELSE
			, STMT_END_IF
			, STMT_EVALUATE
			, STMT_END_EVALUATE
	}

}
