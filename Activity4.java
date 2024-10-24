import java.util.Scanner; 

public class Activity4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.next();
		System.out.println("Hello, "+ name);
		
		System.out.print("\nHow old are you? ");
		int age = input.nextInt();
		System.out.println("You are " + age + " years old");
		
		System.out.print("\nGive me decimal numbers: ");
		float num1 = input.nextFloat();
		System.out.println("Your number is: " + num1);
		
		input.close();
	}

}
