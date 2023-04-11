package handlingstring;

public class StringImmutableHashcode {

	public static void main(String[] args) {
		
		String s1 = "SRI";
		String s2 = "SRI";
		String s3 = "sRI";
		String s4 = "PRIYA";
		s1 =s1.concat(" Sukumar"); 
		
		System.out.println("After contactenation :"+s1);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
// memory space is same for s1 and s2 as values of string is same for both. meaning not created
		//seperate memory for s2.as values are same.
		
				   System.out.println(s1.concat(s4).hashCode());
		   //will print Sachin because strings are immutable objects  
		 }  
		
	}


