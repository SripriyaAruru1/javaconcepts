package listinterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		 ArrayList al = new ArrayList();
		 al.add(10);
		 al.add("SRI");
		 al.add(true);
		 al.add('F');
		 al.add(10);
		 al.add("SRI");
		 al.add(55.55);
		 al.add(53);
		 System.out.println(al);
		 System.out.println("****************");
		 System.out.println(al.size());
		 System.out.println("****************");
		 System.out.println("Retreving value through index : "  +al.get(0));
		 System.out.println("****************");
		 System.out.println("Removing  value through index : "  +al.remove(0));
		 System.out.println("****************");
		 System.out.println(al);
		 al.add(0, "Aruru");
		 System.out.println(al);
		for (Object values : al)
		{
			System.out.println(values);
		}
		
	}

}
