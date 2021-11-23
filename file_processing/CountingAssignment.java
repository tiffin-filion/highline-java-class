package file_processing;

import java.util.*;
import java.io.*;

public class CountingAssignment {
  
  /* CSCI142 6915 - F21 - Obj-Orient Prog 1 with Java
   * Tiffin Filion
   * Assignment File Processing
   * Reads a file and outputs the number of lines
   * Number of words in each line
   * And number of letters in each word in each line
   */
  
  public static void main(String[] args) throws FileNotFoundException {
    
    // reads in the file word.txt
    Scanner input = new Scanner(new File("word.txt"));
    
    // initializing counter variables
    int lineCount = 0;
    int wordCount = 0;
    int letterCount = 0;
    
    // initializing a counter to count the number of lines
    while (input.hasNextLine()) {      
      String line = input.nextLine();
      lineCount++;
      
      // creating a scanner to scan the words and count them per line
      Scanner scanLine = new Scanner(line);      
      while (scanLine.hasNext()) {        
        String word = scanLine.next();
        wordCount++;
        letterCount = word.length();
        System.out.println("Word " + wordCount + " of line " + lineCount + " has " + letterCount + " letters.");
        }
      System.out.println("Line " + lineCount + " has " + wordCount + " words.");
      }
      System.out.println("File has " + lineCount + " lines."); 
    }
  }