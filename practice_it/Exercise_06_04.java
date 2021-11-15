package practice_it;

import java.util.*;
import java.io.*;

public class Exercise_06_04 {

  public static void main(String[] args) {
    // add up cash values of all the coints
    // print total money at the end

  }
  
  public static void countCoins(Scanner input) {
        int number = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;
        String coinName = "";
        double totalValue = 0.0;
        
        while (input.hasNext()) {
            number = input.nextInt();
            coinName = input.next().toLowerCase();
            
            switch (coinName) {
                case "quarters": quarters += number; break;
                case "pennies": pennies += number; break;
                case "nickels": nickels += number; break;
                case "dimes": dimes += number; break;
            }
        }
        totalValue = (quarters * 0.25) + (pennies * 0.01) + (nickels * 0.05) + (dimes * 0.10);
        System.out.printf("Total money: $%.2f", totalValue);
    }

}
