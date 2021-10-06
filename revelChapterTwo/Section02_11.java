package revelChapterTwo;

public class Section02_11 {

	public static void main(String[] args) {
		/* Rewrite the program (revelChapterOne - Exercise01_11) to prompt the user to enter the number of
		 * years and displays the population after the number of years.
		 * Use the int in the exercise for this program. The population
		 * should be cast into an integer
		 */

		System.out.print("Population in one year will be ");
		System.out.println(312032486 + ((365 * 24 * 60 * 60 * 1) / 7.0) - ((365 * 24 * 60 * 60 * 1) / 13.0) + ((365 * 24 * 60 * 60 * 1) / 45.0));

		System.out.print("Population in two years will be ");
		System.out.println(312032486 + ((365 * 24 * 60 * 60 * 2) / 7.0) - ((365 * 24 * 60 * 60 * 2) / 13.0) + ((365 * 24 * 60 * 60 * 2) / 45.0));
		
		System.out.print("Population in three years will be ");
		System.out.println(312032486 + ((365 * 24 * 60 * 60 * 3) / 7.0) - ((365 * 24 * 60 * 60 * 3) / 13.0) + ((365 * 24 * 60 * 60 * 3) / 45.0));
		
		System.out.print("Population in four years will be ");
		System.out.println(312032486 + ((365 * 24 * 60 * 60 * 4) / 7.0) - ((365 * 24 * 60 * 60 * 4) / 13.0) + ((365 * 24 * 60 * 60 * 4) / 45.0));
		
		System.out.print("Population in five years will be ");
		System.out.println(312032486 + ((365 * 24 * 60 * 60 * 5) / 7.0) - ((365 * 24 * 60 * 60 * 5) / 13.0) + ((365 * 24 * 60 * 60 * 5) / 45.0));
	}

}
