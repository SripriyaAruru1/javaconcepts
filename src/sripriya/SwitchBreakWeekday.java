package sripriya;

public class SwitchBreakWeekday {

	public static void main(String[] args) {
	
		String Day="Sunday";
		switch (Day)
		{
		case  "Monday":
			System.out.println("Monday is Busy day");
		break;
		case  "Tuesday":
			System.out.println("Tuesday is Tiered day");
		break;
		case  "Wednesday":
			System.out.println("Wednesday is overwork day");
		break;
		case  "Thursday":
			System.out.println("Thursday is Exausted Day");
		break;
		case  "Friday":
			System.out.println("Friday is energetic Day");
		break;
		case  "Saturday":
			System.out.println("Saturday is Funday");
		break;
		case  "Sunday":
			System.out.println("Sunday is Jolly Day");
		break;
		default:
			System.out.println("Festival Day");
		break;
		
		}
		

	}

}
