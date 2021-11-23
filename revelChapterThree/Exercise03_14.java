package revelChapterThree;

import java.util.Scanner;

public class Exercise03_14 {

  public static void main(String[] args) {
    /*
     * Program lets user guess whether the flip of a coin results in heads or tails
     * Program randomly generates and integer 0 or 1, which represents head or tail
     * Program prompts user to enter a guess and reports whether the guess is correct or not
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter guess for heads(0) or tails (1)");
    int guess = input.nextInt();
    
    int flip = (int)(Math.random() *2);
    
    if (guess == flip) {
      System.out.println("You got that correct");
    }
    else {
      System.out.println("Sorry, it was " + flip);
    }

  }

}
