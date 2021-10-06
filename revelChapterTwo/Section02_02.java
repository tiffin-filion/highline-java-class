package revelChapterTwo;

import java.util.Scanner;

public class Section02_02 {

	public static void main(String[] args) {
		/* Program that computes the area and volume of a cylinder
		 * Given the radius and length
		 * area = radius * radius * pi
		 * volume = area * length
		 */
		
		// add Scanner so user can send input
		Scanner input = new Scanner(System.in);
		
		// get radius from user
		System.out.print("Enter the radius of the cylinder: ");
		double radius = input.nextDouble();
		
		// get length from user
		System.out.print("Enter the length of the cylinder: ");
		double length = input.nextDouble();
		
		// compute area of cylinder
		double area = radius * radius * 3.14159;
		
		// computer volume of cylinder
		double volume = area * length;
		
		// display results
		System.out.println("The area of the cylinder is " + area + ".\n" + "The volume of the cylinder is " + volume + ".");

	}

}
