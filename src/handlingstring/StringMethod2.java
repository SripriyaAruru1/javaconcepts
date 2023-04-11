package handlingstring;

public class StringMethod2 {

	public static void main(String[] args) {
		// charAt(index) - This method prints the character present at the given index.
		
		String str = " I am a java programmer111";
		String str1 = " and Selenium Expert";
		System.out.println(str.charAt(20));
		
		// 2nd method
		   char charat = str.charAt(20);
		   System.out.println(charat);
		   
		   //Replace ('old char','new char')- This method replaces the old char with the new char
		   
		  String replstr = str.replace('m', 'M');
		  System.out.println(replstr);
		  System.out.println(str.replace('a', 'A'));
		  System.out.println(str.replace("am", "AM"));
		  System.out.println(str.replace('1', '0'));
		  System.out.println(str.replace('1', '0').length());
		   
		  //Replace all - this method to change bunch of character
		  
		  System.out.println(str.replaceAll("am", "AM"));
		  System.out.println(str.replaceAll("java", "JAVA"));
		  
		  //Contains - This is very very imp, checks for the partial string content- it results in boolean
		  
		  System.out.println(str.contains("I AM A"));
		  System.out.println(str.contains("I am a"));
		  
		  //Concat - This method appends 2 strings or combine two strings
		  
		  System.out.println(str.concat(str1));
		  System.out.println(str+str1);
		  System.out.println("**************");
		  String concat = str.concat(str1);
		  System.out.println(concat);
		  System.out.println(str.charAt(20));
	}

	
}
