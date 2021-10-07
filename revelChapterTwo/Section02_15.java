package revelChapterTwo;

import java.util.Scanner;

public class Section02_15 {

	public static void main(String[] args) {
		/* Write a program that prompts the user to enter two points
		 * (x1, y1) and (x2, y2) and displays their distance. The formula
		 * for computing the distance
		 * sqrt (x2 - x1)2 + (y2 - y1)2
		 * Note that you can use Math.pow(a, 0.5) to compute square root of a
		 */

		 // Add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get two points from user
		 System.out.println("Starting point");
		 System.out.print("Enter the x-axis: ");
		 double x1 = input.nextDouble();

		 System.out.print("Enter the y-axis: ");
		 double y1 = input.nextDouble();

		 System.out.println("Ending point");
		 System.out.print("Enter the x-axis: ");
		 double x2 = input.nextDouble();

		 System.out.print("Enter the y-axis: ");
		 double y2 = input.nextDouble();

		 // compute the distance between both points
		 double distance = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) + (y2 - y1), 0.5);
		 System.out.println("The distance between " + x1 + "," + y1 + " and " + x2 + "," + y2 + " is: " + distance);

	}

}
