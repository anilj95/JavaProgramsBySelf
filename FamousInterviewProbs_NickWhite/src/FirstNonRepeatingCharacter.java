import java.util.HashMap;

public class FirstNonRepeatingCharacter {
//Amazon interview Question
	public static void main(String[] args) {

		String str = "aaazzcccdeee";

		char ch = findFirstNonRepeating3(str);

		System.out.println(ch);

	}

	// Method1: Using Brute Force Algorithm
	//Time complexity: O(n^2)
	private static char findFirstNonRepeating(String str) {

		for (int i = 0; i < str.length(); i++) {

			boolean isDuplicate = false;

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && i!=j) {

					isDuplicate = true;
				}
			}

			if (!isDuplicate) {

				return str.charAt(i);
			}
		}
		return '-';

	}

	// Method2: Using Array of size 26
	//Time complexity: O(2n) i.e 2 for loop. We also useed extra space
	private static char findFirstNonRepeating2(String str) {

		// initially individual count of all 26 alphabets are zero.
		int[] chCount = new int[26];

		for (char ch : str.toCharArray()) {

			// ASCAII subtraction.Below line gives count of particular character, then
			// increment its count value. ch-'a' gives 0('a'-'a'=0),if 1st char is 'a'
			chCount[ch - 'a']++;

		}
		for (char ch : str.toCharArray()) {

			if (chCount[ch - 'a'] == 1) {

				return ch;
			}
		}
		return '-';

	}

	// Method2: Using HashMap of size 26
	//Time complexity: O(2n) i.e 2 for loop. We also used extra space.
	private static char findFirstNonRepeating3(String str) {

		HashMap<Character, Integer> hs = new HashMap<>();

		for (char ch : str.toCharArray()) {
			
			if(hs.containsKey(ch)) {
				
				hs.put(ch, hs.get(ch) + 1);
			}else {
				
				hs.put(ch,1);
			}

			
		}

		for (char ch : str.toCharArray()) {

			if (hs.get(ch) == 1) {

				return ch;
			}
		}
		return '-';

	}

}
