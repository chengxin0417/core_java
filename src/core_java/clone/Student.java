package core_java.clone;

public class Student implements Cloneable {

	private String name;
	private int age;
	private Classes classes;
	
	public Student() {
		
	}
	
	public Student(String name, int age, Classes classes) {
		this.name = name;
		this.age  = age;
		this.classes = classes;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = (Student) super.clone();
		return s;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "Student信息 => name: " + name + "; age = " + age + "; class = " + classes;
		return s;
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

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}

}
