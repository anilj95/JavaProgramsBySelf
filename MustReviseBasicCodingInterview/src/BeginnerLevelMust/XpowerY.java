package BeginnerLevelMust;

public class XpowerY {

	public static void main(String[] args) {

		int x = 2;
		int y = 4;

		System.out.printf("%d", power2(x, y));

	}

	// Method 1: Recursion
	// Time complexity: O(n)
	private static int power(int x, int y) {
		if (y == 0)
			return 1;
		else if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		else
			return x * power(x, y / 2) * power(x, y / 2);
	}

// Method 2: Divide & Conquer
//Time complexity: O(logn)  by calculating power(x, y/2) only once and storing it.

	private static int power2(int x, int y) {
		int temp;
		if (y == 0)
			return 1;
		temp = power(x, y / 2);
		if (y % 2 == 0)
			return temp * temp;
		else
			return x * temp * temp;
	}

}
