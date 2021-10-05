package revelChapterOne;

public class Exercise01_12 {

	public static void main(String[] args) {
		/* Assume a runner runs 24 miles in 1 hour, 40 minutes and
		 * 35 seconds.
		 * Write a program that displays the average speed in kph.
		 * 1 mile = 1.6km
		 */

		System.out.print("The runner's kph average is ");
		System.out.println(((24 * 60) / 100.583) * 1.6);
	}

}
