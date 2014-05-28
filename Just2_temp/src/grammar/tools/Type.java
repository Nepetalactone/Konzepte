package grammar.tools;
/**
 * Seite 45
 * */
public class Type {

	
	public enum Kind {
		undefKind, voidKind, boolKind, intKind, fieldKind
	};
	
		
	public Type(String string, Kind intType2) {
		this.name = string;
		m_spix = 0;//SymbolTable.curScope.namelist.add(name);
		m_kind = intType2;
	}
	
	public String name;	
	public Kind m_kind;
	public int m_spix;
	
	public static Type undefType = new Type("undef", Kind.undefKind);
	public static Type voidType = new Type("void", Kind.voidKind);
	public static Type boolType = new Type("boolean", Kind.boolKind);
	public static Type intType = new Type("int", Kind.intKind);
	public static Type fieldType = new Type("field", Kind.fieldKind);
}
