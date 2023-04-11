package methodsdemo;

public class NonStaticCalculator {
	
	public void calsum(int num1,int num2)
	{
		int res = num1+num2;
		System.out.println("Total of given number is =  " +res);
	}
		public  void caldiff(int num1,int num2)
		{
			int res = num1-num2;
		
			System.out.println("Result of given number is =  " +res);
			
		}
			public void caldivi(int num1,int num2)
			{
				int res = num1/num2;
				System.out.println("division of given number is =  " +res);
			}
				public  void calmulti(int num1,int num2)
				{
					int res = num1*num2;
					System.out.println("Multiplication of given number is =  " +res);
				}	
					public void calmodulus(int num1,int num2)
					{
						int res = num1%num2;
						System.out.println("Modulus of given number is =  " +res);
					}

					public static void main(String[] args)
					{
						
						NonStaticCalculator	cal = new NonStaticCalculator();
						cal.caldiff(30, 20);
						cal.calsum(20, 30);
					}
					
						
					}
					
							
					
					
						
					

