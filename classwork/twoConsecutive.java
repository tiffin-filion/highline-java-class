package classwork;

import java.util.Scanner;

public class twoConsecutive {

  public static void main(String[] args) {
    /* Static method named twoConsecutive that accepts three integers as parameters
     * Returns true if there is at least one pair of integers that differ by exactly 1
     * Example: integers 3 and 4 diffre by 1
     * Method should return false if there are no such consecutive values
     * Integers could be passed in any order.
     */
    
    Scanner input = new Scanner(System.in);
    
    // enter three integers (1 2 3)
    System.out.print("Enter three integers separated by spaces (1 2 3): ");
    int a = Math.abs(input.nextInt());
    int b = Math.abs(input.nextInt());
    int c = Math.abs(input.nextInt());
    
    // are any numbers 1 digit away from each other
    
    if (a - b == 1 || a - c == 1 || b - a == 1 || b - c == 1 || c - a == 1 || c - b == 1) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }

  }

}
