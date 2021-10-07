package revelChapterTwo;

import java.util.Scanner;

public class Section02_20 {

	public static void main(String[] args) {
		/* Program takes in balance and apr to compute the interest
		 * formula: interest = balance * (annualInterestRate/1200)
		 */

		 // Add scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get balance from user
		 System.out.print("Enter a balance: ");
		 double balance = input.nextDouble();

		 // get annual percentage from user
		 System.out.print("Enter the annual percentage rate (APR): ");
		 double apr = input.nextDouble();

		 //compute interest
		 double interest = balance * (apr / 1200);

		 // display result
		 System.out.println("The interest is: " + interest);

	}

}
