package revelChapterThree;

import java.util.Scanner;

public class Exercise03_28 {

  public static void main(String[] args) {
    /*
     * Program prompts the user to enter the center x, y coordinates, width and height of two rectangles
     * Determines whether the second rectangle is inside the first or overlaps with the first
     * 
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter r1's center x, y coordinates, width and height for rectangle 1: ");
    double x1 = input.nextDouble();
    double y1 = input.nextDouble();
    double w1 = input.nextDouble(); // width
    double h1 = input.nextDouble(); // height
    
    System.out.print("Enter r2's center x, y coordinates, width and height for rectangle 2: ");
    double x2 = input.nextDouble();
    double y2 = input.nextDouble();
    double w2 = input.nextDouble();
    double h2 = input.nextDouble();
    
    w1 /= 2; // to get half of width measurement
    h1 /= 2; // to get half of height measurement
    
    w2 /= 2;
    h2 /= 2;
    
    // calculate range of rectangle 1 and 2
    double x1max = x1 + w1;
    double y1max = y1 + h1;
    double x1min = x1 - w1;
    double y1min = y1 - h1;
    
    double x2max = x2 + w2;
    double y2max = y2 + h2;
    double x2min = x2 - w2;
    double y2min = y2 - h2;
    
    if (x1max == x2max && x1min == x2min && y1max == y2max
        && y1min == y2min) {
       // Check if the two are identicle
       System.out.print("r1 and r2 are indentical");
     
      } else if (x1max <= x2max && x1min >= x2min && y1max <= y2max
        && y1min >= y2min) {
       // Check if r1 is in r2
       System.out.print("r1 is inside r2");
      } else if (x2max <= x1max && x2min >= x1min && y2max <= y1max
        && y2min >= y1min) {
       // Check if r2 is in r1
       System.out.print("r2 is inside r1");
      } else if (x1max < x2min || x1min > x2max || y1max < y2min
        || y2min > y1max) {
       // Check if the two overlap
       System.out.print("r2 does not overlap r1");
      } else {
       System.out.print("r2 overlaps r1");
      }
  }

}
