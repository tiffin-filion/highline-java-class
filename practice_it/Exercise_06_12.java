package practice_it;
import java.util.*;
import java.io.*;

public class Exercise_06_12 {

  public static void main(String[] args) {
    // removes html before printing

  }
  public static void stripHtmlTags(Scanner input) throws FileNotFoundException {
    while (input.hasNextLine()) {
        String line = input.nextLine();
        
        while (line.contains("<") || line.contains(">")) {
            int start = line.indexOf("<");
            int end = line.indexOf(">");
            if (start == 0) {
                line = line.substring(end + 1);
            }
            else {
                line = line.substring(0, start) + line.substring(end + 1);
            }
        }
        System.out.println(line);
    }
}

}
