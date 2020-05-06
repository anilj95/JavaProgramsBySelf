
public class RadixSort {

	public static void main(String[] args) {

		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };

		radixSortAlgo(arr);

		System.out.print("Sorted Radix array is: ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");

	}

// Time complexity: O(d(3n+k))=O(d*(n+k)): where d is no. of digits in max element of given array.
	// Space complexity is also: O(n+k)
	private static void radixSortAlgo(int[] arr) {

		int max = getMax(arr);

		for (int pos = 1; max / pos > 0; pos = pos * 10) {

			countSort(arr, pos);
		}

	}

	private static int getMax(int arr[]) {

		int max = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max) {

				max = arr[i];
			}
		}
		return max;
	}

	private static void countSort(int arr[], int pos) {

		int[] output = new int[arr.length];

		int[] count = new int[10];
		// initialize count array elements as 0.
		for (int i = 0; i < count.length; i++) {

			count[i] = 0;
		}
		// 1st for loop for counting frequency of numbers
		for (int i = 0; i < arr.length; i++) {
			// for every digit(0th,10th & 100th)
			// adding frequency of each number in count array.
			++count[(arr[i] / pos) % 10];
		}
		// 2nd for loop for modifying count array
		for (int i = 1; i < count.length; i++) {

			count[i] = count[i] + count[i - 1];
		}
		// 3rd for loop for saving into output array.
		for (int i = arr.length - 1; i >= 0; i--) {
			// starting from last

			output[--count[(arr[i] / pos) % 10]] = arr[i];
		}
		// coping elements into original array
		for (int i = 0; i < arr.length; i++) {

			arr[i] = output[i];
		}

	}

}
