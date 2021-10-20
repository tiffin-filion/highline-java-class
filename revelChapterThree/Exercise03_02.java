package revelChapterThree;

import java.util.Scanner;

public class Exercise03_02 {

  public static void main(String[] args) {
    /* Revise AdditionQuiz to generate three single-digit integers
     * Prompt user to enter the sum of these three integers
     */
    
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is " + number1 + " + " + number2 + "? ");
    
    int answer = input.nextInt();
    
    System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

  }

}
