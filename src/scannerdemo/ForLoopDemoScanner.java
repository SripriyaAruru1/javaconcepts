package scannerdemo;

import java.util.Scanner;

public class ForLoopDemoScanner {

	public static void main(String[] args) {
		System.out.println("Please enter the number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		
				
for (int i=1; i<=num; i++)
{
	System.out.println(i + "  Hello World");
	
	scan.close();
}

	}

}
