
public class FindDuplicates {
	
	//This problem is to remove Duplicates without using any library function.
	// Use arryList and set properties for production code.

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,3,4,5};
		
		int[] result = new int[arr.length];
		
		int ch,previous;
		
		previous =arr[0];
		
		
		result[0] = previous;
		
		for(int i=1;i<arr.length;i++) {
			
			ch = arr[i];
			
			
			if(previous!=ch) {
				
				result[i]=ch;
			}
			
			previous = ch;
		}
		for(int i =0;i<result.length;i++) {
			
			System.out.print(" "+ i);
		}
		

	}

}
