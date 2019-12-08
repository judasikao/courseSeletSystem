package course;

import java.util.ArrayList;

public class Main {
	private ArrayList<Staff> ListStaff = new ArrayList<Staff>(); // 存放人员类容器
	private ArrayList<Course> ListCourse = new ArrayList<Course>(); // 存放课程类容器
	
	public void AddStaff(Staff staff) { // 添加人员
		ListStaff.add(staff);
	}

	public void AddCourse(Course course) { // 添加课程
		ListCourse.add(course);
	}

	public void Listcourse() {
		for (Course course : ListCourse) { // 输出课程列表
			System.out.println("选课" + course);
		}
	}
	
	public String ListCourse1() {
		StringBuffer kecheng =new StringBuffer();
		String kecheng1=new String();
		for (Course course : ListCourse) 
			kecheng.append("选课" + course+"\n");
			kecheng1=kecheng.toString();
		return kecheng1;
	}
	public String ListStuff1() {
		StringBuffer kecheng =new StringBuffer();
		String kecheng1=new String();
		for (Staff staff : ListStaff) 
			kecheng.append(staff+"\n");
			kecheng1=kecheng.toString();
		return kecheng1;
	}
	

	public void ListStuff() { // 输出人员列表
		for (Staff staff : ListStaff) {
			System.out.println(staff);
			}
	}

	public void deleteStuff(int index) { // 删除人员
		ListStaff.remove(index - 1);
	}

	public void Select(int index, String student) { // 选课
		ListCourse.get(index - 1).setStudent(student);
	}

	public void Delete(int index) { // 退课
		ListCourse.get(index - 1).deleteStudent();
	}

	public void changePlace(int index, String place) { // 更改课程地点
		ListCourse.get(index - 1).changePlace(place);
	}

	public void changeTime(int index, String time) { // 更改课程时间
		ListCourse.get(index - 1).changeTime(time);
	}

	public void setStaff(int index, int number) { // 更改人员编号
		ListStaff.get(index - 1).setStaff(number);
	}

	public static void main(String[] args) {
		
	}
}
