package sripriya;

import oopsconcept.iphone;

public class Iphone2 extends InheritanceIphone {
	
	public void Receivemessage()
	{
		System.out.println("Receive Messages");
	}
	
	public void Sendmessage()
	{
		System.out.println("Sending Messages");
	}

	public static void main(String[] args) {
		Iphone2 Iphone2 = new Iphone2();
		Iphone2.makecalls();
		Iphone2.ReceiveCalls();
Iphone2.Sendmessage();
Iphone2.Receivemessage();

	}

}
