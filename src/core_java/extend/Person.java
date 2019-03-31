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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((school == null) ? 0 : school.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (school == null) {
			if (other.school != null)
				return false;
		} else if (!school.equals(other.school))
			return false;
		return true;
	}
	
	

}
