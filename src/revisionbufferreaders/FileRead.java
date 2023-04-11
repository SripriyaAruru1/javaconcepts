package revisionbufferreaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
//		FileReader fr = new FileReader("C:\\Users\\sukum\\Desktop\\Reading.txt");
//		Scanner sc = new Scanner(fr);
//		sc.useDelimiter("\\z");
//		System.out.println(sc.next());
	 
		FileReader fr = new FileReader("C:\\Users\\sukum\\Desktop\\Reading.txt");
		BufferedReader br = new BufferedReader(fr);
		 //br.readLine();
		String str = null;
	while ((str = br.readLine())!= null)
		{
		  for (int i = 0;i<str.length();i++)
			  if (Character.isLetter(str.charAt(i)))
		  {
			//str = br.readLine();
			  
			System.out.print(str.charAt(i));
		  }
		}
		
		
	}

}
