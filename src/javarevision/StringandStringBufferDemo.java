package javarevision;

public class StringandStringBufferDemo {

	public static void main(String[] args) {
		String str = new String(" Sri priya ");
		//concate add two strings 
		str.concat("Sukumar");
		System.out.println(str.concat("Sukumar"));
		System.out.println(str.concat(str.substring(5)));
		//substring  -----return the string from first letter of given lenght = priya 
		System.out.println(str.substring(5));
		//replace - old string to new string
		System.out.println(str.replace("Sri", "Sree"));
		//replace old char to new char
		System.out.println(str.replace('S', 'R'));
		//lenghth();no of characters of a given string. ans - 8 starts with 1 not with '0' as it is not index.only indexstarts with 0
		System.out.println(str.length());
		//indexOf(int 1)----index of first character in given string  = 1
		System.out.println(str.indexOf("rip"));
		//indexOf(String "ya")---gives index value of first string  =ans =6
		System.out.println(str.indexOf("ya"));
		//charAt(index)---returns the character at given index
		System.out.println(str.charAt(2));
		//toLowerCase - 
				System.out.println(str.toLowerCase());
		//toUpperCase - 
				System.out.println(str.toUpperCase());
	//compareTo--comapres two strings- unicode (0-9 =48-57,A-Z = 65-90,a-z = 97-122) the charater and compare =
				//return "0" - if equals --
				//gives "+ve" - if 1st mismatch of 1st string" > "1st mismatch of 2nd String
				//gives "-ve" -if 1st mismatch of 1st string" < "1st mismatch of 2nd String
				System.out.println(str.compareTo("Sukumar"));
				//compareToIgnoreCase
				System.out.println(str.compareToIgnoreCase("sukumar"));
				//trim- remove all white spaces before and after the string but not space between string  
				System.out.println(str.trim());
		System.out.println("_________________________________________________");
		
		      StringBuffer sb = new StringBuffer("Welcome");
		//append
		      sb.append("India");
		//insert = insert value at given index 
			  System.out.println(sb.insert(0, "HI "));
		//delete	= start index 0,end index 3(means 3-1 = 2)	
			  sb.delete(0, 3);
		//reverse
			  sb.reverse();
			  System.out.println(sb);
		      sb.reverse();
		      System.out.println(sb.insert(0, "HI "));
		//replace - --start index , endindex and specified string  - eg-if end index is 2 -  2-1)
		      sb.replace(0, 2, "Hello");
		      System.out.println(sb);
		//length
             System.out.println( sb.length());
        //substring(start ind,end index --- shows as subtring inclusive 1st index exclusive last index -0-4 letters shows as substring
             System.out.println(sb.substring(0, 5));
        //substring (index) 6 - shows word as substring from index number
             sb.substring(6); 
             System.out.println (sb.substring(6));
             System.out.println(sb);
               sb.reverse();
             System.out.println(sb);
	}

}
