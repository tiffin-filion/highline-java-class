package revelChapterSeven;

import java.util.*;

public class Exercise07_01 {

  public static void main(String[] args) {
    /* read in student scores, get best score, assign grade based on scheme
     * A = score >= best - 10
     * B = score >= best - 20
     * C = score >= best - 30
     * D = score >= best - 40
     * Grade is F otherwise
     * prompt user to enter total number of students
     * prompt user to enter all scores
     * display grades
     */
    
    /* Enter the number of students: 4
     * Enter 4 scores: 40 55 70 58
     * Student 0 score is 40 and grade is C
     * Student 1 score is 55 and grade is B
     * Student 2 score is 70 and grade is A
     * Student 3 score is 58 and grade is B
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of students: ");
    int numStudents = input.nextInt();
    
    System.out.print("Enter " + numStudents + " scores: ");
    int[] studentScores = new int[numStudents];
    for (int i = 0; i < studentScores.length; i++) {
      studentScores[i] = input.nextInt();
    }
    
    // Get the best score
    double max = studentScores[0];
    for (int i = 1; i < studentScores.length; i++) {
      if (studentScores[i] > max) {
        max = studentScores[i];
      }
    }
    
    // Assign grades based on best score
    for (int i = 0; i < studentScores.length; i++) {
      if (studentScores[i] >= max - 10) {
        System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is A");
      }
      else if (studentScores[i] >= max - 20) {
        System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is B");
      }
      else if (studentScores[i] >= max - 30) {
        System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is C");
      }
      else if (studentScores[i] >= max - 40) {
        System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is D");
      }
      else {
        System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is F");
      }
    }

  }

}
