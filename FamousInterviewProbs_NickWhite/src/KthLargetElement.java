import java.util.Arrays;

//In an array find kth(3rd or 4th) largest element from array.
//Amazon,Walmart labs.
public class KthLargetElement {

	public static void main(String[] args) {

		int arr[] = { 8, 6, 4, 1, 10, 9, 2 };
		int position = 4;

		int element = kthLargest2(arr, position);

		System.out.println(element);
	}

	// Method1: Brute force
	// TIme complexity: O(n^2) : Not accepted answer. Improve it.
	private static int kthLargest(int arr[], int position) {

		int value = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				// here we are sorting element

				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

				if (i == position - 1) {

					value = arr[i];
				}
			}
		}
		return value;

	}

	// Method2: using in build quick sort.
	// Time complexity O(nLogn) : Little improved still not O(n).
	private static int kthLargest2(int arr[], int position) {

		Arrays.sort(arr);

		return arr[position - 1];

	}

// Method3: Or you can modify Quick sort into Randomized quick sort.
	// 99% chance is Time complexity O(n).
	private static int kthLargest3(int arr[], int position) {
	}

// Method4: using quick select Algorithm.
	private static int kthLargest4(int arr[], int position) {
	}

	// Method5: using Heap sort.() max heap or min heap.
	// Time complexity will be linear.
	private static int kthLargest5(int arr[], int position) {
	}

	// Method6: using medians of median algorithm.
	// Time complexity will be linear.
}
