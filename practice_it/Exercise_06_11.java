package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_11 {

  public static void main(String[] args) {
    // wraps lines at 60 characters
    // does not break inside a word
  }

  public static void wordWrap3(Scanner input) throws FileNotFoundException {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        
        while (line.length() > 60) {
            if (line.charAt(60) == ' ') {
                System.out.println(line.substring(0, 60));
                line = line.substring(61);
            } else {
                int index = line.substring(0, 60).lastIndexOf(" ");
                System.out.println(line.substring(0, index));
                line = line.substring(index + 1);
            }
        }
        
        System.out.println(line);
    }
}
}
