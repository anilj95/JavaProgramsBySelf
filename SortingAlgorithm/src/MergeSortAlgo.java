
public class MergeSortAlgo {

	public static void main(String[] args) {

		int[] arr = { 7, 2, 3, 5, 6, 8, 1, 4 };
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.println("Before Sorting:"+arr[i]);
		}

	

		MergeSortAlgo mm = new MergeSortAlgo();

		mm.mergeSort(arr);

		System.out.println("After Sorting:" + arr);

	}

	void mergeSort(int arr[]) {

		int n = arr.length;

		if (n < 2) {

			return;
		}

		int mid = n / 2;

		int[] left = new int[mid];
		int[] right = new int[n - mid];

		for (int i = 0; i < mid - 1; i++) {

			left[i] = arr[i];
		}
		for (int j = mid+1; j < n; j++) {

			right[j] = arr[j];
		}

		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}

	private static void merge(int[] arr, int[] left, int[] right) {

		int i = 0, j = 0, k = 0;

		int n = left.length;
		int m = right.length;

		while (i < n && j < m) {

			if (left[i] <= right[j]) {

				arr[k] = left[i];
				i++;
			} else {

				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < n) {

			arr[k] = left[i];
			i++;
			k++;

		}
		while (i < m) {

			arr[k] = right[j];
			j++;
			k++;

		}
	}

}
