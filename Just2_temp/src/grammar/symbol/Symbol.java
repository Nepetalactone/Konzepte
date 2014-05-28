package grammar.symbol;

/**
 * Seite 43
 * */
public class Symbol {
	public enum Kind {
		undefKind, 	constKind, varKind, parKind, funcKind
	};
	
	/*public enum Type {
		intType, boolType, voidType
	};*/
	
	public String m_name;
	public int spix; //Spelling index for name list
	public Kind kind;
	public Type type; //data type
	public boolean init; //is init? for vars only
	public int val; //for constants and initialized vars only
	public int adr; //for globals, params, consts and local vars
	
	//for functions only
	public boolean defined; //is func already defined
	public Symbol symbols; //params and loc vars
	public int level; //scope level
	public Symbol next; //linear list of symbols within a scope
}
