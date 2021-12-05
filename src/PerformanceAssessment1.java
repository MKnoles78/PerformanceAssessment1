
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

		System.out.printf("Your age is: %d%n", age);
		// if input is less than one or greater than 100 exception occurs
		// Output message Invalid age. Please try again
		// Continues to out Invalid age, until valid input received

	}

}
