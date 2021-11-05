package classwork.FileOutput;

// Zorah Fung, CSE 142
// This program prompts for an output file name and prints out the contents
// or jabberwocky.txt to the given file. Total words is printed to the console

import java.io.*;
import java.util.*;

public class PrintFile {
   public static void main(String[] args) throws FileNotFoundException {
      File inputFile = new File("jabberwocky.txt");
      Scanner input = new Scanner(inputFile);
      
      Scanner console = new Scanner(System.in);
      System.out.print("Output file? ");
      String fileName = console.nextLine();
      File outputFile = new File(fileName);
      PrintStream output = new PrintStream(outputFile);
      
      
      int totalWords = 0;
      while (input.hasNextLine()) {
         // Processing a single line
         String line = input.nextLine();
         output.println(line);
         Scanner lineScan = new Scanner(line);
         while (lineScan.hasNext()) {
            // Process each token
            lineScan.next();
            totalWords++;
         }
      }
      
      System.out.println("Total number of words: " + totalWords);
   }
}
