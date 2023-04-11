package constructorsdemo;

public class Employee {
	
	String  Empname;
	int  EmpID;
	String EmpDept;
	boolean PresentEmp;
	char Empgender;
	
	
	
	public static void main(String[] args) {
		Employee s1= new Employee();
		s1.Empname = "Sripriya";
		s1.EmpID = 100;
		s1.EmpDept = "Testing";
		s1.PresentEmp = true;
		s1.Empgender = 'F';
		System.out.println(s1.Empname+ " : "+s1.EmpID+"  : "+s1.EmpDept+"  : "+s1.PresentEmp+" : "+s1.Empgender);
		

	}

}
