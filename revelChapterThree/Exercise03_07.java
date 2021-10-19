package revelChapterThree;

import java.util.Scanner;

public class Exercise03_07 {

  public static void main(String[] args) {
    /*
     * Modify ComputeChange class to display the nonzero denominations only
     * Using singular words for single units such as 1 dollar and 1 penny
     * And plural words for more than one unit such as 2 dollars and 3 pennies
     */
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    // Receive the amount
    System.out.print("Enter an amount in double, for example, 11.56: ");
    double amount = input.nextDouble();
    
    int remainingAmount = (int)(amount * 100);
    
    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;
    
    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;
    
    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;
    
    // Find the  number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;
    
    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;
    
    // Display results
    System.out.println("Your amount " + amount + " consists of");
    System.out.println("\t" + numberOfOneDollars + " dollars");
    System.out.println("\t" + numberOfQuarters + " quarters");
    System.out.println("\t" + numberOfDimes + " dimes");
    System.out.println("\t" + numberOfNickels + " nickels");
    System.out.println("\t" + numberOfPennies + " pennies");

  }

}
