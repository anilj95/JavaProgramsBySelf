package BeginnerLevelMust;

public class NextBigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result  = nextBig(1318540);
		
		System.out.println(result);

	}
	
	private static int nextBig(int num) {
		
		char[] elements = String.valueOf(num).toCharArray();
		
		int  i = elements.length-2;
		// checking ascending order
		while(i>=0 && elements[i] >= elements[i+1]) {
			
			i--;
		}
		
		if(i==-1) {
			
			return num; //returning same no.
		}
		
		int j = elements.length-1;
		
		while(elements[j]<=elements[i]) {
			
			j--;
		}
		
		
		char temp = elements[i];
		
		elements[i] = elements[j];
		
		elements[j] = temp;
		
		// swaping remaining elements
		
		int left = i+1;
		int right = elements.length-1;
		
		while(left<right) {
			
			
			temp = elements[left];
			
			elements[left] = elements[right];
			
			elements[right] = temp;
			
			left++;
			right--;
		}
		
		return Integer.parseInt(String.valueOf(elements));
		
	}

}
