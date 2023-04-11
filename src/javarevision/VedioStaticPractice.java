package javarevision;

public class VedioStaticPractice {
	
	static int a = 10;
	
	public static void Display()
	{
		System.out.println("print static Display method");
	}
	
	static
	{
		System.out.println("Static Block");
	}

	public static void main(String[] args) {
		System.out.println(a);
		 Display();
		 
		
		
		
	}

}
