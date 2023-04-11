package variables;

public class Student {
	String Sname;
	int id;
	int age;
	char gender;
	String dept;
 static String Institute ="CAPGEMINI" ;
 
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.Sname = "SRI";
		s1.id = 100;
		s1.age = 30;
		s1.gender = 'F';
		s1.dept = "HR";
		System.out.println(Student.Institute);

		System.out.println(s1.Sname);
		System.out.println(s1.id );
		System.out.println(s1.age);
		System.out.println(s1.gender);
		System.out.println(s1.dept);
		System.out.println(Student.Institute);

		Student s2 = new Student();
		s2.Sname = "SRIPritya";
		s2.id = 1001;
		s2.age = 20;
		s2.gender = 'F';
		s2.dept = "HR";
		System.out.println(s2.Sname);
		System.out.println(s2.id );
		System.out.println(s2.age);
		System.out.println(s2.gender);
		System.out.println(s2.dept);
		System.out.println(Student.Institute);
}


}
