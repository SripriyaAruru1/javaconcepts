package mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		 Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
		 hm.put(1001,"Sri");
		 hm.put(100,"Sri");
		 hm.put(1020,"Sri");
		 hm.put(103,"Sri");
		 hm.put(100,"Sri");
		 hm.put(104,"Sri");
		 hm.put(105,"Sri");
		 hm.put(1016,"Sri");
		 System.out.println(hm);
		 
}
	
	
	
}