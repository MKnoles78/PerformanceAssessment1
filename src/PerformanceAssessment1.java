
//CIS218: Unit 4.4 Performance Assessment
//User Entry of Age
import java.util.InputMismatchException;
import java.util.Scanner;

public class PerformanceAssessment1 {

	public static void main(String[] args) {
		// Ask user for their age
		Scanner input = new Scanner(System.in);
		boolean invalid = false;

		do {
			// takes in input from user
			System.out.print("Please enter your age: ");
			int age = input.nextInt();

			try {
				// if input is less than one or greater than 100 exception occurs
				if (age > 1 && age < 100) {
					System.out.printf("%nYour age is: %d%n", age);
					invalid = false;
				} else {
					invalid = true;
					throw new InputMismatchException();
				} // end else
			} catch (InputMismatchException inputMismatchException) {
				// Output message Invalid age. Please try again
				System.out.printf("%n%s: You must enter a valid age.%n", inputMismatchException);
				System.out.println("\nInvalid age. Please try again.\n");

			}

		} while (invalid); // Continues to output Invalid age, until valid input received

	}

}
