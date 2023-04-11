package sripriya;

public class LocalVariablePractice {
			
	public  int sub ()
	{
		int a = 20;
		int b = 30;
	int c = b-a;
		return c;
	}
	
	public void add ()
	{
		int a = 20;
		int b = 30;
	    int c = b+a;
	    System.out.println("Local Variable addition within a method"+c);
	}
	
	public static int mul(int a,int b)
	{
	
		
        int c = a*b;
	return c;	
	}
public static void main(String[] args) {
		
		int a;
		a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Result is : " +c);
	 LocalVariablePractice obj = new LocalVariablePractice (); 
	 
	 obj.add();
	 
	 //System.out.println("subtraction method: "+obj.sub());
	 
	 System.out.println("Calling static method using Class : "+LocalVariablePractice.mul(10, 20));
	 System.out.println("Calling static method using object : " +obj.mul(10, 10));
	
	 System.out.println("Calling Non static method using Object : "+obj.sub());
	 
	// int d = LocalVariablePractice.mul();
	// System.out.println( d);
	 
		
	}
}
