package setcollection;


import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		Set<String> hs = new LinkedHashSet<String>();
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
