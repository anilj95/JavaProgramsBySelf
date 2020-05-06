import java.util.HashSet;

// Two different array is given, find a value which is a combo of 2 elements in both array. Google Interview
public class TwoSum {

	public static void main(String[] args) {
		
		int[] a = {7,-2,-3,5,-6};
		int[] b = {1,7,8,-5,9};
		int sum = 7;
		
		boolean value = findTwoSum2(a,b,sum);
		
		System.out.println("is pair present: "+value);
		

	}

	private static boolean findTwoSum(int[] a, int[] b, int sum) {

		HashSet<Integer> hs = new HashSet();

		for (int i = 0; i < a.length; i++) {

			int difference = sum - a[i];

			hs.add(difference);

		}

		for (int j = 0; j < b.length; j++) {

			if (hs.contains(b[j])) {

				return true;
			}
		}
		return false;

	}

	private static boolean findTwoSum2(int[] a, int[] b, int sum) {

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {

				if (a[i] + b[j] == sum) {

					return true;
				}
			}
		}
		return false;

	}

}
