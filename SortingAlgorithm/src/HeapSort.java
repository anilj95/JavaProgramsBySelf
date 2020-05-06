
public class HeapSort {

	public static void main(String[] args) {


		int[] arr = {12, 11, 13, 5, 6, 7};
		
		HeapSort hsort = new HeapSort();
		
		hsort.sort(arr);
		
		 System.out.println("Sorted array is"); 
	        printArray(arr); 

	}

	private void sort(int[] arr) {

		int n = arr.length;
// 1st we will build Max Heap	
		for (int i = n / 2 - 1; i >= 0; i--) {

			heapify(arr, n, i);

		}
//2nd we will delete element from top of the Max Heap, we cann't delete element from any where, we have to
//delete from top of the max heap,we will keep on shrinking array after deletion & again build new Heap Tree.
//Also checking if child nodes(left or right) should not be greater than parent node. And keep on replacing 
// Top element with last element of the Array. This way we will short elements in ascending order. 

		for (int i = n - 1; i >= 0; i--) {

			// swapping 'end' element with 'root'(arr[0])

			int temp = arr[0];

			arr[0] = arr[i];
			arr[i] = temp;
			// Again calling heapify to make sure to build MaxHeap(all parent node is
			// greater or equal to child node)
			// here i is dynamic size of array, '0' is the index of root node always.(for
			// new maxHeap also).

			heapify(arr, i, 0);

		}

	}

// here n is the size of array, 'i' is the index of root element.
	private void heapify(int[] arr, int n, int i) {

		int largest = i; // taking root node as largest.
		// Using Binary tree property to calculate left & right child.
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// If left child is larger than root update largest index.

//here 1st condition to check either left or right child index is within size of array.
		if (l < n && arr[l] > arr[largest]) {

			largest = l;
		}

		// If right child is larger than root, update index of largest.
		if (r < n && arr[r] > arr[largest]) {

			largest = r;
		}
// 3rd condition is to check if largest index is updated or same as 'i'. i.e either left or right
// child is greater than current largest value. if it is , so swap the value of largest with greater value of i.
		if (largest != i) {

			int temp = arr[i];

			arr[i] = arr[largest];
			arr[largest] = temp;

// Recursively heapify the affected sub-tree, to make MaxHeap. Because after swapping, 
			heapify(arr, n, largest);
		}

	}

	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println(i + " ");
		}

	}
}
