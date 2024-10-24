import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner area = new Scanner(System.in);
		
		System.out.print("Enter the base: ");
		int num1 = area.nextInt();
		
		System.out.print("Enter the height: ");
		int num2 = area.nextInt();
		
		float triArea = (num1 * num2) /2;
		
		System.out.println("\nThe area of the triangle is: " + triArea);
		
		area.close();
	}
}
