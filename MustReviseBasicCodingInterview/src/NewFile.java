
public class NewFile {

	public static void main(String[] args) {

		findPrime(10);

	}

	private static void findPrime(int num) {

		for (int i = 1; i <= num; i++) {

			int counter = 0;

			for (int j = i; j >= 1; j--) {

				if (i % j == 0) {

					counter += 1;
				}

			}

			if (counter == 2) {

				System.out.println(i);
			}

		}
	}

}
