package revelChapterTwo;

import java.util.Scanner;

public class Section02_06 {

	public static void main(String[] args) {
		/* Write a program that reads an integer between 0 and 1000
		 * adds all the digits in the integer (if int = 932, sum = 14)
		 * HINT: Use the % operator to extract digits
		 * Use the / operator to remove extracted digit
		 * 932 % 10 = 2 and 932 / 10 = 93
		 */
		
		// add Scanner to get user input
		Scanner input = new Scanner(System.in);
		
		// get integer from user (0 - 1000);
		System.out.print("Pick a number between 0 to 1000 (not including 0 or 1000): ");
		int integer = input.nextInt();
		
		// extract all digits of integer
		int onesInt = integer % 10;	
		int intRemainder = integer - onesInt;
	
		int tensInt = intRemainder / 10;
		tensInt %= 10;

		int hundredsInt = intRemainder / 100;

		// add all digits together
		System.out.println(integer + " = " + hundredsInt + " + " + tensInt + " + " + onesInt + " = " + (hundredsInt + tensInt + onesInt));

	}

}
