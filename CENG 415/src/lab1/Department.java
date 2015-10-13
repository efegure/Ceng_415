package lab1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String Name;
	private List<Instructor> InstructorList = new ArrayList<Instructor>();
	private List<Student> StudentList = new ArrayList<Student>();
	private List<Lecture> LectureList = new ArrayList<Lecture>();

	public Department(String name) {
		super();
		Name = name;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Instructor> getInstructorList() {
		return InstructorList;
	}
	public void setInstructorList(List<Instructor> instructorList) {
		InstructorList = instructorList;
	}
	public void addInstructor(List<Instructor> instructorList,Instructor newInstructor){
		instructorList.add(newInstructor);
	}

	public List<Student> getStudentList() {
		return StudentList;
	}
	public void addStudent(List<Student> studentList,Student newStudent){
		StudentList.add(newStudent);
	}

	public List<Lecture> getLectureList() {
		return LectureList;
	}
}
