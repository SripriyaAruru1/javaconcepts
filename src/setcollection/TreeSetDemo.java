package setcollection;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	
		Set<String> hs = new TreeSet<String>();
		 hs.add("APPLE");
		 hs.add("Pine APPLE");
		 hs.add("APPLE");
		 hs.add("ORANGE");
		 hs.add("ORANGE");
		 hs.add("FIG");
		 hs.add("DATES");
		 hs.add("PEars");
		 hs.add("Banana");
		 System.out.println("HASH Notfollows the insersion order : " +hs);
		 System.out.println("*******************");
		 System.out.println("SIZE IS: " +hs.size());
		 System.out.println("*******************");
		for (String Fruits : hs) 
		{
		System.out.println(Fruits);	
		}
		

	}

}
