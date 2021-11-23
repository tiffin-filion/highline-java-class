// Zorah Fung, CSE 142
// This program finds the average and high and low scores on a test
// stored inside of a file

import java.io.*;
import java.util.*;

public class CalculateGrades {
   public static void main(String[] args) throws FileNotFoundException {
      File data = new File("data.txt");
      Scanner input = new Scanner(data);
      
      int total = 0;
      int max = 0;
      int min = 101;
      int count = 0;
      String bestStudent = "";
      String notBestStudent = "";
      while (input.hasNext()) {
         String name = input.next();
         int score = input.nextInt();
         total += score;
         count++;
         if (score > max) {
            max = score;
            bestStudent = name;
         }
         if (score < min) {
            min = score;
            notBestStudent = name;
         }
      }
      System.out.println("The average was " + (double) total / count);
      System.out.println(bestStudent + " got the max score of " + max);
      System.out.println(notBestStudent + " got the min score of " + min);
   }
}