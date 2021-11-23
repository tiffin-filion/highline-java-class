package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_15 {

  public static void main(String[] args) {
    // h = heads, t = tails
    // each line is a separate set of coin flips
    // output number & percentage of heads per line (round to nearest tenth)
    // if percentage more than 50%, prints "You win"

  }
  
  public static void coinFlip(Scanner input) {
    while (input.hasNextLine()) {
      String line = input.nextLine().toLowerCase(); // all input is now lowercase to make matching easier
      
      int headCount = 0;
      int totalCount = 0;
      double percentage = 0.0;
      
      Scanner scanLine = new Scanner(line); 
      while (scanLine.hasNext()) {
        String word = scanLine.next();
        switch(word) {
          case "h": headCount++; totalCount++; break;
          case "t": totalCount++; break;
        }
      }
      percentage = ((double)headCount / (double)totalCount * 100.0);
      System.out.printf(headCount + " heads (%.1f" + "%%)\n", percentage);
      
        if (percentage >= 50.0) {
            System.out.println("You win!\n");
        } else {
            System.out.println();
        }
    }
}
  }

}
