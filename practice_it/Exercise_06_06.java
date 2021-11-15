package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_06 {

  public static void main(String[] args) {
    // reads entire file and prints contents to a string

  }
  public static String readEntireFile(Scanner input) {
        String line = "";
        
        while (input.hasNextLine()) {
            line += input.nextLine() + "\n";
        } return line;
    }

}
