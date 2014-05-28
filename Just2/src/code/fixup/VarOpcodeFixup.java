package code.fixup;

import symbol.Scope;
import symbol.Symbol;
import code.Descriptor;
import code.OpCode;
import justcc.ParseException;

public class VarOpcodeFixup extends Fixup {

	private boolean save;

	private Descriptor desc;

	private Scope scope;

	public VarOpcodeFixup(boolean save, Descriptor desc, Scope scope) {
		this.save = save;
		this.desc = desc;
		this.scope = scope;
	}

	@Override
	public boolean fix() throws ParseException {
		Symbol s = this.scope.lookup(this.desc.getId());
		if (s != null && s.getAddress() != -1) {
			switch (s.getKind()) {
			case paramKind:
				this.op = save ? OpCode.ISTORE : OpCode.ILOAD;
				break;
			case localKind:
				this.op = save ? OpCode.ISTORE : OpCode.ILOAD;
				break;
			case fieldKind:
				this.op = save ? OpCode.PUTSTATIC : OpCode.GETSTATIC;
				break;
			default:
			case stackKind:
				if (save) {
					return false;
				} else {
					this.op = "";
				}
				break;
			}

			return true;
		}
		return false;
	}

}
