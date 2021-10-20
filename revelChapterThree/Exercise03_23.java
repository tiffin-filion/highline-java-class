package revelChapterThree;

import java.util.Scanner;

public class Exercise03_23 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // user enters a point
        System.out.print("Enter a point with two coordinates: ");
        System.out.print("As # # (2 2)");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // rectangle with center as 0 0

        // Point (x, y) is (not) in the rectangle
        if (((x <= 5.0) && (x >= -5.0)) && ((y <= 2.5) && (y >= -2.5))) {
            System.out.println("Point (" + x + ", " + y + ") is in the rectangle");
        } else {
            System.out.println("Point (" + x + ", " + y + ") is not in the rectangle");
        }

    }

}

