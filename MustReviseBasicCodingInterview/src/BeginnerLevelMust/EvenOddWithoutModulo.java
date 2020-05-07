package BeginnerLevelMust;

public class EvenOddWithoutModulo {

	public static void main(String[] args) {

		int num = 124;

		System.out.println(isEven3(num));

	}

// using modulo operator	
	private static boolean isEven(int n) {

		if (n % 2 == 0) {

			return true;
		} else {

			return false;
		}
	}

	// Method1: simply for loop & boolean property.
	// Start from 1 & make it false, next time it will be true.

	private static boolean isEven1(int n) {

		boolean isEven = true;

		for (int i = 1; i <= n; i++) {

			isEven = !isEven;
		}
		return isEven;
	}

	// Method2: Divide & multiply by 2, in same order, if no. is same, even
	// otherwise odd.

	private static boolean isEven2(int n) {

		if ((n / 2) * 2 == n) {

			return true;
		} else
			return false;

	}

	// Method3: Using bit manipulation.any odd no. last bit will be 1.

	private static boolean isEven3(int n) {

		if ((n & 1) == 1) {

			return false;
		} else {

			return true;
		}

	}

}
