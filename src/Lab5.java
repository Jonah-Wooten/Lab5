
// Jonah Wooten & Tim Pieniazek Lab Number 5 4/26/18
import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Welcome Statement
		System.out.println("Welcome to the Factorial Calculator!");

		String cont = "Y";
		// Repeat if user doen't wish to continue
		while (cont.equalsIgnoreCase("Y")) {

			// User inputs a number 1 - 10
			System.out.println("Enter a number 1 to 10");

			// Setting the factorial at 1 to use inside of loop
			long f = 1;
			Scanner scan = new Scanner(System.in);

			int num = 0;

			// Repeat the scanner until the user enters the correct number
			while (num < 1 || num > 10) {

				num = scan.nextInt();

			}
			// This is our factorial formula
			// the loop counts from to the number
			for (int i = 1; i <= num; i++) {
				f = f * i;

			}
			// The printf subs for variables after the commas
			System.out.printf("The factorial of %s is %s", num, f);

			// Prompt user to continue
			System.out.println("Continue? y/n");
			cont = scan.next();
		}

		System.out.println("GAME OVER :(");

	}
}