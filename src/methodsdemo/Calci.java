package methodsdemo;

public class Calci {
	
	public void calsum(int num1,int num2)

	{
		int sum = num1+num2;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		
Calci obj= new Calci();
 obj.calsum(10, 10);

	}

}
