import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		// input a Scanner
		System.out.println("Enter a numver betwenn 1 and 100:");

		int num = input.nextInt();

		if (num % 2 == 0)
			System.out.println(num + "Even");
		if (num % 2 != 0)
			;
		System.out.println(num + " Odd");

		System.out.println("continue? Y/N");
		num = input.nextInt();

	}

}
