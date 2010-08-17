package examples.oo.good;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HappyDemeter {

	public static void main(String[] args) {
		final Student s1 = new Student();
		s1.setName("andre");
		s1.setResult("B");
		final Student s2 = new Student();
		s2.setName("ribeiro");

		School school = new School(Arrays.asList(s2));

		school.addStudent(s1);
		System.out.println("Andre tirou nota: "
				+ school.findByName("andre").getResult());

	}
}

class School {

	// private final List<Student> students = new ArrayList<Student>();

	private final Map<Integer, Student> students;

	public School(List<Student> list) {
		// students.addAll(list);

		students = new HashMap<Integer, Student>(list.size());
		for (int i = 0; i < list.size(); i++) {
			students.put(i, list.get(i));
		}
	}

	public void addStudent(Student s) {
		// students.add(s);
		students.put(students.size(), s);
	}

	public Student findByName(String name) {
		// for (Student student : students) {
		for (Student student : students.values()) {
			if (student.getName().equals(name)) {
				return student;
			}
		}
		throw new IllegalArgumentException("not found");
	}

}

class Student {

	private String name;
	private String result;

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getResult() {
		return result;
	}

}
