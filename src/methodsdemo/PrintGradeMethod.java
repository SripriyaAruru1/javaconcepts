package methodsdemo;

public class PrintGradeMethod {
	
	public static void main(String[] args) {
		PrintGradeMethod.calgarde("Sri", 90);
		PrintGradeMethod.calgarde("Priya", 80);
		PrintGradeMethod.calgarde("Ram", 70);
		PrintGradeMethod.calgarde("xxx", 34);
		
	}
	
	public static void calgarde(String sname, int marks)
	{
	
		String grade;
	
	if (marks <=100 & marks >=80)
	{
		grade = "A";
	}
	else if (marks <=79 & marks >=60)
	{
		grade = "B";
	}
	else if (marks <=59 & marks >=35)
	{
		grade = "C";
	}
	else
	{
		grade = "Fail";
	}
	System.out.println("Student name is:  " +sname+ "  : grade is " +grade);
	System.out.println("*******************");
	
	}
	
}
