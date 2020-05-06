
public class PrefixSumAlgo {

	// With this algo, we can find query sum results in order to get O(n) time
	// complexity.
	// Ex: No. of queries: Array[0-4],Array[2-6],Array[3-5]...m(no. of queries).
	// each query will run from start to end index:(0-n) in worst case.
	// Time complexity will be O(m*n). if we will go via normal way(i.e not using
	// prefix sum algorithm).

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 5, sum = 0;
		int arr[] = new int[6];

		for (int i = 1; i < m; i++) {
			
			///1st query
			int start = 0, end = 6;

			for (int j = start; j < end; j++) {

				sum = sum + arr[j];

			}
			//2nd query
			int start2 = 2, end2 = 5,sum2=0;

			for (int j = start2; j < end2; j++) {

				sum2 = sum2 + arr[j];

			}
			//....up to m queries. Time Complexity: O(m*n): where 'n' is end of array.
		}
		
		//method 2: Using prefix sum algorithm.
		
		
		int normalArr[] = new int[6];
		
		// this will take Time complexity : O(n)
		for(int i = 1;i<normalArr.length;i++) {
			
			// Modifying same array:current element + previous element
			
			normalArr[i] = normalArr[i] + normalArr[i-1];
		}
		
		//Now to calculate array sum like, arr[0-3],arr[2-6]. will take O(1).
		// for arr[0-3] = normalArr[3]
		//for arr[2-6] = normalArr[6] - normalArr[1]
		// General formula: arr[i,j] = arr[j] - arr[i-1] : TC= O(2)
		// overall TC = O(n)
		
		
		
	}

}
