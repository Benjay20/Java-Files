import java.util.Scanner;
public class MDAS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();
        
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        
        System.out.println("\nAddition: " + addition);
        System.out.println("\nSubtraction: " + subtraction);
        System.out.println("\nMultiplication: " + multiplication);
        System.out.println("\nDivision: " + division);
        
        input.close();
	}

}