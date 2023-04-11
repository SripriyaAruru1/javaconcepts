package multipleclassinheritance;

import multipleinheritance.Vechicle;
2
public class MultipleInheriCall extends Vechile,Vechicle   {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.Bus();
		c.Car();
		c.Ben();
	}

}
