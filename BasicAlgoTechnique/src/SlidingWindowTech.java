
public class SlidingWindowTech {
	//An integer array of size n, and find  maximum sum of any contiguous sub array of size k.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Method1: Brute Force Algorithm
	
	//Time complexity: O(n*k): Exponential
	private int getMaxSumSubarrayOfSizek(int arr[],int k) {
		
		int maxSum=0;
		//first for loop, to iterate up to n-window size(k).
		for(int i=0;i<arr.length-k;i++) {
			
			int weightSum=0;
			///2nd for loop to add all value inside window. up to certain index no. in given array.
			for(int j=i;j<i+k;j++) {
				
				weightSum+=arr[j];
			}
			
			maxSum= Math.max(maxSum, weightSum);
		}
		
		return maxSum;
		
		
	}
	
	//Method2: Sliding window technique: When window slides it adds next element and leave last element of window.
	// We are going to exploit this behavior of window. This way we can avoid some unnecessary calculations.
	
	private int getMaxSumSubarrayOfSizek2(int arr[],int k) {
		
		int windowSum=0; int maxSum=0;
		// 1st for loop will 1 time only to calculate sum of all elements inside window.
		for(int i =0;i<k;i++) {
			
			windowSum+= arr[i];
		}
		// 2nd for loop iterates for next element(here it is 'end') up to last element of array.
		for(int end=k;end<arr.length;end++) {
			
			windowSum+= arr[end] -arr[end-k];
			
			maxSum = Math.max(windowSum, maxSum);
		}
		 return maxSum;
	}

}
