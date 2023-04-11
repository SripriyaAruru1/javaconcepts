package multipleclassinheritance;

import multipleinheritance.Vechicle;
import multipleinheritance.Vechle2;


//public class Child extends Vehicle,Vechile2 {

		
 public class Child implements   Vechicle,Vechle2 {
	 
	public  void bus() {
		 
		Vechicle.super.bus();
		
	
	}
	
	public void Car() {
		 
		System.out.println("2-Vechile Car");
	
	}
	
	void Ben()
	{
		System.out.println("New feature Ben added");
	}
public static void main(String[] args) {
	
	Child c = new Child();
	c.bus();
	c.Car();
c.Ben();

	}

}