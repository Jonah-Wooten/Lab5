
public class DoWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		System.out.println(num++);
		System.out.println(num);

		System.out.println();// this is just for formating to show the difference between examples
		int num2 = 7;
		System.out.println(num2--);
		int counter = 100; // variable declared outside of loop

		// the do loop will always execute the code between the brackets at least once
		do {

			System.out.println("Counter:" + counter);
			counter--;

		} while (counter > 0);

	}

}
/*
 * for(initialization; Boolean_epression; update) { ) }
 */