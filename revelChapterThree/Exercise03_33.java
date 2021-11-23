package revelChapterThree;

import java.util.Scanner;

public class Exercise03_33 {

  public static void main(String[] args) {
    /*
     * Suppose you shop for rice in two different packages
     * Write program to compare the cost
     * Program prompts user to enter weight and price of each package
     * Displays the one with the better price
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter weight and price for package 1: ");
    double w1 = input.nextDouble();
    double p1 = input.nextDouble();
    
    System.out.print("Enter weight and price for package 2: ");
    double w2 = input.nextDouble();
    double p2 = input.nextDouble();
    
    // compute cost per weight of package 1
    double package1 = p1 / w1;
    
    // compute cost per weight of package 2
    double package2 = p2 / w2;

    if (package1 < package2) {
      System.out.println("Package 1 has the better price");
    }
    else if (package1 > package2){
      System.out.println("Package 2 has the better price");
    }
    else {
      System.out.println("Package 1 and Package 2 cost the same");
      }
  }

}
