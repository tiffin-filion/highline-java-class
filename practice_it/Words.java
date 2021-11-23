package practice_it;

import java.util.*;
import java.io.*;

//This program prints the total number of words in a file.

public class Words {
 public static void main(String[] args) throws FileNotFoundException {
     int wordCount = 0;
     Scanner input = new Scanner(new File("practice_it/wordinput.txt"));
     
     while (input.hasNext()) {
       String token = input.next();
       wordCount++;
     }
     
     System.out.println("Total words = " + wordCount);
 }
}
