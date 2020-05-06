// reference: javaaid
public class LongestCommonSubsequence {

	public static void main(String[] args) {

        
		String a = "javaaid";
		String b ="javaid";
		
		char[] X = a.toCharArray();
		char[] Y = b.toCharArray(); 
		
		int m = X.length;
		int n = Y.length;
		Integer[][] dp = new Integer[m+1][n+1];
		//int value = LCSM2(X,Y,m,n,dp);
		int value1 = LCSM3(X,Y,m,n);
		
		System.out.println(value1+" ");

	}

// method1: Using recursion	: time complexity: O(2^(m+n)) exponential

	private static int LCSM1(char[] X, char[] Y, int i, int j) {

		if (i <= 0 || j <= 0) {

			return 0;
		}
		if (X[i - 1] == Y[j - 1]) {

			return 1 + LCSM1(X, Y, i - 1, j - 1);
		} else {

			return Math.max(LCSM1(X, Y, i, j - 1), LCSM1(X, Y, i - 1, j));
		}
	}

	// method2: Using recursion + memoization : time complexity: exponential
	// space complexity: O(m+n)
	private static int LCSM2(char[] X, char[] Y, int i, int j, Integer[][] dp) {

		if (i <= 0 || j <= 0) {

			return 0;
		}
		if (dp[i][j] != null) {

			return dp[i][j];
		}
		if (X[i - 1] == Y[j - 1]) {

			return 1 + LCSM2(X, Y, i - 1, j - 1, dp);
		} else {

			return dp[i][j] = Math.max(LCSM2(X, Y, i, j - 1, dp), LCSM2(X, Y, i - 1, j, dp));
		}

	}

	// method3: Pure DP solution: efficient solution
	//
	private static int LCSM3(char[] X, char[] Y, int m, int n) {

		int[] memo = new int[n + 1];

		for (int i = 1; i <= m; i++) {

			int prev = 0;

			for (int j = 1; j <= n; j++) {

				int temp = memo[j];

				if (X[i - 1] == Y[j - 1]) {

					memo[j] = prev + 1;

				} else {
					memo[j] = Math.max(memo[j], memo[j - 1]);
				}

				prev = temp;

			}
		}
		
		return memo[n];
	}

}
