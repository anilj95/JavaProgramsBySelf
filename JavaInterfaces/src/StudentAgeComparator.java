import java.util.Comparator;

public class StudentAgeComparator implements Comparator<StudentPOJO> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(StudentPOJO stu1, StudentPOJO stu2) {
		// return 0,1,-1
		return stu1.age-stu2.age;
	}

}
