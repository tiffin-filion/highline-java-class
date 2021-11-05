package revelChapterTwo;

import java.util.Scanner;

public class Section02_17 {

	public static void main(String[] args) {
		/* Program uses the current temperature and wind speed to determin the wind-chill
		 * tWC = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
		 * where ta is the outside temperature measured in degrees
		 * Fahrenheit and v is the speed measured in miles per hour.
		 * tWC is the wind-chill temperature. The formula cannot be
		 * used for wind speeds below 2 mph or temperatures below -58F
		 * or above 41F
		 */

		 // Add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get user to provide a temperature
		 System.out.print("Enter a temperature in Fahrenheit that's between -58F and 41F: ");
		 double temperature = input.nextDouble();

		 // get user to enter a wind speed
		 System.out.print("Enter a wind speed that is greater than or equal to 2 mph: ");
		 double windSpeed = input.nextDouble();
		 windSpeed = Math.pow(windSpeed, 0.16);
		 
		 // compute wind-chill temperature
		 double windChill = 35.74 + (0.6215 * temperature) - (35.75 * windSpeed) + (0.4275 * temperature * windSpeed);

		 // display result
		 System.out.println("The wind-chill temperature is: " + windChill);

	}

}
