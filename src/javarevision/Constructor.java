package javarevision;

public class Constructor {
	int a ;
String name;
	
	
	Constructor ()
	{
		a = 10;
		name = "Sri";
		System.out.println(a+"   " +name);
				
	}
	
	Constructor ( int a,String name,boolean resident)
	
	{
		//int a = 10;
		//this.a = a;
		System.out.println(a+  "             "+name+  "  " +resident    );
	}
	

	public static void main(String[] args) {
		
		new Constructor ();
		new Constructor(100,"Priya",true );
		new Constructor(200,"Srisuku",true);
		

	}

}
