package sripriya;

public class SwithBreakBrowser {

	public static void main(String[] args) {
	
		String browser = "Chrome";
		
		switch (browser)
		
		{
		case "Chrome":
			System.out.println("using chrome");
		break;
	
		case "firebox":
		System.out.println("Using Firefox");
		break;
		
		case "Edge":
			System.out.println("using Edge");
			break;
		
		
			default:
				System.out.println("None of the above");
		}	
	}

}
