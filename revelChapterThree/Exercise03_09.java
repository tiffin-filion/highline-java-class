package revelChapterThree;

import java.util.Scanner;

public class Exercise03_09 {

  public static void main(String[] args) {
    /*
     * ISBN-10 consists of 10 digits. The last is a checksum which is calculated from the other nine digits.
     * Formula: (d1 x 1 + d1 x 2...etc. up to 9) % 11
     * If the checksum is 10, the last digit is denoted as X
     * Prompt user for the first 9 digits and display the 10 digit ISBN
     * Include leading zeros
     * Input as integer
     */
    
    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    Scanner input = new Scanner(System.in);
    int isbn = input.nextInt();

    int isbnI = isbn % 10;
    int remainder = isbn / 10;
    
    int isbnH = remainder % 10;
    remainder = remainder / 10;
    
    int isbnG = remainder % 10;
    remainder = remainder / 10;
    
    int isbnF = remainder % 10;
    remainder = remainder / 10;
    
    int isbnE = remainder % 10;
    remainder = remainder / 10;
    
    int isbnD = remainder % 10;
    remainder = remainder / 10;
    
    int isbnC = remainder % 10;
    remainder = remainder / 10;
    
    int isbnB = remainder % 10;
    remainder = remainder / 10;
    
    int isbnA = remainder;
    
    int isbnSum = (isbnA * 1) + (isbnB * 2) + (isbnC * 3) + (isbnD * 4) + (isbnE * 5) + (isbnF * 6) + (isbnG * 7) + (isbnH * 8) + (isbnI * 9);
    int checksum = isbnSum % 11;
    if (checksum == 10) {
      System.out.print("The ISBN-10 number is " + isbnA + isbnB + isbnC + isbnD + isbnE + isbnF + isbnG + isbnH + isbnI + "X");
    }
    else {
      System.out.println("The ISBN-10 number is " + isbnA + isbnB + isbnC + isbnD + isbnE + isbnF + isbnG + isbnH + isbnI + checksum);
    }

  }

}
