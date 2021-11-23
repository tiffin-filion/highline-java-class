package practice_it;

import java.util.*;
import java.io.*;

public class Exercise06_20 {

  public static void main(String[] args) {
    // preserve line breaks
    // first letter of each word is moved to the end
    // if the word starts with a vowel append "yay"
    // if the word starts with a consonant append "ay"
    // convert all words to lowercase
  }

  public static void pigLatin(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine();
      
      Scanner scanLine = new Scanner(line);
      while (scanLine.hasNext()) {
        String originalWord = scanLine.next();
        
        // check for vowels
        if (originalWord.charAt(0) == 'a' || originalWord.charAt(0) == 'e'
            || originalWord.charAt(0) == 'i' || originalWord.charAt(0) == 'o'
            || originalWord.charAt(0) == 'u') {
          originalWord = originalWord + "yay";
        }
        else {
          char firstChar = originalWord.charAt(0);
          String tempWord = originalWord.substring(1, originalWord.length() - 1);
          originalWord = tempWord + firstChar + "ay";
        }
        System.out.print(originalWord + " ");
      }
      System.out.println();
    }
  }
}
