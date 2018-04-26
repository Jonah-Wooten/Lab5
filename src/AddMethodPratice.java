import java.util.Scanner;

public class AddMethodPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Number");

		int num1 = scan.nextInt();
		System.out.println("Enter another number");

		int num2 = scan.nextInt();

		System.out.println(sumDisplay(num1, num2));

	}

	public static int sumDisplay(int input1, int input2) {
		return input1 + input2;
	}
}
