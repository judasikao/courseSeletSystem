package course;

public class Staff {
	private int number;
	private String name;
	private String sex;

	public Staff(int number, String name, String sex) {
		this.number = number;
		this.name = name;
		this.sex = sex;
	}

	public void setStaff(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "number=" + number + ", name=" + name + ", sex=" + sex;
	}

	public static void main(String[] args) {

	}

}
