package core_java.extend;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("zhangsan", 30, "cheer");
		p.introduce(p);
		
		Student s = new Student("lisi",18,"cheer","001");
		s.introduce(s);
	}

}
