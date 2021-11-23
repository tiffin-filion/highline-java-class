package revelChapterThree;

import java.util.Scanner;

public class Exercise03_15 {

  public static void main(String[] args) {
    /*
     * revise Lottery.java to generate a lottery of a 3-digit number
     * Program prompts the user to enter a 3-digit number and determines whether the user wins according to the rules
     * - if user input matches the lottery number in the exact order, award is $10,000
     * - if all digits in user input match all digits in lottery number, award is $3,000
     * - if one digit in user input matches a digit in lottery number, award is $1,000
     */
    
    // Generate a lottery
    int lottery = (int)(Math.random() * 1000);
    
    // Prompt the user to enter a gues    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();
    
    // Get digits from lottery
    int lotteryDigit1 = lottery / 100;
    int lotteryRemainder = lottery % 100;
    int lotteryDigit2 = lotteryRemainder / 10;
    int lotteryDigit3 = lotteryRemainder % 10;
    
    // Get digits from guess
    int guessDigit1 = guess / 100;
    int guessRemainder = guess % 100;
    int guessDigit2 = guessRemainder / 10;
    int guessDigit3 = guessRemainder % 10;
    
    System.out.println("The lottery number is " + lottery);
    
    // Check the guess
    if (guess == lottery)
      System.out.println("Exact match: you win $10,000");
    else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1
        || guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit2
        || guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit3 && guessDigit2 == lotteryDigit3)
      System.out.println("Match all digits: you win $3,000");
    else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3
        || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
        || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3)
      System.out.println("Match one digit: you win $1,000");
    else
      System.out.println("Sorry, no match");
  }
}

