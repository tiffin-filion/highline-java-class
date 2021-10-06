package revelChapterTwo;

import java.util.Scanner;

public class Section02_03 {
	

	public static void main(String[] args) {
		/* Program converts a number from feet to meters
		 * 1 foot = 0.305 meters
		 */
		
		// add Scanner to get user input
		Scanner input = new Scanner(System.in);
		
		// get amount in feet from user
		System.out.print("Enter an amount for feet to convert to meters: ");
		int feet = input.nextInt();
		
		// convert to meters
		double meters = feet * 0.305;
		
		// display result
		System.out.println(feet + " feet is " + meters + " in meters.");

	}

}
