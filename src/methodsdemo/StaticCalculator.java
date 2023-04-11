package methodsdemo;

public class StaticCalculator {
	public static void main(String[] args) {
		
		StaticCalculator.calsum(20, 30);
		StaticCalculator.caldiff(40, 50);		
		StaticCalculator.caldivi(40, 3);
		StaticCalculator.calmodulus(40, 3);
		StaticCalculator.calmulti(5, 16);
	}
	
		
	public static void calsum(int num1,int num2)
	{
		int res = num1+num2;
		System.out.println("Total of given number is =  " +res);
	}
		public static void caldiff(int num1,int num2)
		{
			int res = num1-num2;
			System.out.println("Result of given number is =  " +res);
			
		}
			public static void caldivi(int num1,int num2)
			{
				int res = num1/num2;
				System.out.println("division of given number is =  " +res);
			}
				public static void calmulti(int num1,int num2)
				{
					int res = num1*num2;
					System.out.println("Multiplication of given number is =  " +res);
				}	
					public static void calmodulus(int num1,int num2)
					{
						int res = num1%num2;
						System.out.println("Modulus of given number is =  " +res);
			
					}
	}


