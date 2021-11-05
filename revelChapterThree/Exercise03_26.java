package revelChapterThree;

import java.util.Scanner;

public class Exercise03_26 {

  public static void main(String[] args) {
    /*
     * Program prompts user to enter integer and determines whether it is divisible by 5 and 6
     * By 5 OR 6, and whether divisible by 5 or 6, but not both
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter an integer: ");
    int userInput = input.nextInt();
    
    System.out.println("Is " + userInput + " divisible by 5 and 6? " + (userInput % 5 == 0 && userInput % 6 == 0));
    System.out.println("Is " + userInput + " divisible by 5 or 6? " + (userInput % 5 == 0 || userInput % 6 == 0));
    System.out.println("Is " + userInput + " divisible by 5 or 6, but not both? " + (userInput % 5 == 0 ^ userInput % 6 == 0));
    }
  }

