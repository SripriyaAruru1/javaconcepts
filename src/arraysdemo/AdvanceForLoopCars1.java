package arraysdemo;

public class AdvanceForLoopCars1 {

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
		
		for (String carmake : cars)
		
		{
			System.out.println(carmake);
		}
	}

}
