package BeginnerLevelMust;

public class ReverseWordInString {

	public static void main(String[] args) {

		String str = "I love Java Programming";
		System.out.println(reverseWord(str));

	}

	private static String reverseWord(String str) {

		String[] temp = str.split(" ");
		String result = "";

		for (int i = temp.length-1; i >=0; i--) {

			result =result + temp[i]+" ";

		}

		return result;
	}

}
