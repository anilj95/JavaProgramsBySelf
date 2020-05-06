import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "swissi";

		//firstNonRepChar1(str);
		firstNonRepChar2(str);

	}

	// Method 1: using LinkedHashMap: it saves order of insertion.

	private static void firstNonRepChar1(String str) {

		Map<Character, Integer> map = new LinkedHashMap<>(str.length());

		for (char ch : str.toCharArray()) {

			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);

			/*
			 * if (map.containsKey(ch)) {
			 * 
			 * map.put(ch, map.get(ch) + 1); } else {
			 * 
			 * map.put(ch, map.get(ch)); }
			 */
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {

				System.out.println("1st non repeating char:" + entry.getKey());
			}

		}

	}
	// Method 2: using HashMap: it does not save order of insertion.

	private static void firstNonRepChar2(String str) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {

				map.put(ch, 1);
			}
		}

		// As we know HashMap don't preserve insertion order. We have to iterate string
		// again to get 1st non repeating character.
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(map.get(c)==1) {
				
				System.out.println("First non-repeating char:"+c);
			}
		}

	}

}
