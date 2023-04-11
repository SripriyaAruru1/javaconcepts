package arraysdemo;

public class Cars {

	public static void main(String[] args) {
	
		String cars[] = new String[10];
		cars[0] = "BMW";
		cars[1] = "AUDI";
		cars[2] = "HONDS";
		cars[3] = "HUNDAI";
		cars[4] = "TESLA";
		cars[5] = "KIA";
		cars[6] = "POLA";
		cars[7] = "BENZ";
		cars[8] = "FORD";
		cars[9] = "TOYOTA";
		int size = cars.length;
		System.out.println("size of the cars in showroom  " +size);
		// Retrieve the value based on index
		System.out.println(cars[0]);
		System.out.println("********************");
		//print all cars
		for(int i =0;i<size;i++)
		{
			System.out.println(cars[i]);
			
		}
			System.out.println("********************");
			//if last 3 cars changed it stores latest value
			cars[7] = "BENZ";
			cars[8] = "BENZ";
			cars[9] = "BENZ";
			System.out.println("********************");
			
			for(int i =0;i<size;i++)
			{
				System.out.println(cars[i]);
		}
	}

}
