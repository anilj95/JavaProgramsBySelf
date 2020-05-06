import java.util.BitSet;

public class FindMissingNmbers {

	// Problem Statement: Given series:1-10
	// Constraints:No duplicates. Array must be sorted.

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int count = 10;

		approach1(arr, count);
		// approach2(arr, count);
		// approach3(arr, count);

		// Also we can use search operation(linear or binary search) to find missing
		// element in an array.
		//We can use set to find missing nos. 1st add actual array in set.
		// add expected array. set.add() give 'true' if if no. was not already present.
		// filter all nos. for which set.add() results 'true'.
		//advantages: any no. of missing item, sorted array not required also duplicate nos. will not affect the result.

	}

	// Method 1: Using sum of series formula.
	// Constraints:Given array don't have duplicates,also only one element is
	// missing.
	// Disadvantages: if numbers are large, summation can throw overflow exception.

	private static void approach1(int[] arr, int count) {

		int missingNo;
		int expectedSum = count * (count + 1) / 2;

		int actualSum = 0;

		for (int sum : arr) {

			actualSum += sum;
		}

		missingNo = expectedSum - actualSum;

		System.out.print(missingNo);
	}

	// Method 2: Using XOR properties. 1.(XOR table) same value=0, different value
	// =1 . Also XOR follows commutative & associative laws.
	// Constraints:Given array don't have duplicates,also only one element should be
	// missing.
	// Advantages: If no. are large also, it will not throw overflow.

	private static void approach2(int[] arr, int count) {

		int xor1 = arr[0];
		int xor2 = 1;
		int missingNo;

		for (int i = 1; i < arr.length; i++) {
			// getting XOR of actual array elements
			xor1 = xor1 ^ arr[i];
		}

		for (int j = 2; j <= count; j++) {

			// getting XOR of all array elements including missing one.
			xor2 = xor2 ^ j;
		}
		// getting XOR of actual array and expected array. Same value results=0, only
		// missing no. don't have any pair, so result will be that no.
		missingNo = xor1 ^ xor2;

		System.out.print(missingNo);
	}

	// Method 3: Using BitSet java utility class.
	// Constraints:Given array don't have duplicates.
	// Advantages: and it can provide all missing no of given sorted array.

	private static void approach3(int[] arr, int count) {
		// creating bitset of size count
		BitSet bitset = new BitSet(count);

		int missingIndex = count - arr.length;
		int lastMissingIndex = 0;

		for (int num : arr) {
			// setting particular indexes of bitset to true. Bitset index starts from 0 &
			// given array arr[0] is 1.
			// this way we are setting 0th index of bitset as true.
			bitset.set(num - 1);
		}

		for (int i = 0; i < missingIndex; i++) {
			// nextClearBit(startIndex) will provide index no which is reset/false on
			// startIndex or from startIndex.
			lastMissingIndex = bitset.nextClearBit(lastMissingIndex);
			// here lastMissingIndex will provide missing index & ++lastMissingIndex will
			// provide actual no.
			// because bitset index start from 0.
			System.out.println(++lastMissingIndex);
		}

	}

}
