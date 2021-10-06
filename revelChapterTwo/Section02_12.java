package revelChapterTwo;

import java.util.Scanner;

public class Section02_12 {

	public static void main(String[] args) {
		/* Program computes the minimum runway length needed for airplane takeoff
		 * length = v * v / 2 * a
		 */

		 // add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get airplane's speed from user
		 System.out.print("Enter the plane's take-off speed (m/s): ");
		 double speed = input.nextDouble();

		 // get airplane's acceleration from user
		 System.out.print("Enter the plane's acceleration (m/s): ");
		 double acceleration = input.nextDouble();

		 // calculate length needed for takeoff
		 double runwayLength = (speed * speed) / (2 * acceleration);
		 System.out.println("A plane traveling at " + speed + " meters per second and accelerating at " + acceleration + 
		 " meters per second, needs a minimum of " + runwayLength + " meters of runway.");

	}

}
