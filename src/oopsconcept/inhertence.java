package oopsconcept;

public class inhertence {

	public static void main(String[] args) {
		
	iphone iphone	= new iphone();
	System.out.println("Iphone feature: ");
	System.out.println("********************");
	iphone.makecalls();
	iphone.Receivecalls();
	
	System.out.println("********************");
	System.out.println("Iphone2 feature: ");
	System.out.println("********************");
	 Iphone2 Iphone2 =new Iphone2();
	 Iphone2.makecalls();
	 Iphone2.Receivecalls();
	 Iphone2.sendmessage();
	 Iphone2.Receivemessage();
	 Iphone2.Camera();
	 
	 System.out.println("********************");
		System.out.println("Iphone3 feature: ");
		System.out.println("********************");
		Iphone3 Iphone3 =new Iphone3();
		 Iphone3.makecalls();
		 Iphone3.Receivecalls();
	 Iphone3.sendmessage();
	Iphone3.Receivemessage();
		Iphone3.Camera();
	}

}
