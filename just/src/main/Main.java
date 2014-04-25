package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;




import javacc.JUST;
import javacc.ParseException;
import javacc.tools.Scope;
import javacc.tools.SymbolTable;


public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File testFile = null;
		JUST parser = null;
		InputStream stream = null;
		File testFolder = new File("test");
		
		try {
			File[] files = testFolder.listFiles();
			
			for(int i = 0; i < files.length; i++) {
				System.out.println("Test case " + files[i].getName() + ":");
				if(files[i].isFile()) {
					testFile = files[i].getAbsoluteFile();
					stream = new FileInputStream(testFile);
				}
				if (parser == null) {
					parser = new JUST(stream);
				}
				JUST.ReInit(stream);
				JUST.Start().dump("");
				System.out.println("-> ok\n");
				SymbolTable.curScope = new Scope();
			}
		 } catch(SecurityException e) {
		 	System.out.println("Cant get the list of files: ");
		 	System.out.println(e.getMessage());
		 } catch(IOException e) {
		 	System.out.println(e.getMessage());
		 } catch (ParseException e) {
			System.out.println(e.getMessage());
		 }
	}
}
