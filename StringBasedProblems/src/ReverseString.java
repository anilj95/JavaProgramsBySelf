
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Get well soon";
		
		
		String rverse = reverse3(str);
		
		System.out.print(rverse);

	}
	//Method 1: Using property of StringBuffer reverse() function;
	private static String reverse1(String str) {
		
		
		String reverse = new StringBuffer(str).reverse().toString();
		
		return reverse;
	}
	
	//Method 2: Using Iteration.
		private static String reverse2(String str) {
			
			char[] ch = str.toCharArray();
			
			StringBuilder sb = new StringBuilder();
			
			for(int i= str.length()-1;i>=0;i--) {
				
				sb.append(ch[i]);
			}
			return sb.toString();
		}
		
		//Method 3: Using Recursion.
		// str = "rama";
		//"ama" + r;->     (callback)->amar
		//"ma" +a +r;->    (callback)-> ama
		//"a" +m+a+r;->    (callback of reverse function)-> am
		//
		//
				private static String reverse3(String str) {
					
					if(str.length()<2) {
						
						return str;
					}
					
					return reverse3(str.substring(1)) + str.charAt(0);
				}

}
