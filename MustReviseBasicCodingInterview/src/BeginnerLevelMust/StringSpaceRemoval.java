package BeginnerLevelMust;

public class StringSpaceRemoval {

	public static void main(String[] args) {

		char str[] = "g eeks for ge eeks ".toCharArray();
		int i = spaceRemove(str); // i is no. of non space characters
		System.out.println(String.valueOf(str).subSequence(0, i));
	}

	private static int spaceRemove(char[] ch) {

		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ') {

				ch[count++] = ch[i];
			}
		}

		return count;

	}

}
