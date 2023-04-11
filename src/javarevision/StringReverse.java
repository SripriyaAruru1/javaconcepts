package javarevision;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
//		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Give the string name : " );
//		
//		int len1 = sc.next().length();
//		String rev1 = "";
//		
//		for (int i = len1-1;i>=0;i--)
//		{
//			rev1 = rev1+sc.next().charAt(i);
//		}
//		
//		System.out.println(" Reverse String is :" +rev1);
//		
			String name = "Sripriya";
			String rev = "";
			int len = name.length();
			
			for (int i = len-1;i>=0;i--)
			{
				rev = rev+name.charAt(i);
			}
			System.out.println(rev);
	}
	

}
