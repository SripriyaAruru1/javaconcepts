package javarevision;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
	
		System.out.println("Enter Number: ");
		System.out.println("Enter Name: ");
		System.out.println("Enter double Value: ");
		System.out.println("Enter Boolean Value: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String name = sc.next();
		double d = sc.nextDouble();
	boolean  s = sc.nextBoolean();
	
	System.err.println("The number is : "+a);
	System.err.println("The Name is : "+name);
	System.err.println(" Double Value is : "+d);
	System.err.printf(" Boolean : "+s);
	
		
		
		

	}

	

}
