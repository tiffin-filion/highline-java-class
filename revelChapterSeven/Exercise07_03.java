package revelChapterSeven;

import java.util.*;

public class Exercise07_03 {

  public static void main(String[] args) {
    // program reads integers between 1 and 100 and counts occurrences of each
    Scanner in = new Scanner(System.in);
    
    int[] numbers = new int[100];
    int input;
    int count = 0;
    
    System.out.print("Enter integers between 1 and 100: ");
    
    do {
      input = in.nextInt();
      numbers[count] = input;
      count++;
    }
    while (input != 0);
    
    countOccurence(numbers); 
  }
  
  public static void countOccurence(int[] numberList) {
    for (int i = 1; i <= 100; i++) {
      int count = 0;
      for (int j = 0; j < numberList.length - 1; j++) {
        if (numberList[j] == i) {
          count++;
        }
      }
      if (count != 0) {
        System.out.printf("%d occurs %d %s%n", i, count, count > 1 ? "times" : "time");
      }
    }
  }
}
