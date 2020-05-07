package BeginnerLevelMust;
// Codality problem:
public class ArrayRightRotation {

	public static void main(String[] args) {

      int[] arr = {3,8,9,7,6};
      int d =3;
      
      int[] rotatedArray = rightRotation(arr,d);
      
      printArray(rotatedArray);

	}
	
	private static int[] rightRotation(int[] arr, int d) {
		
		int n = arr.length;
		int[] rotated = new int[n];
		
		for(int i=0;i<n;i++) {
			
			int newIndex = (i+d)%n;
			
			rotated[newIndex] = arr[i];
			
		}
		
		return rotated;
	}
	
	private static void printArray(int[] arr) {
		
		for(int i =0;i<arr.length;i++) {
			
			System.out.println(arr[i]+" ");
		}
	}

}
