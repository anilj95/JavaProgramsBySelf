import java.util.Arrays;

public class AnagramOfString {

	// Anagram means same strings but at different position. ex: stop :post,
	// mary:army
	// we have to take care of null check and upper, lower case separately.
	// Below programs are assuming null check & both strings are upper or in lower
	// case.
	// otherwise: 1. if(str && anagram !=null) 2. str.toLowerCase,
	// anagram.toLowerCase should be added.

	public static void main(String[] args) {
		
		String str1 ="army";
		String str2 = "mary";
		
		System.out.println(isAnagram2(str1,str2));

	}

	// Method 1:Convert to char array then sort both strings.
	// After sorting each char will take certain positions. Then equals method:
	// compare each char, index by index.

	private static boolean isAnagram(String str, String anagram) {

		char[] string = str.toCharArray();
		char[] anag = anagram.toCharArray();

		Arrays.sort(string);
		Arrays.sort(anag);

		return Arrays.equals(string, anag);

	}
	// Method 2: Using string builder, if char found, deleting that char.
	//If both are anagram, no char left in string builder.
	private static boolean isAnagram2(String str, String anagram) {

		char[] chararray = str.toCharArray();

		StringBuilder sb = new StringBuilder(anagram);

		for (char ch : chararray) {
			
			int index = sb.indexOf("" + ch);

			if (index != -1) {

				sb.deleteCharAt(index);
			} else {

				return false;
			}
		}

		return sb.length() == 0 ? true : false;
	}

}
