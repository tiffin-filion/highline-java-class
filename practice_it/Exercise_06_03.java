package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_03 {

  public static void main(String[] args) {
    // sums numbers until it is negative

  }
  
  public static boolean negativeSum(Scanner input) {
        
        int sum = 0;
        int number = 0;
        int count = 0;
        
        while (input.hasNextInt()) {
            count++;
            number = input.nextInt();
            sum += number;
            
            if (sum < 0) {
                System.out.println(sum + " after " + count + " steps");
                return true;
            }
        }
            System.out.println("no negative sum");
            return false;
    }

}
