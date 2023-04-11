package contrlstatments;

import java.util.Scanner;

public class IfStat {
	
	static void age()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age : " );
	int age = sc.nextInt();
	
		if (age >= 18)
		{
			System.out.println("You are elgible for Voting");
		}
		else if (age == 17)
		{
			System.out.println("Sorry all the best next year ");
		}
		else if (age <=10 )
		{
			System.out.println("Sorry KID ");
		}
		else
			System.out.println("Sorry not elgible for voting");
	}
	
	

	public static void main(String[] args) {
		
	age();
		
	}

}
