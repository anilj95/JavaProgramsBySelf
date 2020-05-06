import java.util.ArrayList;
import java.util.Collections;

public class TestClassSorting {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(4);
		al.add(19);
		al.add(17);
		al.add(1);
		al.add(3);

		// before sorting
		System.out.println(al);

		Collections.sort(al);

		// after sorting
		System.out.println(al);

	}

}
