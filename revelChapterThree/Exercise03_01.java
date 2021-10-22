package revelChapterThree;

import java.util.Scanner;

public class Exercise03_01 {

  public static void main(String[] args) {
    /*
     * two roots of a quadratic equation ax(2) + bx + c = 0 can be obtained using the following formula
     * r1 = (-b + squareroot(b(2) - 4ac)/2a and r2 = (-b - squareroot(b(2) - 4ac)/2a
     * b(2) - 4ac is called the discriminant of the quadratic equat"ion.
     * If positive, the equation has two real roots. If zero, the equation has one root.
     * If negative, the equation has no real roots. Math.pow(x, 0.5) for squareroot
     */
    
    // Create scanner to get input
    Scanner input = new Scanner(System.in);

    // user enters values for a, b and c
    System.out.print("Enter a, b and c (3 3 3): ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    
    double r1 = (((-1 * b) + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
    double r2 = (((-1 * b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a));
    
    double discriminant = Math.sqrt((Math.pow(b, 2) - (4 * a * c)));
    
    // if positive display two roots
    if (discriminant > 0) {
      System.out.println("Discriminant is positive and it's two roots are: " + r1 + " & " + r2);
    }
    
    // if zero, display one root
    else if (discriminant == 0) {
      System.out.println("Discriminant is zero and the shared root is: " + r1);
    }
    
    // otherwise "The equation has no real roots."
    else {
      System.out.println("The equation has no real roots.");
    }
  }
}
