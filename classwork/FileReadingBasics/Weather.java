import java.io.*;
import java.util.*;
// Zorah Fung, CSE 142
// Prints out the change in temperature between days given by data
// stored in a file. Ignores tokens that are not real numbers.

public class Weather {
   public static void main(String[] args) throws FileNotFoundException {
      File data = new File("weather.txt");
      Scanner input = new Scanner(data);
      
      double temp1 = input.nextDouble();
      while (input.hasNext()) {
         if (input.hasNextDouble()) {
            double temp2 = input.nextDouble();
            
            System.out.println(temp1 + " to " + temp2 + ", change = " + (temp2 - temp1)); 
            temp1 = temp2;
         } else {
            input.next();
         }
      }
   }
}