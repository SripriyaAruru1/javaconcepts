package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	///Generics in collection used for type safety of collection objects

	public static void main(String[] args) {
		 List<String> al = new LinkedList<String>();
		 al.add("JAVA");
		 al.add("SRI");
		 al.add("SELENIUM");
		 al.add("METRIXS");
		 al.add("COBOL");
		 al.add("SRI");
		 al.add("PYTHON");
		 al.add("SHARK");
		 al.add("Jenkins");
		 al.add("GIT");
		 al.add("cucumber");
		 al.add("cucumber");
		 
		 System.out.println(al.get(6));
		 al.add("APPIUM");
		 
		 System.out.println("***********");
		 for (String values : al) 
		 {
			
			System.out.println(values);
		}
		
		
	}

}
