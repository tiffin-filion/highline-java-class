package revelChapterFour;

import java.util.Scanner;

public class Exercise04_17 {

  public static void main(String[] args) {
    /* Program prompts user to enter a year and first three letters of a month name
     * Displays number of days in the month
     * First letter of month name must be in uppercase
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    System.out.print("Enter a month: ");
    String month = input.next();

    if (Character.isUpperCase(month.charAt(0)) != true) {
      System.out.println(month + " is not a correct month name");
    }
    else {
      if ((year % 100 == 0 && year % 400 == 0) ^ (year % 4 == 0)) {
        System.out.println(month + " " + year + " has 29 days");
      }
      else {
        switch(month) {
          case "Jan": System.out.println(month + " " + year + " has 31 days"); break;
          case "Feb": System.out.println(month + " " + year + " has 28 days"); break;
          case "Mar": System.out.println(month + " " + year + " has 31 days"); break;
          case "Apr": System.out.println(month + " " + year + " has 30 days"); break;
          case "May": System.out.println(month + " " + year + " has 31 days"); break;
          case "Jun": System.out.println(month + " " + year + " has 30 days"); break;
          case "Jul": System.out.println(month + " " + year + " has 31 days"); break;
          case "Aug": System.out.println(month + " " + year + " has 31 days"); break;
          case "Sep": System.out.println(month + " " + year + " has 30 days"); break;
          case "Oct": System.out.println(month + " " + year + " has 31 days"); break;
          case "Nov": System.out.println(month + " " + year + " has 30 days"); break;
          case "Dec": System.out.println(month + " " + year + " has 31 days"); break;
        }
      }
    }
  }
}
