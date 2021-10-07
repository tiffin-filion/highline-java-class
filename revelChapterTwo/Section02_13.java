package revelChapterTwo;

import java.util.Scanner;

public class Section02_13 {

	public static void main(String[] args) {
		/* Suppose you save $100 each month into a savings account with
		 * the annual interest rate 5%. Thus, the monthly interest rate is
		 * 0.05/12 = 0.00417. After the first month, the value in the
		 * account becomes: 100 * (1 + 0.00417) = 100.417
		 * After the second month: (100 + 100.417) * (1 + 0.00417) = 201.252
		 * After the third month: (100 + 201.252) * (1 + 0.00417) = 302.507
		 * Write a program that prompts the user to enter a montly saving amount
		 * and displays the account value after the sixth month
		 */

		 // add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get monthly saving amount from user
		 System.out.print("Enter an amount to save each month: ");
		 double monthlySaving = input.nextDouble();

		 // calculate interest rate for a single month
		 double interest = (0.05/12) + 1;
		 
		 // calculate account balance
		 double currentBalance = monthlySaving * interest; // one month
		 currentBalance = (monthlySaving + currentBalance) * interest; // two months
		 currentBalance = (monthlySaving + currentBalance) * interest; // three months
		 currentBalance = (monthlySaving + currentBalance) * interest; // four months
		 currentBalance = (monthlySaving + currentBalance) * interest; // five months
		 currentBalance = (monthlySaving + currentBalance) * interest; // six months

		 System.out.println("Balance after six months " + currentBalance);

	}

}
