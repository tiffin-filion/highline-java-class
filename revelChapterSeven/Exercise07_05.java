package revelChapterSeven;

import java.util.*;

public class Exercise07_05 {

  public static void main(String[] args) {
    // reads 10 numbers and displays number of distinct numbers
    
    Scanner input = new Scanner(System.in);
    int[] numbers = new int[10];
    
    System.out.print("Enter ten numbers: ");
    int elementIndex = 0;
    
    for (int i = 0; i < numbers.length; i++) {
      boolean inArray = false;
      int num = input.nextInt();
      for (int j = 0; j < numbers.length; j++) {
        if (num == numbers[j]) {
          inArray = true;
        }
      }
      if (!inArray) {
        numbers[elementIndex] = num;
        elementIndex++;
      }
    }
    System.out.println("The number of distinct numbers is " + elementIndex);
    for (int a = 0; a < elementIndex; a++) {
      System.out.print(numbers[a] + " ");
    }
  }
}


