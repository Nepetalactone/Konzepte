package grammar.codegen;

import grammar.symbol.Symbol;


public class CodeGenerator {

	private Code m_curCode;
	public Symbol m_symbol;
	
	public CodeGenerator() {
		m_curCode = new Code();
	}
	
	public void generateClassFile(){
		// TODO Auto-generated method stub
	}
	
	public void load(Descriptor desc) {
		switch (desc.m_kind) {
		case descConst:
		emit2(Opcode.LDC_W, desc.m_adr);
		break;
		case descArg:
		emit2(Opcode.ILOAD, desc.m_adr);
		break;
		case descLocal:
		emit2(Opcode.ILOAD, desc.m_adr);
		break;
		case descField:
		emit2(Opcode.GETSTATIC, desc.m_adr);
		markFieldFixup(desc.m_symbol.m_name);
		break;
		case descStack:
		break;
		}
		desc.m_kind = DescKind.descStack;
		}

	private void markFieldFixup(String name) {
		// TODO Auto-generated method stub
		
	}


	public void emit1(Opcode opcode) {
		// TODO Auto-generated method stub
		
	}
	
	public void emit2(Opcode opcode, int adr) {
		// TODO Auto-generated method stub
		
	}
	

	public void emit2(Opcode opcode, Label fLabel) {
		// TODO Auto-generated method stub
		
	}

	public void falseJump(Descriptor desc) {
		desc.m_fLabel = createLabel();
		emit2(Opcode.IF_ICMPNE, desc.m_fLabel);
	}


	public void markByLabel(Label label) {
		add(Opcode.NOP);
		//label.m_statement = m_statements.getLast();
		label.m_statement = m_curCode.m_statements.getLast();
	}
	
	public Descriptor newDescriptor(Symbol symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	private void add(Opcode opcode) {
		// TODO Auto-generated method stub
		
	}

	public Label createLabel() {
		// TODO Auto-generated method stub
		return null;
	}

	public void jump(Label label) {
		// TODO Auto-generated method stub
		
	}
}
