package BeginnerLevelMust;

public class HCForGCD {

//Euclidean Theorem: If you keep on subtracting higher value from lower one, at last, one value
// become zero & non zero will be GCD.
// Similarly if you keep on doing modulus of max value from minimum value, same result.

	public static void main(String[] args) {

		int hcf = findHCF3(32, 12);

		System.out.println("HCF is: " + hcf);

	}

	// Method 1: Doing subtraction
	private static int findHCF(int a, int b) {

		if (a == 0) {

			return b;
		} else if (b == 0) {

			return a;
		}

		else if (a > b) {

			return findHCF(a - b, b);
		} else {

			return findHCF(a, b - a);
		}

	}

	// Method 2: Doing Modulus
	private static int findHCF2(int a, int b) {

		if (a == 0) {

			return b;
		}

		return findHCF2(b % a, a);
	}

	// Method 3: Simple observation
	private static int findHCF3(int a, int b) {

		int min, hcf = 0;
		
// Using Ternary operator to find min value. Used to avoid if else condition.
		
		min = a < b ? a : b;
		// up to minimum is sufficient to find Highest common factor.
		for (int i = 1; i < min; i++) {

			if (a % i == 0 && b % i == 0) {

				hcf = i;
			}
		}

		return hcf;

	}

}
