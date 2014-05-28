package code;

import code.fixup.Fixup;
import code.fixup.VarAddressFixup;
import code.fixup.VarOpcodeFixup;
import symbol.Symbol;
import justcc.ParseException;


public class CodeGenerator {

	private MethodCode curCode;

	public Descriptor getDescriptor(Symbol s) {
		return new Descriptor(s);
	}

	public void setCurrentCode(MethodCode code) {
		this.curCode = code;
	}

	public void load(Descriptor desc) throws ParseException {
		this.emit2(new VarOpcodeFixup(false, desc, this.curCode.getScope()),
				new VarAddressFixup(desc, this.curCode.getScope()));
	}

	public void save(Descriptor desc) throws ParseException {
		this.emit2(new VarOpcodeFixup(true, desc, this.curCode.getScope()),
				new VarAddressFixup(desc, this.curCode.getScope()));
	}

	public void emit(OpCode opCode) {
		this.curCode.addLine(new CodeLine(opCode, new Object[] {}));
	}

	public void emit2(OpCode opCode, Object op) {
		this.curCode.addLine(new CodeLine(opCode, new Object[] { op }));
	}

	public void emit2(OpCode opCode, Fixup op) throws ParseException {
		if (op.fix()) {
			this.emit2(opCode, op.getOp());
		} else {
			this.curCode.addLine(new CodeLine(opCode, new Object[] { op }));
		}
	}

	public void emit2(Fixup opCode, Fixup op) throws ParseException {
		if (opCode.fix()) {
			this.emit2((OpCode) opCode.getOp(), op);
		} else {
			this.curCode.addLine(new CodeLine(opCode, new Object[] { op }));
		}
	}
}
