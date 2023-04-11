package b;

import a.A;

public class C extends A {
	
	public static void main(String[] args) {
		
		A obj = new A();
		System.out.println(obj.c);
		
		C objc = new C();
		System.out.println(objc.c);
		System.out.println(objc.d);
		
	}

}
