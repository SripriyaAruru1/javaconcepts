package multipleinheritance;

public class ChildClassDemo implements Vechle2,Vechicle{

		@Override
	public void Car() {
		
		Vechicle.super.Car();
		
		
	
		
		Vechle2.super.Car();
	}
		public static void  Bus()
		{
			System.out.println("MAIN METHOD OF CHILD CLASS");
		}
		
	public static void Car1()
	{
		System.out.println("Method of CAR from Child Method ");
	}
		public static void main(String[] args) {
			
			ChildClassDemo c = new ChildClassDemo();
			c.Car();
			Bus();

}
}