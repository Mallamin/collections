package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "lamin"), new Student(100, "Mohamed"),
				new Student(2, "Jalloh"));

		List<Student> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);

		Collections.sort(studentsAl);

		System.out.println(studentsAl);
	}


}
