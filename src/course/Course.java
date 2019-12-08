package course;

public class Course {
	private int number;
	private String courseName;
	private String place;
	private String time;
	private int credit;
	private String teacher;
	private String student;

	public Course(int number, String courseName, String place, String time, int credit, String teacher) {
		super();
		this.number = number;
		this.courseName = courseName;
		this.place = place;
		this.time = time;
		this.credit = credit;
		this.teacher = teacher;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public void deleteStudent() {
		this.student = null;
	}

	public void changeTime(String time) {
		this.time = time;
	}

	public void changePlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "student [number=" + number + ", courseName=" + courseName + ", place=" + place + ", time=" + time
				+ ", credit=" + credit + ", teacher=" + teacher + ", student=" + student + "]";
	}

}
