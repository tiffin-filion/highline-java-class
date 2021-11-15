package revelChapterSix;

import java.util.*;

public class Exercise06_23 {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);    
    
    System.out.print("Enter a string: ");
    String userString = input.nextLine();
    
    System.out.print("Enter a character: ");
    String userChar = input.next();
    
    char letter = userChar.charAt(0);

    System.out.println("The number of occurrences of '" + letter + "' in '" + userString + "' is " + count(userString, letter));
    
  }
  
  public static int count(String str, char a) {
    int count = 0;
    
    for (int i = 0; i < str.length(); i++) {
      if (a == str.charAt(i))
        count++;
    }
    
    return count;
  }

}
