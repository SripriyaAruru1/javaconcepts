package javarevision;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingScan {
	
public
int sub  ()
	{
		int a = 20;
		int b = 30;
	int c = b-a;
		return c;
	}


	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("C:\\Users\\sukum\\Desktop\\assignment.txt") ;
		Scanner sc = new Scanner(fr);
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	
	ReadingScan o = new ReadingScan();
		
		System.out.println( o.sub());
		
			
		
	}

}
