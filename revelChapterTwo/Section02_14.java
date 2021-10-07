package revelChapterTwo;

import java.util.Scanner;

public class Section02_14 {

	public static void main(String[] args) {
		/* Program gets weight & height and figures out BMI
		 * Note that one pound is 0.45359237 kg and one inch is
		 * 0.0254 meters.
		 */

		 // add Scanner so user can provid input
		 Scanner input = new Scanner(System.in);

		 // get weight in pounds from user
		 System.out.print("Please enter your weight in pounds: ");
		 double weightInPounds = input.nextDouble();

		 // get height in inches from user
		 System.out.print("Please enter your height in inches: ");
		 double heightInInches = input.nextDouble();

		 // convert weight to kg
		 double weight = weightInPounds * 0.45359237;

		 // convert height to meters
		 double height = heightInInches * 0.0254;

		 // compute BMI
		 double bmi = weight / ( height * height);
		 
		 // display result
		 System.out.println("Your BMI is: " + bmi);

	}

}
