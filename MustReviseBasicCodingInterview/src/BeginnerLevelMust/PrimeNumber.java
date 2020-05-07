package BeginnerLevelMust;

public class PrimeNumber {

	public static void main(String[] args) {

		printPrime(20);
		boolean value = isPrime(1);

		System.out.println(value);

	}

	private static boolean isPrime(int num) {

		if (num <= 1) {

			return false;
		}
		// 1 is not a prime number.
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;
			}

		}

		return true;

	}

	private static void printPrime(int count) {

		String str = "";

		for (int i = 1; i <= count; i++) {

			int counter = 0;

			// we are dividing every no. by all number equal to and less than that no.(up to
			// 1)

			for (int num = i; num >= 1; num--) {

				if (i % num == 0) {

					counter = counter + 1;
				}

			}
			// Prime no. either divide by 1 or by itself, so counter==2.
			if (counter == 2) {

				str = str + i + " ";
			}

		}

		System.out.println("Prime no.s are:" + str);

	}

}
