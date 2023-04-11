package javarevision;

public class InterviewCode {
		
	
	public static void main(String[] args) {
		
		System.out.println("Pattern");
	for (int i = 1;i<=5;i++)
		
	{
		for (int j=1;j<=i;j++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	
	
	System.out.println("Reverse String");
	String s = "Madam";
	int a = s.length();
	String rev = "";
	for (int i=a-1;i>=0;i--)
	{
		 rev=rev+s.charAt(i);
		
	}
	System.out.println(rev);
	
	System.out.println("Traingle format of alphbaets");
	
	for(char a1 ='A';a1<='F';a1++)
	{
		for (char b = 'A';b<=a1;b++)
		{
			System.out.print(b+" ");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	}
	
	
	

}
