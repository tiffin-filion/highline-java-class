package revelChapterThree;

import java.util.Scanner;

public class Exercise03_29 {

  public static void main(String[] args) {
    /*
     * Program prompts user to enter the center coordinates and radii of two circles
     * Determines whether the second circle is inside the first or overlaps with the first
     * circle2 is inside circle1 if distance between two centers <= r1 - r2
     * circle2 overlaps circle1 if distance between the two centers <= r1 + r2
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double r1 = input.nextDouble();
    
    System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double r2 = input.nextDouble();
    
    double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);

    if ((r2 >= r1) && (distance <= (r2 - r1))) {
      System.out.println("circle 1 is inside circle 2");
    }
    else if ((r1 >=r2) && (distance <= (r1 - r2))) {
      System.out.println("circle 2 is inside circle 1");
    }
    else if (distance > (r1 + r2)) {
      System.out.println("circle 2 does not overlap circle 1");
    }
    else {
      System.out.println("circle 2 overlaps circle 1");
    }
    
  }

}
