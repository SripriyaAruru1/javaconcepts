package sripriya;

public class SplitExample {
	  
    // Main driver method
    public static void main(String args[])
    {
        // Custom input string
        String str = "geekss @for @geekss";
        String[] arrOfStr = str.split("@");
        System.out.println("Array : "+arrOfStr);
     
       
        for (String a : arrOfStr)
            System.out.println(a);
    }
}