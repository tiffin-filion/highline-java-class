package revelChapterFour;

import java.util.Scanner;

public class Exercise04_11 {

  public static void main(String[] args) {
    /* Program prompts user to enter an int between 0 and 15
     * Displays corresponding hex number
     * Incorrect input, displays invalid input message
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a decimal value (0 to 15): ");
    int decimalToHex = input.nextInt();
    
    if (decimalToHex >= 0 && decimalToHex <= 9) {
      System.out.println("The hex value is " + decimalToHex);
    }
    
    else if (decimalToHex >= 10 && decimalToHex <= 15) {
      decimalToHex += 55;
      System.out.println("The hex value is " + (char)(decimalToHex));
    }
    
    else {
      System.out.println(decimalToHex + " is an invalid input");
    }
  }
}
