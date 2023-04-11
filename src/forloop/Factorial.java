package forloop;

public class Factorial {

	public static void main(String[] args) {
		
		int result = 1;
		for (int i = 1;i <=5;i ++)
			
		{
			result = result * i;
		System.out.print(i + " * ");
		}
		
		System.out.println("= "+result);

	}

}
