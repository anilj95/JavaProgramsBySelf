
public class TwoPointerTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 4;
		int arr[]= {1,9,-1,-1,7,3,-1,2};
		
		int max = getMaxSumsubArrayofSizeK(arr,size);
		
		System.out.println(""+ max);

	}
	
	private static int getMaxSumsubArrayofSizeK(int arr[], int k) {
		
		int start=0, end=0, maxSum=0,windowSum=0;
		
		while(end<k) {
			
			windowSum+=arr[end++];
		}
		
		while(end<arr.length) {
			
			windowSum+= arr[end++] - arr[start++];
			
			maxSum = Math.max(windowSum, maxSum);
			
		}
		
		return maxSum;
		
		
	}

}
