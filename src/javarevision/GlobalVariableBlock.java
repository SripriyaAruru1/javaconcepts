package javarevision;

public class GlobalVariableBlock {
	
	
	
//	// Declare Zero parameter constructor. 
//		GlobalVariableBlock() 
//	   { 
//	      System.out.println("0-arg Constructor"); 
//	   } 
//	// Declaration of an Instance block. 
//		
//	   { 
//	      System.out.println("Instance Block"); 
//	   } 
//	public static void main(String[] args) 
//	{ 
//	 // First approach: Create the object of the class. 
//		GlobalVariableBlock t = new GlobalVariableBlock(); // named object because object contains reference variable. 
//
////	// Second approach: 
////	      new GlobalVariableBlock(); // nameless object. It is frequently used to reduce the length of the code. 
//	   } 
//	}
///////////////////////////////////////////////////////////////

	 // Declaration of an IIB. 
    { 
        System.out.println("IIB"); 
      } 

// Declare a zero parameter constructor. 
	GlobalVariableBlock() 
   { 
      System.out.println("0-arg constructor"); 
   } 
// Declare one parameter constructor with int parameter named x. 
	GlobalVariableBlock(int x)
   { 
     System.out.println("1-arg constructor"); 
   } 
// Declare two parameters constructor with int parameter named x and y. 
	GlobalVariableBlock(int x, int y)
   { 
      System.out.println("2-arg constructor"); 
   } 

  
public static void main(String[] args) 
{ 
// Create first object of class to call zero paramter constructor. 
	GlobalVariableBlock obj =  new GlobalVariableBlock(); 

// Create second object of class to call one parameter constructor and pass one argument value to its constructor.. 
    new GlobalVariableBlock(20); 

// Create third object of the class to call two parameters constructor and send two arguments value to its constructor.. 
    new GlobalVariableBlock(10,20); 

  } 
}
