import java.util.Scanner;

public class VolumeOfRectangle {

	public static void main(String[] args) {
		Scanner vol = new Scanner(System.in);
		
		System.out.print("Enter the lenght: ");
		int num1 = vol.nextInt();
		
		System.out.print("Enter the width: ");
		int num2 = vol.nextInt();
		
		System.out.print("Enter the height: ");
		int num3 = vol.nextInt();
		
		float volume = num1 * num2 * num3;
		System.out.println("\nThe volume of the rectangle is: " + volume);

		vol.close();
	}
	
}
