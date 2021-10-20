package revelChapterThree;

import java.util.Scanner;

public class Exercise03_11 {
  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  int days = 0;
  String monthName = "";
  
  // prompt user for month
  System.out.print("Enter a number for the month: ");
  int month = input.nextInt();
  
  //prompt user for year
  System.out.print("Enter a four-digit year: ");
  int year = input.nextInt();
  
  switch(month) {
    case 1: days = 31; monthName = "January"; break;
    case 2: if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { days = 29; } else { days = 28; } monthName = "February"; break;
    case 3: days = 31; monthName = "March"; break;
    case 4: days = 30; monthName = "April"; break;
    case 5: days = 31; monthName = "May"; break;
    case 6: days = 30; monthName = "June"; break;
    case 7: days = 31; monthName = "July"; break;
    case 8: days = 31; monthName = "August"; break;
    case 9: days = 30; monthName = "September"; break;
    case 10: days = 31; monthName = "October"; break;
    case 11: days = 30; monthName = "November"; break;
    case 12: days = 31; monthName = "December"; break;
  }
  
  // display number of days in the month
  System.out.println(monthName + year + " has " + days + " days.");
}
}
