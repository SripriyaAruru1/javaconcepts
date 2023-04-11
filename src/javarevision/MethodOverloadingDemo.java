package javarevision;

public class MethodOverloadingDemo {
	
//	MethodOverloadingDemo()
//	{
//		System.out.println("constructor without parameters");
//	}
//	MethodOverloadingDemo(int a)
//	{
//		System.out.println("constructor with parameters value : " +a);
//	}
	
	static void add()
	{
		int a =10;int b =20;
		int c = a+b;
		System.out.println("Add without parameters method : "+c);
	}
	
	static void add(int a,int b)
	{
		
		int c = a+b;
		System.out.println("Add with parameters method : "+c);
	}
	
	public static void main(String[] args) {
//		new MethodOverloadingDemo();
//		new MethodOverloadingDemo(30);
		  MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.add();
		obj.add(20, 30);
		
		
	}

}
