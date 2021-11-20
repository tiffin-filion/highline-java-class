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

    System.out.println("Years\tFuture Value");

    for (int i = 1; i <= 30; i++) {
      years = i;
      double FV = futureInvestmentValue(investmentAmount, monthlyInterestRate, years);
      System.out.printf(i + "\t%.2f", FV);
    }
  }
  
  public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
    // FV = PV (1 + i)t

    double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate / 1200.0, years * 12.0);
    return futureInvestmentValue;
  }
}

