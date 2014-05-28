package grammar.codegen;

import java.util.LinkedList;
import grammar.codegen.fixup.FixUp;

public class Code {
	public LinkedList<Statement> m_statements;

	public void generate() {
	}

	public void add(Opcode opcode) {
	}

	public void add(Opcode opcode, int adr) {
	}

	public void add(Opcode opcode, Label fLabel) {
	}

	public FixUp createLabelFixUp() {
	}

	public FixUp createMethodRefFixUp() {
	}

	public FixUp createFieldRefFixUp() {
	}

	public FixUp createMethodRetValueFixUp() {
	}
}
