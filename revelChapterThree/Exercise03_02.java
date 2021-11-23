package revelChapterThree;

import java.util.Scanner;

public class Exercise03_02 {

  public static void main(String[] args) {
    /* Revise AdditionQuiz to generate three single-digit integers
     * Prompt user to enter the sum of these three integers
     */
    
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);
    int number3 = (int)(System.currentTimeMillis() / 100 % 10);
       
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
    
    int answer = input.nextInt();
    
    System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));

  }
}
