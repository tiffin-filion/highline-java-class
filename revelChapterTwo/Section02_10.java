package revelChapterTwo;

import java.util.Scanner;

public class Section02_10 {

	public static void main(String[] args) {
		/* Program that calculates the energy needed to heat water
		 * Q = M * (finalTemperature - initialTemperature) * 4184
		 * where M is the weight of water in kg, temperatures are in
		 * degrees Celsius, and energy Q is measured in joules
		 */

		 // add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get amount of water in kg from user
		 System.out.print("Enter the amount of water in Kilograms: ");
		 double waterWeight = input.nextDouble();

		 // get starting temperature of water from user
		 System.out.print("Enter the starting temperature of the water in Celsius: ");
		 double startingTemp = input.nextDouble();

		 // get ending temperature of water from user
		 System.out.print("Enter the ending temerature of the water in Celsius: ");
		 double endingTemp = input.nextDouble();

		 // compute energy needed to heat water
		 double energyNeeded = waterWeight * (endingTemp - startingTemp) * 4184;

		 // display result
		 System.out.println("The energy needed to heat " + (int) waterWeight + " kgs of water from " + (int)startingTemp + " Celcius to " + 
		 (int)endingTemp + " Celcius is " + (long)energyNeeded + " Joules.");


	}

}
