package sripriya;

public class LocalVariables2 {

	public static int  mul()
	{
		int a = 10;
				int b = 20;
				int c = a*b;
				return c;
						
									
	}
	public int mul(int a, int b)
	{
		int res = a%b;
		return res;
	}
	
	public static void main(String[] args) {
		
		LocalVariables2 obj = new LocalVariables2();
		int c = obj.mul();
		       int res = obj.mul(c,7) ;  
		       System.out.println("MUltiplication value :" +c);
		System.out.println("*********************");
	

	System.out.println("Modulus Remainder: "+res);

	}

}
