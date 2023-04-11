package sripriya;

public class StringTest {

	public static void main(String[] args) {
	
		String s1 = "Sachin";
		String s2 = "Sachin Tedulkar S";
	
		//s1 = "Sachin Tedulkar";
		
	System.err.println();
//		System.out.println(s1.replaceAll("Sachin", "SACHIN"));
//		System.out.println(s1.contains("SACHIN Tedulkar"));
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
//		System.out.println(s1.contains("Sachin "));
//		System.out.println(s1.equalsIgnoreCase("sachin"));
//		System.out.println(s1.charAt(2));
//		System.out.println(s1.equals(s2));
		System.out.println(s2.substring(1));
		System.out.println(s2.substring(0, 4));
		System.out.println(s2.subSequence(0, 8));
		System.out.println(s2.concat(" " +s1));
		System.out.println(s2.concat(s2));
		
		System.out.println(s2.replace("Sac", "SAC"));
		System.out.println(s1.replaceAll("Sachin", "SACHIN "));
		System.out.println(s2.split("\n"));
		
	String[] a = s2.split(" ");
for (String string : a) 
	{
		System.out.println(string);
	}

String[] a1 = s2.split(" ", 4);
for (String string : a1) 
{
	System.out.println(string);
}
//		StringTest sname	= new StringTest();
//		String sname1 = "Sachin";
//		System.out.println(sname1.length());
//		//String sname1 = "Sachin Tendulkar";
	}

}
