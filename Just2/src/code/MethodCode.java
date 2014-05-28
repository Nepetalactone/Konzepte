package code;

import java.util.LinkedList;

import symbol.Scope;

public class MethodCode {
	private LinkedList<CodeLine> lines = new LinkedList<>();

	private Scope scope;

	public MethodCode(Scope scope) {
		this.scope = scope;
	}

	public Scope getScope() {
		return scope;
	}

	public void addLine(CodeLine line) {
		this.lines.add(line);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();

		builder.append('\n');
		for (CodeLine line : this.lines) {
			builder.append(line.toString());
		}

		if (!lines.peekLast().isReturn()) {
			builder.append(OpCode.RETURN);
			builder.append('\n');
		}

		return builder.toString();
	}

}
