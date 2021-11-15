package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_17 {

  public static void main(String[] args) {
    // number of lines in the file
    // longest line
    // number of tokens on each line
    // length of longest token per line

  }
  
  public static void inputStats(Scanner input) {
    
  }
  
  public static void inputStats(Scanner input) {
    int numberOfLines = 0;
    int lineLength = 0;
    String longestLine = "";
    
    while (input.hasNextLine()) {
        String line = input.nextLine();
        numberOfLines ++;
        
        if (line.length() > lineLength) {
            lineLength = line.length();
            longestLine = line;
        }
        
        int numberOfTokens = 0;
        int longestToken = 0;
        
        Scanner scanLine = new Scanner(line);
        while (scanLine.hasNext()) {
            String token = scanLine.next();
            numberOfTokens++;            
            
            if (token.length() > longestToken) {
                longestToken = token.length();
            }
        }
        System.out.println("Line " + numberOfLines + " has " + numberOfTokens + 
                           " tokens (longest = " + longestToken + ")");        
    }
    System.out.println("Longest line: " + longestLine);
}

}
