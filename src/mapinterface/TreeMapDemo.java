package mapinterface;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		 Map<Integer, String> hm = new TreeMap<Integer, String>();
		 hm.put(1001,"Sri");
		 hm.put(100,"Sri");
		 hm.put(1020,"SriPriya");
		 hm.put(103,"Sri");
		 hm.put(100,"Sri");
		 hm.put(104,"Sri");
		 hm.put(105,"Sri");
		 hm.put(1016,"Sri");
		 System.out.println(hm);
		 System.out.println("***************");
		 System.out.println(hm.size());
		 System.out.println("***************");
		 System.out.println(hm.get(1020));
}
	
	
	
}