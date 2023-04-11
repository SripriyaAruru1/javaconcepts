package javarevision;

public class StringImmu {

	public static void main(String[] args) {
		
		//float f = 0.1f;
		//int n = 10;
		
		String s1 = "Hi"; //s1 = ma 001  Hi
		String s2 = s1;  //s2 = 002 Hi
		s1 = "Bye"; //001 Bye

		System.out.println(s2);
		
		
		System.out.println(s1);
		
//		String str = new String ("Hello");
//		System.out.println(str);
//		//str = str.concat(" Welcome");
//		System.out.println("String manipulated in buffer : "+str.concat(" Welcome"));
//		
	}

}
