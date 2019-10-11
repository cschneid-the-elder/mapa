
import java.util.*;

public class KeywordValueWrapper {

	private String value = null;
	private int line = -1;
	private int posn = -1;

	public KeywordValueWrapper(String value, int line, int posn) {
		this.value = value;
		this.line = line;
		this.posn = posn;
	}

	public String getValue() {
		return this.value;
	}

	public int getLine() {
		return this.line;
	}

	public int getPosn() {
		return this.posn;
	}

	public long getSortKey() {
		return ((long)this.line * (long)Integer.MAX_VALUE) + this.posn;
	}
}
