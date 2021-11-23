package practice_it;

import java.util.*;
import Java.io.*;

public class Exercise_06_19 {

  public static void main(String[] args) {
    // convert input to "leet speak"
    // replace some letters with numbers
    // wrap each word in parenthesis
    /* original character | leet character
     * o    | 0
     * l    | 1
     * e    | 3
     * a    | 4
     * t    | 7
     * s    | Z (but only at the ends of words
     */

  }
  
  public static void leetSpeak(Scanner input, PrintStream output) {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        
        Scanner scanLine = new Scanner(line);
        while (scanLine.hasNext()) {
            String word = scanLine.next();
            
            if ((word.contains("o")) || (word.contains("l")) || (word.contains("e"))
               || (word.contains("a")) || (word.contains("t")) || (word.contains("s"))) {
                word = word.replace("o", "0");
                word = word.replace("l", "1");
                word = word.replace("e", "3");
                word = word.replace("a", "4");
                word = word.replace("t", "7");
                if (word.charAt(word.length() - 1) == 's') {
                    word = word.substring(0, word.length() -1) + "Z";
                }
            }
            
            output.print("(" + word + ") ");
        }
        output.println();
    }
}

}
