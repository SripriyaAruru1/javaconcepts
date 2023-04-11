package javarevision;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		  
		        int a;  
		        int b;      
		        Scanner obj=new Scanner(System.in);  
		        System.out.println("Enter first value");  
		        a=obj.nextInt();  
		        System.out.println("Enter second value");  
		        b=obj.nextInt();  
		        int c = a + b;  
		       System.err.printf("First value  %d Second value  %d Addition is: %d.", a,b, c); 
		    

	}

}
