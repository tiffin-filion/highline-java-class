package revelChapterSix;

import java.util.Scanner;

public class Exercise06_07 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an investment amount $: ");
    double investmentAmount = input.nextDouble();
    
    System.out.print("Enter an annual interest rate %: ");
    double monthlyInterestRate = input.nextDouble();
    
    int years = 0;

    System.out.println("Years Future Value");

    for (int i = 1; i <= 30; i++) {
      years = i;
      double FV = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
      System.out.println(i + FV);
    }
    
    // now print out as a table, showing each year up to 30
  }
  
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
    /* computes future investment value at given interest rate for specified number of years
     * FV = PV (1 + i)t
     * FV = future investment value, PV = present value of investment/beginning value
     * i = interest, t = number of time periods in months it remains invested
     * if given years t = t * 12
     */
    
    
    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate / 1200.0, years * 12.0);

    return futureInvestmentValue;
    
    
  }

}

