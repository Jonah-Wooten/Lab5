import java.util.Scanner;

public class Wed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// command shift o
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a nuber between 1 and 7:");
		int num = input.nextInt();

		switch (num) {
		case 1:
			System.out.println("You entered 1");

		case 2:
		case 4:
		case 6:
			System.out.println("the nuver entered is even");
		case 7:
			System.out.println("You entered lucky #7");
			break;

		default:
			System.out.println("The number is not between 1 and 7 or is 3, r 5");

		}

	}

}
