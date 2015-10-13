package lab1;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
	private Instructor Instructor;
	private List<Student> StudentList;

	public Lecture(lab1.Instructor instructor, List<Student> studentList) {
		super();
		Instructor = instructor;
		StudentList = new ArrayList<Student>();
	}

	public Instructor getInstructor() {
		return Instructor;
	}

	public void setInstructor(Instructor instructor) {
		Instructor = instructor;
	}

	public List<Student> getStudentList() {
		return StudentList;
	}

	public void setStudentList(List<Student> studentList) {
		StudentList = studentList;
	}
	public void addStudent(List<Student> StudentList,
			Student newStudent) {
		StudentList.add(newStudent);
	}
}
