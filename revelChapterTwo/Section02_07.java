package revelChapterTwo;

import java.util.Scanner;

public class Section02_07 {

	public static void main(String[] args) {
		// Program converts minutes into years and days (assuming year is not a leap year)

		 // enable Scanner so user can send input to pro389gram
		 Scanner input = new Scanner(System.in);

		 // prompt user to enter minutes
		 System.out.print("Enter an amount of minutes to get the amount of years and days: ");
		 int minutes = input.nextInt();

		 // get number hours
		 int hours = minutes / 60;

		 // get number of days
		 int days = hours / 24;

		 // get remainging days after finding years
		 int years = days / 365;
		 days = days % 365;
		 System.out.println(minutes + " minutes is " + years + " year(s) & " + days + " days.");
	}

}
