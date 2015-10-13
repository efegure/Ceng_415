package lab1;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String Name;
	private List<Instructor> InstructorList = new ArrayList<Instructor>();

	public Department(String name, List<Instructor> instructorList) {
		super();
		Name = name;
		InstructorList = instructorList;
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
}
