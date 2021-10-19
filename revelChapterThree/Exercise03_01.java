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

    // user enters values for a, b and c
    System.out.print("Enter a, b and c (3 3 3): ");
    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    
    // if positive display two roots
    // if zero, display one root
    // otherwise "The equation has no real roots."
  }
}
