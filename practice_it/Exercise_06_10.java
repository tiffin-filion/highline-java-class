package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_10 {

  public static void main(String[] args) {
    // prints wrapped lines to a file rather than the console
    // line length is now saved as a variable

  }
  public static void wordWrap2(Scanner input, PrintStream out) {

        String output = "";
        int maxLineLength = 60;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            output = "";
            
            if (line.length() > maxLineLength) {
                while (line.length() > 0) {
                    int linePart = line.length() >= maxLineLength ? maxLineLength : line.length();
                    output += line.substring(0, linePart);
                    line = line.substring(linePart);
                    if (linePart >= maxLineLength) {
                        output += "\n";
                    }
                }
            }
            else {
                output = line;
            }
            
            out.println(output);
        }
    }

}
