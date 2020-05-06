
public class ProductExceptSelf {
//given an array nums of n integers where n>1, return an array 'output' such that output[i] is equal to the
//product of all the element except nums[i].

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 }; // output: {24,12,8,6}

		int[] output = new int[arr.length];

		output = productAllExceptSelf3(arr);

		for (int i = 0; i < output.length; i++) {

			System.out.println(output[i] + " ");
		}

	}

//Method 1st using division: Time complexity O(n)
	private static int[] productAllExceptSelf(int[] nums) {

		int length = nums.length;
		int sum = 1;

		int output[] = new int[length];

//1st for loop for multiplying each element to get sum.
		for (int i = 0; i < length; i++) {

			sum = sum * nums[i];
		}
//2nd for loop for dividing sum by each element to get value at that particular index.
//This way we can get product of each element except self(we are dividing sum to remove self).
		for (int k = 0; k < length; k++) {

			output[k] = sum / nums[k];
		}

		return output;

	}

//Method 2nd without division: Time complexity O(n). see video for more clarification.
//space Complexity: O(n).

	private static int[] productAllExceptSelf2(int[] nums) {

		int N = nums.length;

		int[] left_array = new int[N];
		int[] right_array = new int[N];
		int[] output_array = new int[N];

		left_array[0] = 1;
		right_array[N - 1] = 1;

		for (int i = 1; i < N; i++) {

			left_array[i] = nums[i - 1] * left_array[i - 1];
		}

		for (int i = N - 2; i >= 0; i--) {

			right_array[i] = nums[i + 1] * right_array[i + 1];
		}

		for (int i = 0; i < N; i++) {

			output_array[i] = left_array[i] * right_array[i];
		}

		return output_array;

	}

//Method 3rd without any Extra space: using variable

	private static int[] productAllExceptSelf3(int[] nums) {

		int N = nums.length;

		int output_array[] = new int[N];

		output_array[0] = 1;

//1st for loop is similar as left_array

		for (int i = 1; i < N; i++) {

			output_array[i] = nums[i - 1] * output_array[i - 1];

		}
// We are using variable R as right_array
		int R = 1;

		for (int i = N - 1; i >= 0; i--) {

			output_array[i] = output_array[i] * R;

			R = R * nums[i];

		}

		return output_array;

	}

}
