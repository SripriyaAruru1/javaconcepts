package sripriya;

public class Iphone3 extends Iphone2 {
	
	public void Sendmessage()
	{
		System.out.println("Updated send message");
	}
	
	public static void Camera()
	{
		System.out.println("Camera Installed");
	}

	public static void main(String[] args) {
		
		 Iphone3 IPhone3= new Iphone3();
		 IPhone3.makecalls();
		 IPhone3.ReceiveCalls();
		 IPhone3.Receivemessage();
		 IPhone3.Sendmessage();
	IPhone3.Camera();

	}

}
