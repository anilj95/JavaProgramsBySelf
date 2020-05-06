
public class StudentPOJO {
	
	int age;
	
	String location;

	public StudentPOJO(int age, String location) {
		super();
		this.age = age;
		this.location = location;
	}

	

	public StudentPOJO() {
		super();
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student [age= "+age+",location = "+location+"]";
	}
	
	

}
