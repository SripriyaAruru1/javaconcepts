package javarevision;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("Welcome");
		System.out.println(str.append(" Java"));
		System.out.println(str.insert(2, "Hi"));
		System.out.println(str);
System.out.println(str.delete(2, 4));
System.out.println(str.reverse());
System.out.println(str);
System.out.println(str.reverse());
System.out.println(str.replace(0,3,"HI"));
System.out.println(str.length());
System.out.println(str.substring(2));
System.out.println(str.indexOf("come"));
System.out.println(str);
System.out.println(str.charAt(4));
System.out.println(str.subSequence(2, 5));
	}

}
