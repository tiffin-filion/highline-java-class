package revelChapterOne;

public class ShowLogicErrors {

	public static void main(String[] args) {
		// Demonstrates logic errors
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32); // conversion is wrong, 9 should be 9.0 to get a decimal integer
		
		System.out.print("Celsius 35 is Fahrenheit degree ");
		System.out.println((9.0 / 5) * 35 + 32); // this should show the correct answer of 95F
	}

}
