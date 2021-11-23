package revelChapterFive;

import java.util.Scanner;

public class Exercise05_01 {

  public static void main(String[] args) {
    // Count positive and negative numbers and compute the average of numbers
    // Program ends with 0
    // Display average as floating-point number
    
    // read in an unspecified number of integers
    Scanner input = new Scanner(System.in);
    
    int userInput = 1;
    int positive = 0;
    int negative = 0;
    int total = 0;
    double count = 0;
    
    while (userInput != 0) {
      System.out.print("Enter an integer, the input ends if it is 0: ");
      userInput = input.nextInt();  
      
      if (userInput > 0) {
        positive++;
        total += userInput;
        count++;
      }
      else if (userInput < 0) {
        negative++;
        total += userInput;
        count++;
      }
}

    if (count == 0) {
      System.out.println("No numbers are entered except 0");
    }
    else {
      System.out.println("The number of positives is " + positive);
      System.out.println("The number of negatives is " + negative);
      System.out.println("The total is " + total);
      System.out.println("The average is " + ((double)total / (double)count));
  }
}
}