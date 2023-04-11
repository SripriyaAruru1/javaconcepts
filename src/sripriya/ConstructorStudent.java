package sripriya;

public class ConstructorStudent {

	 String sname;
	int sno;
	char gender;
	boolean student;
	int year; 
	static String college ="SVUniversity";
	
	
	public ConstructorStudent (String sname,int sno,int i,int year)
	{
		
		this.sname = sname;
		this.sno = sno;
		this.gender = (char) i;
		this.student = student;
		this.year = year;
		System.out.println(sname);
		System.out.println(sno);
		System.out.println(i);
		System.out.println(student);
		System.out.println(college);
		System.out.println("**************");
		}	
//		//public ConstructorStudent (String sname,int sno,char gender,boolean student,int year)
//		{
//			this.sname = sname;
//			this.sno = sno;
//			this.gender = gender;
//			this.student = student;
//			System.out.println("Student name is : "+sname+" Student Roll no. : "+sno+" student gender is : "+gender+" Student is Present: "+student+" year : "+year);
//			
//	}
	public static void main(String[] args) {
		
		new ConstructorStudent("Sri",100,'F',2000);
new ConstructorStudent("SUKU",1001,'M', 1999);
new ConstructorStudent("OM", 10000, 'f', 2000);
new ConstructorStudent("XXX", 0, 0, 0);

//System.out.println("sname : "+sname+ ",sno : "+sno+ ",gender : "+gender+ ", student : "+student+", college : "+college);
//new ConstructorStudent("sssss", 0, 'f', false);
	}

}
