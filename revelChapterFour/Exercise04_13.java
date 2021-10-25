package revelChapterFour;

import java.util.Scanner;

public class Exercise04_13 {

  public static void main(String[] args) {
    /* Program prompts user to enter a letter
     * Checks whether the letter is a vowel or consonant
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a letter: ");
    String letter = input.nextLine();

    char ch = letter.charAt(0);
    
    if (Character.isLetter(ch) == true) {
      if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        System.out.println(ch + " is a vowel");
      }
      else {
        System.out.println(ch + " is a consonant");
      }
    }
    
    else {
      System.out.println(ch + " is an invalid input");
    }
  }

}
