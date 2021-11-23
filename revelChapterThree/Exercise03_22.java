package revelChapterThree;

import java.util.Scanner;

public class Exercise03_22 {

  public static void main(String[] args) {
    /*
     * Program prompts user to enter a point (x, y)
     * Checks whether the point is within the circle centered at (0, 0) with radius 10
     * For example (4, 5) is inside the circle and (9, 9) is outside the circle
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a point ");
    double x = input.nextDouble();
    double y = input.nextDouble();
    
    double distance = Math.sqrt((Math.pow(x - 0, 2))+(Math.pow(y - 0, 2)));

    if (distance <= 10) {
      System.out.println("Point (" + x + ", " + y + ") is in the circle");
    }
    else {
      System.out.println("Point (" + x + ", " + y + ") is not in the circle");
    }
  }

}
