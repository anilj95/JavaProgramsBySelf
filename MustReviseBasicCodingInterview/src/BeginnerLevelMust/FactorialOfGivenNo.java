package BeginnerLevelMust;

public class FactorialOfGivenNo {

	public static void main(String[] args) {


		int factorial = findFactorial2(6);
		
		System.out.println(factorial);

	}
	
	//Method 1: using recursion
	private static int findFactorial(int num) {
		
		
		if(num<= 1) {
			
			return num;
		}else 
			return num*(findFactorial(num-1));
	}
	
	//Method 2: using iteration
		private static int findFactorial2(int num) {
			
			int fact =1;
			if(num <= 1) {
				
				return 1;
			}else {
				
				for(int i=2;i<=num;i++) {
					
					fact= fact*i;
				}
				return fact;
			}
				
		}

}
