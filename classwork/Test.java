package classwork;

// just a place to help with Pearson Quizzes & Exercises

import java.util.Scanner;

public class Test {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter multiple lines of copy");
    
    while (input.hasNextLine() == true) {
      System.out.print(input + " ");
     }
  }
}
