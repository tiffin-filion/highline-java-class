package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_08 {

  public static void main(String[] args) {
    // outputs dobule spaced version of input

  }

  public static void doubleSpace(Scanner in, PrintStream out) {
    String line = "";
    
    while (in.hasNextLine()) {
        line += in.nextLine() + "\n\n";
    }
    out.println(line);
}
}
