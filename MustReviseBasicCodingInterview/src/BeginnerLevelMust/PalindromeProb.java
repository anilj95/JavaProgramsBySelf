package BeginnerLevelMust;

public class PalindromeProb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean value = isPalindrome("abcddcba");

		System.out.println(value);
	}

	private static boolean isPalindrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		char[] ch = str.toCharArray();

		while (i < j) {

			if (ch[i] == ch[j]) {

				i++;
				j--;
			} else {

				return false;
			}

		}

		return true;
	}

}
