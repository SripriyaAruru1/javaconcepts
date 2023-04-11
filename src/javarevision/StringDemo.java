package javarevision;

public class StringDemo {


	public static void main(java.lang.String[] args) {
		
		String str = new String("hello@hi@India");

		System.out.println("First assigned value: " +str);
		
		String str1 = "HEllo ";
		//System.out.println("Changed the value : " +str);
		System.out.println("str1 value: "+str1);
		System.out.println("Index of : "  +str.indexOf("H"));
		System.out.println("Lenght  of : "  +str1.length());
		System.out.println("charater at given index:  " + str.charAt(0));
		System.out.println("Relaces old to new string : " +str.replace("Hello", "Hi India"));
		System.out.println("Relaces old to new string : " + str.replace("Hi", "hi"));
		System.out.println("converts into lowercase : " + str1.toLowerCase());
		System.out.println("converts into Uppercase : " + str1.toUpperCase());
		System.out.println("for compare To two strings : "+ str.compareTo(str1));
		System.out.println("Relaces all old to new string : " + str.replaceAll("Hello", "hi"));
		System.out.println("for compare To two strings : "+ str.compareTo(str1));
		System.out.println("Relaces old to new string : " + str.replace("He", "hE"));
		System.out.println("Trim value  :" + str.trim());
		System.out.println("Without Trim value  :" + str);
		System.out.println("conacat the string  : "+str.concat(str1));
		System.out.println(str+ "  "  +str1);
		System.out.println(str.concat("Welcome"));
		System.out.println(str.contains("hii"));
		String[] arrystr  = str.split("@",2);
		 for (String a : arrystr ) 
		{
			System.out.println(a);
		}
		
	System.out.println(str.substring(0,3));
	System.out.println(str);
	
	}
	

}
