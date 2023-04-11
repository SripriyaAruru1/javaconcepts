package forloop;

public class ForLoopDemo {

	public static void main(String[] args) {
		
for (int i=1; i<=5; i++)
{
	System.out.println(i + "  Hello World");
}
	
System.out.println("____________ i = 5________");

		for (int i = 5;i>=0;i--)
		{
			for (int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("____________Reverse triangle________");
		
		for (int i =1;i<=5;i++)
		{
			for(int j = 5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("_________i = 0________");
		for (int i = 0;i<=5;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("_________Number in triangle j________");
		
		for (int i = 1;i<=5;i++)
		{
			for (int j =1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
System.out.println("_________ Reverse Number in triangle j________");
		
		for (int i = 5;i>=1;i--)
		{
			for (int j =1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
System.out.println("_________Number in triangle i ________");
		
		for (int i = 1;i<=5;i++)
		{
			for (int j =1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
System.out.println("_________ Reverse Number in triangle i ________");
		
		for (int i = 5;i>=1;i--)
		{
			for (int j =1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
System.out.println("_________Number in reverse triangle  with j ________");
		
		for (int i = 1;i<=5;i++)
		{
			for (int j =5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
System.out.println("_________Number in triangle  starts with 5 j ________");
		
		for (int i = 5;i>=1;i--)
		{
			for (int j =5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
System.out.println("_________Number in reverse triangle  with i ________");
		
		for (int i = 1;i<=5;i++)
		{
			for (int j =5;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
