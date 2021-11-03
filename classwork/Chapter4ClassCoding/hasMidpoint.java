package classwork;

import java.util.Scanner;

public class hasMidpoint {

  public static void main(String[] args) {
    /* Accepts three integers as parameters
     * Returns true if one of the integers is the midpoint between the other two
     * If one integer is exactly halfway between them
     * Method should return false if no such midpoint relationship exists
     */
    
    Scanner input = new Scanner(System.in);

    // get three integers
    System.out.print("Enter three integers with spaces between (1 2 3): ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    if (a - b == b - c || a - c == c - b || b - a == a - c || b - c == c - a || c - a == a - b || c - b == b - a) {
      System.out.println(true);
    }
    else {
      System.out.println(false);
    }
    
  }

}
