package lab1;

import java.util.List;

public class Student {
	private String Name;
	private List<Lecture> LectureList;

	public Student(String name, List<Lecture> lectureList) {
		super();
		Name = name;
		LectureList = lectureList;
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
}
