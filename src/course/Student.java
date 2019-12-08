package course;

public class Student extends Staff {

	public Student(int number, String name, String sex) {
		super(number, name, sex);
	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "]";
	}

}
