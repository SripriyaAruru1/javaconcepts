package scannerdemo;

import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the Number: ");
	Scanner Scan = new Scanner(System.in);
	int num  = Scan.nextInt();
	
	if (num%2 == 0)
	{
System.out.println("Given number is Even ");		

	}
else
	
{
	System.out.println("Given number is ODD Number");
}
	Scan.close();
	}
}