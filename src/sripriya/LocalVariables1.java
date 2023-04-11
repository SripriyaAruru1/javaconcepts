package sripriya;

public class LocalVariables1 {

	public static void  mul()
	{
		int a = 10;
				int b = 20;
				int c = a*b;
						System.out.println("MUltiplication value :" +c);
									
	}
	public int modulus(int a, int b)
	{
		int c = a%b;
		return c;
	}
	
	public static void main(String[] args) {
		
		LocalVariables1 obj = new LocalVariables1();
		obj.mul();
		       int c = obj.modulus(10,5) ;   
		System.out.println("*********************");
	

	System.out.println("Modulus Remainder: "+c);

	}

}
