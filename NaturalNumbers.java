import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter odd natural numbers: ");
        int num = scanner.nextInt();
        
        int sum = 0;
        int count = 0;
        
        for (int i = 1; count < num; i += 2) {
            sum += i;
            count++;
        }
        
        double average = (double) sum / num;
        
        System.out.println("Sum of first " + num + " odd natural numbers: " + sum);
        System.out.println("Average: " + average);
        
        scanner.close();
	}

}
