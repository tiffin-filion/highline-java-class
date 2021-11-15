package practice_it;

import java.util.*;
import java.io.*;

public class runningSum {

  public static void main(String[] args) throws FileNotFoundException {

    Scanner input = new Scanner(System.in);
    
    double sum = 0.0;
    double max = 0.0;
    System.out.print("running sum = ");
    
    while (input.hasNextDouble()) {
        double number = input.nextDouble();        
        sum += number;

        System.out.print(sum + " ");
        
        if (max <= sum) {
            max = sum;
        }       
    }
    
    System.out.println("\nmax sum = " + max);
  }
}