package sripriya;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		//To print multiplication of first 5 numbers

		System.out.println("Enter the Number : ");
		Scanner scan = new Scanner(System.in);
		//int num = scan.nextInt();

		int res = 1;
		for (int i = 1; i <= scan.nextInt() ;i++)
			
		{
			res = res * i; 
			System.out.println("i val :"+i+" <=  Input value"+scan.nextInt());
			
		}
System.out.println(res);
	}

}
