package revelChapterTwo;

import java.util.Scanner;

public class Section02_21 {

	public static void main(String[] args) {
		/* Program that reads in investment amount, annual interest rate,
		 * and number of years, and displays the future investment value using
		 * the formula:
		 * futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
		 * monthlyInterestRate = annualInterestRate / 1200
		 */

		 // Add Scanner so user can provide input
		 Scanner input = new Scanner(System.in);

		 // get investment amount
		 System.out.print("Enter an investment amount: ");
		 double investmentAmount = input.nextDouble();

		 // get annual interest rate
		 System.out.print("Enter an interest rate percentage: ");
		 double annualInterestRate = input.nextDouble();

		 // get number of years
		 System.out.print("Enter in the number of years: ");
		 double numberOfYears = input.nextInt();

		 // compute investment value
		 double monthlyInterestRate = annualInterestRate / 1200;
		 double futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate * (numberOfYears * 12));

		 // display result
		 System.out.println("If you invest $" + investmentAmount + " at " + annualInterestRate + "% for " + (int)numberOfYears + 
		 " years, you will have a balance of $" + futureInvestmentValue);


	}

}
