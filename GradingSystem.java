import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the grade: ");
		int grade = scanner.nextInt();
		
		if (grade <= 100 && grade >= 97) {
			System.out.println("Your grade is 1.00");
		} else if (grade <= 96 && grade >=93) {
			System.out.println("Your grade is 1.25");
		} else if (grade <= 92 && grade >=89) {
			System.out.println("Your grade is 1.50");
		} else if (grade <= 88 && grade >=85) {
			System.out.println("Your grade is 1.75");
		} else if (grade <= 84 && grade >=81) {
			System.out.println("Your grade is 2.00");
		} else if (grade <= 80 && grade >=79) {
			System.out.println("Your grade is 2.25");
		} else if (grade <= 78 && grade >=77) {
			System.out.println("Your grade is 2.50"); 
		} else if (grade == 96) {
			System.out.println("Your grade is 2.75");
		} else if (grade == 75) {
			System.out.println("Your grade is 3.00");
		} else if (grade < 75) {
			System.out.println("Your grade is 5.00");
		}
		
		scanner.close();
	}
	
}
