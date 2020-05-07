package BeginnerLevelMust;

public class ReverseANo {

	public static void main(String[] args) {
		int num = reverseMethod3(155);
		System.out.print("Reverse of the input number is:" + num);
		// reverseMethod(num);

	}

	// method 1: using recursion
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.print(number);
			return;
		} else {
			System.out.print(number % 10);
			// Method is calling itself: recursion
			reverseMethod(number / 10);
		}
	}

	// method 2 : using for loop : interesting
	public static int reverseMethod2(int number) {

		int reverseNo = 0;

		for (; number != 0;) {

			reverseNo = reverseNo * 10;
			reverseNo = reverseNo + number % 10;
			number = number / 10;
		}

		return reverseNo;

	}

	// method 3 : using while loop

	public static int reverseMethod3(int number) {

		int reverseNo = 0;

		while (number != 0) {

			reverseNo = reverseNo * 10;
			reverseNo = reverseNo + number % 10; // provide remainder
			number = number / 10; // Separate last digit
		}

		return reverseNo;

	}

}
