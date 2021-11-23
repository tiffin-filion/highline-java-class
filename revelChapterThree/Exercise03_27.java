package revelChapterThree;

import java.util.Scanner;

public class Exercise03_27 {

  public static void main(String[] args) {
    /*
     * Suppose right triangle is placed on a plane
     * Right-angle point is placed at (0, 0), other two points at (200, 0) and (0, 100)
     * Program prompts user to enter point with x and y coordinates determines whether point is inside the triangle
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a point's x- and y-coordinates: ");
    double x = input.nextDouble(); // p
    double y = input.nextDouble(); // p
    
    double x1 = 200; // a
    double y1 = 0; // a
    double x2 = 0; // b
    double y2 = 100; // b
    double x3 = 0; // c
    double y3 = 0; // c
    
    double triangleABC = Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    double trianglePBC = Math.abs((x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2)) / 2.0);
    double trianglePAC = Math.abs((x * (y1 - y3) + x1 * (y3 - y) + x3 * (y - y1)) / 2.0);
    double trianglePAB = Math.abs((x * (y1 - y2) + x1 * (y2 - y) + x2 * (y - y1)) / 2.0);
    
    if ((trianglePBC + trianglePAC + trianglePAB) == triangleABC) {
      System.out.println("Point is in the triangle");
    }
    else {
      System.out.println("Point is not in the triangle");
    }
  }

}
