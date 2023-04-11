package arraysdemo;

public class Alphabets {

	public static void main(String[] args) {
	
		//another way of declaring array
		char[] ch = {'a','e','i','o','u'};
		
	//to know the size of array
		System.out.println(ch.length);
		
		System.out.println("*********************");
		
		//to know the values of array in advance for loop
		for (char c : ch) 
		{
		System.out.println(c);	
		}
		System.out.println("*********************");
		
		// double array
		
		double num[] = new double[5];
		num[0] = 10.33;
		num[1] = 12.33;
		num[2] = 14.33;
		num[3] = 15.33;
		num[4] = 19.33;
		System.out.println("Advance for loop  ");
		for (double d : num) 
		{
			System.out.println(d);
		}
		
		System.out.println("*********************");
		System.out.println(num.length);
		System.out.println("*********************");
		System.out.println("ordinary for loop  ");
		
		for(int i = 0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}

}
