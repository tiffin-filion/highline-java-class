package revelChapterTwo;

import java.util.Scanner;

public class Section02_01 {

	public static void main(String[] args) {
		/* Program that converts Celsius to Fahrenheit
		 * fahrenheit = ( 9 / 5 ) * celsius + 32
		 */
		
		// create scanner so user can add input
		Scanner input = new Scanner(System.in);
		
		// ask user to enter temperature in Celsius
		System.out.print("Enter a Celsius amount to convert: ");
		double celsius = input.nextDouble();
		
		// convert Celsius to Fahrenheit
		double fahrenheit = ( 9 / 5.0 ) * celsius + 32;
		
		// display result to user
		System.out.print(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit.");
	}

}
