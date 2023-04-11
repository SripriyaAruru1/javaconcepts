package arraysdemo;

public class TwoDimensionArray {

	public static void main(String[] args) {
		
		String S [] [] = new String [3][4];
		S [0][0] = "A";
		S [0][1] = "B";
		S [0][2] = "C";
		S [0][3] = "D";
	
		S [1][0] = "A1";
		S [1][1] = "B1";
		S [1][2] = "C1";
		S [1][3] = "D1";
		
		S [2][0] = "A2";
		S [2][1] = "B2";
		S [2][2] = "C2";
		S [2][3] = "D2";
		
		System.out.println("Row size of array ");
		System.out.println(S.length);
		// for printing col size no direct method. first specify the row like below
		System.out.println("Column size of array ");
		System.out.println(S[0].length);
		System.out.println("Ordinary for loop to print all values of matrix x and y values ");
		
		for (int i =0;i<S.length;i++)
		{
			for (int j = 0;j<S[0].length;j++) 
			{
				System.out.println(S[i][j]);
		}
		}
		System.out.println("Advance for loop to print all values of matrix x and y values ");
		
		for (String[] values : S)
		
		{
			for (String cellvalues : values)
			{
				System.out.println(cellvalues);
			}	
		}
		
		System.out.println("practice of advance for loop");
		for (String[] strings : S)
		{
			for (String strings2 : strings) 
			{
			System.out.println(strings2);	
			}
		}
		
		
		
		
		
		
		
		}
	}


