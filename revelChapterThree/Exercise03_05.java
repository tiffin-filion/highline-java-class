package revelChapterThree;

import java.util.Scanner;

public class Exercise03_05 {

  public static void main(String[] args) {
    /* Program prompts user for an integer for today's day of week
     * Prompts user to enter number of days after today for a future day
     * Displays the future day of the week
     */
    
    Scanner input = new Scanner(System.in);
    
    /* get user to enter current day of week as a number
     * 0 - Sunday, 1 - Monday, etc.
     */
    
    System.out.print("Enter today's day: ");
    int currentDayOfWeek = input.nextInt();
    
    
    // get user to enter number of days from today
    
    System.out.print("Enter number of days elapsed since today: ");
    int daysFromToday = input.nextInt();
    
    System.out.print("Today is ");
    
    switch(currentDayOfWeek) {
      case 0: System.out.print("Sunday"); break;
      case 1: System.out.print("Monday"); break;
      case 2: System.out.print("Tuesday"); break;
      case 3: System.out.print("Wednesday"); break;
      case 4: System.out.print("Thursday"); break;
      case 5: System.out.print("Friday"); break;
      case 6: System.out.print("Saturday"); break;
    }
    
    System.out.print(" and the future day is ");
    
    int futureDay = (currentDayOfWeek + daysFromToday);
    if (futureDay > 7) {
      futureDay %= 7;
    }
    
    switch(futureDay) {
      case 0: System.out.print("Sunday"); break;
      case 1: System.out.print("Monday"); break;
      case 2: System.out.print("Tuesday"); break;
      case 3: System.out.print("Wednesday"); break;
      case 4: System.out.print("Thursday"); break;
      case 5: System.out.print("Friday"); break;
      case 6: System.out.print("Saturday"); break;
    }

  }

}
