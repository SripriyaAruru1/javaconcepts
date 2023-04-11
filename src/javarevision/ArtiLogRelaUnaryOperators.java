package javarevision;

public class ArtiLogRelaUnaryOperators {
	
	// +,-*,/,% Arthemetic 
	static int a = 10;
	static int b = 20;
	static int c = 20;
	static String d = "Sri";
	static String e = "Priya";
	public static void Arthemetic()
	{
		
		
		System.out.println("Addision Output: "   +(a+b));
		System.out.println("Subtraction Output is :"+(a-b));
		System.out.println("Multiplication Output: "   +a*b);
		System.out.println("Division Output is Quetiont : " +100/2);
		System.out.println("Modulus Output is remainder : "            +100%2);
		System.out.println("________________________"); 
		System.out.println(d+e);
	}
	// and '&',or'|',exor'^' --Logical Operators & Relationsl Operators >=,>,<,==,!=
	
	public static void Logical()
	{
		System.out.println( ((c==b) & (b==c) ));
		System.out.println( ((a!=b) | (a==b) ));
		System.out.println( ((a>b) ^ (b==c)));
		
		
	}
	// Unary operators Increment,decrement ++,--
	public static void Unary()
	{
		System.out.println("________________________"); 
		a++;
		b--;
//		++a;
//		--b;
		System.out.println(a);
		System.out.println(b);
//		System.out.println(a);
//		System.out.println(b);
//		
	}
	
	
	
	//
	public static void main(String[] args) {
		
		ArtiLogRelaUnaryOperators ar = new ArtiLogRelaUnaryOperators ();
		ar.Arthemetic();
		ar.Logical();
		ar.Unary();
		System.out.println("**********************");
		++a;
		--b;
		System.out.println(a);
		System.out.println(b);
		

	}

}
