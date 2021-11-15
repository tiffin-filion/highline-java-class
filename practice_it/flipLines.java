package practice_it;

import java.util.*;
import java.io.*;

public class flipLines {

  public static void main(String[] args) {

  }
  
  public static void flipLines(Scanner input) throws FileNotFoundException {
    
    String lineA = "";
    String lineB = "";
    String tempA = "";
    String tempB = "";
    
    while (input.hasNext()) {
      lineA = input.next();
      lineB = input.next();
      
      if (lineA != null & lineB != null) {
        lineA = tempA;
        lineB = tempB;
        lineA = tempB;
        lineB = tempA;
        
        System.out.print(lineA + "\n" + lineB);
      }
    }
    
  }

}
