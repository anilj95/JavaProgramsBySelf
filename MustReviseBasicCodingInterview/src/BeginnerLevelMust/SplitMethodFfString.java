package BeginnerLevelMust;

//Java String split method is used for splitting a String into its substrings based on the given delimiter or regular expression.
// two variants of split() method in String class: 1.String[] split(String regex): return array of string.
//2.String[] split(String regex, int limit):e.g. split("anydelimiter", 3) would return the array of only 3 strings even if the 
//delimiter is present in the string more than 3 times.

public class SplitMethodFfString {

	public static void main(String[] args) {

		// This is out input String
		String str = new String("28/12/2013");

		System.out.println("split(String regex):");
		/*
		 * Here we are using first variation of java string split method which splits
		 * the string into substring based on the regular expression, there is no limit
		 * on the substrings
		 */
		String array1[] = str.split("/");
		for (String temp : array1) {
			System.out.println(temp);
		}

		/*
		 * Using second variation of split method here. Since the limit is passed as 2.
		 * This method would only produce two substrings.
		 */
		System.out.println("split(String regex, int limit) with limit=2:");
		String array2[] = str.split("/", 2);
		for (String temp : array2) {
			System.out.println(temp);
		}

		System.out.println("split(String regex, int limit) with limit=0:");
		String array3[] = str.split("/", 0);
		for (String temp : array3) {
			System.out.println(temp);
		}

		/*
		 * When we pass limit as negative. The split method works same as the first
		 * variation because negative limit says that the method returns substrings with
		 * no limit.
		 */
		System.out.println("split(String regex, int limit) with limit=-5:");
		String array4[] = str.split("/", -5);
		for (String temp : array4) {
			System.out.println(temp);
		}
	}//Difference between zero and negative limit: Ex. String s="bbaaccaa";String arr1[]= s.split("a", -1);
	//String arr2[]= s.split("a", 0); : In this case arr1 would be having {“bb”, ” “, “cc”, ” “, ” “} 
	//However arr2 would be having {“bb”, ” “, “cc”} because limit zero excludes trailing empty Strings.

}
