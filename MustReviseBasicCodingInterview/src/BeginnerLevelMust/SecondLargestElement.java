package BeginnerLevelMust;

public class SecondLargestElement {

	public static void main(String[] args) {


		int [] arr = {3,1,5,8,9,12,10};
		
		System.out.println(findNo(arr));

	}
// method 1: Without using 2 for loop. O(n)
	
	private static int findNo(int[] arr) {

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {

				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {

				second = arr[i];
			}

		}
		
		return second;

	}

}
