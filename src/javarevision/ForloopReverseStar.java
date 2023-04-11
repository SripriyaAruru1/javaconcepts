package javarevision;

public class ForloopReverseStar {

	public static void main(String[] args) {
		
		for (int a = 0;a<=5;a++)
	{
			
			for (int b=0;b<=a;b++)
		{
				System.out.print("*");
			}
			System.out.println();
			
	}
		
		System.out.println("__________________________________");
		
		for (int i = 1;i<=5;i++)
		{
			
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
		System.out.println();
							
		}
		System.out.println("__________________________________");
		for (int a = 1;a<=5;a++)
		{
			for (int j = 1;j<=a;j++)
			{
				System.out.print("*");
			}
System.out.println();
		}
		System.out.println("__________________________________");
		
		for (int k = 1;k<=5;k++)
		{
			for (int l = 5;l>=k;l--)
			{
				System.out.print("*");
		     }
			System.out.println();
			
		
							
		}
		
		
	}
}



