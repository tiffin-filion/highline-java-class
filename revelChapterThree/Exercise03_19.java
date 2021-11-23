package revelChapterThree;

import java.util.Scanner;

public class Exercise03_19 {

  public static void main(String[] args) {
    /* Program reads 3 edges for a triangle and computes perimeter if input is valid
     * Otherwise, display input is invalid.
     * Input is valid if sum of every pair of 2 edges is greater than the remaining edge
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter three edges (length in double): ");
    double edgeA = input.nextDouble();
    double edgeB = input.nextDouble();
    double edgeC = input.nextDouble();
    
    if ((edgeA + edgeB) > edgeC ^ (edgeB + edgeC) > edgeA ^ (edgeC + edgeA) > edgeB) {
      double perimeter = edgeA + edgeB + edgeC;
      System.out.println("The perimeter is " + perimeter);
    }
    else {
      System.out.println("Input is invalid");
    }

  }

}
