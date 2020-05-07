package BeginnerLevelMust;

public class LCMOfNumbers {

	public static void main(String[] args) {


		//General Formula of LCM = a*b/HCF
		
		int lcm = findLCM(8,10);
		
		System.out.println("LCM is:"+ lcm);

	}
	
	private static int findLCM(int a,int b) {
		
		
		int max,step,lcm=0;
		
		max =step = a>b?a:b;
// We are 		
		while(a!=0) {
			
			
			if(max%a==0 && max%b==0) {
				
				lcm = max;
				break;
			}else {
				
				max= max+step;
			}
		}
		return lcm;
	}

}
