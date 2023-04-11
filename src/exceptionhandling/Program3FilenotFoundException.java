package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;

public class Program3FilenotFoundException {

	public static void main(String[] args) throws Exception {
	 File file = new File("./javaconcepts/src/exceptionhandling/text.txt");
	 FileInputStream fis=  new FileInputStream(file);
	 fis.close();
	}

}
