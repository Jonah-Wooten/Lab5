import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String Y = null;
		String cont = Y;
		int num;
		int I = 1;

		System.out.println("Enter a number:");
		num = scan.nextInt();

		System.out.printf("%-10s  %-10s  %-10s %n", "Number", "Squared", "Cubed");
		System.out.printf("%-10s  %-10s  %-10s %n", "=====", "=====", "=====");

		for (int i = 1; i <= num; i++)

		{
			System.out.printf("%-10s  %-10s  %-10s %n", i, +i * i, i * i * i);

		}
		System.out.println("do you want to continue?");
		num = scan.nextInt();

		scan.close();
	}
}
