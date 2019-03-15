package core_java.helloworld;

public class Student {
	
	private String name; //学生的名字
	
	//构造方法
	public Student(String name) {
		this.name = name;
	}
	
	//学生说话
	public void speak() {
		System.out.println("Hello, my name is " + name);
	}
}
