
public class StudentPOJOComparable implements Comparable<StudentPOJOComparable> {

	int age;

	String location;

	public StudentPOJOComparable(int age, String location) {
		super();
		this.age = age;
		this.location = location;
	}

	public StudentPOJOComparable() {
		super();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [age= " + age + ",location = " + location + "]";
	}

	@Override
	public int compareTo(StudentPOJOComparable student) {
		// 0 or 1 or -1

		if (age == student.age) {
			return 0;
		} else if (age > student.age) {
			return 1;
		} else {
			return -1;
		}

	}

}
