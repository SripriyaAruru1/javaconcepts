package javarevision;

public class Constructor1 {
	
	int a;
	String name;
	
	Constructor1(){
		a = 10;
		name = "Sukumar";
		System.out.println(a+"   "+name);
		
	}
	 public static void Constructor3()
	
	{
		int a = 100;
		String name = "SRIPRIYA";
		boolean owner = true;
		
		System.out.println(a+"      "+name+"    "+owner);
		
	}
	
	public static void main(String[] args) {
		// Constructor1 c = new Constructor1();
		// Constructor1 d = new Constructor1(100, "SRI");
		 
//		 System.out.println(c.a);
//			System.out.println(c.name);
//			
//			
//			System.out.println(d.a);
//			System.out.println(d.name);
		new Constructor1();
		//Constructor1 b = new Constructor1();
Constructor3();
		
	}

}
