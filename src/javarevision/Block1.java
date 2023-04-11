package javarevision;

public class Block1 {
	
	int a = 10;
	int b = 40;
	static int num = 500;
	public void nonstatic() {
		
		int c = a+b;
		System.out.println("Global variable block: " +c);
		{
			int d = 30;
			System.out.println(" Local Blocke inside the global method  : "+d);
		}
		
	
		
	}
	static
	{
		System.out.println("Static Block: "+ num);
	}
	

	public static void main(String[] args) {
		
		new Block1().nonstatic(); 
		new MultipleStaticvariablesinClass().nonstatic("Sri",100);
		 MultipleStaticvariablesinClass.addclass("SUKUS");
		
		MultipleStaticvariablesinClass obj = new MultipleStaticvariablesinClass();
		obj.addclass("Sripriya");
		
		MultipleStaticvariablesinClass.addclass("Preetu");
		
	}

}
