package userdefinedcollections;

import java.util.ArrayList;

public class ObjectofStudentCollection {

	public static void main(String[] args) {
	
		 Student s1 = new Student("SRI",1000, "IT");
		 Student s2 = new Student("Suku",1001, "IT");
		 Student s3 = new Student("Priya",1000, "HR");
		 
		 ArrayList<Student> sc = new ArrayList<Student>();
		 sc.add(s1);
		 sc.add(s2);
		 sc.add(s3);
		 for (Student values : sc)
		 {
			System.out.println(values.sname+"   : " +values.sid+ "  :  "+values.sdept);
		}
	}

}
