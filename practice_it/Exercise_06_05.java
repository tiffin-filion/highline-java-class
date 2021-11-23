package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_05 {

  public static void main(String[] args) {
    // removes multiple spaces or tabs to a single space

  }
  public static void collapseSpaces(Scanner input) {
        
        while (input.hasNextLine()) {
            String line = input.nextLine();
            
            Scanner scanLine = new Scanner(line);
            
            while (scanLine.hasNext()) {
                String word = scanLine.next();
                System.out.print(word + " ");
            }
            System.out.println();
        } 
        
    }

}
