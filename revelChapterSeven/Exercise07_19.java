package revelChapterSeven;

import java.util.*;

public class Exercise07_19 {

  public static void main(String[] args) {
    /* method returns true if the list is already sorted in increasing order
     * prompt user for a list of numbers and determine if sorted or not
     */
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the size of the list: ");
    int listSize = input.nextInt();
    
    System.out.print("Enter the contents of the list: ");
    int[] list = new int[listSize];
    for (int i = 0; i < listSize; i++) {
      list[i] = input.nextInt();
    }
    
    System.out.println("The list has " + listSize + " integers " + Arrays.toString(list));
    if (isSorted(list)) {
      System.out.println("The list is already sorted");
    }
    else {
      System.out.println("The list is not sorted");
    }
    

  }
  
  public static boolean isSorted(int[] list) {
    boolean result = true;
    for (int i = 0; i < list.length - 1; i++) {
      if (list[i] > list[i + 1]) {
        result = false;
      }
    }
    return result;
  }

}
