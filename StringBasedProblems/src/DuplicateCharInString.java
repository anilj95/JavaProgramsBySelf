import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {


		String str = "Programming";
        printDuplicate(str);
	}
	
	private static void printDuplicate( String str) {
		
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		
		for(Character charct: ch) {
			
			
			if(charMap.containsKey(charct)) {
				
				charMap.put(charct, charMap.get(charct)+1);
			}
			else {
				
				charMap.put(charct,1);
			}
		}
		
		
		Set<Map.Entry<Character,Integer>> entSet = charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entrySet: entSet) {
			
			
			if(entrySet.getValue()>1) {
				
				
				System.out.println("Char is:"+entrySet.getKey()+""
						+ " value is:"+ entrySet.getValue());
				
			}
		}
		
	}

}


