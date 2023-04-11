package sripriya;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		System.out.println("Please enter the number : ");
	Scanner	 scan= new Scanner(System.in);
	int num=scan.nextInt();
	if (num % 2 == 0)
	{
		System.out.println("Given number is even number");
	}
	else
	{
		System.out.println("Given number is ODd number");
	}
	}

}
