public class Infinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This code will run endlessly unless we add a stop condition
		while (true) {

			// will generate a number between 0 and 9
			int randomNum = (int) (Math.random() * 10);

			System.out.println(randomNum);

			// To break out of this loop we added a conditional statement with the break
			if (randomNum == 7) {
				System.out.println("The number 7 has been found!");
				break;
			}
		}
		for (int i = 0; i < 5; i++) {
			int randomNum = (int) (Math.random() * 10);
			System.out.println("Random: + randomNum");

			if (randomNum > 7) {
				System.out.println();
			}
		}
	}
}
