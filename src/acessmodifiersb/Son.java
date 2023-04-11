package acessmodifiersb;

import acessmodifiersa.Mother;

public class Son extends Mother {
	
	public static void main(String[] args) {
		
		Mother obj = new Mother();
		System.out.println(obj.c);
		
		Son objc = new Son();
		System.out.println(objc.c);
		System.out.println(objc.d);
		
	}

}
