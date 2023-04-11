package javarevision;

public class ConstructorDemo {
	
//	int a;
//	String name;
//	boolean owner;
	
	ConstructorDemo(int a,String name)
	{
		System.out.println(a);
		System.out.println(name);
		
	}
	
	
	ConstructorDemo()
	{
		int a = 10;
		String name = new String("Sukumar");
		System.out.println(a+"   "+name);
		
	}
	  ConstructorDemo(int a,String name,boolean owner)
	
	{
		
		
		System.out.println(a+"      "+name+"    "+owner);
		
	}
	
	public static void main(String[] args) {
		  new ConstructorDemo();
		 new ConstructorDemo(200,"Sukumarachary");
		 new ConstructorDemo(100, "Sripriya",true);

		
	}



	}


