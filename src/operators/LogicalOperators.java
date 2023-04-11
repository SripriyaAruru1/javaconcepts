package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		//& and Both should be true
	System.out.println(true & true);
	System.out.println(true & false);
	System.out.println(false & false);
	System.out.println(false & true);
	System.out.println("**********************");
	//'|' or any one should be true 
	System.out.println(true | true);
	System.out.println(true | false);
	System.out.println(false | false);
	System.out.println(false | true);
	//'^'-Ex-or both should be different
	System.out.println("**********************");
	System.out.println(true ^ true);
	System.out.println(true ^ false);
	System.out.println(false ^ false);
	System.out.println(false ^ true);
	
	}
	

}
