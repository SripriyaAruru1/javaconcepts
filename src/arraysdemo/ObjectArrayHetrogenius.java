package arraysdemo;

public class ObjectArrayHetrogenius {

	public static void main(String[] args) {
		
		Object [] obj = new Object[6];
		obj[0] ="SRI";
		obj[1] =29.06;
		obj[2] =800.999;
		obj[3] =5.3;
		obj[4] ='F';
		obj[5] =true;
		
		for (Object object : obj)
		{
			System.out.println(object);
		}
		
	}

}
