package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_01 {

  public static void main(String[] args) {
    // compute absolute difference between the sum of boys integers 
    // and the sum of girls' integers
  }
  
  public static void boyGirl(Scanner input) throws FileNotFoundException {
        // count # of boys & # of girls
        int boyCount = 0;
        int girlCount = 0;
        // count sum of boys #'s & sum of girls #'s
        int boySum = 0;
        int girlSum = 0;
        int count = 0;
        // difference between boy & girl sums
        int difference = 0;
        // save names somewhere
        String name = "";
        
        while (input.hasNext()) {
            count++; // which number of integer in input it is
            
            name = input.next();
            
            if (count %2 != 0) {
                // if count is odd = boy
                boyCount++; // counts # of boys
                boySum += input.nextInt();  // sums the boys integers
            }
            else if (count %2 == 0) {
                // if count is even = girl
                girlCount++; // counts # of girls
                girlSum += input.nextInt();  // sums the girls integers
            } 
            
            // compute difference between boy & girl sums
            difference = Math.abs(boySum - girlSum);
        }
        System.out.println(boyCount + " boys, " + girlCount + " girls");
        System.out.println("Difference between boys' and girls' sums: " + difference);
    }
}

