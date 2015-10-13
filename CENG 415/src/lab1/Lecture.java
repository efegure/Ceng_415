package lab1;


import java.util.HashSet;

public class Lecture {
	private Department Department;
	private Instructor Instructor;
	private HashSet<Student> StudentList;

	public Lecture(lab1.Instructor instructor, HashSet<Student> studentSet) {
		super();
		Instructor = instructor;
		StudentList = new HashSet<Student>();
	}

	public Instructor getInstructor() {
		return Instructor;
	}

	public void setInstructor(Instructor instructor) {
		Instructor = instructor;
	}

	public HashSet<Student> getStudentList() {
		return StudentList;
	}

	public void setStudentList(HashSet<Student> studentList) {
		StudentList = studentList;
	}
	public void addStudent(HashSet<Student> StudentList,
			Student newStudent) {
		StudentList.add(newStudent);
	}

	public Department getDepartment() {
		return Department;
	}

	public void setDepartment(Department department) {
		Department = department;
	}
}
