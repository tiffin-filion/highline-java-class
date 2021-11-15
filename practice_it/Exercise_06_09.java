package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_09 {

  public static void main(String[] args) {
    // wraps lines if they are more than 60 characters
    // can separate words

  }
  
  public static void wordWrap(Scanner input) {
        String output = "";

        
        while (input.hasNextLine()) {
            String line = input.nextLine();
            output = "";
            
            if (line.length() > 60) {
                while (line.length() > 0) {
                    int linePart = line.length() >= 60 ? 60 : line.length();
                    output += line.substring(0, linePart);
                    line = line.substring(linePart);
                    if (linePart >= 60) {
                        output += "\n";
                    }
                }
            }
                else {
                    output = line;
                }
            System.out.println(output);
        }
    }

}
