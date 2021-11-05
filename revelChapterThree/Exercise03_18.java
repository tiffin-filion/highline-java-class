package revelChapterThree;

import java.util.Scanner;

public class Exercise03_18 {

  public static void main(String[] args) {
    /*
     * Shipping company uses following function to calculate the cost (in dollars) of shipping based on weight of package (in pounds)
     * c(w) =   3.5, if 0 < w <= 1
     *          5.5, if 1 < w <= 3
     *          8.5, if 3 < w <= 10
     *          10.5, if 10 < w <= 20
     * Program prompts user to enter the weight of package and displays shipping cost
     * If weight is negative or zero "Invalid input"
     * If weight is greater than 20 "The package cannot be shipped"
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter weight of package: ");
    double weight = input.nextDouble();
    double cost;
    
    if (weight <= 0.0) {
      System.out.println("Invalid input");
      return;
    }
    else if (0.0 < weight && weight <= 1.0) {
      cost = 3.5;
      System.out.printf("The shipping cost is: $%.2f", cost);
    }
    else if (1.0 < weight && weight <= 3.0) {
      cost = 5.5;
      System.out.printf("The shipping cost is: $%.2f", cost);
    }
    else if (3.0 < weight && weight <= 10.0) {
      cost = 8.5;
      System.out.printf("The shipping cost is: $%.2f", cost);
    }
    else if (10.0 < weight && weight <= 20.0) {
      cost = 10.5;
      System.out.printf("The shipping cost is: $%.2f", cost);
    }
    else if (weight > 20.0) {
      System.out.println("The package cannot be shipped");
      return;
    }

  }

}
