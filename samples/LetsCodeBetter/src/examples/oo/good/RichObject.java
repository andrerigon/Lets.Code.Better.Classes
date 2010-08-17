package examples.oo.good;

public class RichObject {

	public static void main(String[] args) {
		// read inout data from user
		final Person p = Person.create("andre", 45);
		
		System.out.println("Name: " + p.getName() + " Age: " + p.getAge()
				+ " Will retire in  " + p.getYearsUntilRetirement() + " years");

	}
}

class PersonService {
	public int calculateYearsUntilRetirement(int age) {
		return 60 - age;
	}

	public void save(Person p) {
		// save
		System.out.println("Name: " + p.getName() + " Age: " + p.getAge()
				+ " Will retire in  " + p.getYearsUntilRetirement() + " years");
	}
}

class Person {

	private final String name;
	private final int age;
	private final int yearsUntilRetirement;

	private Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.yearsUntilRetirement = calculateYearsUntilRetirement();
	}

	public int getYearsUntilRetirement() {
		return yearsUntilRetirement;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	private int calculateYearsUntilRetirement() {
		return 60 - this.age;
	}

	public static Person create(String name, int age) {
		final Person person = new Person(name, age);
		// save
		return person;
	}

}
