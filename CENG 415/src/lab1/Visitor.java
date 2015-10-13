package lab1;

import java.util.List;

public class Visitor extends Instructor {

	public Visitor(lab1.Department department, String name,
			List<Lecture> lectureList) {
		super(department, name, lectureList);
	}

}
