package examples.oo.bad;

public class StupidObject {

	public static void main(String[] args) {
		// read inout data from user
		 PersonService service = new PersonService();
		
		 Person p = new Person();
		 p.setName("andre");
		 p.setAge(45);
		 p.setYearsUntilRetirement(service.calculateYearsUntilRetirement(45));
		
		 service.save(p);
		
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
	private String name;
	private int age;
	private int yearsUntilRetirement;

	public Person() {
	}

	public int getYearsUntilRetirement() {
		return yearsUntilRetirement;
	}

	public void setYearsUntilRetirement(int yearsUntilRetirement) {
		this.yearsUntilRetirement = yearsUntilRetirement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}




// MAIN

//final Person p = Person.create("andre", 45);
//System.out.println("Name: " + p.getName() + " Age: " + p.getAge()
//		+ " Will retire in  " + p.getYearsUntilRetirement() + " years");


//class Person {
//
//	private final String name;
//	private final int age;
//	private final int yearsUntilRetirement;
//
//	private Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//		this.yearsUntilRetirement = calculateYearsUntilRetirement();
//	}
//
//	public int getYearsUntilRetirement() {
//		return yearsUntilRetirement;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	private int calculateYearsUntilRetirement() {
//		return 60 - this.age;
//	}
//
//	public static Person create(String name, int age) {
//		final Person person = new Person(name, age);
//		// save
//		return person;
//	}
//
//}
