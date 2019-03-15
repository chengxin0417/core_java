package core_java.import_demo;

public class ImportDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		core_java.helloworld.Student s = new core_java.helloworld.Student("Tom");
		s.speak();
		core_java.import_demo.sub.Student s1 = new core_java.import_demo.sub.Student();
	}

}
