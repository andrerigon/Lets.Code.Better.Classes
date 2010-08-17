package examples.oo.bad;

import java.util.ArrayList;
import java.util.List;

public class SadDemeter {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		final Student s1 = new Student();
		s1.setName("andre");
		s1.setResult("B");
		final Student s2 = new Student();
		s2.setName("ribeiro");

		School school = new School();
		school.setStudents(new ArrayList<Student>(){{add(s2);}});
		
		school.getStudents().add(s1);

		for (int i = 0; i < school.getStudents().size(); i++) {
			if (school.getStudents().get(i).getName().equals("andre")) {
				System.out.println("Andre tirou nota: "
						+ school.getStudents().get(i).getResult());
			}
		}

		

	}
}

class School {

	private List<Student> students = new ArrayList<Student>();

	// e se mudar a representacao pra hash map?

	public School() {
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
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


// MAIN

// School school = new School(Arrays.asList(s2));
// school.addStudent(s1);
// System.out.println("Andre tirou nota: "
// + school.findByName("andre").getResult());

//class School {
//
//	private final List<Student> students = new ArrayList<Student>();
//
//	// private final Map<Integer, Student> students;
//
//	public School(List<Student> list) {
//		students.addAll(list);
//
//		// students = new HashMap<Integer, Student>(list.size());
//		// for (int i = 0; i < list.size(); i++) {
//		// students.put(i, list.get(i));
//		// }
//	}
//
//	public void addStudent(Student s) {
//		students.add(s);
//		// students.put(students.size(), s);
//	}
//
//	public Student findByName(String name) {
//		for (Student student : students) {
//			// for (Student student : students.values()) {
//			if (student.getName().equals(name)) {
//				return student;
//			}
//		}
//		throw new IllegalArgumentException("not found");
//	}
//
//}