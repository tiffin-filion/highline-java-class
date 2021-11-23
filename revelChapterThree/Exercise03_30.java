package revelChapterThree;

import java.util.Scanner;

public class Exercise03_30 {

  public static void main(String[] args) {
    /*
     * Revise the program to display the hour using a 12-hour clock.
     */
    
    // add Scanner so user can enter time zone offset
    Scanner input = new Scanner(System.in);

    // ask user for timezone offset
    System.out.println("Enter a timezone offset to convert GMT time to your local timezone (PST is -7): ");

    long offset = input.nextLong();

    long offsetSeconds = offset * 3600;

    // Obtain the total milliseconds since midnight, Jan 1, 1970
    long totalMilliseconds = System.currentTimeMillis();
    
    // Obtain the total seconds  since midnight, Jan 1, 1970
    long totalSeconds = (totalMilliseconds / 1000) + offsetSeconds;

    // Compute the current second in the minute in the hour
    long currentSecond = totalSeconds % 60;
    
    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;
    
    // Compute the current minute in the hour and convert using offset
    long currentMinute = (totalMinutes % 60);

    // Obtain the total hours
    long totalHours = totalMinutes / 60;
    
    // Compute the current hour
    long currentHour = totalHours % 24;
    
    String meridiem = "AM";
    
    if (currentHour > 12) {
      currentHour -= 12;
      meridiem = "PM";
    }
    
    // Display results
    System.out.printf("Current time is %02d:%02d:%02d " + meridiem,currentHour, currentMinute, currentSecond);
}
}
