package revelChapterTwo;

import java.util.Scanner;

public class Section02_11 {

	public static void main(String[] args) {
		/* Rewrite the program (revelChapterOne - Exercise01_11)
		 * to allow entry of years to calculate
		 */

		// add Scanner so user can provide input
		Scanner input = new Scanner(System.in);

		// get number of years to calculate from user
		System.out.print("Enter the number of years: ");
		int years = input.nextInt();

		int startingPopulation = 312032486;
		int yearsToSeconds = 365 * 24 * 60 * 60;
		int birthsPerSecond = 7;
		int deathsPerSecond = 13;
		int immigrantsPerSecond = 45;

		System.out.println("Population in " + years + "(s) will be ");
		System.out.println(startingPopulation + ((yearsToSeconds * years) / birthsPerSecond) - ((yearsToSeconds * years) / deathsPerSecond) + ((yearsToSeconds * years) / immigrantsPerSecond));
	}

}
