package classwork.Project4;

import java.util.*;

public class FutureInvestmentValue {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an investment amount $: ");
    double investmentAmount = input.nextDouble();
    
    System.out.print("Enter an annual interest rate %: ");
    double monthlyInterestRate = input.nextDouble();
    
    System.out.print("Enter number of years: ");   
    int years = input.nextInt();

    System.out.println("\nYEARS\t|\tFUTURE VALUE");
    System.out.println("------------------------------");
    
    for (int i = 1; i <= 30; i++) {
      double FV = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
      System.out.printf("%2d\t|\t$%,.2f\n", i, FV);
    }
  }
  
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
    /* computes future investment value at given interest rate for 30 years
     * FV = PV (1 + i)t
     * FV = future investment value, PV = present value of investment/beginning value
     * i = interest, t = number of time periods in months it remains invested
     */   
    
    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate / 1200.0, years * 12.0);
    return futureInvestmentValue;
  }
}
