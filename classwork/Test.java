package classwork;

// just a place to help with Pearson Quizzes & Exercises

import java.util.*;

public class Test {

  public static void main(String[] args) {
    
    // Scanner input = new Scanner(System.in);
    
    dashedLine(-2);
  }
  
  public static void dashedLine(int i) {
    if (i > 0) {
      for (int j = 0; j < i; j++) {
        System.out.print("-");        
      }
      System.out.println();
    }
    else {
      return;
    }
  }
}
