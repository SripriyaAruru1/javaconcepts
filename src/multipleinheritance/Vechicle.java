package multipleinheritance;

public interface Vechicle {
	
	default void Car()
	
	{
		int b = 10;
		System.out.println("VECHILE INTERFACE BUS");
	}
		
	default void Bus()
	{
		
	}
	

}
