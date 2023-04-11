package setcollection;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetToListWithLinkedHashSet {

	public static void main(String[] args) {
	
		Set<String> hs = new LinkedHashSet<String>();
		 hs.add("APPLE");
		 hs.add("Pine APPLE");
		 hs.add("APPLE");
		 hs.add("ORANGE");
		 hs.add("ORANGE");
		 hs.add("FIG");
		
		 System.out.println(hs);
		 ArrayList<String> al = new ArrayList<String>(hs);
		System.out.println(al.get(2)); 
		

	}

}
