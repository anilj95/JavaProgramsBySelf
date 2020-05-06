
public class QuickSortAlgo {

	public static void main(String[] args) {

		int arr[] = { 7, 2, 3, 5, 6, 8, 1, 4 };

		int len = arr.length;

		QuickSortAlgo qs = new QuickSortAlgo();

		qs.quickSort(arr, 0, len - 1);

		for (int i = 0; i < len; i++) {

			System.out.println("After sorting:" + arr[i]);
		}

	}

	void quickSort(int[] arr, int start, int end) {
		if (start < end) {

			int pIndex = partition(arr, start, end);

			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);

		}

	}

	private int partition(int[] arr, int start, int end) {

		int pivot = arr[end];

		int pIndex = start;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] <= pivot) {

				arr[i] = arr[pIndex];
				pIndex++;
				break;
			}

			int temp = arr[pIndex];

			arr[pIndex] = pivot;

			pivot = temp;
		}

		return pIndex;
	}

}
