package grammar.symbol;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * Seite 44
 * */
public class NameList {
	//name -> spix
	private HashMap<String, Integer> m_nameIndices;
	//spix -> name
	private ArrayList<String> m_names;
	
	public NameList() {
		m_nameIndices = new HashMap<String, Integer>();
		m_names = new ArrayList<String>();
	}
	
	public int add(String name) {
		if (m_nameIndices.containsKey(name)) {
			throw new IllegalArgumentException();
		}
		
		m_names.add(name);
		int spix = m_names.size() - 1;
		m_nameIndices.put(name, spix);
		return spix;
	}
	
	public String nameOf(int spix){
		return m_names.get(spix);
	}
	
	public int spixOf(String name){
		return m_nameIndices.get(name);
	}
}
