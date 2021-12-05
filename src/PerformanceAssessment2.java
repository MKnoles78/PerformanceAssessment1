
//CIS218 Unit 4.5 PA: PerformanceAssessment2.java
//Author Mike Knoles
import java.util.InputMismatchException;
import java.util.Scanner;

public class PerformanceAssessment2 {

	public static void main(String[] args) {
		// Ask user for their age
		Scanner input = new Scanner(System.in);
		boolean invalid = false;

		do {
			// takes in input from user
			System.out.print("Please enter your age: ");
			int age = input.nextInt();

			try {
				// if input is less than 21 or greater than 100 exception occurs
				if (age > 21 && age < 100) {
					System.out.printf("%nYour age is: %d%n", age);
					invalid = false;
				} else {
					invalid = true;
					throw new InputMismatchException();
				} // end else
			} catch (InputMismatchException inputMismatchException) {
				// Output message Invalid age. Please try again
				if (age < 21) {
					System.out.printf("%n%s: You must enter a valid age.%n", inputMismatchException);
					System.out.println("\nThat age is too low. Please try again.\n");
				} else {
					System.out.printf("%n%s: You must enter a valid age.%n", inputMismatchException);
					System.out.println("\nThat age is too high. Please try again.\n");
				}

			} finally {
				System.err.println("Finally executed.");
			}

		} while (invalid); // Continues to output Invalid age, until valid input received

	}

}
