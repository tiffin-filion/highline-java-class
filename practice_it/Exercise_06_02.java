package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_02 {

  public static void main(String[] args) {
    // total number of numbers
    // sum of the numbers
    // count of even numbers
    // percentage of even numbers
  }
  
  public static void evenNumbers(Scanner input) {
    int totalNumberOfNumbers = 0;
    int currentNumber = 0;
    int sumOfNumbers = 0;
    int countEvenNumbers = 0;
    double percentageEvenNumbers;
    
    while (input.hasNextInt()) {
        currentNumber = input.nextInt();
        totalNumberOfNumbers++;  // counts how many numbers there are
        sumOfNumbers += currentNumber;  // adds the sum of the numbers
        
        if (currentNumber % 2 == 0) {           
            countEvenNumbers++;  // counts even numbers
        }        
    }
    
    percentageEvenNumbers = ((double)countEvenNumbers / (double)totalNumberOfNumbers) * 100.0;

    
    System.out.println(totalNumberOfNumbers + " numbers, sum = " + sumOfNumbers);
    System.out.printf(countEvenNumbers + " evens (%.2f" + "%%)", percentageEvenNumbers);
}

}
