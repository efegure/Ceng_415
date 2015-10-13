package lab1;

import java.util.ArrayList;
import java.util.List;

public abstract class Instructor {
	private Department Department;
	private String Name;
	private List<Lecture> LectureList;

	public Instructor(lab1.Department department, String name,
			List<Lecture> lectureList) {
		super();
		Department = department;
		Name = name;
		LectureList = lectureList = new ArrayList<>();
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Lecture> getLectureList() {
		return LectureList;
	}

	public void setLectureList(List<Lecture> lectureList) {
		LectureList = lectureList;
	}

	public Department getDepartment() {
		return Department;
	}

	public void setDepartment(Department department) {
		Department = department;
	}

	public void addLecture(List<Lecture> LectureList,
			Lecture newLecture) {
		LectureList.add(newLecture);
	}
	public void getStudentAmount(List<Lecture> LectureList){
		
	}
}
