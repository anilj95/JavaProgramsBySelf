package BeginnerLevelMust;

public class PowerOfTwo {

	public static void main(String[] args) {

		boolean value = isPowerOfTwo2(2);

		System.out.println(value);
	}
//Method 1: Using Iteration
	private static boolean isPowerOfTwo(int num) {

		if (num == 0) {

			return false;
		}

		while (num != 1) {

			if (num % 2 != 0) {

				return false;
			}

			num = num / 2;

		}
		return true;

	}
	
	//Method 2: Using Bit Manipulation property.
	
	private static boolean isPowerOfTwo2(int num) {
		
		
		if(num<=1) {
			
			return false;
		}
		//power of two don't have 1 (set value) in binary representation.
		///it has 0
		return (num&(num-1))==0;
		
	}
	

}
