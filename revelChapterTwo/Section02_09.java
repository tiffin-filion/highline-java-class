package revelChapterTwo;

import java.util.Scanner;

public class Section02_09 {

	public static void main(String[] args) {
		/* Program gets starting velocity, ending velocity, and time (all in seconds)
		 * Computes average acceleration
		 * a = v1 - v0 / t
		 * Starting velocity = v0 in meters/second
		 * Ending velocity = v1 in meters/second
		 * Time span = t in seconds
		 */

		 // Start Scanner to get user input
		 Scanner input = new Scanner(System.in);

		 // get starting velocity from user
		 System.out.print("Enter a value for the starting velocity in meters per second: ");
		 double startingVelocity = input.nextDouble();

		 // get ending velocity from user
		 System.out.print("Enter a value for the ending velocity in meters per second: ");
		 double endingVelocity = input.nextDouble();

		 // get time span from user
		 System.out.print("Enter a time span in seconds: ");
		 double time = input.nextDouble();

		 // computer average acceleration
		 double avgAcceleration = ( endingVelocity - startingVelocity ) / time;

		 // display result
		 System.out.println("Average acceleration is: " + avgAcceleration + " seconds.");

	}

}
