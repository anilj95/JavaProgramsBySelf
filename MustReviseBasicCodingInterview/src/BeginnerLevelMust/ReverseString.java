package BeginnerLevelMust;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Welcome to Beginnersbook";

		String reverse = reverseString3(str);

		System.out.print("Reverse string is:" + reverse);

	}

//Method 1: recursion
	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		// Calling Function Recursively
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	// Method 2: iteration
	public static String reverseString2(String str) {

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);

		}

		return reverse;

	}

	// Method 3: Using StringBuilder : In place reversal.
	public static String reverseString3(String str) {

		StringBuilder reverString = new StringBuilder();

		String[] strg = str.split(" ");

		for (String words : strg) {

			String reverseSrt = new StringBuilder(words).reverse().toString();

			reverString.append(reverseSrt + " ");
		}

		return reverString.toString().trim();

	}

}
