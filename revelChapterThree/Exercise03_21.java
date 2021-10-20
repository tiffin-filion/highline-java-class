package revelChapterThree;

import java.util.Scanner;

public class Exercise03_21 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    /* Zeller's congruence
     * h = (q + 26(m + 1)/10 + k + k/4 + j/4 + 5j) % 7
     * h = day of the week, q = day of the month
     * m = month (jan and feb are counted as months 13 and 14 of the previous year)
     * j = the century (year/100)
     * k = year of the century (year%100)
     */
    
    // enter year
    System.out.print("Enter year: ");
    int year = input.nextInt();
    
    // enter month
    System.out.print("Enter month: ");
    int m = input.nextInt();
    
    // enter day
    System.out.print("Enter the day of the month: ");
    int q = input.nextInt();
    
    if (m == 1) {
      m += 12;
      --year;
      }
    else if (m == 2) {
      m += 12;
      --year;
      }
   
    int j = year / 100;
    int k = year % 100;
    String week = "";

    int h = (q + (26 * (m + 1))/10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
    
    switch(h) {
      case 0: week = "Saturday"; break;
      case 1: week = "Sunday"; break;
      case 2: week = "Monday"; break;
      case 3: week = "Tuesday"; break;
      case 4: week = "Wednesday"; break;
      case 5: week = "Thursday"; break;
      case 6: week = "Friday"; break;
    }
       
    // display name of the day of the week
    System.out.println("Day of the week is " + week);

  }
}
