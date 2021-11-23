/*
 * Tiffin & Trang
 * CSCI 142 Object Oriented Program 1 with Java
 * Project 1: Proper Fractions, Improper Fractions, and Mixed Fractions
 * Prompts user to enter numerator and denominator
 * Returns if the fraction is proper or improper For improper it can return either a mixed fraction 
 * or a whole number
 */

import java.util.Scanner;

public class Fractions {

  public static void main(String[] args) {

    // create Scanner to capture user input
    Scanner input = new Scanner(System.in);

    // have user enter a numerator
    System.out.print("Enter a number to use as the numerator\n" + "(top number in a fraction): ");
    int numerator = input.nextInt();

    // have user enter a denominator
    System.out
        .print("Enter a number to use as the denominator\n" + "(bottom number in a fraction): ");
    int denominator = input.nextInt();

    // determine if the fraction is proper or improper
    if (numerator / denominator < 1) {
      System.out.println(numerator + " / " + denominator + " is a proper fraction.");
    }

    // Trang's solution
    else if (numerator / denominator >= 1 && numerator % denominator == 0) {
      System.out.println(numerator + " / " + denominator
          + " is an improper fraction and it can be reduced to " + (numerator / denominator) + ".");
    }

    else {
      int remainder = (numerator % denominator);

      System.out.println(
          numerator + " / " + denominator + " is an improper fraction and it's mixed fraction is "
              + (numerator / denominator) + " + " + remainder + " / " + denominator + ".");
    }

    /*
     * // Tiffin's solution
     * else if (numerator / denominator >= 1) {
     * 
     *   if (numerator % denominator == 0) { 
     *      System.out.println( numerator + " / " + denominator +
     *      " is an improper fraction and it can be reduced to " + (numerator / denominator) + "."); 
     *   }
     * 
     *   else { 
     *      int remainder = (numerator % denominator);
     * 
     *      System.out.println( numerator + " / " + denominator +
     *      " is an improper fraction and it's mixed fraction is " + (numerator / denominator) + " + " +
     *      remainder + " / " + denominator + "."); 
     *   } 
     *}
     */
  }
}
