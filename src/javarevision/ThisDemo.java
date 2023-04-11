package javarevision;

public class ThisDemo {
	// this keyword represent instance vaiables of current object/class
	int a = 10;
	
	 void add()
	{
		int a = 20;
		System.out.println("local variable: " +a);
		System.out.println("Instance variables : " +this.a);
	}

	public static void main(String[] args) {
		
		 ThisDemo obj = new ThisDemo();
		 obj.add();

	}

}
