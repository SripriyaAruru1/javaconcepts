package javarevision;

public class PatternNumbersForLoop {

	public static void main(String[] args) {
		
		
		for (int i = 1;i<=5;i++)
		{
			for (int j = 1;j<=i;j++)
			{
				System.out.print(j);
			}
				
		
		System.out.println();
	}

		System.out.println("________________________________");
		
		for (int i = 1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
System.out.println("________________________________");
		
		for (int m = 1;m<=5;m++)
		{
			for (int n=5;n>=m;n--)
			{
				System.out.print(n);
			}
			System.out.println();
		}
System.out.println("________________________________");
		
		for (int m = 1;m<=5;m++)
		{
			for (int n=5;n>=m;n--)
			{
				System.out.print(n);
			}
			System.out.println();
		}
}
	
	
}

