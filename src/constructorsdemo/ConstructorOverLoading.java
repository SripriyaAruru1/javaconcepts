package constructorsdemo;

public class ConstructorOverLoading {
	
	String Resname;
	int doorno ;
	String Street;
	boolean Resident;
	
	public ConstructorOverLoading() //default constructor
	{
		System.out.println("i am a constructor ");
		System.out.println("*******************");
	}
	public ConstructorOverLoading(String Resname,int doorno ,String Street,boolean Resident)
	{
//	//this.Resname = Resname;
//	this.doorno = doorno;
//	this.Street = Street;
//	this.Resident = Resident;
	System.out.println("Resident is : "+Resname+" Door No is: "+doorno+" Street is : "+Street+" Owner: "+Resident);
	System.out.println("Default values are: ");
	}
	
	public ConstructorOverLoading(String Resname,int doorno ,String Street)
	{
//	this.Resname = Resname;
//	this.doorno = doorno;
//	this.Street = Street;
//	this.Resident = Resident;
	System.out.println("Resident is : "+Resname+" Door No is: "+doorno+" Street is : "+Street+" Owner: "+Resident);
	System.out.println("Default values are: ");
	}
	
	
	public static void main(String[] args) {
	new ConstructorOverLoading();
new ConstructorOverLoading("Sri", 6329, "Wales St", true);
new ConstructorOverLoading(null, 0, null, false);
new ConstructorOverLoading("Sukumar", 6329, "Wales St");

}
}
