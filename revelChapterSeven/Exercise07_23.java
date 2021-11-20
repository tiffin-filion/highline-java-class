package revelChapterSeven;

/* Game: Locker puzzle
 */

public class Exercise07_23 {

  public static void main(String[] args) {
    // Create & initialize arrays for students and lockers
    int[] students = new int[100];
    boolean[] lockers = new boolean[100];
    
    // Populate student array with numbers from 1 - 100
    for (int i = 0; i < students.length; i++) {
      students[i] = i + 1;
    }
    
    // Close all the lockers
    for (int j = 0; j < lockers.length; j++) {
      lockers[j] = false;
    }
    
    // Each student will change the locker according to their number
    for (int s : students) {
      int i = 1;
      while (i <= 100) {
        if ((i * s - 1) <= 100) {
          if (lockers[i * s - 1] == true) {
            lockers[i * s - 1] = false;
          }
          else {
            lockers[i * s - 1] = true;
          }
        }
        i++;
      }
    }
    
    for (int i = 0; i < lockers.length; i++) {
      if (lockers[i] == true) {
        System.out.println("Locker " + (i + 1) + " is open");
      }
    }
  }
}

