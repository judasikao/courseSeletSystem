package course;

public class Teacher extends Staff {
	private String Tcourse;

	public Teacher(int number, String name, String sex, String Tcourse) {
		super(number, name, sex);
		this.Tcourse = Tcourse;
	}

	@Override
	public String toString() {
		return "Teacher [Tcourse=" + Tcourse + "," + super.toString() + "]";
	}

	public static void main(String[] args) {
		;
	}
}
