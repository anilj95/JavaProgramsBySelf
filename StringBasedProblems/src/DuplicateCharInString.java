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
			
			charMap.put(charct, charMap.getOrDefault(charct,0)+1);
			
		}
		
		
		Set<Map.Entry<Character,Integer>> entSet = charMap.entrySet();
		
		for(char cha : charMap.keySet()) {
			
			int no = charMap.get(cha);
			
			if(no>1) {
				
				System.out.println("Char is:"+cha+""
						+ " value is:"+ no);
				
			}
		}
		
	}

}


