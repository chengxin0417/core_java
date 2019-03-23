package core_java.extend;

public class Student extends Person {
	
	private String id;
	
	public Student() {
		super();
	}

	public Student(String name, int age, String school, String id) {
		super(name, age,school);//调用父类构造方法
		this.id = id;
	}
	
	public void introduce(Student s) {
		System.out.println("Hello, I am a student， my id is " + s.id+"; my name is "+
	s.getName());
	}
}
