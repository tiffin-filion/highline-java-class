package revelChapterThree;

import java.util.Scanner;

public class Exercise03_06 {

  public static void main(String[] args) {
    /* using ComputeAndInterpretBMI class
     * user enters weight and height in feet and inches
     */

    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter weight in pounds
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();
    
    // Prompt the user to enter height in feet and inches
    System.out.print("Enter height in feet and inches: ");
    double heightInFeet = input.nextDouble();
    double heightInInches = input.nextDouble();
    
    final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
    final double METERS_PER_INCH = 0.0254; // Constant
    
    // Compute BMI
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = ((heightInFeet * 12) + heightInInches) * METERS_PER_INCH;
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);
    
    // Display result
    System.out.println("BMI is " + bmi);
    if (bmi < 18.5) System.out.println("Underweight");
    else if (bmi < 25) System.out.println("Normal");
    else if (bmi < 30) System.out.println("Overweight");
    else System.out.println("Obese");

  }

}
