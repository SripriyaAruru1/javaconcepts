package javarevision;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
		
		System.out.println("Enter your Name : ");
		
		Scanner s = new Scanner(System.in);
		
		String name = s.next() ;
		System.out.println("The given name is : " +name);
		
		if (name.equalsIgnoreCase("Sripriya") ) {
		
			System.out.println("Your father is Rathnam."); }
		
			else if (name.equalsIgnoreCase("Sri"))
		
		
			{System.out.println("Your husband is Sukumar :");}
		
		
		else if (name.equalsIgnoreCase("Pritish")) {
		
			System.out.println("He is Sri and Suku's Son");}
		{
		System.out.println("Not  Related to this Family");
		}
s.close();

	}

	
}
