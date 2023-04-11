package handlingstring;

public class StringMethods1 {

	public static void main(String[] args) {
		
		//length - this method will print length of the given string. 
		
		//declaring string in two methods
		
		//String s1 = new String("Hello");
		//System.out.println(s1.length());
		
		System.out.println("***********************");
		String S2 = "  Hello";
		String S1 = " Hello India";
		System.out.println(S2);
	
		int size = S2.length();
		System.out.println(size);
		System.out.println("***********************");
		
		// trim -This method will cut the trailling(front) and Preceeding (back) space of the given string 
		
		System.out.println(S2.trim());
		//trim will not trim the space between two words
		String trimmedstring = S1.trim();
		System.out.println(S1.trim());
		
		System.out.println(trimmedstring.length());
		
		//toupper case - This method coverts the lower case letter from the given String to upper case
		
		System.out.println(S2.toUpperCase());
		System.out.println(S2.toUpperCase().trim());
		System.out.println(S2.trim().length());
		
		//tolower case - This methos is vice versa of uppercase.
		
		System.out.println(S2.toLowerCase());
		System.out.println(S2.toLowerCase().trim());
		System.out.println(S2.toLowerCase().trim().length());
		System.out.println(S2.length());
		
	}

}
