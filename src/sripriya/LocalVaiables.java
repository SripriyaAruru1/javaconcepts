package sripriya;

public class LocalVaiables {
	
	public static void calsub()
	{
		int a = 10;
		int b = 2;
	    int sub = a-b;
		System.out.println(sub);
		System.out.println("******************");
	}
	
	public int sub(int a,int b)
	{
		int s = a-b;
		return s;
	}
	
	public void div(int a)
	{
		int res = a/2;
		System.out.println("Division value is:  " +res);
		
	}

	public static void main(String[] args) {
		

		int a = 10;
		int b;
	b=20;
		int sum = a+b;
		System.out.println(sum);
		
		LocalVaiables obj = new LocalVaiables();
		obj.calsub();
		int  s = obj.sub(20, 10);
		System.out.println("Subtraction Value : "+s);
		obj.div(s);
		
		
		
		
	}

}
