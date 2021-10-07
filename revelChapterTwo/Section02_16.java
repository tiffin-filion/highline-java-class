package revelChapterTwo;

import java.util.Scanner;

public class Section02_16 {

	public static void main(String[] args) {
		/* Program takes length of one side of hexagon and computes it's area
		 * Area = ((3 * sqrt of 3) / 2) * side squared
		 */

		 // Add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // Get user to enter hexagon side length
		 System.out.print("Enter the length of one side of the hexagon: ");
		 double side = input.nextDouble();

		 // Compute area of hexagon
		 double area = ((3 * (Math.sqrt(3))) / 2) * (side * side);

		 // Display result
		 System.out.println("The area of the hexagon is: " + area);

	}

}
