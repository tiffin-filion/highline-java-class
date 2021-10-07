package revelChapterTwo;

import java.util.Scanner;

public class Section02_23 {

	public static void main(String[] args) {
		/* Write a program that prompts the user to enter the
		 * distance to drive, the fuel efficiency of the car in miles
		 * per gallon, and the price per gallon, and displays the
		 * cost of the trip
		 */

		 // Add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // user to enter distance to drive in miles
		 System.out.print("Enter the miles to drive: ");
		 double distance = input.nextDouble();

		 // user to enter fuel efficiency of vehicle in miles per gallon
		 System.out.print("Enter the vehicle's fuel efficiency in mpg: ");
		 double mpg = input.nextDouble();

		 // user to enter price of gas per gallon
		 System.out.print("Enter the price of gas per gallon: ");
		 double gasPrice = input.nextDouble();

		 // compute trip cost
		 double tripCost = (distance / mpg) * gasPrice;

		 // display trip cost
		System.out.println("The cost of the trip will be $" + tripCost);
	}

}
