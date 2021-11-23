package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_16 {

  public static void main(String[] args) {
    // print the name the occurs most frequently per line
    // add total number of unique names found total in the file
    // assume no name appears on multiple lines

  }

  public static int mostCommonNames(Scanner input) {
    int uniqueName = 0;
    
    while (input.hasNextLine()) {
      String line = input.nextLine();
      
      Scanner nextName = new Scanner(line);
      String last = nextName.next();
      uniqueName++;
      
      String commonName = last;
      int mostCommon = 1;
      int count = 1;
      
      while (nextName.hasNext()) {
        String current = nextName.next();
          if (current.equals(last)) {
            count++;
          } else {
            if (count > mostCommon) {
              mostCommon = count;
              commonName = last;
            }
            count = 1;
            uniqueName++;
          }
          last = current;
        }
        if (count > mostCommon) {
          commonName = last;
        }
        System.out.println("Most common: " + commonName);
      }
      return uniqueName;
    }
  }
