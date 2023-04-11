package sripriya;

public class ThisExample {
	int a;
	int b;
	
	public ThisExample(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("In Constructor");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisExample obj = new ThisExample(10,20);
		
		System.out.println("Class level Varaibles");
		System.out.println(" A : "+obj.a);
		System.out.println(" A : "+obj.b);
					
	}

}
