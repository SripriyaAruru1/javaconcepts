package revisionbufferreaders;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamRead {

	public static void main(String[] args) throws IOException 
	{
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		System.out.println("Give values a and b number : " );
		System.out.println("Give String : ");
		int a = Integer.parseInt(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c =  a+b;
	      String str = br.readLine();
		System.out.println(c);
   
         System.out.println(str);

	}

}
