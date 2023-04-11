package arraysdemo;

public class Numbers {

	public static void main(String[] args) {
		int num[] = new int[5];
		num [0] = 10;
		num [1] = 20;
		num [2] = 30;
		num [3] = 90;
		num [4] = 40;
		
		
		System.out.println(num[4]);
		System.out.println("*********************");
		//--system.out.println(num[5]);
		// throws error -arrayindexoutof bound-
	
		System.out.println("regular for loop");
		
		int size = num.length;
		for (int i = 0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		System.out.println("Advance for Loop ");
		for (int i : num)
		{
			System.out.println(i);
		}
		
		System.out.println("reverse for loop");
		
	
		for (int i = size-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}

}
