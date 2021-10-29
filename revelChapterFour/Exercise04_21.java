package revelChapterFour;

import java.util.Scanner;

public class Exercise04_21 {

  public static void main(String[] args) {
    /* Program prompts user to enter an SSN in the format DDD-DD-DDDD
     * D = digit
     * Program should check if input is valid
     */
    
    Scanner input = new Scanner(System.in);   
    
    System.out.print("Enter an SSN: ");
    String ssn = input.nextLine();

    if (ssn.length() == 11) {
      String dashOne = ssn.substring(3, 4);
      String dashTwo = ssn.substring(6, 7);
      if (dashOne.equals(dashTwo)) {
        String first = ssn.substring(0, 3);
        String second = ssn.substring(4, 6);
        String third = ssn.substring(7, 11);
        if (first.length() == 3) {
          if (second.length() == 2) {
            if (third.length() == 4) {
              System.out.println(ssn + " is a valid social security number");
            }
            else {
              System.out.println(ssn + " is an invalid social security number");
            }
          }
          else {
            System.out.println(ssn + " is an invalid social security number");
            } 
        }
        else {
          System.out.println(ssn + " is an invalid social security number");
        } 
      }
      else {
        System.out.println(ssn + " is an invalid social security number");
      }  
    }
    else {
      System.out.println(ssn + " is an invalid social security number");
    }
  }
  }
