package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_14 {

  public static void main(String[] args) {
    // prints duplicated tokens
    // counts how many times it appears consecutively
    // non-repeats are not printed
    // repetition across multiple lines not counted

  }
  
  public static void printDuplicates(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine();
      
      Scanner word = new Scanner(line);
      String last = word.next();
      int count = 1;
      
      while (word.hasNext()) {
        String current = word.next();
        if (last.equals(current)) {
          count++;
        }
        else {
          if (count > 1) {
            System.out.print(last + "*" + count + " ");
          }
          count = 1;
        }
        last = current;
      }
      if (count > 1) {
        System.out.print(last + "*" + count + " ");
      }
      System.out.println();
    }
  }

}
