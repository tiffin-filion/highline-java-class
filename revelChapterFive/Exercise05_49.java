package revelChapterFive;

import java.util.*;

public class Exercise05_49 {

  public static void main(String[] args) {
    /* A, E, I, O, U = vowels
     * prompt user for string
     * display number of vowels and consonants
     */
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String userInput = input.next().toLowerCase(); // conver to lower to make it easier
    
    int stringLength = userInput.length();
    int vowels = 0;
    int consonants = 0;
    
    for (int i = 0; i < stringLength; i++) {
      char ch = (char)(i);
      
      if (ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u'){
        // count the consonants
        consonants++;
      }
      else {
        // count the vowels
        vowels++;
        vowels = stringLength - consonants;
      }
      
    }
    
    System.out.println("The number of vowels is " + vowels);
    System.out.println("The number of consonants is " + consonants);
  }

}
