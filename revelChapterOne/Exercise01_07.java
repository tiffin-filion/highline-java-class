package revelChapterOne;

public class Exercise01_07 {

	public static void main(String[] args) {
		/* Pi can be computed using the formula...
		 * pi = 4 x (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
		 * Write a program that displays the result
		 * And another that goes to 1/16
		 */
		
		System.out.print("Pi = ");
		System.out.println(4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0)));
		
		System.out.print("Pi = ");
		System.out.println(4.0 * (1.0 - (1.0 / 3.0) + (1.0 / 5.0) - (1.0 / 7.0) + (1.0 / 9.0) - (1.0 / 11.0) + (1.0 / 13.0)));
	}

}
