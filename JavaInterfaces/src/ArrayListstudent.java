import java.util.ArrayList;
import java.util.Collections;

public class ArrayListstudent {

	public static void main(String[] args) {
		
		// For testing Comparable

		ArrayList<StudentPOJOComparable> alstu = new ArrayList<>();

		alstu.add(new StudentPOJOComparable(12, "Pune"));
		alstu.add(new StudentPOJOComparable(8, "Delhi"));
		alstu.add(new StudentPOJOComparable(20, "Mumbai"));
		alstu.add(new StudentPOJOComparable(23, "Bengaluru"));
		alstu.add(new StudentPOJOComparable(17, "Kolkata"));
		
		// Here sort() method takes one parameter for Comparable
		//Collections.sort(alstu);

		//System.out.println(alstu);
		
		// For testing Comparator

		ArrayList<StudentPOJO> alst = new ArrayList<>();

		alst.add(new StudentPOJO(12, "Pune"));
		alst.add(new StudentPOJO(9, "Delhi"));
		alst.add(new StudentPOJO(17, "Bengaluru"));
		alst.add(new StudentPOJO(8, "Kolkata"));
		alst.add(new StudentPOJO(24, "Pragraj"));
		alst.add(new StudentPOJO(4, "Mumbai"));
		
		// Here sort() method takes two parameter for Comparator
		Collections.sort(alst, new StudentAgeComparator());
		
		System.out.println(alst);
		
		Collections.sort(alst, new StudentLocationComparator());

		System.out.println(alst);

	}

}
