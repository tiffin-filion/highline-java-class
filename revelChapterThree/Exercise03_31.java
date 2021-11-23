package revelChapterThree;

import java.util.Scanner;

public class Exercise03_31 {

  public static void main(String[] args) {
    /*
     * Program prompts user to enter exchange rate from currency in US dollars to Chinese RMB
     * prompt user to enter 0 to convert from US to Chinese and 1 to convert from Chinese to US
     * prompt user to enter US dollar amount or chinese rmb amount to convert
     * convert to RMB or US Dollars respectively
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the exchange rate from dollars to RMB: ");
    double exchangeRate = input.nextDouble();
    
    System.out.print("Enter 0 to convert dollars to RMB and 1 to convert from RMB to dollars: ");
    int conversion = input.nextInt();
    
    System.out.print("Enter the dollar amount: ");
    double dollar = input.nextDouble();
    
    if (conversion == 0) {
      double CNY = dollar * exchangeRate;
      System.out.printf("$%.2f is %.4f Yuan", dollar, CNY);
    }
    else if (conversion == 1) {
      double USD = dollar / exchangeRate;
      System.out.printf("%.4f Yuan is $%.2f", dollar, USD);
    }

  }

}
