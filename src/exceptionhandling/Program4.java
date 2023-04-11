package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class Program4 {

	public static void main(String[] args) {
	 File file = new File("./javaconcepts/src/exceptionhandling/text.txt");
	 FileInputStream fis;
	try {
		fis = new FileInputStream(file);
		fis.close();
	} catch (Exception e) 
	{
		System.out.println("Exception");
		e.printStackTrace();
		 
	}
	}
}


