package javarevision;

import java.util.Scanner;

public class ScannerDemo1 {
			
	public static void main(String[] args) {
		
		System.out.println("Enter Number : ");
		Scanner s = new Scanner(System.in);
		
		
int n = s.nextInt();
		
		if (n%2 == 0)
		{
			System.out.println("Given number is Even ");
		}
		else
		{
			System.out.println("Given number is Odd");
		}
		s.close();
	}

}
