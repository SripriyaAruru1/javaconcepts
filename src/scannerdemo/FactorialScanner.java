package scannerdemo;

import java.util.Scanner;

public class FactorialScanner {

	public static void main(String[] args) {
		
		System.out.println("please enter the Number");
		Scanner Scan = new Scanner(System.in);
		int num = Scan.nextInt();
				
		int result = 1;
		for (int i = 1;i <=num;i ++)
			
		{
			result = result * i;
		
		}
		
		System.out.println(result);
		Scan.close();
	}
       
}
