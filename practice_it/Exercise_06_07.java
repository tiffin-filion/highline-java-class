package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_07 {

  public static void main(String[] args) {
    // switches the order of pairs of lines

  }
  public static void flipLines(Scanner input) {
    int i = 0;
    while (input.hasNextLine()) {
        String ignore = input.nextLine();
        if (i >= 0 && input.hasNextLine()) {
            String keep = input.nextLine();
            System.out.println(keep);
        }
        i++;
        System.out.println(ignore);
    }
}

}
