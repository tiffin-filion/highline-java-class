package revelChapterThree;

import java.util.Scanner;

public class Exercise03_17 {

  public static void main(String[] args) {
    /*
     * Program that plays rock-paper-scissors (scissors cuts paper, rock breaks scissors, paper wraps rock)
     * Program randomly generates a number 0, 1, or 2 representing rock, paper, scissors
     * Program prompts user to enter a number and displays a message indicating whether user or computer wins, loses or draws
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your choice: 0 - Rock, 1 - Paper, or 2 - Scissors ");
    int guess = input.nextInt();
    
    int random = (int)(Math.random() * 3);
    
    if (guess == 0) // rock
    {
      switch(random) {
        case 0: System.out.println("Draw: Rock"); break; // rock & rock
        case 1: System.out.println("Lose: Paper covers Rock"); break; // paper covers rock
        case 2: System.out.println("Win: Rock breaks Scissors"); break;  // rock breaks scissors
      }
    }
    else if (guess == 1) // paper
    {
      switch(random) {
        case 0: System.out.println("Win: Paper covers Rock"); break; // paper covers rock
        case 1: System.out.println("Draw: Paper"); break; // paper & paper
        case 2: System.out.println("Lose: Scissors cuts paper"); break; // scissors cuts paper
      }
    }
    else if (guess == 2) // scissors
    {
      switch(random) {
        case 0: System.out.println("Lose: Rock breaks Scissors"); break; // rock breaks scissors
        case 1: System.out.println("Win: Scissors cuts Paper"); break; // scissors cuts paper
        case 2: System.out.println("Draw: Scissors"); break; // scissors & scissors
      }
    }
    else {
      System.out.println("That's not a valid guess");
      return;
    }

  }

}
