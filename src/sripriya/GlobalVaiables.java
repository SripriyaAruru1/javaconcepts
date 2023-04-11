package sripriya;

import java.util.Scanner;

public class GlobalVaiables {
	String  Empname;
	int  EmpID;
	String EmpDept;
	boolean PresentEmp;
	char Empgender;

	public static void main(String[] args)
	{
//		GlobalVaiables s1 = new GlobalVaiables();
//		s1.Empname = "SRI";
//		s1.Empgender = 'F';
//		s1.EmpID = 100;
//		s1.EmpDept = "IT";
//		s1.PresentEmp = true;
//		System.out.println(s1.Empname);
//		System.out.println(s1.Empgender);
//		System.out.println(s1.EmpID);
//		System.out.println(s1.EmpDept);
//		System.out.println(s1.PresentEmp);
		
		System.out.println("Please enter the Empname : ");
		
		System.out.println("Please enter the EmpDept : ");
		System.out.println("Please enter the PresentEmp : ");
				try (Scanner scan = new Scanner(System.in)) {
					String Empname = scan.next();
					
					String EmpDept = scan.next();
					boolean PresentEmp = scan.hasNextBoolean();
					System.out.println("Please enter the Empname : " + Empname);
System.out.println("Please enter the EmpDept : " +EmpDept);
					System.out.println("Please enter the PresentEmp : " +PresentEmp);
				}
		
		
	}

}

//public class ScannerClass1 {
//
//	public static void main(String[] args) {
//		System.out.println("Please enter the number : ");
//	Scanner	 scan= new Scanner(System.in);
//	int num=scan.nextInt();
//	if (num % 2 == 0)
//	{
//		System.out.println("Given number is even number");
//	}
//	else
//	{
//		System.out.println("Given number is ODd number");
//	}
//	}
