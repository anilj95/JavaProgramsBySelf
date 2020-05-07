package BeginnerLevelMust;
//given number 1-100, print "Fizz" if multiple of 3,print "Buzz" if multiple of 5

//Print "FizzBuzz" if multiple of both.

//The alternative of loops in java is either recursion or Java Streams.
//Use recursion carefully, it may end up infinity loop if exit condition is not efficient.

public class FizzBuzzVariation {

	public static void main(String[] args) {

		findMultiple2();

	}
	// Method1: Novice Programming. Below are problems listed in this code.
	// 1. “why are you using multiple else if statements that checks against a
	// simple numeric value? Is there a better alternative? Yes use switch
	// statement. Below code will not work for other no. like multiple of 7,11 etc.
	//it is not testable,modular,scalable & maintainable.

	private static void findMultiple() {

		for (int i = 1; i < 50; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");

			} else if (i % 5 == 0) {

				System.out.println("Buzz");
			} else {

				System.out.println(i);
			}
		}
	}

	// Method2:This method is more Modular, scalable & maintainable

	static boolean isMultiple(int num, int mod) {

		return num % mod == 0;
	}

	private static void findMultiple2() {

		for (int i = 1; i < 50; i++) {

			if (isMultiple(i, 15)) {

				System.out.println("FizzBuzz");
			} else if (isMultiple(i, 11)) {

				System.out.println("Boo");
			} else if (isMultiple(i, 7)) {

				System.out.println("Foo");
			} else if (isMultiple(i, 5)) {

				System.out.println("Buzz");
			} else if (isMultiple(i, 3)) {

				System.out.println("Fizz");
			} else {

				System.out.println(i);
			}

		}

	}

}
