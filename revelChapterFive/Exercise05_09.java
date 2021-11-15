package revelChapterFive;

import java.util.*;

public class Exercise05_09 {

  public static void main(String[] args) {
    /* prompts user to enter number of students, and each student's name and score
     * displays student with the highest score
     * displays student with the second-highest score
     * Use next() to read a name rather than using nextLine()
     * Assume number of students is at least 2
     */
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of students: ");
    int numberOfStudents = input.nextInt();
    double secondHighestScore = 0.0;
    String secondHighestStudent = "";
    double highestScore = 0.0;
    String highestStudent = "";
    
    for (int i = 0; i < numberOfStudents; i++) {

      System.out.print("Enter a student name: ");
      String studentName = input.next();

      System.out.print("Enter a student score: ");
      double studentScore = input.nextDouble();
      
      if (studentScore > highestScore) {
        secondHighestScore = highestScore;
        secondHighestStudent = highestStudent;
        highestScore = studentScore;
        highestStudent = studentName;
      }
      else if (studentScore > secondHighestScore) {
        secondHighestScore = studentScore;
        secondHighestStudent = studentName;
      }
      
    }
    System.out.println("Top two students: ");
    System.out.printf(highestStudent + "'s score is %.1f \n", highestScore);
    System.out.printf(secondHighestStudent + "'s score is %.1f", secondHighestScore);
  }

}
