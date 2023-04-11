package selectionstatments;

public class SwitchChooseBrowserDemo {

	public static void main(String[] args) {
		
	String browser = "Edge";
	
	switch(browser)
	{
		case "chrome":
		System.out.println("Executing the test cases using chrome browser");
//break;
		
		case "firefox":
			System.out.println("Executing the test cases using firefox browser");
	//break;
		case "Edge":
			System.out.println("Executing the test cases using Edge browser");
		//break;
		case "safari":
			System.out.println("Executing the test cases using safari browser");
	break;
	default :
	System.out.println("please provide supported browser name ");
			
	}
	
	

	}

}
