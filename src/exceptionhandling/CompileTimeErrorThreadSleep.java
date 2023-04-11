package exceptionhandling;

public class CompileTimeErrorThreadSleep {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("1");System.out.println("1");
		System.out.println("11");
    	System.out.println("111");
		System.out.println("1111");Thread.sleep(4000);
		
		System.out.println("11111");
		System.out.println("111111");
		System.out.println("1111111");
		System.out.println("11111111");
		System.out.println("111111111");
		
		
		
	}

}
