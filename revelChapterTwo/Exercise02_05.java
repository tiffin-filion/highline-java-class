package revelChapterTwo;

import java.util.Scanner;

public class Exercise02_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Please enter your subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Please enter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        double gratuityAmount = subtotal * (gratuityRate / 100);
        double totalAmount = subtotal + gratuityAmount;

        System.out.println("Gratuity amount due is: " + gratuityAmount);
        System.out.println("Total Amount due is: " + totalAmount);

	}

}
