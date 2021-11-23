package revelChapterThree;

import java.util.Scanner;

public class Exercise03_12 {

  public static void main(String[] args) {
    /*
     * Program prompts user for 3-digit integer
     * Determines whether it is a palindrome number
     * A number is palindrome if it reads the same from right to left and from left to right
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a three digit integer: ");
    int palindrome = input.nextInt();
    
    int a = palindrome % 10;
    int remainder = palindrome / 10;
    
    int b = remainder % 10;
    remainder = remainder / 10;
    
    int c = remainder;

    if (c == a) {
      System.out.println("Integer is a palindrome");
    }
    else {
      System.out.println("Integer is not a plaindrome");
    }
  }

}
