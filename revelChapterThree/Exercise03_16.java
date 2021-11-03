package revelChapterThree;

public class Exercise03_16 {

  public static void main(String[] args) {
    /*
     * Program that displays a random coordinate in a rectangle
     * Rectangle is centered at (0, 0) with width 100 and height 200
     */
    
    // random coordinate inside rectangle
    int x = (int)((Math.random() * 201) - 100);
    int y = (int)((Math.random() * 401) - 200);
    
    System.out.println(x + ", " + y + " is inside the 100 x 200 rectangle");
    
    

  }

}
