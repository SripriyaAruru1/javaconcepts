package sripriya;

public class ForLoop1 {

	public static void main(String[] args) {

for (int i = 1;i<=5;i++)
{
	System.out.println(i+ " HELLO INDIA");
	
}
// Reverse numbers
System.out.println("*************");
for (int i =10;i>=1;i--)
	
{
	

	System.out.println(i);
	
}

//Even numbers between 50 to 100
System.out.println("*************");
for (int i = 50; i<=100;i++)
{
	if ( i % 2 == 0)
	

{
	System.out.println(i);
}
	}
//Even numbers between 50 to 100 in reverse for loop 
System.out.println("*************");
for (int i = 100; i>=50;i--)
{
	if ( i % 2 == 0)
	

{
	System.out.println(i);
}
	}
//To print sum of first 5 numbers

System.out.println("*************");

int sum =0;
for (int i = 0; i<=5 ;i++)
	
{
	sum = sum + i; 
	System.out.println(sum);
}
//To print multiplication of first 5 numbers

System.out.println("*************");

int res = 1;
for (int i = 1; i <=5 ;i++)
	
{
	res = res * i; 
	
}
System.out.println(res);
//To print Number divisable by 3

System.out.println("*************");

for (int i = 1; i <=100 ;i++)
	
{
	if (i % 3 == 0 & i % 7 ==0) 
		System.out.println(i);

}	
}
}
