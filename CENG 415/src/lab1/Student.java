package lab1;

import java.util.List;

public class Student {
	private String Name;
	private int Id;
	private List<Lecture> LectureList;
	private Department Department;

	public Student(String name, List<Lecture> lectureList,Department department) {
		super();
		Name = name;
		LectureList = lectureList;
		Department = department;
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
	public void addLecture(List<Lecture> LectureList,
			Lecture newLecture) {
		LectureList.add(newLecture);
	}

	public lab1.Department getDepartment() {
		return Department;
	}

	public void setDepartment(lab1.Department department) {
		Department = department;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
}
