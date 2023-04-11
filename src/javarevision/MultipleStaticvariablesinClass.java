package javarevision;

public class MultipleStaticvariablesinClass {

static String college = "SUV";
static String Address = "Wales";

static
{
	System.out.println("HIIIIIIIII Static Block");
}

public static void addclass(String name)
{

	System.out.println("Static Method");
	System.out.println(name);
	System.out.println(college);
	System.out.println(Address);
}

public  void nonstatic(String name,int rno) 
	
{
	System.out.println("nonStatic Method/global");
	System.out.println(name);
	System.out.println(rno);
	System.out.println(college);
	System.out.println(Address);
	
}
	public static void main(String[] args) {
		
	addclass("Sripriya");
	new MultipleStaticvariablesinClass().nonstatic("Sri",100);

	}

}
