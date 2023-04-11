package methodsdemo;

public class ReturnMethod{
	
	public int calsum(int num1,int num2)

	{
		int sum = num1+num2;
		return sum;
		
	}
	
	public int calsum(int num1,int num2,int num3)
	{
		int sum = num1+num2+num3;
		return sum;
		
	}
	
	public double calcum(int num1,double num2)	
	
	{
		double sum = num1+num2;
		return sum;
		
	}
	
public boolean flag()	
	
	{
				return true;
		
	}
public String Printmessage()	

{
	String Message ="Welcome to Java-Sripriya";
	return Message;
	
}

	
	public static void main(String[] args) {
		
		 ReturnMethod obj= new  ReturnMethod();
 int sum = obj.calsum(10, 10);
 System.out.println(sum);
 int sum1= obj.calsum(10, 10, 10);
 System.out.println(sum1);
 double sum2 = obj.calcum(10, 10);
 System.out.println(sum2);
 System.out.println(true);
 String Message= obj.Printmessage();
 System.out.println(Message);
	}

}
