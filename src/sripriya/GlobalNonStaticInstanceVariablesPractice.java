package sripriya;

public class GlobalNonStaticInstanceVariablesPractice {
	
	public,40 static final String STU1 = null;
	int Snum;
	String Sname;
	String Dept ;
	static String Collage = "SV University";
	
	
	public static void student(int Snum,String Sname,String Dept)
	{
		System.out.println(Snum+ "  "+Sname+ "  "+Dept+" "+Collage);

	}
	
	public  void stu() 
	{
	int Snum = 101;
	String Sname = "PRIYA";
		String Dept = "Mechanical";
		System.out.println(Snum   );
		System.out.println(Sname  );
		System.out.println(Dept  );
		System.out.println(Collage   );
		
	}
	

	
	public static void  STU1()
{
		int Snum = 300;
		String Sname = "SSSSSS";
		String Dept ="MCA" ;
		System.out.println(Snum);
		System.out.println(Sname);
		System.out.println(Dept);
		System.out.println(Collage);

	}
	
	public static void main(String[] args) {
	
		GlobalNonStaticInstanceVariablesPractice ob = new GlobalNonStaticInstanceVariablesPractice();
		
		System.out.println("ClassdefeninedMain Method Results :");
		ob.Snum = 100;
		ob.Sname = "Sri";
		ob.Dept = "Testing";
		
       System.out.println(ob.Snum);
        System.out.println(ob.Sname);
       System.out.println(ob.Dept);
        System.out.println(Collage);
        System.out.println("*********************************************************************");
        
		System.out.println("Student Method Results :");  
		ob.student(1001, "SRIpriya", "HR");
		 System.out.println("*********************************************************************");
		 ob.student(0, STU1, Collage);
		System.out.println("Stu calling by obj :");  
		ob.stu();
		 System.out.println("*********************************************************************");
		 
		 System.out.println("Stu1 Method calling by class :"); 
   GlobalNonStaticInstanceVariablesPractice.STU1();
    
  
    
    
//		System.out.println("Student Method Results : ****************************");
//		GlobalNonStaticInstanceVariablesPractice.student(100, "ARURU", "HR");
//		GlobalNonStaticInstanceVariablesPractice.student(200, "AAAA","MBA");
//		System.out.println("****************************");
//		System.out.println("Class Results: " +ob.Snum+ " "+ob.Sname+" "+ob.Dept+" "+Collage );
//		System.out.println("Stu Resuts: ****************************");
//		GlobalNonStaticInstanceVariablesPractice.stu();
//		System.out.println("****************************");
//		ob.STU1();
//		ob.stu();
	}
}