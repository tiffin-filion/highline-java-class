package revelChapterTwo;

import java.util.Scanner;

public class Section02_04 {

	public static void main(String[] args) {
		/* Program that converts pounds to kilograms
		 * 1 pound = 0.454 kilograms
		 */
		
		// add Scanner to get user input
		Scanner input = new Scanner(System.in);
		
		// get number of pounds from user
		System.out.print("Enter in the number of pounds to convert: ");
		int pounds = input.nextInt();
		
		// convert to kilograms
		double kilograms = pounds * 0.454;
		
		// display result
		System.out.println(pounds + " pounds is " + kilograms + " in kilograms.");

	}

}
