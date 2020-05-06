import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindAValueInArray {
	// We can use binary search if array is sorted. If not sorted sort first then
	// find element.
	// Or use Array List if allowed or Linear search to get that item.

	public static void main(String[] args) {

		int arr[] = { 1, 3, 6, 7, 9, 8, 10 };

		int value = 1;

		//boolean b = isPresent(arr, value);
        //System.out.print(b);
		
		//int item = isPresent2(arr,value);
		//System.out.print("Element is present at index:"+item);
		
		int item3 = isPresent3(arr,0,6,value);
		System.out.print("Element is present at index:"+item3);

	}

	// Method1: Using Linear Search

	private static boolean isPresent(int arr[], int value) {

		for (int i = 0; i < arr.length; i++) {

			if (value == arr[i]) {

				return true;
			}

		}
		return false;
	}

	// Method2: Using Binary Search

	private static int isPresent2(int arr[],int value) {

		int start = 0;
		int end = arr.length;
		int mid;

		while (start <= end) {

			mid = start + (end - start) / 2;

			if (value == arr[mid]) {

				return mid;
			} else if (value > mid) {

				start = mid + 1;
			} else {

				end = mid - 1;
			}

		}

		return -1;

	}
	
	// Method3: Using Recursive Binary Search

		private static int isPresent3(int arr[],int start,int end,int value) {

			start = 0;
			end = arr.length;
			int mid = start + (end-start)/2;

			if(start > end) {

				return -1;
			}
			
			if(value== arr[mid]) {
				
				return mid;
			}
			else if(value>arr[mid]) {
				
				return isPresent3(arr,(mid+1),end,value);
			}
			else {
				
				return isPresent3(arr,start,(mid-1),value);
			}

			

		}
		
		

}
