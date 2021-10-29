package revelChapterThree;

import java.util.Scanner;

public class Exercise03_03 {

  public static void main(String[] args) {
    /*
     * A linear equation can be solved using Cramer's rule
     * Prompt user to enter a, b, c, d, e and f and display the result
     * If ad - bc is 0, "The equation has no solution."
     * ax + by = e
     * cx + dy = f
     * x = (ed - bf)/(ad - bc)
     * y = (af - ec)/(ad - bc)
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter values for a, b, c, d, e, and f (1 2 3 4 5 6): ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();
    double e = input.nextDouble();
    double f = input.nextDouble();
    
    double x = (e * d - b * f) / (a * d - b * c);
    double y = (a * f - e * c) / (a * d - b * c);
    
    // "x is ... and y is ..."
    System.out.println("X is " + x + " and Y is " + y);
  }

}
