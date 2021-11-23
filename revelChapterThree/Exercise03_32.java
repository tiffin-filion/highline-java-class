package revelChapterThree;

import java.util.Scanner;

public class Exercise03_32 {

  public static void main(String[] args) {
    /* given a directed line from point p0(x0, y0) to p1(x1, y1)
     * Can use the following condition to decide whether a point p2(x2, y2) is on the left of the line, on the right or on the same line
     * (x1-x0) * (y2-y0) - (x2-x0) * (y1-y0)
     * >0 p2 is on the left
     * =0 p2 is on the same line
     * <0 p2 is on the right
     * Program prompts user to enter three points for p0, p1 and p2
     * Displays whether p2 is on the left from p0 or p1, on the right or on the same line
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three points for p0, p1, and p2: ");
    double x0 = input.nextDouble(); // point a of line
    double y0 = input.nextDouble();
    
    double x1 = input.nextDouble(); // point b of line
    double y1 = input.nextDouble();
    
    double x2 = input.nextDouble(); // point to find the location of
    double y2 = input.nextDouble();
    
    double line = ((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0));
    
    if (line > 0) {
      System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
    else if (line == 0) {
      System.out.println("(" + x2 + ", " + y2 + ") is on the same line as (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
    else {
      System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }

  }

}
