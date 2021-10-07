package revelChapterTwo;

import java.util.Scanner;

public class Section02_22 {

	public static void main(String[] args) {
		/* Rewrite (Section02_10) ComputeChange.java to fix the possible
		 * loss of accuracy when converting a double value to an int value.
		 * Enter the input as an integer whose last two digits represent the cents.
		 * For example, the input 1156 represents 11 dollars and 56 cents.
		 */

		 // Create a Scanner
		 Scanner input = new Scanner(System.in);

		 // Receive the amount
		 System.out.print("Enter an amount, for example, 1156 ($11.56): ");
		 int amount = input.nextInt();

		 int remainingAmount = amount;

		 // Find the number of one dollars
		 int numberOfOneDollars = remainingAmount / 100;
		 remainingAmount = remainingAmount % 100;

		 // Find the number of quarters in the remaining amount
		 int numberOfQuarters = remainingAmount / 25;
		 remainingAmount = remainingAmount % 25;

		 // Find the number of dimes in the remaining amount
		 int numberOfDimes = remainingAmount / 10;
		 remainingAmount = remainingAmount %10;

		 // Find the number nickels in the remaining amount
		 int numberOfNickels = remainingAmount / 5;
		 remainingAmount  = remainingAmount % 5;

		 // Find the number of pennies in the remaining amount
		 int numberOfPennies = remainingAmount;

		 // Display results
		 System.out.println("Your amount " + amount + " consists of ");
		 System.out.println("\t" + numberOfOneDollars + " dollars");
		 System.out.println("\t" + numberOfQuarters + " quarters");
		 System.out.println("\t" + numberOfDimes + " dimes");
		 System.out.println("\t" + numberOfNickels + " nickels");
		 System.out.println("\t" + numberOfPennies + " pennies");


	}

}
