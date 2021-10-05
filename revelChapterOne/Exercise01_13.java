package revelChapterOne;

public class Exercise01_13 {

	public static void main(String[] args) {
		/* You can use Cramer's rule to solve the following 2 x 2
		 * system of linear equations:
		 * ax + by = e
		 * cx + dy = f
		 * 
		 * x = ed - bf/ad - bc
		 * y = af - ec/ad - bc
		 * 
		 * Write a program that solves the following equation and
		 * displays the value for x and y:
		 * 
		 * 3.4x + 50.2y = 44.5
		 * 2.1x + .55y = 5.9
		 */

		System.out.print("The value of x is ");
		System.out.println(((44.55 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));

		System.out.print("The value of y is ");
		System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
	}

}
