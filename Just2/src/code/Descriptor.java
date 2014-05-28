package code;

import symbol.Kind;
import symbol.Symbol;

public class Descriptor {
	private Kind kind;

	private Symbol symbol;

	public Descriptor(Symbol s) {
		this.kind = s.getKind();
		this.symbol = s;
	}

	public int getAddress() {
		return symbol.getAddress();
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public int getId() {
		return this.symbol.getId();
	}
}
