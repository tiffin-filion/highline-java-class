package classwork;
import java.util.Scanner;
public class RevelCh3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int x1;
    int x2;
    int y1;
    int y2;
    int z;
    
    System.out.print("Enter number for x1: ");
    x1 = input.nextInt();
    
    System.out.print("Enter number for x2: ");
    x2 = input.nextInt();
    
    System.out.print("Enter number for y1: ");
    y1 = input.nextInt();
    
    System.out.print("Enter number for y2: ");
    y2 = input.nextInt();
    
    z = ((x1 > x2) ? x1 : x2) - ((y1 > y2) ? y2 : y1);
    
    System.out.println("Answer is: " + z);

  }

}
