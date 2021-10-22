package revelChapterThree;

import java.util.Scanner;

public class Exercise03_08 {

  public static void main(String[] args) {
    /*
     * Program prompts user to enter three integers
     * Displays the integers in non-decreasing order
     */
    
    // Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three integers: ");
    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    
    if (a > b && b > c) {
      System.out.println("The integers you entered are: " + c + " " + b + " " + a);
    }
    else if (b > c && c > a) {
      System.out.println("The integers you entered are: " + a + " " + c + " " + b);
    }
    else if (c > a && a > b) {
      System.out.println("The integers you entered are: " + b + " " + a + " " + c);
    }
    else if (a > c & c > b) {
      System.out.println("The integers you entered are: " + b + " " + c + " " + a);
    }
    else if (b > a & a > c) {
      System.out.println("The integers you entered are: " + c + " " + a + " " + b);
    }
    else if (c > b && b > a) {
      System.out.println("The integers you entered are: " + a + " " + b + " " + c);
    }

  }

}
