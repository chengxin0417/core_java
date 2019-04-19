package core_java.reflex;

public class Person {
	
	private String name = "刘德华";
	public int age = 56;
	
	public Person() {
		
	}
	
	private void sayHello() {
		System.out.println("调用私有方法sayHello()...");
	}
	
	public void sing() {
		System.out.println("调用公开方法sing()...");
	}
}
