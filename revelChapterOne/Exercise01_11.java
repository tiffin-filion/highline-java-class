package revelChapterOne;

public class Exercise01_11 {

	public static void main(String[] args) {
		/* The U.S Census Bureau projects population based
		 * on the following assumptions:
		 * 1 birth every 7 seconds
		 * 1 death every 13 seconds
		 * 1 new immigrant every 45 seconds
		 * 
		 * Write a program to display the population for each of the next
		 * five years. Assume the current population is 312,032,486
		 * and one year has 365 days.
		 * 
		 * Hint: In Java, if two integers perform division, the result
		 * is an integer. The fractional part is truncated. To get an
		 * accurate result with the fractional part, one of the values
		 * involved in the division must be a number with a decimal
		 * point.
		 * 
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
