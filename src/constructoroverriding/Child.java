package constructoroverriding;

public class Child extends Parent {
	
	 Child ()
	{
		System.out.println("Child constructor");
	}

	 Child (int a,int b )
	 
	 {
		 int c = a+b;
		 System.out.println(c);
		 
		 
	 }
	 
	public static void main(String[] args) {
		
	new Child ();
	
		

	}

}
