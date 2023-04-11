package javarevision;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	
	 

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		int a = Integer.parseInt(br.readLine());
		float b = Float.parseFloat(br.readLine());
		String st = br.readLine();
		System.out.println(st);
		
	// to read data from file
		
		FileReader fr = new FileReader("NEED TO GIVE PATH OF FILE IN DOUBLE QUOTES");
		BufferedReader brr = new BufferedReader(fr);
		String s = brr.readLine();
		System.out.println(s);
		
		
		
	}

}
