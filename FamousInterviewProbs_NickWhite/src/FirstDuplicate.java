import java.util.HashSet;

//Google interview Question
public class FirstDuplicate {

	public static void main(String[] args) {

		//condition: array elements must be b/w 1 & size of array.
		int[] arr = { 2, 1, 3, 5, 3, 2 };

		int firstDup = firstDuplicate(arr);

		System.out.println(firstDup);

	}

	// Method 1: BruteForce: Time COmplexity:O(n^2)
	private static int firstDuplicate(int[] arr) {
		int min_index = arr.length;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					min_index = Math.min(min_index, j);
				}
			}
		}

		if (min_index == arr.length) {
			return min_index;

		} else
			return arr[min_index];
	}

	// Method 2: Using extra space:HashSet. Time COmplexity:O(n)

	private static int firstDuplicate2(int[] arr) {

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			if (hs.contains(arr[i])) {

				return arr[i];
			} else {

				hs.add(i);
			}

		}

		return -1;

	}

	private static int firstDuplicate3(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[Math.abs(arr[i]) - 1] < 0) {

				return Math.abs(arr[i]);
			} else {

				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
			}
		}
		return -1;

	}

}
