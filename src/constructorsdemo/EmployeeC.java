package constructorsdemo;

public class EmployeeC {
	
	String  Empname;
	int  EmpID;
	String EmpDept;
	boolean PresentEmp;
	char Empgender;
	
	public EmployeeC(String  Empname,int  EmpID,String EmpDept,boolean PresentEmp,char Empgender)
	{
		this.Empname = Empname;
		this.EmpID = EmpID;
		this.EmpDept =EmpDept;
		this.PresentEmp = PresentEmp;
		this.Empgender = Empgender;
		System.out.println("Default values   ");
		System.out.println(Empname+ " : "+EmpID+"  : "+EmpDept+"  : "+PresentEmp+" : "+Empgender);
		
	}
	
	
	
	public static void main(String[] args)
	{
		new EmployeeC("Sri", 100, "Testing", true, 'F');
		new EmployeeC("SUKU", 1010, "DEV", true, 'M');

	}

}
