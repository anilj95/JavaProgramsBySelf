package TwoPointerBasedProblems;

public class TwoSumProblem {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int target = 6;
		
		int arr[] = {1,3,4,8,3,6,7};
		
		int result[] = twoSum(arr,target);
		
		System.out.println(result[0]+"  "+result[1]);

	}
	// find sum of two elements in an array which has value as target. And return indexes of both elements.
	// to apply two pointer technique for this problem array will be sorted. Both Pointers will move in opposite direction.
	private static int[] twoSum(int arr[],int target) {
		
		int result[] = new int[2];
		
		int start=0, end=arr.length-1,sum=0;
		
		while(start<end) {
			
			sum= arr[start] + arr[end];
			
			if(target==sum) {
				
				result[0]=start;
				result[1]=end;
				break;
			}
			else if(target<sum) {
				
				end--;
			}else {
				
				start++;
			}
		}
		
		return result;
		
		
		
	}

}
