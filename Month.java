import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the month (1 - 12): ");
		String Month = scanner.nextLine().toLowerCase();
		
		System.out.print("Enter the year: ");
		int year = scanner.nextInt();
		
		int days;
		
		switch (Month) {
		
		case "1":
		case "January":
			days = 31;
			break;
		case "2":
		case "February":
			if (year % 4 == 0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case "3":
		case "March":
			days = 31;
			break;
		case "4":
		case "April":
			days = 30;
			break;
		case "5":
		case "May":
			days = 31;
			break;
		case "6":
		case "June":
			days = 30;
			break;
		case "7":
		case "July":
			days = 31;
			break;
		case "8":
		case "August":
			days = 31;
			break;
		case "9":
		case "September":
			days = 30;
			break;
		case "10":
		case "October":
			days = 31;
			break;
		case "11":
		case "November":
			days = 30;
			break;
		case "12":
		case "December":
			days = 31;
			break;
		default:
			System.out.print("Invalid Month");
			return;
			
		}
		System.out.println("Number of days: " + days);
	}
	
}
