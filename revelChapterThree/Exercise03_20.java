package revelChapterThree;

import java.util.Scanner;

public class Exercise03_20 {

  public static void main(String[] args) {
    /*
     * Wind Chill app gives formula to compute wind-chill temperature
     * Formula is valid for temperatures between -58F and 41F and wind speed greater than or equal to 2
     * Program prompts user to enter a temperature and wind speed
     * Program displays wind-chill temperature if input is valid
     * If invalid, displays message indicating if temperature and/or wind speed is invalid
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the temperature in Fahrenheit: ");
    double temperature = input.nextDouble();
    
    System.out.print("Enter the wind speed in miles per hour: ");
    double windSpeed = input.nextDouble();
    
    if ((temperature >= -58 && temperature <= 41) && (windSpeed >= 2)) {
      windSpeed = Math.pow(windSpeed, 0.16);
      
      // compute wind-chill temperature
      double windChill = 35.74 + (0.6215 * temperature) - (35.75 * windSpeed) + (0.4275 * temperature * windSpeed);

      // display result
      System.out.println("The wind chill index is " + windChill);
    }
    else if (temperature < -58) {
      System.out.println("Temperature must be between -58F and 41F");
    }
    else if (temperature > 41) {
      System.out.println("Temperature must be between -58F and 41F");
    }
    else if (windSpeed < 2) {
      System.out.println("Speed must be greater than or equal to 2");
    }
  }
}

