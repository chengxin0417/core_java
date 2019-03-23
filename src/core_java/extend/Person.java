package core_java.extend;

public class Person {

	private String name;
	private int age;
	private String school;

	public Person() {

	}

	public Person(String name, int age, String school) {
		this.name = name;
		this.age = age;
		this.school = school;
	}

	public void introduce(Person p) {
		System.out.println("I'm person");
	}

	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

	public String getSchool() {
		return school;
	}

}
