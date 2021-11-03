package classwork;

import java.util.Scanner;

public class MaxValue {

  public static void main(String[] args) {
    /* Program reads integers, finds the largest and counts how many times it occurs
     * 0 ends the input
     * Test input: 3 5 2 5 5 5 0
     * Max: 5, Count: 4
     */
    
    Scanner input = new Scanner(System.in);

    int userInput = 1;
    int max = -100000;
    int count = 1;
    
    while (userInput != 0) {
      System.out.print("Enter an integer (enter 0 to quit): ");
      userInput = input.nextInt();

      if (userInput > max) {
        max = userInput;
        count = 1;
      }
      else if (userInput == max) {
        count ++;
      }
    }
    
    System.out.println("The largest number is " + max);
    System.out.println("The occurrence count of the largest number is " + count);
  }
}
