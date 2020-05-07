package BeginnerLevelMust;

public class FindSetBits {

	public static void main(String[] args) {

		int num = 15;

		System.out.println(setBits2(num));

	}
//Method 1: Simple iteration
	private static int setBits(int n) {

		int count = 0;
		int remainder;

		while (n != 0) {

			remainder = n % 2;

			if (remainder == 1) {
				
				count++;
			}
			n = n / 2;
				
		}

		return count;

	}
	
	//Method 1: Using Bit manipulation:  >>(right shift operator) and '&' operator.
		private static int setBits2(int n) {
			
			int count=0;
			while(n!=0) {
	// & operator is simply multiplying	 with right most bit		
				count = count + (n&1);
//right shift operator delete the right most bit.	(Ex. n=10101, n>>1= 1010; n>>2=101 )
				n = n>>1;
			}
			
			return count;
			
		}

}
