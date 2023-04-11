package handlingstring;

public class StringMethod3 {

	public static void main(String[] args) {
		// Split - it splits the string 
		
		String str = " Java Programming is a fun";
		
		System.out.println(str.split(" "));
		
		///  this is the output will get. [Ljava.lang.String;@626b2d4a,
		// need to do in for loop method for split the space
		
		System.out.println("Normal for loop "); 
		String[] splitstr = str.split(" ");
		for (int i = 0;i<splitstr.length;i++)
		{
			System.out.println(splitstr[i]); 
		}
		
		System.out.println("Advance for loop ");
		
		for (String string : splitstr)
		{
			System.out.println(string);
			
		}
		//substring - this method prints the sub string from a given index
		//very important beginning index is inclusive and last index is exclusive
		
		System.out.println(str.substring(0));
		System.out.println(str.subSequence(1, 7));
		
		//equalsignorecase - this method ignores case sensitive and prints answer in boolean
		
		String s = "Selenium";
		String s1 = "selenium";

		System.out.println(s.contentEquals(s1));
		boolean coneual = s.equalsIgnoreCase(s1);
		System.out.println(coneual);
		System.out.println(str.substring(0));
		System.out.println(str.subSequence(1, 7));
		
		
	}
	

	
}
