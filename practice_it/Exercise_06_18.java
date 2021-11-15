package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_18 {

  public static void main(String[] args) {
    // student's name + percentage of +'s

  }
  
  public static void plusScores(Scanner input) {
    while (input.hasNextLine()) {
        String name = input.nextLine();
        String line = input.nextLine();
        int total = line.length();
        int plus = 0;
        double percentage = 0.0;
        
        for (int i = 0; i < total; i++) {
            if (line.charAt(i) == '+') {
                plus++;
            }
        }
        percentage = ((double)plus / (double) total) * 100;
        System.out.printf(name + ": %.1f" + "%% plus\n", percentage);
    }
}

}
