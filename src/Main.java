// Import the Scanner util.
import java.util.Scanner;

/**
 * Approximates pi based on an inputted number of 
 * iterations of the Leibniz approximation.
 */
public class Main {

	/** Compiler constructor. */
	public static void main(String[] args) {
		// Instantiates the scanner object.
		Scanner scanner = new Scanner(System.in);
		// The amount of terms of the Leibiz approximation.
		int iterations = 0;

		// Runs until the amount of loops to be used is greater than 0.
		while (iterations < 1) {
            // Requests an integer.
		    System.out.println("How many terms of the Leibniz approximation would you like to use when calculating pi?");
			// If the input is an integer, set that value as the amount of iterations.
			iterations = scanner.hasNextInt() ? scanner.nextInt() : 0;
            // "Reset" the scanner.
            scanner.nextLine();
        }
		// The approximation of pi.
		double approximation = 0;

		// Loops through the series until the termination iteration is reached.
		for (int i = 1; i < iterations; i++) {
			// Series representation of the approximation from term 1 to i.
			approximation += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		// The Leibniz alternating series evaluates pi/4;
		approximation = 4 * approximation;

		// Outputs the approximation.
		System.out.println("The approximation of pi based on " + iterations
				+ " terms of the Leibniz alternating series is " + approximation);

		// The percent error of the approximation compared to pi.
		double percentError = (approximation - Math.PI) / Math.PI * 100;

		// Outputs the error.
		System.out.println("The error of the approximation is " + percentError
				+ "%");

		// Terminates the scanner runnable.
		scanner.close();
	}
}