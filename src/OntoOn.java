import java.util.Scanner;

public class OntoOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			// Your code should start here

			System.out.println("Do some stuff");

			// This is where your code should stop
			System.out.println("do you want to continue?");
			cont = scan.nextLine();

			scan.close();

		}
	}
}
/*
 * do { statements } while(Boolean_expression);
 */