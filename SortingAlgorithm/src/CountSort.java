
public abstract class CountSort {

	//jeny,s lecture youtube link
	public static void main(String[] args) {

		int[] arr = { 0, 1, 2, 5, 3, 1, 0, 8, 0, 2, 9, 4, 5, 8 };

		countSortAlgo(arr);

		System.out.print("Sorted array is: ");
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
	}

	// Time complexity: O(3n+K)=O(n+k), where 3 is the no. of loop runs upto n, k is
	// range
	// of counting array. also 1 loop runs up to k.
	// Space complexity: O(n+k)
	private static void countSortAlgo(int[] arr) {

		int[] output = new int[arr.length];

		// taking size 10 because range is asked before implementing count sort.
		// Given array lies between 0 to 9 as informed.
		int count[] = new int[10];

		// initializing count array
		for (int i = 0; i < count.length; i++) {

			count[i] = 0;
		}
		// 1st for loop for counting frequency of numbers in given array & saving in
		// count array.
		for (int i = 0; i < arr.length; i++) {

			++count[arr[i]];
		}

		// 2nd for loop for modifying count array to find range of indexes for each
		// element. Simply adding previous frequency to get range.
		// loop starts from 1, zeroth position is already having frequency=no. of range.

		for (int i = 1; i < count.length; i++) {

			count[i] += count[i - 1];
		}

		// 3rd for loop for saving element in output array. Started from last
		// element to make sorting stable. index(start from 0) & count is different, so
		// --count. to get proper index no. to save in output array.
		// output[count[arr[i]]-1] = arr[i]; and
		// --count[arr[i]]; or below one line.

		for (int k = arr.length - 1; k >= 0; k--) {
//using modified count array, by 2nd for loop
			output[--count[arr[k]]] = arr[k];
		}
		// 4th for loop to copy array into original array.
		for (int i = 0; i < arr.length; i++) {

			arr[i] = output[i];
		}

	}

}
