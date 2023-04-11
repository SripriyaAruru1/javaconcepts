package sripriya;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileReadDemo {

		
		public static void main(String[] args) throws FileNotFoundException {

            FileReader fr = new FileReader("C:\\Users\\sukum\\Desktop\\assignment.txt");
    Scanner sc = new Scanner(fr);
    sc.useDelimiter("\\Z");
    System.out.println(sc.next());
    
}
}