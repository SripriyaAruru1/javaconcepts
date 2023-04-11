package javarevision;

public class MethodoverLoading {

	public static void add()
	{
		int a = 10;
		int b = 20;
		int c = a +b;
		System.out.println("With out parameter with static method : " +c);
	}
	
	public int add(int a,int b)
	{
		int c = a+b;
		//System.out.println("Answer wwith return type" +c);
		return c;
	}
	
	
	public static void main(String[] args) {
		
		 add();
		 int returnVal = new MethodoverLoading().add(40, 50);
		 System.out.println(returnVal);
		
	}

}
