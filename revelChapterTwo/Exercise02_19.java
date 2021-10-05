package revelChapterTwo;

import java.util.Scanner;

public class Exercise02_19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Get first set of points
		System.out.println("Please enter first set of points: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// Get second set of points
		System.out.println("Please enter second set of points: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		// Get third set of points
		System.out.println("Please enter third set of points: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		// Compute sides
		double sideOne = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1), 0.5);
		double sideTwo = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2), 0.5);
		double sideThree = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3), 0.5);
		
		// Compute perimeter
		double s = (sideOne + sideTwo + sideThree) / 2;
		
		double area = Math.sqrt( s * (s - sideOne) * (s - sideTwo) * (s - sideThree));
		
		System.out.println("The area of the triangle is: " + area);
	}

}
