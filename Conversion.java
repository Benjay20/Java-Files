import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Input the weight in grams: ");
		double g = scanner.nextDouble();
		double kg = g / 1000;
		System.out.println(g + " grams is equal to " + kg + "kg");
		
		System.out.print("\nInput the distance in meters: ");
		double m = scanner.nextDouble();
		double km = m / 1000;
		System.out.println(m + " meters is equal to " + km + "km");
		
		System.out.print("\nInput the temperature Celcius: ");
		float celsius = scanner.nextFloat();
		float f = (celsius * 9/5) + 32;
		System.out.println(celsius + "°C" + " is equal to " + f + "°F");
		
		scanner.close();
		
		System.out.println("\nName: Benjay V. de Guzman");
		System.out.println("Section: OLCA211M043");
	}
	
}
