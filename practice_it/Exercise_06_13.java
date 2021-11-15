package practice_it;
import java.util.*;
import java.io.*;

public class Exercise_06_13 {

  public static void main(String[] args) {
    // removes comments before printing

  }
  
  public static void stripComments(Scanner input) throws FileNotFoundException {
    while (input.hasNextLine()) {
      String line = input.nextLine();
      
      if (!line.startsWith("/*")) {
        if (!line.contains("/*") && line.endsWith("*/")) {
          line = "";
        }
        else if (line.contains("/*") && line.contains("*/")) {
          line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
        }
        else if (line.contains("//")) {
          line = line.substring(0, line.indexOf("//"));
        }
        System.out.println(line);
      }
    }
}
}

