package BeginnerLevelMust;

public class FibonacciSeries {

	public static void main(String[] args) {

		// printFibo(10);
		System.out.println(printFibo4(6));

	}

//Printing Fibonacci series.
//Method 1: Using Iteration
	private static void printFibo(int count) {

		int a = 0;
		int b = 1;
		int c;
		System.out.println(a + " ");
		System.out.println(b + " ");

		for (int i = 2; i < count; i++) {

			c = a + b;

			a = b;
			b = c;

			System.out.println(c + " ");

		}

	}

	// Find nth fibonacci number.
	// Method 1: Using Recursion
	/// Time Complexity: T(n) = T(n-1) + T(n-2) which is exponential.
	private static int printFibo2(int count) {

		if (count <= 1) {

			return count;
		} else {

			return printFibo2(count - 1) + printFibo2(count - 2);
		}

	}

	// Find nth fibonacci number.
	// Method 2: Using Recursion + Memoization= DP solution.
	private static int printFibo3(int count) {

		int[] f = new int[count + 2];

		f[0] = 0;
		f[1] = 1;

		for (int i = 2; i <= count; i++) {

			f[i] = f[i - 1] + f[i - 2];
		}
		return f[count];
	}

	// Method 3: Using Iteration. We saved space complexity in this method.
	//Time Complexity:O(n)
	private static int printFibo4(int count) {

		int a = 0;
		int b = 1;
		int c = 0;

		for (int i = 2; i < count; i++) {

			c = a + b;

			a = b;
			b = c;
		}
		return c;

	}

}
