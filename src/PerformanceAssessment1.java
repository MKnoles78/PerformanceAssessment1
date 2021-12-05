
//CIS218: Unit 4.4 Performance Assessment
//User Entry of Age
import java.util.Scanner;

public class PerformanceAssessment1 {

	public static void main(String[] args) {
		// Ask user for their age
		Scanner input = new Scanner(System.in);

		// takes in input from user
		System.out.print("Please enter your age: ");
		int age = input.nextInt();

		if (age > 1 && age < 100) {
			System.out.printf("Your age is: %d%n", age);
		} else {
			System.out.print("Your age is not within range, try again");
		}

		// if input is less than one or greater than 100 exception occurs
		// Output message Invalid age. Please try again
		// Continues to out Invalid age, until valid input received

	}

}
